package com.briup.briuppts.service;

import com.briup.briuppts.entity.ManagerHurdles;
import com.briup.briuppts.entity.ext.HurdlesExtend;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface HurdlesService {

    PageInfo<HurdlesExtend> findHurdlesByPage(String hName, Integer hMax,
                                                     String fhName, String hEnable,
                                                     Integer pageNum, Integer pageSize);

    List<ManagerHurdles> findHurdlesInHMaxAndEnable(String hFull, String hEnable) ;
    Set<Integer> findAllMax();
    void modifyStatus(String hId, String hEnable);
    void modifyStatusBatch(List<Map<String, String>> idAndStatus);
    void delete(String hId);
}
