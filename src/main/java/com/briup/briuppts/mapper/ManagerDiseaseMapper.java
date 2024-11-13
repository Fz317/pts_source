package com.briup.briuppts.mapper;

import com.briup.briuppts.entity.ManagerDisease;
import com.briup.briuppts.entity.ManagerDiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerDiseaseMapper {
    long countByExample(ManagerDiseaseExample example);

    int deleteByExample(ManagerDiseaseExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(ManagerDisease record);

    int insertSelective(ManagerDisease record);

    List<ManagerDisease> selectByExample(ManagerDiseaseExample example);

    ManagerDisease selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") ManagerDisease record, @Param("example") ManagerDiseaseExample example);

    int updateByExample(@Param("record") ManagerDisease record, @Param("example") ManagerDiseaseExample example);

    int updateByPrimaryKeySelective(ManagerDisease record);

    int updateByPrimaryKey(ManagerDisease record);
}