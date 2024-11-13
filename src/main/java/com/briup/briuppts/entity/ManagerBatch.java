package com.briup.briuppts.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * manager_batch
 * @author 
 */
@Data
public class ManagerBatch implements Serializable {
    /**
     * 批次编号
     */
    @JsonProperty("bSerialId")
    private String bSerialId;

    /**
     * 批次描述
     */
    @JsonProperty("bDesc")
    private String bDesc;

    /**
     * 检疫状态,未检疫已检疫
     */
    @JsonProperty("bQuarantine")
    private String bQuarantine;

    /**
     * 检疫合格状态,合格不合格
     */
    @JsonProperty("bQualified")
    private String bQualified;

    /**
     * 批次时间
     */
    @JsonProperty("bTime")
    private Date bTime;

    private static final long serialVersionUID = 1L;
}