package com.briup.briuppts.service.impl;


import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.briup.briuppts.entity.ManagerAnimal;
import com.briup.briuppts.entity.ManagerBatch;
import com.briup.briuppts.entity.ManagerHurdles;
import com.briup.briuppts.entity.ext.AnimalExtend;
import com.briup.briuppts.entity.ext.HurdlesExtend;
import com.briup.briuppts.exception.ServiceException;
import com.briup.briuppts.mapper.ManagerAnimalMapper;
import com.briup.briuppts.mapper.ManagerBatchMapper;
import com.briup.briuppts.mapper.ManagerHurdlesMapper;
import com.briup.briuppts.result.ResultCode;
import com.briup.briuppts.service.ManagerAnimalService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ManagerAnimalServiceImpl implements ManagerAnimalService {

    @Autowired
    ManagerAnimalMapper managerAnimalMapper;
    @Autowired
    ManagerBatchMapper batchMapper;
    @Autowired
    ManagerHurdlesMapper hurdlesMapper;

    @Override
    public PageInfo<AnimalExtend> findAllAnimalsByPage(String aHealthy, String aGender, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<AnimalExtend> animalExtends = managerAnimalMapper.selectAll(aHealthy, aGender);
        PageInfo<AnimalExtend> page = new PageInfo<>(animalExtends);
        return page;
    }

    @Override
    @Transactional
    public void addOrEditAnimal(ManagerAnimal animal) {
        String aAnimalId = animal.getAAnimalId();
        if(StrUtil.isBlank(aAnimalId)){
            // 新增操作
            // 0、动物表中的主键不是自增长的，是程序员需要依据主键生成策略完成的
            // 本次主键生成策略为UUID去除-的部分，使用的是huTools的工具
            animal.setAAnimalId(IdUtil.simpleUUID());

            // 1、根据批次的状态来定义动物的状态
            String aBatchId = animal.getABatchId();
            ManagerBatch batch = batchMapper.selectByPrimaryKey(aBatchId);
            // 获取是否检疫的状态
            String bQuarantine = batch.getBQuarantine();
            if("已检疫".equals(bQuarantine)){
                animal.setAStatus("已检疫");
            }else if("未检疫".equals(bQuarantine)){
                animal.setAStatus("养殖中");
            }else {
                throw new ServiceException(ResultCode.DATA_IS_EMPTY);
            }
            // 执行插入逻辑
            int insert = managerAnimalMapper.insert(animal);
            if(insert == 0){
                // 插入失败
                throw new ServiceException(ResultCode.FAIL);
            }
            // 2、根据动物所属栏圈。查询当前容量和最大容量
            String aHurdlesId = animal.getAHurdlesId();
            ManagerHurdles hurdles = hurdlesMapper.selectByPrimaryKey(aHurdlesId);
            // 当前栏圈的已有容量
            Integer hSaved = hurdles.getHSaved();
            // 当前栏圈的最大容量
            Integer hMax = hurdles.getHMax();
            // +1
            Integer hCurr = hSaved+1;
            // 判断
            // 提前准备一个用于更新的栏圈对象
            ManagerHurdles curr = new ManagerHurdles();
            curr.setHId(hurdles.getHId());
            curr.setHSaved(hCurr);
            if(hCurr.equals(hMax)){
                // 已满
                curr.setHFull("已满");
            }
            // 3、根据容量是否达到最大，来修改栏圈的状态
            hurdlesMapper.updateByPrimaryKeySelective(curr);

        }else {
            // 修改操作
            // 1、通过动物的id查询原来的动物信息
            ManagerAnimal oldAnimal = managerAnimalMapper.selectByAAnimalId(aAnimalId);
            // 2、如果原来动物信息的存在，保存下来栏圈id
            if(oldAnimal == null){
                // 报错为：修改时查询的动物信息不存在
                throw new ServiceException(ResultCode.DATA_IS_EMPTY);
            }
            String oldHId = oldAnimal.getAHurdlesId();
            // 3、判断传递的动物信息中有没有修改栏圈
            String newHId = animal.getAHurdlesId();
            if(!oldHId.equals(newHId)){
                // 3.5 当更新栏圈成功之后，再执行4
                // 转出栏圈
                ManagerHurdles h1 = hurdlesMapper.selectByPrimaryKey(oldHId);
                ManagerHurdles h1Update = new ManagerHurdles();
                h1Update.setHId(h1.getHId());
                // 转出栏圈已存数量-1
                Integer h1Curr = h1.getHSaved()-1;
                h1Update.setHSaved(h1Curr);
                // 如果转出栏圈是满的改为未满
                if("已满".equals(h1.getHFull())){
                    h1Update.setHFull("未满");
                }
                int i1 = hurdlesMapper.updateByPrimaryKeySelective(h1Update);
                if(i1 == 0){
                    // 转出栏圈操作失败
                    throw new ServiceException(ResultCode.FAIL);
                }
                // 转入栏圈
                ManagerHurdles h2 = hurdlesMapper.selectByPrimaryKey(newHId);
                ManagerHurdles h2Update = new ManagerHurdles();
                h2Update.setHId(h2.getHId());
                // 转入栏圈数量+1
                Integer h2Curr = h2.getHSaved() +1;
                h2Update.setHSaved(h2Curr);
                // 判断转入栏圈是否已满
                if(h2.getHMax().equals(h2Curr)){
                    h2Update.setHFull("已满");
                }
                int i2 = hurdlesMapper.updateByPrimaryKeySelective(h2Update);
                if(i2 == 0){
                    // 转入栏圈操作失败
                    throw new ServiceException(ResultCode.FAIL);
                }
                // 4、如果修改了，要更新两个栏圈的状态（是否已满）、已存数量

            }
            // 直接更新（还没有写）\
            System.out.println(animal);
            int i = managerAnimalMapper.updateByPrimarySelective(animal);
            if(i == 0){
                // 动物更新失败
                throw new ServiceException(ResultCode.FAIL);
            }
        }
    }

    @Override
    public void delete(String id) {
        managerAnimalMapper.deleteByAAnimalId(id);
    }

    @Override
    public void deleteByBatch(List<String> ids) {
        for(String s:ids){
            managerAnimalMapper.deleteByAAnimalId(s);
        }
    }
}
