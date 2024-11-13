package com.briup.briuppts.mapper;

import com.briup.briuppts.vm.StringVM;

import java.util.List;
import java.util.Map;

public interface AnalysisMapper {

    List<Integer> count();

    List<Integer> countSales(Integer year);

    List<StringVM> countDisease();
    Map<String,Long> weightCount();
}
