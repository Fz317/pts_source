package com.briup.briuppts.mapper.ext;

/**
 * @BelongsProject: briup-pts
 * @BelongsPackage: com.briup.briuppts.mapper.ext
 * @Author: Fz
 * @CreateTime: 2024-11-06  19:07
 * @Description: TODO
 * @Version: 1.0
 */

import org.springframework.stereotype.Repository;

import com.briup.briuppts.entity.ext.DiseaseRecordExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Repository
public interface DiseaseExtendMapper {
    List<DiseaseRecordExt> selectDiseasedAnimal(@Param("drStatus") String drStatus,
                                                @Param("drDId") Integer drDId);
}
