package com.netctoss.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdIsNull() {
            addCriterion("account_recommender_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdIsNotNull() {
            addCriterion("account_recommender_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdEqualTo(Integer value) {
            addCriterion("account_recommender_id =", value, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdNotEqualTo(Integer value) {
            addCriterion("account_recommender_id <>", value, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdGreaterThan(Integer value) {
            addCriterion("account_recommender_id >", value, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_recommender_id >=", value, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdLessThan(Integer value) {
            addCriterion("account_recommender_id <", value, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_recommender_id <=", value, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdIn(List<Integer> values) {
            addCriterion("account_recommender_id in", values, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdNotIn(List<Integer> values) {
            addCriterion("account_recommender_id not in", values, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdBetween(Integer value1, Integer value2) {
            addCriterion("account_recommender_id between", value1, value2, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountRecommenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_recommender_id not between", value1, value2, "accountRecommenderId");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameIsNull() {
            addCriterion("account_login_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameIsNotNull() {
            addCriterion("account_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameEqualTo(String value) {
            addCriterion("account_login_name =", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameNotEqualTo(String value) {
            addCriterion("account_login_name <>", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameGreaterThan(String value) {
            addCriterion("account_login_name >", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_login_name >=", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameLessThan(String value) {
            addCriterion("account_login_name <", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameLessThanOrEqualTo(String value) {
            addCriterion("account_login_name <=", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameLike(String value) {
            addCriterion("account_login_name like", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameNotLike(String value) {
            addCriterion("account_login_name not like", value, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameIn(List<String> values) {
            addCriterion("account_login_name in", values, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameNotIn(List<String> values) {
            addCriterion("account_login_name not in", values, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameBetween(String value1, String value2) {
            addCriterion("account_login_name between", value1, value2, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginNameNotBetween(String value1, String value2) {
            addCriterion("account_login_name not between", value1, value2, "accountLoginName");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdIsNull() {
            addCriterion("account_login_passwd is null");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdIsNotNull() {
            addCriterion("account_login_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdEqualTo(String value) {
            addCriterion("account_login_passwd =", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdNotEqualTo(String value) {
            addCriterion("account_login_passwd <>", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdGreaterThan(String value) {
            addCriterion("account_login_passwd >", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("account_login_passwd >=", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdLessThan(String value) {
            addCriterion("account_login_passwd <", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdLessThanOrEqualTo(String value) {
            addCriterion("account_login_passwd <=", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdLike(String value) {
            addCriterion("account_login_passwd like", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdNotLike(String value) {
            addCriterion("account_login_passwd not like", value, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdIn(List<String> values) {
            addCriterion("account_login_passwd in", values, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdNotIn(List<String> values) {
            addCriterion("account_login_passwd not in", values, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdBetween(String value1, String value2) {
            addCriterion("account_login_passwd between", value1, value2, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountLoginPasswdNotBetween(String value1, String value2) {
            addCriterion("account_login_passwd not between", value1, value2, "accountLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(String value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(String value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(String value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(String value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(String value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(String value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLike(String value) {
            addCriterion("account_status like", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotLike(String value) {
            addCriterion("account_status not like", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<String> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<String> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(String value1, String value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(String value1, String value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateIsNull() {
            addCriterion("account_create_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateIsNotNull() {
            addCriterion("account_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateEqualTo(Date value) {
            addCriterion("account_create_date =", value, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateNotEqualTo(Date value) {
            addCriterion("account_create_date <>", value, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateGreaterThan(Date value) {
            addCriterion("account_create_date >", value, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("account_create_date >=", value, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateLessThan(Date value) {
            addCriterion("account_create_date <", value, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("account_create_date <=", value, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateIn(List<Date> values) {
            addCriterion("account_create_date in", values, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateNotIn(List<Date> values) {
            addCriterion("account_create_date not in", values, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateBetween(Date value1, Date value2) {
            addCriterion("account_create_date between", value1, value2, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("account_create_date not between", value1, value2, "accountCreateDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateIsNull() {
            addCriterion("account_pause_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateIsNotNull() {
            addCriterion("account_pause_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateEqualTo(Date value) {
            addCriterion("account_pause_date =", value, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateNotEqualTo(Date value) {
            addCriterion("account_pause_date <>", value, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateGreaterThan(Date value) {
            addCriterion("account_pause_date >", value, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("account_pause_date >=", value, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateLessThan(Date value) {
            addCriterion("account_pause_date <", value, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateLessThanOrEqualTo(Date value) {
            addCriterion("account_pause_date <=", value, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateIn(List<Date> values) {
            addCriterion("account_pause_date in", values, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateNotIn(List<Date> values) {
            addCriterion("account_pause_date not in", values, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateBetween(Date value1, Date value2) {
            addCriterion("account_pause_date between", value1, value2, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountPauseDateNotBetween(Date value1, Date value2) {
            addCriterion("account_pause_date not between", value1, value2, "accountPauseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateIsNull() {
            addCriterion("account_close_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateIsNotNull() {
            addCriterion("account_close_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateEqualTo(Date value) {
            addCriterion("account_close_date =", value, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateNotEqualTo(Date value) {
            addCriterion("account_close_date <>", value, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateGreaterThan(Date value) {
            addCriterion("account_close_date >", value, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("account_close_date >=", value, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateLessThan(Date value) {
            addCriterion("account_close_date <", value, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateLessThanOrEqualTo(Date value) {
            addCriterion("account_close_date <=", value, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateIn(List<Date> values) {
            addCriterion("account_close_date in", values, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateNotIn(List<Date> values) {
            addCriterion("account_close_date not in", values, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateBetween(Date value1, Date value2) {
            addCriterion("account_close_date between", value1, value2, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountCloseDateNotBetween(Date value1, Date value2) {
            addCriterion("account_close_date not between", value1, value2, "accountCloseDate");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameIsNull() {
            addCriterion("account_real_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameIsNotNull() {
            addCriterion("account_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameEqualTo(String value) {
            addCriterion("account_real_name =", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameNotEqualTo(String value) {
            addCriterion("account_real_name <>", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameGreaterThan(String value) {
            addCriterion("account_real_name >", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_real_name >=", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameLessThan(String value) {
            addCriterion("account_real_name <", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameLessThanOrEqualTo(String value) {
            addCriterion("account_real_name <=", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameLike(String value) {
            addCriterion("account_real_name like", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameNotLike(String value) {
            addCriterion("account_real_name not like", value, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameIn(List<String> values) {
            addCriterion("account_real_name in", values, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameNotIn(List<String> values) {
            addCriterion("account_real_name not in", values, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameBetween(String value1, String value2) {
            addCriterion("account_real_name between", value1, value2, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountRealNameNotBetween(String value1, String value2) {
            addCriterion("account_real_name not between", value1, value2, "accountRealName");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoIsNull() {
            addCriterion("account_idcard_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoIsNotNull() {
            addCriterion("account_idcard_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoEqualTo(String value) {
            addCriterion("account_idcard_no =", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoNotEqualTo(String value) {
            addCriterion("account_idcard_no <>", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoGreaterThan(String value) {
            addCriterion("account_idcard_no >", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_idcard_no >=", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoLessThan(String value) {
            addCriterion("account_idcard_no <", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("account_idcard_no <=", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoLike(String value) {
            addCriterion("account_idcard_no like", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoNotLike(String value) {
            addCriterion("account_idcard_no not like", value, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoIn(List<String> values) {
            addCriterion("account_idcard_no in", values, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoNotIn(List<String> values) {
            addCriterion("account_idcard_no not in", values, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoBetween(String value1, String value2) {
            addCriterion("account_idcard_no between", value1, value2, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountIdcardNoNotBetween(String value1, String value2) {
            addCriterion("account_idcard_no not between", value1, value2, "accountIdcardNo");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateIsNull() {
            addCriterion("account_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateIsNotNull() {
            addCriterion("account_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateEqualTo(Date value) {
            addCriterion("account_birthdate =", value, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateNotEqualTo(Date value) {
            addCriterion("account_birthdate <>", value, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateGreaterThan(Date value) {
            addCriterion("account_birthdate >", value, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("account_birthdate >=", value, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateLessThan(Date value) {
            addCriterion("account_birthdate <", value, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateLessThanOrEqualTo(Date value) {
            addCriterion("account_birthdate <=", value, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateIn(List<Date> values) {
            addCriterion("account_birthdate in", values, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateNotIn(List<Date> values) {
            addCriterion("account_birthdate not in", values, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateBetween(Date value1, Date value2) {
            addCriterion("account_birthdate between", value1, value2, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountBirthdateNotBetween(Date value1, Date value2) {
            addCriterion("account_birthdate not between", value1, value2, "accountBirthdate");
            return (Criteria) this;
        }

        public Criteria andAccountGenderIsNull() {
            addCriterion("account_gender is null");
            return (Criteria) this;
        }

        public Criteria andAccountGenderIsNotNull() {
            addCriterion("account_gender is not null");
            return (Criteria) this;
        }

        public Criteria andAccountGenderEqualTo(String value) {
            addCriterion("account_gender =", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderNotEqualTo(String value) {
            addCriterion("account_gender <>", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderGreaterThan(String value) {
            addCriterion("account_gender >", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderGreaterThanOrEqualTo(String value) {
            addCriterion("account_gender >=", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderLessThan(String value) {
            addCriterion("account_gender <", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderLessThanOrEqualTo(String value) {
            addCriterion("account_gender <=", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderLike(String value) {
            addCriterion("account_gender like", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderNotLike(String value) {
            addCriterion("account_gender not like", value, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderIn(List<String> values) {
            addCriterion("account_gender in", values, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderNotIn(List<String> values) {
            addCriterion("account_gender not in", values, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderBetween(String value1, String value2) {
            addCriterion("account_gender between", value1, value2, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountGenderNotBetween(String value1, String value2) {
            addCriterion("account_gender not between", value1, value2, "accountGender");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationIsNull() {
            addCriterion("account_occupation is null");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationIsNotNull() {
            addCriterion("account_occupation is not null");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationEqualTo(String value) {
            addCriterion("account_occupation =", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationNotEqualTo(String value) {
            addCriterion("account_occupation <>", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationGreaterThan(String value) {
            addCriterion("account_occupation >", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("account_occupation >=", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationLessThan(String value) {
            addCriterion("account_occupation <", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationLessThanOrEqualTo(String value) {
            addCriterion("account_occupation <=", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationLike(String value) {
            addCriterion("account_occupation like", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationNotLike(String value) {
            addCriterion("account_occupation not like", value, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationIn(List<String> values) {
            addCriterion("account_occupation in", values, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationNotIn(List<String> values) {
            addCriterion("account_occupation not in", values, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationBetween(String value1, String value2) {
            addCriterion("account_occupation between", value1, value2, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountOccupationNotBetween(String value1, String value2) {
            addCriterion("account_occupation not between", value1, value2, "accountOccupation");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneIsNull() {
            addCriterion("account_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneIsNotNull() {
            addCriterion("account_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneEqualTo(String value) {
            addCriterion("account_telephone =", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotEqualTo(String value) {
            addCriterion("account_telephone <>", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneGreaterThan(String value) {
            addCriterion("account_telephone >", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("account_telephone >=", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneLessThan(String value) {
            addCriterion("account_telephone <", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneLessThanOrEqualTo(String value) {
            addCriterion("account_telephone <=", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneLike(String value) {
            addCriterion("account_telephone like", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotLike(String value) {
            addCriterion("account_telephone not like", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneIn(List<String> values) {
            addCriterion("account_telephone in", values, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotIn(List<String> values) {
            addCriterion("account_telephone not in", values, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneBetween(String value1, String value2) {
            addCriterion("account_telephone between", value1, value2, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotBetween(String value1, String value2) {
            addCriterion("account_telephone not between", value1, value2, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNull() {
            addCriterion("account_email is null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNotNull() {
            addCriterion("account_email is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailEqualTo(String value) {
            addCriterion("account_email =", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotEqualTo(String value) {
            addCriterion("account_email <>", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThan(String value) {
            addCriterion("account_email >", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThanOrEqualTo(String value) {
            addCriterion("account_email >=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThan(String value) {
            addCriterion("account_email <", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThanOrEqualTo(String value) {
            addCriterion("account_email <=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLike(String value) {
            addCriterion("account_email like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotLike(String value) {
            addCriterion("account_email not like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIn(List<String> values) {
            addCriterion("account_email in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotIn(List<String> values) {
            addCriterion("account_email not in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailBetween(String value1, String value2) {
            addCriterion("account_email between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotBetween(String value1, String value2) {
            addCriterion("account_email not between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressIsNull() {
            addCriterion("account_mail_address is null");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressIsNotNull() {
            addCriterion("account_mail_address is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressEqualTo(String value) {
            addCriterion("account_mail_address =", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressNotEqualTo(String value) {
            addCriterion("account_mail_address <>", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressGreaterThan(String value) {
            addCriterion("account_mail_address >", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("account_mail_address >=", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressLessThan(String value) {
            addCriterion("account_mail_address <", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressLessThanOrEqualTo(String value) {
            addCriterion("account_mail_address <=", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressLike(String value) {
            addCriterion("account_mail_address like", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressNotLike(String value) {
            addCriterion("account_mail_address not like", value, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressIn(List<String> values) {
            addCriterion("account_mail_address in", values, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressNotIn(List<String> values) {
            addCriterion("account_mail_address not in", values, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressBetween(String value1, String value2) {
            addCriterion("account_mail_address between", value1, value2, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountMailAddressNotBetween(String value1, String value2) {
            addCriterion("account_mail_address not between", value1, value2, "accountMailAddress");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeIsNull() {
            addCriterion("account_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeIsNotNull() {
            addCriterion("account_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeEqualTo(String value) {
            addCriterion("account_zipcode =", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeNotEqualTo(String value) {
            addCriterion("account_zipcode <>", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeGreaterThan(String value) {
            addCriterion("account_zipcode >", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("account_zipcode >=", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeLessThan(String value) {
            addCriterion("account_zipcode <", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeLessThanOrEqualTo(String value) {
            addCriterion("account_zipcode <=", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeLike(String value) {
            addCriterion("account_zipcode like", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeNotLike(String value) {
            addCriterion("account_zipcode not like", value, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeIn(List<String> values) {
            addCriterion("account_zipcode in", values, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeNotIn(List<String> values) {
            addCriterion("account_zipcode not in", values, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeBetween(String value1, String value2) {
            addCriterion("account_zipcode between", value1, value2, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountZipcodeNotBetween(String value1, String value2) {
            addCriterion("account_zipcode not between", value1, value2, "accountZipcode");
            return (Criteria) this;
        }

        public Criteria andAccountQqIsNull() {
            addCriterion("account_qq is null");
            return (Criteria) this;
        }

        public Criteria andAccountQqIsNotNull() {
            addCriterion("account_qq is not null");
            return (Criteria) this;
        }

        public Criteria andAccountQqEqualTo(String value) {
            addCriterion("account_qq =", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotEqualTo(String value) {
            addCriterion("account_qq <>", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqGreaterThan(String value) {
            addCriterion("account_qq >", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqGreaterThanOrEqualTo(String value) {
            addCriterion("account_qq >=", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqLessThan(String value) {
            addCriterion("account_qq <", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqLessThanOrEqualTo(String value) {
            addCriterion("account_qq <=", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqLike(String value) {
            addCriterion("account_qq like", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotLike(String value) {
            addCriterion("account_qq not like", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqIn(List<String> values) {
            addCriterion("account_qq in", values, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotIn(List<String> values) {
            addCriterion("account_qq not in", values, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqBetween(String value1, String value2) {
            addCriterion("account_qq between", value1, value2, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotBetween(String value1, String value2) {
            addCriterion("account_qq not between", value1, value2, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeIsNull() {
            addCriterion("account_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeIsNotNull() {
            addCriterion("account_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeEqualTo(Date value) {
            addCriterion("account_last_login_time =", value, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeNotEqualTo(Date value) {
            addCriterion("account_last_login_time <>", value, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeGreaterThan(Date value) {
            addCriterion("account_last_login_time >", value, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_last_login_time >=", value, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeLessThan(Date value) {
            addCriterion("account_last_login_time <", value, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_last_login_time <=", value, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeIn(List<Date> values) {
            addCriterion("account_last_login_time in", values, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeNotIn(List<Date> values) {
            addCriterion("account_last_login_time not in", values, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("account_last_login_time between", value1, value2, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_last_login_time not between", value1, value2, "accountLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpIsNull() {
            addCriterion("account_last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpIsNotNull() {
            addCriterion("account_last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpEqualTo(String value) {
            addCriterion("account_last_login_ip =", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpNotEqualTo(String value) {
            addCriterion("account_last_login_ip <>", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpGreaterThan(String value) {
            addCriterion("account_last_login_ip >", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("account_last_login_ip >=", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpLessThan(String value) {
            addCriterion("account_last_login_ip <", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("account_last_login_ip <=", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpLike(String value) {
            addCriterion("account_last_login_ip like", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpNotLike(String value) {
            addCriterion("account_last_login_ip not like", value, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpIn(List<String> values) {
            addCriterion("account_last_login_ip in", values, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpNotIn(List<String> values) {
            addCriterion("account_last_login_ip not in", values, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpBetween(String value1, String value2) {
            addCriterion("account_last_login_ip between", value1, value2, "accountLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andAccountLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("account_last_login_ip not between", value1, value2, "accountLastLoginIp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}