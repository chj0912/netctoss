package com.netctoss.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Account {
    private Integer accountId;

    private Integer accountRecommenderId;

    private String accountLoginName;

    private String accountLoginPasswd;

    private String accountStatus;

    private Date accountCreateDate;

    private Date accountPauseDate;

    private Date accountCloseDate;

    private String accountRealName;

    private String accountIdcardNo;

    private Date accountBirthdate;

    private String accountGender;

    private String accountOccupation;

    private String accountTelephone;

    private String accountEmail;

    private String accountMailAddress;

    private String accountZipcode;

    private String accountQq;

    private Date accountLastLoginTime;

    private String accountLastLoginIp;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountRecommenderId() {
        return accountRecommenderId;
    }

    public void setAccountRecommenderId(Integer accountRecommenderId) {
        this.accountRecommenderId = accountRecommenderId;
    }

    public String getAccountLoginName() {
        return accountLoginName;
    }

    public void setAccountLoginName(String accountLoginName) {
        this.accountLoginName = accountLoginName == null ? null : accountLoginName.trim();
    }

    public String getAccountLoginPasswd() {
        return accountLoginPasswd;
    }

    public void setAccountLoginPasswd(String accountLoginPasswd) {
        this.accountLoginPasswd = accountLoginPasswd == null ? null : accountLoginPasswd.trim();
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus == null ? null : accountStatus.trim();
    }

    public Date getAccountCreateDate() {
        return accountCreateDate;
    }

    public void setAccountCreateDate(Date accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    public Date getAccountPauseDate() {
        return accountPauseDate;
    }

    public void setAccountPauseDate(Date accountPauseDate) {
        this.accountPauseDate = accountPauseDate;
    }

    public Date getAccountCloseDate() {
        return accountCloseDate;
    }

    public void setAccountCloseDate(Date accountCloseDate) {
        this.accountCloseDate = accountCloseDate;
    }

    public String getAccountRealName() {
        return accountRealName;
    }

    public void setAccountRealName(String accountRealName) {
        this.accountRealName = accountRealName == null ? null : accountRealName.trim();
    }

    public String getAccountIdcardNo() {
        return accountIdcardNo;
    }

    public void setAccountIdcardNo(String accountIdcardNo) {
        this.accountIdcardNo = accountIdcardNo == null ? null : accountIdcardNo.trim();
    }

    public Date getAccountBirthdate() {
        return accountBirthdate;
    }

    public void setAccountBirthdate(Date accountBirthdate) {
        this.accountBirthdate = accountBirthdate;
    }

    public String getAccountGender() {
        return accountGender;
    }

    public void setAccountGender(String accountGender) {
        this.accountGender = accountGender == null ? null : accountGender.trim();
    }

    public String getAccountOccupation() {
        return accountOccupation;
    }

    public void setAccountOccupation(String accountOccupation) {
        this.accountOccupation = accountOccupation == null ? null : accountOccupation.trim();
    }

    public String getAccountTelephone() {
        return accountTelephone;
    }

    public void setAccountTelephone(String accountTelephone) {
        this.accountTelephone = accountTelephone == null ? null : accountTelephone.trim();
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail == null ? null : accountEmail.trim();
    }

    public String getAccountMailAddress() {
        return accountMailAddress;
    }

    public void setAccountMailAddress(String accountMailAddress) {
        this.accountMailAddress = accountMailAddress == null ? null : accountMailAddress.trim();
    }

    public String getAccountZipcode() {
        return accountZipcode;
    }

    public void setAccountZipcode(String accountZipcode) {
        this.accountZipcode = accountZipcode == null ? null : accountZipcode.trim();
    }

    public String getAccountQq() {
        return accountQq;
    }

    public void setAccountQq(String accountQq) {
        this.accountQq = accountQq == null ? null : accountQq.trim();
    }

    public Date getAccountLastLoginTime() {
        return accountLastLoginTime;
    }

    public void setAccountLastLoginTime(Date accountLastLoginTime) {
        this.accountLastLoginTime = accountLastLoginTime;
    }

    public String getAccountLastLoginIp() {
        return accountLastLoginIp;
    }

    public void setAccountLastLoginIp(String accountLastLoginIp) {
        this.accountLastLoginIp = accountLastLoginIp == null ? null : accountLastLoginIp.trim();
    }
}