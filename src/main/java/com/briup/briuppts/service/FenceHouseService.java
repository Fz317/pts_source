package com.briup.briuppts.service;

import com.briup.briuppts.entity.ManagerFenceHouse;
import com.briup.briuppts.entity.ext.FenceHouseExtend;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FenceHouseService {
    PageInfo<ManagerFenceHouse> findByPage(Integer pageNum, Integer pageSize, String fhName);
    void  saveOrUpdate(ManagerFenceHouse mf);
    void removeById(String fhId);
    void removeBatch(List<String> ids);
    FenceHouseExtend findById(String id);
    List<ManagerFenceHouse> findAll();
}
