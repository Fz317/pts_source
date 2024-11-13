package com.briup.briuppts.web.controller;

import com.briup.briuppts.result.Result;
import com.briup.briuppts.service.AnalysisService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(tags = "首页大屏模块")
@RestController
@RequestMapping("/analysis")
public class AnalysisController {

    @Autowired
    AnalysisService analysisService;

    @GetMapping("/count")
    public Result count(){
        return Result.success(analysisService.count());
    }
    @GetMapping("/countSales")
    public Result countSales(){
        return Result.success(analysisService.countSales());
    }
    @GetMapping("/countDisease")
    public Result countDisease(){
        return Result.success(analysisService.countDisease());
    }
    @GetMapping("/indexCount")
    public Result indexCount(){
        Map<String,Long> stringIntegerMap = analysisService.indexCount();
        return Result.success(stringIntegerMap);
    }
}