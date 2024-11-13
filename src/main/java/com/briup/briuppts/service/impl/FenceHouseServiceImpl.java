package com.briup.briuppts.service.impl;

import cn.hutool.core.util.StrUtil;
import com.briup.briuppts.entity.ManagerFenceHouse;
import com.briup.briuppts.entity.ManagerFenceHouseExample;
import com.briup.briuppts.entity.ext.FenceHouseExtend;
import com.briup.briuppts.exception.ServiceException;
import com.briup.briuppts.mapper.ManagerFenceHouseMapper;
import com.briup.briuppts.mapper.ext.FenceHouseExtendMapper;
import com.briup.briuppts.result.ResultCode;
import com.briup.briuppts.service.FenceHouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FenceHouseServiceImpl implements FenceHouseService {
    @Autowired
    ManagerFenceHouseMapper managerFenceHouseMapper;
    @Autowired
    FenceHouseExtendMapper fenceHouseExtendMapper;
    @Override
    public PageInfo<ManagerFenceHouse> findByPage(Integer pageNum, Integer pageSize, String fhName) {
        PageHelper.startPage(pageNum,pageSize);
        ManagerFenceHouseExample managerFenceHouseExample = new ManagerFenceHouseExample();
        ManagerFenceHouseExample.Criteria criteria = managerFenceHouseExample.createCriteria();
        if(!StrUtil.isEmpty(fhName)){
            criteria = criteria.andFhNameLike("%" + fhName + "%");
        }
        List<ManagerFenceHouse> selectedByExample = managerFenceHouseMapper.selectByExample(managerFenceHouseExample);
        PageInfo<ManagerFenceHouse> managerFenceHousePageInfo = new PageInfo<>(selectedByExample);
        return managerFenceHousePageInfo;

    }
    @Override
    public void saveOrUpdate(ManagerFenceHouse mf) {
        //主键判空
        String fhName = mf.getFhName();
        if(mf.getFhTime()==null || StringUtil.isEmpty(fhName)){
            throw new ServiceException(ResultCode.PARAM_IS_EMPTY);
        }
        int result;
        String fhId = mf.getFhId();
        if(fhId!=null){
            //包含栏舍id进行修改
            result= managerFenceHouseMapper.updateByPrimaryKey(mf);
        }else{
            //不包含栏舍id进行新增
            mf.setFhId(UUID.randomUUID().toString().replace("-", ""));
            result = managerFenceHouseMapper.myinsert(mf);
        }
        if (result == 0) {
            throw new ServiceException(ResultCode.FAIL);
        }
    }

    @Override
    public void removeById(String fhId) {
        managerFenceHouseMapper.deleteByPrimaryKey(fhId);
    }

    @Override
    public void removeBatch(List<String> ids) {
        ManagerFenceHouseExample managerFenceHouseExample = new ManagerFenceHouseExample();
        managerFenceHouseExample.createCriteria().andFhIdIn(ids);
        managerFenceHouseMapper.deleteByExample(managerFenceHouseExample);
    }

    @Override
    public FenceHouseExtend findById(String id) {
        FenceHouseExtend fenceHouseExtend = fenceHouseExtendMapper.selectById(id);
        return fenceHouseExtend;
    }
    @Override
    public List<ManagerFenceHouse> findAll() {
        ManagerFenceHouseExample managerFenceHouseExample = new ManagerFenceHouseExample();
        ManagerFenceHouseExample.Criteria criteria = managerFenceHouseExample.createCriteria();
        List<ManagerFenceHouse> find = managerFenceHouseMapper.selectByExample(managerFenceHouseExample);
        return find;
    }
}
