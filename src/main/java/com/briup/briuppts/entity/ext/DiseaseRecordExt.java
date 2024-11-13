package com.briup.briuppts.entity.ext;

import com.briup.briuppts.entity.DiseaseRecord;
import com.briup.briuppts.entity.ManagerDisease;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @BelongsProject: briup-pts
 * @BelongsPackage: com.briup.briuppts.entity.ext
 * @Author: Fz
 * @CreateTime: 2024-11-06  19:02
 * @Description: TODO
 * @Version: 1.0
 */
@Data
public class DiseaseRecordExt extends DiseaseRecord {
    @JsonProperty("disease")
    ManagerDisease disease;
}
