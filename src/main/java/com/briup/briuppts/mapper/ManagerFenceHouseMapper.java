package com.briup.briuppts.mapper;


import com.briup.briuppts.entity.ManagerFenceHouse;
import com.briup.briuppts.entity.ManagerFenceHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerFenceHouseMapper {
    long countByExample(ManagerFenceHouseExample example);
    int myinsert(ManagerFenceHouse managerFenceHouse);
    int deleteByExample(ManagerFenceHouseExample example);

    int deleteByPrimaryKey(String fhId);

    int insert(ManagerFenceHouse record);

    int insertSelective(ManagerFenceHouse record);

    List<ManagerFenceHouse> selectByExample(ManagerFenceHouseExample example);

    ManagerFenceHouse selectByPrimaryKey(String fhId);

    int updateByExampleSelective(@Param("record") ManagerFenceHouse record, @Param("example") ManagerFenceHouseExample example);

    int updateByExample(@Param("record") ManagerFenceHouse record, @Param("example") ManagerFenceHouseExample example);

    int updateByPrimaryKeySelective(ManagerFenceHouse record);

    int updateByPrimaryKey(ManagerFenceHouse record);
}