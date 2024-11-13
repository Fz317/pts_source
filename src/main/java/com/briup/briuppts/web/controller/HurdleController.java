package com.briup.briuppts.web.controller;

import com.briup.briuppts.entity.ManagerHurdles;
import com.briup.briuppts.entity.ext.HurdlesExtend;
import com.briup.briuppts.result.Result;
import com.briup.briuppts.service.HurdlesService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Api(tags = "栏圈管理模块")
@RestController
@RequestMapping("/hurdle")
public class HurdleController {
    @Autowired
    HurdlesService hurdlesService;

    @ApiOperation("查询所有栏圈带分页带条件")
    @GetMapping
    public Result findAllByPageByCondition(String hName, Integer hMax, String fhName, String hEnable,
                                           @RequestParam Integer pageNum,
                                           @RequestParam Integer pageSize){
        PageInfo<HurdlesExtend> hurdlesByPage = hurdlesService.findHurdlesByPage(hName, hMax, fhName, hEnable, pageNum, pageSize);
        return Result.success(hurdlesByPage);
    }
    @ApiOperation("查询所有可用且未满栏圈")
    @GetMapping("/queryAllEnable")
    public Result findHurdlesEnable(){
        List<ManagerHurdles> hurdlesInHMaxAndEnable = hurdlesService.findHurdlesInHMaxAndEnable(null,null);
        return Result.success(hurdlesInHMaxAndEnable);
    }
    @GetMapping("/queryAllMax")
    public Result selectMax(){
        Set<Integer> allMax = hurdlesService.findAllMax();
        return Result.success(allMax);
    }
    @PutMapping("/{hId}/{hEnable}")
    public Result changeEnable(@PathVariable  String hId,@PathVariable String hEnable){
        hurdlesService.modifyStatus(hId, hEnable);
        return Result.success();
    }
    @ApiOperation("批量启用/禁用栏圈接口")
    @PutMapping
    public Result changeStatusBatch(@RequestBody List<Map<String, String>> idAndStatus) {
        hurdlesService.modifyStatusBatch(idAndStatus);
        return Result.success();
    }
    @DeleteMapping("deleteById/{hId}")
    public Result deleteById(@PathVariable String hId){
        hurdlesService.delete(hId);
        return Result.success();
    }
}
