package com.netctoss.pojo;

import java.util.Date;

public class Cost {
    private Integer costId;

    private String costName;

    private Integer costBaseDuration;

    private Double costBaseCost;

    private Double costUnitCost;

    private String costStatus;

    private String costDescr;

    private Date costCreattime;

    private Date costStarttime;

    private String costType;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName == null ? null : costName.trim();
    }

    public Integer getCostBaseDuration() {
        return costBaseDuration;
    }

    public void setCostBaseDuration(Integer costBaseDuration) {
        this.costBaseDuration = costBaseDuration;
    }

    public Double getCostBaseCost() {
        return costBaseCost;
    }

    public void setCostBaseCost(Double costBaseCost) {
        this.costBaseCost = costBaseCost;
    }

    public Double getCostUnitCost() {
        return costUnitCost;
    }

    public void setCostUnitCost(Double costUnitCost) {
        this.costUnitCost = costUnitCost;
    }

    public String getCostStatus() {
        return costStatus;
    }

    public void setCostStatus(String costStatus) {
        this.costStatus = costStatus == null ? null : costStatus.trim();
    }

    public String getCostDescr() {
        return costDescr;
    }

    public void setCostDescr(String costDescr) {
        this.costDescr = costDescr == null ? null : costDescr.trim();
    }

    public Date getCostCreattime() {
        return costCreattime;
    }

    public void setCostCreattime(Date costCreattime) {
        this.costCreattime = costCreattime;
    }

    public Date getCostStarttime() {
        return costStarttime;
    }

    public void setCostStarttime(Date costStarttime) {
        this.costStarttime = costStarttime;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType == null ? null : costType.trim();
    }
}