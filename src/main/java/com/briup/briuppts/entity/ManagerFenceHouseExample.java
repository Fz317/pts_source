package com.briup.briuppts.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerFenceHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerFenceHouseExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andFhIdIsNull() {
            addCriterion("fh_id is null");
            return (Criteria) this;
        }

        public Criteria andFhIdIsNotNull() {
            addCriterion("fh_id is not null");
            return (Criteria) this;
        }

        public Criteria andFhIdEqualTo(String value) {
            addCriterion("fh_id =", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdNotEqualTo(String value) {
            addCriterion("fh_id <>", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdGreaterThan(String value) {
            addCriterion("fh_id >", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdGreaterThanOrEqualTo(String value) {
            addCriterion("fh_id >=", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdLessThan(String value) {
            addCriterion("fh_id <", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdLessThanOrEqualTo(String value) {
            addCriterion("fh_id <=", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdLike(String value) {
            addCriterion("fh_id like", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdNotLike(String value) {
            addCriterion("fh_id not like", value, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdIn(List<String> values) {
            addCriterion("fh_id in", values, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdNotIn(List<String> values) {
            addCriterion("fh_id not in", values, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdBetween(String value1, String value2) {
            addCriterion("fh_id between", value1, value2, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhIdNotBetween(String value1, String value2) {
            addCriterion("fh_id not between", value1, value2, "fhId");
            return (Criteria) this;
        }

        public Criteria andFhNameIsNull() {
            addCriterion("fh_name is null");
            return (Criteria) this;
        }

        public Criteria andFhNameIsNotNull() {
            addCriterion("fh_name is not null");
            return (Criteria) this;
        }

        public Criteria andFhNameEqualTo(String value) {
            addCriterion("fh_name =", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameNotEqualTo(String value) {
            addCriterion("fh_name <>", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameGreaterThan(String value) {
            addCriterion("fh_name >", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameGreaterThanOrEqualTo(String value) {
            addCriterion("fh_name >=", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameLessThan(String value) {
            addCriterion("fh_name <", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameLessThanOrEqualTo(String value) {
            addCriterion("fh_name <=", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameLike(String value) {
            addCriterion("fh_name like", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameNotLike(String value) {
            addCriterion("fh_name not like", value, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameIn(List<String> values) {
            addCriterion("fh_name in", values, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameNotIn(List<String> values) {
            addCriterion("fh_name not in", values, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameBetween(String value1, String value2) {
            addCriterion("fh_name between", value1, value2, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhNameNotBetween(String value1, String value2) {
            addCriterion("fh_name not between", value1, value2, "fhName");
            return (Criteria) this;
        }

        public Criteria andFhDescIsNull() {
            addCriterion("fh_desc is null");
            return (Criteria) this;
        }

        public Criteria andFhDescIsNotNull() {
            addCriterion("fh_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFhDescEqualTo(String value) {
            addCriterion("fh_desc =", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescNotEqualTo(String value) {
            addCriterion("fh_desc <>", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescGreaterThan(String value) {
            addCriterion("fh_desc >", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescGreaterThanOrEqualTo(String value) {
            addCriterion("fh_desc >=", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescLessThan(String value) {
            addCriterion("fh_desc <", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescLessThanOrEqualTo(String value) {
            addCriterion("fh_desc <=", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescLike(String value) {
            addCriterion("fh_desc like", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescNotLike(String value) {
            addCriterion("fh_desc not like", value, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescIn(List<String> values) {
            addCriterion("fh_desc in", values, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescNotIn(List<String> values) {
            addCriterion("fh_desc not in", values, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescBetween(String value1, String value2) {
            addCriterion("fh_desc between", value1, value2, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhDescNotBetween(String value1, String value2) {
            addCriterion("fh_desc not between", value1, value2, "fhDesc");
            return (Criteria) this;
        }

        public Criteria andFhTimeIsNull() {
            addCriterion("fh_time is null");
            return (Criteria) this;
        }

        public Criteria andFhTimeIsNotNull() {
            addCriterion("fh_time is not null");
            return (Criteria) this;
        }

        public Criteria andFhTimeEqualTo(Date value) {
            addCriterion("fh_time =", value, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeNotEqualTo(Date value) {
            addCriterion("fh_time <>", value, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeGreaterThan(Date value) {
            addCriterion("fh_time >", value, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fh_time >=", value, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeLessThan(Date value) {
            addCriterion("fh_time <", value, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeLessThanOrEqualTo(Date value) {
            addCriterion("fh_time <=", value, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeIn(List<Date> values) {
            addCriterion("fh_time in", values, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeNotIn(List<Date> values) {
            addCriterion("fh_time not in", values, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeBetween(Date value1, Date value2) {
            addCriterion("fh_time between", value1, value2, "fhTime");
            return (Criteria) this;
        }

        public Criteria andFhTimeNotBetween(Date value1, Date value2) {
            addCriterion("fh_time not between", value1, value2, "fhTime");
            return (Criteria) this;
        }
    }

    /**
     */
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