package com.briup.briuppts.web.controller;

import com.briup.briuppts.entity.ManagerBatch;
import com.briup.briuppts.result.Result;
import com.briup.briuppts.service.ManagerBatchService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "批次记录模块")
@RestController
@RequestMapping("/batch")
public class BatchController {
    @Autowired
    ManagerBatchService managerBatchService;
    @GetMapping("/queryAllUnquarantined")
    public Result findAllUnQuarantine(){
        List<ManagerBatch> allUnQuarantineBatch = managerBatchService.findAllUnQuarantineBatch();
        return Result.success(allUnQuarantineBatch);
    }
    @GetMapping("/queryAll")
    public Result findAll(){
        List<ManagerBatch> allUnQuarantineBatch = managerBatchService.findAll();
        return Result.success(allUnQuarantineBatch);
    }
}