package com.briup.briuppts.web.controller;

import com.briup.briuppts.entity.QuarantineRegistration;
import com.briup.briuppts.result.Result;
import com.briup.briuppts.service.QuarantineRegistrationService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("检疫登记")
@RestController
@RequestMapping("/quarantineRegistration")
public class QuarantineRegistrationController {

    @Autowired
    private QuarantineRegistrationService qrService;

    @GetMapping
    public Result findAllByPage(String bQualified,
                                String grMechanism,
                                @RequestParam Integer pageNum,
                                @RequestParam Integer pageSize){

        PageInfo<QuarantineRegistration> pageInfo = qrService.findAllByPage(bQualified,grMechanism,pageNum, pageSize);
        return Result.success(pageInfo);
    }

    @PostMapping("/saveOrUpdate")
    public Result saveOrUpdate(@RequestBody QuarantineRegistration quarantineRegistration){
        qrService.saveOrUpdate(quarantineRegistration);
        return Result.success();
    }

    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Integer id){
        qrService.removerById(id);
        return Result.success();
    }
    @DeleteMapping("/deleteByIdAll")
    public Result deleteByIdAll(@RequestBody List<Integer> ids){
        qrService.removerBatch(ids);
        return Result.success();
    }

}
