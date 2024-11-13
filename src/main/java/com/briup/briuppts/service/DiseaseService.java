package com.briup.briuppts.service;

import com.briup.briuppts.entity.DiseaseRecord;
import com.briup.briuppts.entity.ManagerDisease;
import com.briup.briuppts.entity.ext.DiseaseRecordExt;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @BelongsProject: briup-pts
 * @BelongsPackage: com.briup.briuppts.service
 * @Author: Fz
 * @CreateTime: 2024-11-06  10:25
 * @Description: TODO
 * @Version: 1.0
 */
public interface DiseaseService {
    List<ManagerDisease> findAllDiseases();

    PageInfo<DiseaseRecordExt> findByPage(Integer pageNum,
                                          Integer pageSize,
                                          String drStatus,
                                          Integer drDId);

    void saveOrUpdate(DiseaseRecord record);

    void deleteById(Integer id);

    void deleteByIdAll(List<Integer> ids);
}