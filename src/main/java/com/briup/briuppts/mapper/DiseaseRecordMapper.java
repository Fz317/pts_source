package com.briup.briuppts.mapper;

import com.briup.briuppts.entity.DiseaseRecord;
import com.briup.briuppts.entity.DiseaseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRecordMapper {
    long countByExample(DiseaseRecordExample example);

    int deleteByExample(DiseaseRecordExample example);

    int deleteByPrimaryKey(Integer drId);

    int insert(DiseaseRecord record);

    int insertSelective(DiseaseRecord record);

    List<DiseaseRecord> selectByExample(DiseaseRecordExample example);

    DiseaseRecord selectByPrimaryKey(Integer drId);

    int updateByExampleSelective(@Param("record") DiseaseRecord record, @Param("example") DiseaseRecordExample example);

    int updateByExample(@Param("record") DiseaseRecord record, @Param("example") DiseaseRecordExample example);

    int updateByPrimaryKeySelective(DiseaseRecord record);

    int updateByPrimaryKey(DiseaseRecord record);
}