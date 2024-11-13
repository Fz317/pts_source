package com.briup.briuppts.service;

import com.briup.briuppts.entity.ManagerAnimal;
import com.briup.briuppts.entity.ext.AnimalExtend;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ManagerAnimalService {

    PageInfo<AnimalExtend> findAllAnimalsByPage(String aHealthy, String aGender, Integer pageNum, Integer pageSize);

    void addOrEditAnimal(ManagerAnimal animal);
    void delete(String id);
    void deleteByBatch(List<String> ids);
}
