package com.briup.briuppts.web.controller;

import com.briup.briuppts.entity.ManagerFenceHouse;
import com.briup.briuppts.entity.ext.FenceHouseExtend;
import com.briup.briuppts.result.Result;
import com.briup.briuppts.service.FenceHouseService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "栏舍管理模块")
@RestController
@RequestMapping("/fenceHouse")
public class FenceHouseController {
    @Autowired
    private FenceHouseService managerFenceHouseService;
    @ApiOperation("分页多条件查询栏舍信息接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页码", defaultValue = "1", required = true),
            @ApiImplicitParam(name = "pageSize", value = "每页大小", defaultValue = "10", required = true),
            @ApiImplicitParam(name = "fhName", value = "栏舍名称")
    })
    @GetMapping
    public Result queryByConditionsAndPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, String fhName) {
        PageInfo<ManagerFenceHouse> result = managerFenceHouseService.findByPage(pageNum, pageSize, fhName);
        return Result.success(result);
    }
    @ApiOperation("新增或修改栏舍接口")
    @PostMapping("/saveOrUpdate")
    public Result reviseFenceHouses(@RequestBody ManagerFenceHouse managerFenceHouse) {
        managerFenceHouseService.saveOrUpdate(managerFenceHouse);
        return Result.success();
    }
    @ApiOperation("根据fhId删除栏舍")
    @DeleteMapping("/{fhId}")
    public Result deleteByFhId(@PathVariable  String fhId){
        managerFenceHouseService.removeById(fhId);
        return Result.success();
    }
    @ApiOperation("批量删除栏舍")
    @DeleteMapping("/deleteByIdAll")
    public Result deleteByAll(@RequestBody List<String> ids){
        managerFenceHouseService.removeBatch(ids);
        return Result.success();
    }
    @ApiOperation("根据栏舍Id查询对应的栏圈")
    @GetMapping("/{fhId}")
    public Result selectByFenceHouse(@PathVariable String fhId){
        FenceHouseExtend byId = managerFenceHouseService.findById(fhId);
        return Result.success(byId);
    }
    @GetMapping("/queryAll")
    public Result selectAll(){
        List<ManagerFenceHouse> all = managerFenceHouseService.findAll();
        return Result.success(all);
    }
}