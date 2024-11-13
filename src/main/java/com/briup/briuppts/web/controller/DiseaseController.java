package com.briup.briuppts.web.controller;

import com.briup.briuppts.entity.DiseaseRecord;
import com.briup.briuppts.entity.ManagerDisease;
import com.briup.briuppts.entity.ext.DiseaseRecordExt;
import com.briup.briuppts.result.Result;
import com.briup.briuppts.service.DiseaseService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @BelongsProject: briup-pts
 * @BelongsPackage: com.briup.briuppts.web.controller
 * @Author: Fz
 * @CreateTime: 2024-11-06  10:15
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/diseaseRecord")
public class DiseaseController {
    @Autowired
    DiseaseService diseaseService;
    @GetMapping("/queryAllDisease")
    public Result queryAllDisease(){
        List<ManagerDisease> result = diseaseService.findAllDiseases();
        return Result.success(result);
    }
    @ApiOperation("分页多条件查询病症记录")
    @GetMapping
    public Result getAnimalRelated(Integer pageNum, Integer pageSize,
                                   String drStatus, Integer drDId) {
        PageInfo<DiseaseRecordExt> result
                = diseaseService.findByPage(pageNum, pageSize,drStatus, drDId);
        return Result.success(result);
    }
    @ApiOperation("新增或更新病症记录")
    @PostMapping("/saveOrUpdate")
    public Result reviseDiseaseRecord(@RequestBody DiseaseRecord record) {
        diseaseService.saveOrUpdate(record);
        return Result.success();
    }
    @DeleteMapping("/deleteById/{id}")
    public Result delete(@PathVariable Integer id){
        diseaseService.deleteById(id);
        return Result.success();
    }
    @DeleteMapping("/deleteByIdAll")
    public Result deleteByIdAll(@RequestBody List<Integer> ids){
        diseaseService.deleteByIdAll(ids);
        return Result.success();
    }
}
