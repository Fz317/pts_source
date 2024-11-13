package com.briup.briuppts.service;

import com.briup.briuppts.entity.ManagerBatch;

import java.util.List;

public interface ManagerBatchService {
    /**
     * 查询未检疫的批次信息
     * @return 批次对象的集合
     */
    List<ManagerBatch> findAllUnQuarantineBatch();

    /**
     * 查询所有批次
     * @return 批次对象的集合
     */
    public List<ManagerBatch> findAll();
}
