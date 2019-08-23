package com.netctoss.pojo;

import java.util.Date;

public class AdminInfo {
    private Integer adminId;

    private String adminCode;

    private String adminPassword;

    private String adminName;

    private String adminTelephone;

    private String adminEmail;

    private Date adminEnrolldate;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode == null ? null : adminCode.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminTelephone() {
        return adminTelephone;
    }

    public void setAdminTelephone(String adminTelephone) {
        this.adminTelephone = adminTelephone == null ? null : adminTelephone.trim();
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    public Date getAdminEnrolldate() {
        return adminEnrolldate;
    }

    public void setAdminEnrolldate(Date adminEnrolldate) {
        this.adminEnrolldate = adminEnrolldate;
    }
}