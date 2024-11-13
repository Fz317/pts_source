package com.briup.briuppts.service;

import com.briup.briuppts.vm.CountVM;

import java.util.Map;

public interface AnalysisService {

    CountVM count();

    CountVM countSales();

    Map<String,Integer> countDisease();
    Map<String,Long> indexCount();
}
