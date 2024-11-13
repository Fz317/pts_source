package com.briup.briuppts.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * quarantine_registration
 * @author 
 */
@Data
public class QuarantineRegistration implements Serializable {
    /**
     * 记录id
     */
    private Integer grId;

    /**
     * 检疫时间
     */
    private String grTime;

    /**
     * 检疫证明图片
     */
    private String grImg;

    /**
     * 检疫机构
     */
    private String grMechanism;

    /**
     * 批次id
     */
    private String grBatchId;

    /**
     * 检疫结果
     */
    @JsonProperty("bQualified")
    private String bQualified;

    private static final long serialVersionUID = 1L;
}