package com.briup.briuppts.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 疾病记录表
 * disease_record
 */
@Data
public class DiseaseRecord implements Serializable {
    /**
     * 记录id
     */
    @JsonProperty("drId")
    private Integer drId;

    /**
     * 动物编号
     */
    @JsonProperty("drAnimalId")
    private String drAnimalId;

    /**
     * 症状描述
     */
    @JsonProperty("drDesc")
    private String drDesc;

    /**
     * 治疗过程描述
     */
    @JsonProperty("drCure")
    private String drCure;

    /**
     * 治疗时间
     */
    @JsonProperty("drTime")
    private String drTime;

    /**
     *  未治疗,治疗中,已治疗
     */
    @JsonProperty("drStatus")
    private String drStatus;

    /**
     * 病症类型id
     */
    @JsonProperty("drDId")
    private Integer drDId;

    private static final long serialVersionUID = 1L;
}