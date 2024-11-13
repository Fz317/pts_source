package com.briup.briuppts.mapper;

import com.briup.briuppts.entity.ManagerAnimal;
import com.briup.briuppts.entity.ext.AnimalExtend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ManagerAnimalMapper {

    List<AnimalExtend> selectAll(@Param("aHealthy") String aHealthy,
                                 @Param("aGender") String aGender);

    int insert(ManagerAnimal animal);

    ManagerAnimal selectByAAnimalId(String animalId);

    int updateByPrimarySelective(ManagerAnimal animal);
    int updateByPrimary(@Param("healthy")String status,@Param("animalId")String id);
    void deleteByAAnimalId(String id);
}