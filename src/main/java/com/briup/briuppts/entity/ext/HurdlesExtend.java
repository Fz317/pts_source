package com.briup.briuppts.entity.ext;

import com.briup.briuppts.entity.ManagerFenceHouse;
import com.briup.briuppts.entity.ManagerHurdles;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class HurdlesExtend extends ManagerHurdles {
    @JsonProperty("managerFenceHouse")
    ManagerFenceHouse fenceHouse;
}
