package com.briup.briuppts.mapper;

import com.briup.briuppts.entity.ManagerBatch;
import com.briup.briuppts.entity.ManagerBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerBatchMapper {
    long countByExample(ManagerBatchExample example);

    int deleteByExample(ManagerBatchExample example);

    int deleteByPrimaryKey(String bSerialId);

    int insert(ManagerBatch record);

    int insertSelective(ManagerBatch record);

    List<ManagerBatch> selectByExample(ManagerBatchExample example);

    ManagerBatch selectByPrimaryKey(String bSerialId);

    int updateByExampleSelective(@Param("record") ManagerBatch record, @Param("example") ManagerBatchExample example);

    int updateByExample(@Param("record") ManagerBatch record, @Param("example") ManagerBatchExample example);

    int updateByPrimaryKeySelective(ManagerBatch record);

    int updateByPrimaryKey(ManagerBatch record);
}