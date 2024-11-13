package com.briup.briuppts.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * manager_hurdles
 * @author 
 */
@Data
public class ManagerHurdles implements Serializable {
    /**
     * 栏圈id
     */
    @JsonProperty("hId")
    private String hId;

    /**
     * 栏圈名称
     */
    @JsonProperty("hName")
    private String hName;

    /**
     * 栏圈描述
     */
    @JsonProperty("hDesc")
    private String hDesc;

    /**
     * 栏圈存储猪容量
     */
    @JsonProperty("hMax")
    private Integer hMax;

    /**
     * 栏圈存储猪已存数量
     */
    @JsonProperty("hSaved")
    private Integer hSaved;

    /**
     * 创建时间
     */
    @JsonProperty("hTime")
    private Date hTime;

    /**
     * 状态(可用禁用)
     */
    @JsonProperty("hEnable")
    private String hEnable;

    /**
     * 状态(未满已满)
     */
    @JsonProperty("hFull")
    private String hFull;

    /**
     * 栏舍id外键
     */
    @JsonProperty("hFenceId")
    private String hFenceId;

    private static final long serialVersionUID = 1L;
}