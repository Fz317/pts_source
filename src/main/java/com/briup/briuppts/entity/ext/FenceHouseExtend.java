package com.briup.briuppts.entity.ext;
import com.briup.briuppts.entity.ManagerFenceHouse;
import com.briup.briuppts.entity.ManagerHurdles;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

/**
 * @BelongsProject: pts_source
 * @BelongsPackage: com.briup.entity.ext
 * @Author: Fz
 * @CreateTime: 2024-11-04  16:48
 * @Description: TODO
 * @Version: 1.0
 */
@Data
public class FenceHouseExtend extends ManagerFenceHouse {
    @JsonProperty("mhs")
    private List<ManagerHurdles> managerHurdles;
}
