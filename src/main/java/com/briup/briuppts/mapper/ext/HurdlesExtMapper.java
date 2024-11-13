package com.briup.briuppts.mapper.ext;

import com.briup.briuppts.entity.ManagerHurdles;
import com.briup.briuppts.entity.ManagerHurdlesExample;
import com.briup.briuppts.entity.ext.HurdlesExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HurdlesExtMapper {

   List<HurdlesExtend> selectHurdlesExtendByCondition(@Param("hName") String hName,
                                                      @Param("hMax") Integer hMax,
                                                      @Param("fhName") String fhName,
                                                      @Param("hEnable") String hEnable);
}