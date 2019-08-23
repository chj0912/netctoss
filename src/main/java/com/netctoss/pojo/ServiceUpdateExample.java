package com.netctoss.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceUpdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceUpdateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andUnixHostIsNull() {
            addCriterion("unix_host is null");
            return (Criteria) this;
        }

        public Criteria andUnixHostIsNotNull() {
            addCriterion("unix_host is not null");
            return (Criteria) this;
        }

        public Criteria andUnixHostEqualTo(String value) {
            addCriterion("unix_host =", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostNotEqualTo(String value) {
            addCriterion("unix_host <>", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostGreaterThan(String value) {
            addCriterion("unix_host >", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostGreaterThanOrEqualTo(String value) {
            addCriterion("unix_host >=", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostLessThan(String value) {
            addCriterion("unix_host <", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostLessThanOrEqualTo(String value) {
            addCriterion("unix_host <=", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostLike(String value) {
            addCriterion("unix_host like", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostNotLike(String value) {
            addCriterion("unix_host not like", value, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostIn(List<String> values) {
            addCriterion("unix_host in", values, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostNotIn(List<String> values) {
            addCriterion("unix_host not in", values, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostBetween(String value1, String value2) {
            addCriterion("unix_host between", value1, value2, "unixHost");
            return (Criteria) this;
        }

        public Criteria andUnixHostNotBetween(String value1, String value2) {
            addCriterion("unix_host not between", value1, value2, "unixHost");
            return (Criteria) this;
        }

        public Criteria andOsUsernameIsNull() {
            addCriterion("os_username is null");
            return (Criteria) this;
        }

        public Criteria andOsUsernameIsNotNull() {
            addCriterion("os_username is not null");
            return (Criteria) this;
        }

        public Criteria andOsUsernameEqualTo(String value) {
            addCriterion("os_username =", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameNotEqualTo(String value) {
            addCriterion("os_username <>", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameGreaterThan(String value) {
            addCriterion("os_username >", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("os_username >=", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameLessThan(String value) {
            addCriterion("os_username <", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameLessThanOrEqualTo(String value) {
            addCriterion("os_username <=", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameLike(String value) {
            addCriterion("os_username like", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameNotLike(String value) {
            addCriterion("os_username not like", value, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameIn(List<String> values) {
            addCriterion("os_username in", values, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameNotIn(List<String> values) {
            addCriterion("os_username not in", values, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameBetween(String value1, String value2) {
            addCriterion("os_username between", value1, value2, "osUsername");
            return (Criteria) this;
        }

        public Criteria andOsUsernameNotBetween(String value1, String value2) {
            addCriterion("os_username not between", value1, value2, "osUsername");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNull() {
            addCriterion("cost_id is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(Integer value) {
            addCriterion("cost_id =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(Integer value) {
            addCriterion("cost_id <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(Integer value) {
            addCriterion("cost_id >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_id >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(Integer value) {
            addCriterion("cost_id <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("cost_id <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<Integer> values) {
            addCriterion("cost_id in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<Integer> values) {
            addCriterion("cost_id not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(Integer value1, Integer value2) {
            addCriterion("cost_id between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_id not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateIsNull() {
            addCriterion("service_create_date is null");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateIsNotNull() {
            addCriterion("service_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateEqualTo(Date value) {
            addCriterion("service_create_date =", value, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateNotEqualTo(Date value) {
            addCriterion("service_create_date <>", value, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateGreaterThan(Date value) {
            addCriterion("service_create_date >", value, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("service_create_date >=", value, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateLessThan(Date value) {
            addCriterion("service_create_date <", value, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("service_create_date <=", value, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateIn(List<Date> values) {
            addCriterion("service_create_date in", values, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateNotIn(List<Date> values) {
            addCriterion("service_create_date not in", values, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateBetween(Date value1, Date value2) {
            addCriterion("service_create_date between", value1, value2, "serviceCreateDate");
            return (Criteria) this;
        }

        public Criteria andServiceCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("service_create_date not between", value1, value2, "serviceCreateDate");
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