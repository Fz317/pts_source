package com.briup.briuppts.service.impl;

import cn.hutool.core.util.StrUtil;
import com.briup.briuppts.entity.ManagerBatch;
import com.briup.briuppts.entity.QuarantineRegistration;
import com.briup.briuppts.entity.QuarantineRegistrationExample;
import com.briup.briuppts.exception.ServiceException;
import com.briup.briuppts.mapper.ManagerBatchMapper;
import com.briup.briuppts.mapper.QuarantineRegistrationMapper;
import com.briup.briuppts.result.ResultCode;
import com.briup.briuppts.service.QuarantineRegistrationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuarantineRegistrationImpl implements QuarantineRegistrationService {

    @Autowired
    QuarantineRegistrationMapper qrMapper;
    @Autowired
    ManagerBatchMapper mbMapper;

    @Override
    public PageInfo<QuarantineRegistration> findAllByPage(String bQualified, String grMechanism, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        //
        QuarantineRegistrationExample example = new QuarantineRegistrationExample();
        // 添加拼接条件
        QuarantineRegistrationExample.Criteria criteria = example.createCriteria();
        if(!StrUtil.isEmpty(bQualified)){
            criteria = criteria.andBQualifiedEqualTo(bQualified);
        }
        if(!StrUtil.isEmpty(grMechanism)){
            criteria = criteria.andGrMechanismLike("%"+grMechanism+"%");
        }
        List<QuarantineRegistration> list = qrMapper.selectByExample(example);
        // 返回pageInfo的对象
        PageInfo<QuarantineRegistration> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void saveOrUpdate(QuarantineRegistration qr) {
        // 根据qr对象中是否有id区分新增和更新
        Integer grId = qr.getGrId();
        if(grId == null){
            // 新增逻辑
            int insert = qrMapper.insert(qr);
            if(insert == 1){
                // 新增成功之后要更新批次信息里的检疫状态和检疫结果
                // 需要通过主键的返回来进行查询
                Integer pk = qr.getGrId();
                // 更新批次表
                ManagerBatch mb = new ManagerBatch();
                // 更新检疫状态为 已检疫
                mb.setBQuarantine("已检疫");
                // 检疫是否合格传进去
                mb.setBQualified(qr.getBQualified());
                mb.setBSerialId(qr.getGrBatchId());
                int r = mbMapper.updateByPrimaryKeySelective(mb);
                // 根据r的值判断是否更新成功了（暂时不写，事务管理没加）
                if(r != 1){
                    throw new ServiceException(ResultCode.FAIL);
                }
            }else {
                // 先定义成操作失败，后续可以在枚举里加【插入数据失败】
                throw new ServiceException(ResultCode.FAIL);
            }

        }else {
            // 更新
            qrMapper.updateByPrimaryKeySelective(qr);
        }
    }

    @Override
    public void removerById(Integer id) {
        int i = qrMapper.deleteByPrimaryKey(id);
        if(i == 0){
            throw new ServiceException(ResultCode.FAIL);
        }
    }

    @Override
    public void removerBatch(List<Integer> ids) {
        QuarantineRegistrationExample example = new QuarantineRegistrationExample();
        example.createCriteria().andGrIdIn(ids);
        int i = qrMapper.deleteByExample(example);
        if(i == 0){
            throw new ServiceException(ResultCode.FAIL);
        }
    }
}
