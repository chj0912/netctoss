package com.netctoss.pojo;

import java.util.Date;

public class ServiceUpdate {
    private Integer id;

    private Integer serviceId;

    private String unixHost;

    private String osUsername;

    private Integer costId;

    private Date serviceCreateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getUnixHost() {
        return unixHost;
    }

    public void setUnixHost(String unixHost) {
        this.unixHost = unixHost == null ? null : unixHost.trim();
    }

    public String getOsUsername() {
        return osUsername;
    }

    public void setOsUsername(String osUsername) {
        this.osUsername = osUsername == null ? null : osUsername.trim();
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public Date getServiceCreateDate() {
        return serviceCreateDate;
    }

    public void setServiceCreateDate(Date serviceCreateDate) {
        this.serviceCreateDate = serviceCreateDate;
    }
}