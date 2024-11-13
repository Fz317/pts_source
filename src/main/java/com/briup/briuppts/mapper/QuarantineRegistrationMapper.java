package com.briup.briuppts.mapper;

import com.briup.briuppts.entity.QuarantineRegistration;
import com.briup.briuppts.entity.QuarantineRegistrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuarantineRegistrationMapper {
    long countByExample(QuarantineRegistrationExample example);

    int deleteByExample(QuarantineRegistrationExample example);

    int deleteByPrimaryKey(Integer grId);

    int insert(QuarantineRegistration record);

    int insertSelective(QuarantineRegistration record);

    List<QuarantineRegistration> selectByExample(QuarantineRegistrationExample example);

    QuarantineRegistration selectByPrimaryKey(Integer grId);

    int updateByExampleSelective(@Param("record") QuarantineRegistration record, @Param("example") QuarantineRegistrationExample example);

    int updateByExample(@Param("record") QuarantineRegistration record, @Param("example") QuarantineRegistrationExample example);

    int updateByPrimaryKeySelective(QuarantineRegistration record);

    int updateByPrimaryKey(QuarantineRegistration record);
}