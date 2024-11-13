package com.briup.briuppts.entity.ext;

import com.briup.briuppts.entity.ManagerAnimal;
import com.briup.briuppts.entity.ManagerBatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class AnimalExtend extends ManagerAnimal {
    @JsonProperty("managerHurdles")
    private String hurdle;
    @JsonProperty("managerFenceHouse")
    private String fenceHouse;
    @JsonProperty("managerBatch")
    private ManagerBatch batch;
}
