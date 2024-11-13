package com.briup.briuppts.mapper;

import com.briup.briuppts.entity.ManagerHurdles;
import com.briup.briuppts.entity.ManagerHurdlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerHurdlesMapper {
    long countByExample(ManagerHurdlesExample example);

    int deleteByExample(ManagerHurdlesExample example);

    int deleteByPrimaryKey(String hId);

    int insert(ManagerHurdles record);

    int insertSelective(ManagerHurdles record);

    List<ManagerHurdles> selectByExample(ManagerHurdlesExample example);

    ManagerHurdles selectByPrimaryKey(String hId);

    int updateByExampleSelective(@Param("record") ManagerHurdles record, @Param("example") ManagerHurdlesExample example);

    int updateByExample(@Param("record") ManagerHurdles record, @Param("example") ManagerHurdlesExample example);

    int updateByPrimaryKeySelective(ManagerHurdles record);

    int updateByPrimaryKey(ManagerHurdles record);
}