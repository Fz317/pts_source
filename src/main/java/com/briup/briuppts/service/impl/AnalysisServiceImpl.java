package com.briup.briuppts.service.impl;


import com.briup.briuppts.mapper.AnalysisMapper;
import com.briup.briuppts.service.AnalysisService;
import com.briup.briuppts.vm.CountVM;
import com.briup.briuppts.vm.StringVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AnalysisServiceImpl implements AnalysisService {
    @Autowired
    AnalysisMapper analysisMapper;

    @Override
    public CountVM count() {
        CountVM countVM = new CountVM();
        // 定义一下名字
        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList,"栏舍","栏圈","动物","冷库","员工");
        countVM.setName(nameList);
        // 获取每个部分的统计数据
        // 两种写法：
        //  1、使用各个模块的查询全部进行统计size（每一个需要的模块提供一个count的方法）
        //  2、使用一条sql语句组装结果集（讲解的时候使用这个）
        countVM.setValue(analysisMapper.count());
        return countVM;
    }

    @Override
    public CountVM countSales() {
        CountVM countVM = new CountVM();
        countVM.setName(Arrays.asList("1月","2月","3月","4月","5月","6月","7月","8月","9月","10月","11月","12月"));
        countVM.setValue(analysisMapper.countSales(2023));
        return countVM;
    }

    @Override
    public Map<String, Integer> countDisease() {
        Map<String,Integer> map = new HashMap<>();
        List<StringVM> stringVMS = analysisMapper.countDisease();
        for(StringVM s : stringVMS){
            map.put(s.getName(),s.getValue());
        }
        return map;
    }
    @Override
    public Map<String, Long> indexCount() {
        Map<String,Long> stringIntegerMap = analysisMapper.weightCount();
        HashMap<String,Long> map = new HashMap<>();
        stringIntegerMap.forEach((e,v)->{
            map.put(String.valueOf(e),(long)v);
        });
        return map;
    }
}
