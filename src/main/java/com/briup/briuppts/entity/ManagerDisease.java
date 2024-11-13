package com.briup.briuppts.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 疾病类型表
 * manager_disease
 */
@Data
public class ManagerDisease implements Serializable {
    /**
     * 病症id
     */
    @JsonProperty("dId")
    private Integer dId;

    /**
     * 病症名称
     */
    @JsonProperty("dName")
    private String dName;

    /**
     * 病症描述
     */
    @JsonProperty("dDesc")
    private String dDesc;

    /**
     * 病症类型
     */
    @JsonProperty("dType")
    private String dType;

    /**
     * 病源
     */
    @JsonProperty("dEtiology")
    private String dEtiology;

    /**
     * 症状
     */
    @JsonProperty("dSymptom")
    private String dSymptom;

    /**
     * 预防方式
     */
    @JsonProperty("dPrevention")
    private String dPrevention;

    private static final long serialVersionUID = 1L;
}