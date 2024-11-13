package com.briup.briuppts.web.controller;

import com.briup.briuppts.entity.ManagerAnimal;
import com.briup.briuppts.entity.ext.AnimalExtend;
import com.briup.briuppts.result.Result;
import com.briup.briuppts.service.ManagerAnimalService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "动物管理模块")
@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private ManagerAnimalService managerAnimalService;

    @ApiOperation("查询动物信息带分页带模糊")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "健康状况", value = "aHealthy"),
            @ApiImplicitParam(name = "动物性别", value = "aGender"),
            @ApiImplicitParam(name = "页数", value = "pageNum",paramType = "query",required = true),
            @ApiImplicitParam(name = "条数", value = "pageSize",paramType = "query",readOnly = true),
    })
    @GetMapping
    public Result getAllAnimal(String aHealthy,
                               String aGender,
                               @RequestParam Integer pageNum,
                               @RequestParam Integer pageSize){
        PageInfo<AnimalExtend> allAnimalsByPage = managerAnimalService.findAllAnimalsByPage(aHealthy, aGender, pageNum, pageSize);
        return Result.success(allAnimalsByPage);
    }

    @PostMapping("/saveOrUpdate")
    public Result saveOrUpdate(@RequestBody ManagerAnimal animal){
        managerAnimalService.addOrEditAnimal(animal);
        return Result.success();
    }
    @DeleteMapping("/deleteById/{aAnimalId}")
    public Result deleteById(@PathVariable String aAnimalId){
        managerAnimalService.delete(aAnimalId);
        return Result.success();
    }
    @DeleteMapping("/deleteByIdAll")
    public Result deleteByBatch(@RequestBody  List<String> ids){
        managerAnimalService.deleteByBatch(ids);
        return Result.success();
    }
}
