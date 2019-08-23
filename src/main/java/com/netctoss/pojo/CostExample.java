package com.netctoss.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostExample() {
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

        public Criteria andCostNameIsNull() {
            addCriterion("cost_name is null");
            return (Criteria) this;
        }

        public Criteria andCostNameIsNotNull() {
            addCriterion("cost_name is not null");
            return (Criteria) this;
        }

        public Criteria andCostNameEqualTo(String value) {
            addCriterion("cost_name =", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotEqualTo(String value) {
            addCriterion("cost_name <>", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameGreaterThan(String value) {
            addCriterion("cost_name >", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameGreaterThanOrEqualTo(String value) {
            addCriterion("cost_name >=", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameLessThan(String value) {
            addCriterion("cost_name <", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameLessThanOrEqualTo(String value) {
            addCriterion("cost_name <=", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameLike(String value) {
            addCriterion("cost_name like", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotLike(String value) {
            addCriterion("cost_name not like", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameIn(List<String> values) {
            addCriterion("cost_name in", values, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotIn(List<String> values) {
            addCriterion("cost_name not in", values, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameBetween(String value1, String value2) {
            addCriterion("cost_name between", value1, value2, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotBetween(String value1, String value2) {
            addCriterion("cost_name not between", value1, value2, "costName");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationIsNull() {
            addCriterion("cost_base_duration is null");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationIsNotNull() {
            addCriterion("cost_base_duration is not null");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationEqualTo(Integer value) {
            addCriterion("cost_base_duration =", value, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationNotEqualTo(Integer value) {
            addCriterion("cost_base_duration <>", value, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationGreaterThan(Integer value) {
            addCriterion("cost_base_duration >", value, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_base_duration >=", value, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationLessThan(Integer value) {
            addCriterion("cost_base_duration <", value, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationLessThanOrEqualTo(Integer value) {
            addCriterion("cost_base_duration <=", value, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationIn(List<Integer> values) {
            addCriterion("cost_base_duration in", values, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationNotIn(List<Integer> values) {
            addCriterion("cost_base_duration not in", values, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationBetween(Integer value1, Integer value2) {
            addCriterion("cost_base_duration between", value1, value2, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_base_duration not between", value1, value2, "costBaseDuration");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostIsNull() {
            addCriterion("cost_base_cost is null");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostIsNotNull() {
            addCriterion("cost_base_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostEqualTo(Double value) {
            addCriterion("cost_base_cost =", value, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostNotEqualTo(Double value) {
            addCriterion("cost_base_cost <>", value, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostGreaterThan(Double value) {
            addCriterion("cost_base_cost >", value, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_base_cost >=", value, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostLessThan(Double value) {
            addCriterion("cost_base_cost <", value, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostLessThanOrEqualTo(Double value) {
            addCriterion("cost_base_cost <=", value, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostIn(List<Double> values) {
            addCriterion("cost_base_cost in", values, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostNotIn(List<Double> values) {
            addCriterion("cost_base_cost not in", values, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostBetween(Double value1, Double value2) {
            addCriterion("cost_base_cost between", value1, value2, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostBaseCostNotBetween(Double value1, Double value2) {
            addCriterion("cost_base_cost not between", value1, value2, "costBaseCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostIsNull() {
            addCriterion("cost_unit_cost is null");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostIsNotNull() {
            addCriterion("cost_unit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostEqualTo(Double value) {
            addCriterion("cost_unit_cost =", value, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostNotEqualTo(Double value) {
            addCriterion("cost_unit_cost <>", value, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostGreaterThan(Double value) {
            addCriterion("cost_unit_cost >", value, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_unit_cost >=", value, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostLessThan(Double value) {
            addCriterion("cost_unit_cost <", value, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostLessThanOrEqualTo(Double value) {
            addCriterion("cost_unit_cost <=", value, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostIn(List<Double> values) {
            addCriterion("cost_unit_cost in", values, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostNotIn(List<Double> values) {
            addCriterion("cost_unit_cost not in", values, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostBetween(Double value1, Double value2) {
            addCriterion("cost_unit_cost between", value1, value2, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostUnitCostNotBetween(Double value1, Double value2) {
            addCriterion("cost_unit_cost not between", value1, value2, "costUnitCost");
            return (Criteria) this;
        }

        public Criteria andCostStatusIsNull() {
            addCriterion("cost_status is null");
            return (Criteria) this;
        }

        public Criteria andCostStatusIsNotNull() {
            addCriterion("cost_status is not null");
            return (Criteria) this;
        }

        public Criteria andCostStatusEqualTo(String value) {
            addCriterion("cost_status =", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusNotEqualTo(String value) {
            addCriterion("cost_status <>", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusGreaterThan(String value) {
            addCriterion("cost_status >", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cost_status >=", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusLessThan(String value) {
            addCriterion("cost_status <", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusLessThanOrEqualTo(String value) {
            addCriterion("cost_status <=", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusLike(String value) {
            addCriterion("cost_status like", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusNotLike(String value) {
            addCriterion("cost_status not like", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusIn(List<String> values) {
            addCriterion("cost_status in", values, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusNotIn(List<String> values) {
            addCriterion("cost_status not in", values, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusBetween(String value1, String value2) {
            addCriterion("cost_status between", value1, value2, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusNotBetween(String value1, String value2) {
            addCriterion("cost_status not between", value1, value2, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostDescrIsNull() {
            addCriterion("cost_descr is null");
            return (Criteria) this;
        }

        public Criteria andCostDescrIsNotNull() {
            addCriterion("cost_descr is not null");
            return (Criteria) this;
        }

        public Criteria andCostDescrEqualTo(String value) {
            addCriterion("cost_descr =", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrNotEqualTo(String value) {
            addCriterion("cost_descr <>", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrGreaterThan(String value) {
            addCriterion("cost_descr >", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrGreaterThanOrEqualTo(String value) {
            addCriterion("cost_descr >=", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrLessThan(String value) {
            addCriterion("cost_descr <", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrLessThanOrEqualTo(String value) {
            addCriterion("cost_descr <=", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrLike(String value) {
            addCriterion("cost_descr like", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrNotLike(String value) {
            addCriterion("cost_descr not like", value, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrIn(List<String> values) {
            addCriterion("cost_descr in", values, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrNotIn(List<String> values) {
            addCriterion("cost_descr not in", values, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrBetween(String value1, String value2) {
            addCriterion("cost_descr between", value1, value2, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostDescrNotBetween(String value1, String value2) {
            addCriterion("cost_descr not between", value1, value2, "costDescr");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeIsNull() {
            addCriterion("cost_creattime is null");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeIsNotNull() {
            addCriterion("cost_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeEqualTo(Date value) {
            addCriterion("cost_creattime =", value, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeNotEqualTo(Date value) {
            addCriterion("cost_creattime <>", value, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeGreaterThan(Date value) {
            addCriterion("cost_creattime >", value, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cost_creattime >=", value, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeLessThan(Date value) {
            addCriterion("cost_creattime <", value, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("cost_creattime <=", value, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeIn(List<Date> values) {
            addCriterion("cost_creattime in", values, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeNotIn(List<Date> values) {
            addCriterion("cost_creattime not in", values, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeBetween(Date value1, Date value2) {
            addCriterion("cost_creattime between", value1, value2, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("cost_creattime not between", value1, value2, "costCreattime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeIsNull() {
            addCriterion("cost_starttime is null");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeIsNotNull() {
            addCriterion("cost_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeEqualTo(Date value) {
            addCriterion("cost_starttime =", value, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeNotEqualTo(Date value) {
            addCriterion("cost_starttime <>", value, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeGreaterThan(Date value) {
            addCriterion("cost_starttime >", value, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cost_starttime >=", value, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeLessThan(Date value) {
            addCriterion("cost_starttime <", value, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("cost_starttime <=", value, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeIn(List<Date> values) {
            addCriterion("cost_starttime in", values, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeNotIn(List<Date> values) {
            addCriterion("cost_starttime not in", values, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeBetween(Date value1, Date value2) {
            addCriterion("cost_starttime between", value1, value2, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("cost_starttime not between", value1, value2, "costStarttime");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNull() {
            addCriterion("cost_type is null");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andCostTypeEqualTo(String value) {
            addCriterion("cost_type =", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotEqualTo(String value) {
            addCriterion("cost_type <>", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThan(String value) {
            addCriterion("cost_type >", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cost_type >=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThan(String value) {
            addCriterion("cost_type <", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(String value) {
            addCriterion("cost_type <=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLike(String value) {
            addCriterion("cost_type like", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotLike(String value) {
            addCriterion("cost_type not like", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeIn(List<String> values) {
            addCriterion("cost_type in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotIn(List<String> values) {
            addCriterion("cost_type not in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeBetween(String value1, String value2) {
            addCriterion("cost_type between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotBetween(String value1, String value2) {
            addCriterion("cost_type not between", value1, value2, "costType");
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