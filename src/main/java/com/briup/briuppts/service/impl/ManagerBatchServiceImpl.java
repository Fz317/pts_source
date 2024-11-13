package com.briup.briuppts.service.impl;


import com.briup.briuppts.entity.ManagerBatch;
import com.briup.briuppts.entity.ManagerBatchExample;
import com.briup.briuppts.mapper.ManagerBatchMapper;
import com.briup.briuppts.service.ManagerBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerBatchServiceImpl implements ManagerBatchService {

    @Autowired
    private ManagerBatchMapper mbMapper;
    @Override
    public List<ManagerBatch> findAllUnQuarantineBatch() {
        ManagerBatchExample example = new ManagerBatchExample();
        example.createCriteria().andBQuarantineEqualTo("未检疫");
        List<ManagerBatch> list = mbMapper.selectByExample(example);
        return list;
    }
    @Override
    public List<ManagerBatch> findAll() {
        ManagerBatchExample example = new ManagerBatchExample();
        List<ManagerBatch> list = mbMapper.selectByExample(example);
        return list;
    }
}
