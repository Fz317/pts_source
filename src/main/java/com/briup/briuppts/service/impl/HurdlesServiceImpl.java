package com.briup.briuppts.service.impl;

import cn.hutool.core.util.StrUtil;
import com.briup.briuppts.entity.ManagerBatch;
import com.briup.briuppts.entity.ManagerFenceHouse;
import com.briup.briuppts.entity.ManagerHurdles;
import com.briup.briuppts.entity.ManagerHurdlesExample;
import com.briup.briuppts.entity.ext.HurdlesExtend;
import com.briup.briuppts.exception.ServiceException;
import com.briup.briuppts.mapper.ManagerFenceHouseMapper;
import com.briup.briuppts.mapper.ManagerHurdlesMapper;
import com.briup.briuppts.mapper.ext.HurdlesExtMapper;
import com.briup.briuppts.result.ResultCode;
import com.briup.briuppts.service.HurdlesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class HurdlesServiceImpl implements HurdlesService {

    @Autowired
    ManagerHurdlesMapper mhMapper;
    @Autowired
    HurdlesExtMapper hurdlesExtMapper;


    @Override
    public PageInfo<HurdlesExtend> findHurdlesByPage(String hName, Integer hMax, String fhName, String hEnable, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<HurdlesExtend> hurdlesExtends = hurdlesExtMapper.selectHurdlesExtendByCondition(hName, hMax, fhName, hEnable);
        PageInfo<HurdlesExtend> pageInfo = new PageInfo<>(hurdlesExtends);
        return pageInfo;
    }
    @Override
    public Set<Integer> findAllMax() {
        ManagerHurdlesExample managerHurdlesExample = new ManagerHurdlesExample();
        managerHurdlesExample.createCriteria();
        List<ManagerHurdles> managerHurdles = mhMapper.selectByExample(managerHurdlesExample);
        Set<Integer> list = new HashSet<>();
        for(ManagerHurdles m : managerHurdles){
            list.add(m.getHMax());
        }
        return list;
    }

    @Override
    public void modifyStatus(String hId, String hEnable) {
        ManagerHurdles managerHurdles = mhMapper.selectByPrimaryKey(hId);
        if ("可用".equals(hEnable)) {
            managerHurdles.setHEnable("禁用");
        }else{
            managerHurdles.setHEnable("可用");
        }
        mhMapper.updateByPrimaryKey(managerHurdles);
    }

    @Override
    public void modifyStatusBatch(List<Map<String, String>> idAndStatus) {
        int result = 0;
        for (Map<String, String> map : idAndStatus) {
            String hId = map.get("hId");
            if (mhMapper.selectByPrimaryKey(hId)==null) {
                // 栏圈不存在，跳过本次循环
                continue;
            }
            String hEnable = map.get("hEnable");
            String status = "可用";
            if (status.equals(hEnable)) {
                status="禁用";
            }
            ManagerHurdles managerHurdles = mhMapper.selectByPrimaryKey(hId);
            managerHurdles.setHEnable(status);
            result+= mhMapper.updateByPrimaryKey(managerHurdles);
        }
        if (result == 0) {
            throw new ServiceException(ResultCode.FAIL);
        }
    }

    @Override
    public void delete(String hId) {
        mhMapper.deleteByPrimaryKey(hId);
    }


    @Override
    public List<ManagerHurdles> findHurdlesInHMaxAndEnable(String hFull, String hEnable) {

        ManagerHurdlesExample example = new ManagerHurdlesExample();
        example.createCriteria().andHFullEqualTo("未满")
                                .andHEnableEqualTo("可用");
        List<ManagerHurdles> managerHurdles = mhMapper.selectByExample(example);
        return managerHurdles;
    }
}
