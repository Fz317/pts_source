package com.briup.briuppts.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerBatchExample() {
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

        public Criteria andBSerialIdIsNull() {
            addCriterion("b_serial_id is null");
            return (Criteria) this;
        }

        public Criteria andBSerialIdIsNotNull() {
            addCriterion("b_serial_id is not null");
            return (Criteria) this;
        }

        public Criteria andBSerialIdEqualTo(String value) {
            addCriterion("b_serial_id =", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdNotEqualTo(String value) {
            addCriterion("b_serial_id <>", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdGreaterThan(String value) {
            addCriterion("b_serial_id >", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdGreaterThanOrEqualTo(String value) {
            addCriterion("b_serial_id >=", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdLessThan(String value) {
            addCriterion("b_serial_id <", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdLessThanOrEqualTo(String value) {
            addCriterion("b_serial_id <=", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdLike(String value) {
            addCriterion("b_serial_id like", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdNotLike(String value) {
            addCriterion("b_serial_id not like", value, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdIn(List<String> values) {
            addCriterion("b_serial_id in", values, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdNotIn(List<String> values) {
            addCriterion("b_serial_id not in", values, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdBetween(String value1, String value2) {
            addCriterion("b_serial_id between", value1, value2, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBSerialIdNotBetween(String value1, String value2) {
            addCriterion("b_serial_id not between", value1, value2, "bSerialId");
            return (Criteria) this;
        }

        public Criteria andBDescIsNull() {
            addCriterion("b_desc is null");
            return (Criteria) this;
        }

        public Criteria andBDescIsNotNull() {
            addCriterion("b_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBDescEqualTo(String value) {
            addCriterion("b_desc =", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescNotEqualTo(String value) {
            addCriterion("b_desc <>", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescGreaterThan(String value) {
            addCriterion("b_desc >", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescGreaterThanOrEqualTo(String value) {
            addCriterion("b_desc >=", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescLessThan(String value) {
            addCriterion("b_desc <", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescLessThanOrEqualTo(String value) {
            addCriterion("b_desc <=", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescLike(String value) {
            addCriterion("b_desc like", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescNotLike(String value) {
            addCriterion("b_desc not like", value, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescIn(List<String> values) {
            addCriterion("b_desc in", values, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescNotIn(List<String> values) {
            addCriterion("b_desc not in", values, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescBetween(String value1, String value2) {
            addCriterion("b_desc between", value1, value2, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBDescNotBetween(String value1, String value2) {
            addCriterion("b_desc not between", value1, value2, "bDesc");
            return (Criteria) this;
        }

        public Criteria andBQuarantineIsNull() {
            addCriterion("b_quarantine is null");
            return (Criteria) this;
        }

        public Criteria andBQuarantineIsNotNull() {
            addCriterion("b_quarantine is not null");
            return (Criteria) this;
        }

        public Criteria andBQuarantineEqualTo(String value) {
            addCriterion("b_quarantine =", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineNotEqualTo(String value) {
            addCriterion("b_quarantine <>", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineGreaterThan(String value) {
            addCriterion("b_quarantine >", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineGreaterThanOrEqualTo(String value) {
            addCriterion("b_quarantine >=", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineLessThan(String value) {
            addCriterion("b_quarantine <", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineLessThanOrEqualTo(String value) {
            addCriterion("b_quarantine <=", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineLike(String value) {
            addCriterion("b_quarantine like", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineNotLike(String value) {
            addCriterion("b_quarantine not like", value, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineIn(List<String> values) {
            addCriterion("b_quarantine in", values, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineNotIn(List<String> values) {
            addCriterion("b_quarantine not in", values, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineBetween(String value1, String value2) {
            addCriterion("b_quarantine between", value1, value2, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQuarantineNotBetween(String value1, String value2) {
            addCriterion("b_quarantine not between", value1, value2, "bQuarantine");
            return (Criteria) this;
        }

        public Criteria andBQualifiedIsNull() {
            addCriterion("b_qualified is null");
            return (Criteria) this;
        }

        public Criteria andBQualifiedIsNotNull() {
            addCriterion("b_qualified is not null");
            return (Criteria) this;
        }

        public Criteria andBQualifiedEqualTo(String value) {
            addCriterion("b_qualified =", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedNotEqualTo(String value) {
            addCriterion("b_qualified <>", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedGreaterThan(String value) {
            addCriterion("b_qualified >", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedGreaterThanOrEqualTo(String value) {
            addCriterion("b_qualified >=", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedLessThan(String value) {
            addCriterion("b_qualified <", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedLessThanOrEqualTo(String value) {
            addCriterion("b_qualified <=", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedLike(String value) {
            addCriterion("b_qualified like", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedNotLike(String value) {
            addCriterion("b_qualified not like", value, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedIn(List<String> values) {
            addCriterion("b_qualified in", values, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedNotIn(List<String> values) {
            addCriterion("b_qualified not in", values, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedBetween(String value1, String value2) {
            addCriterion("b_qualified between", value1, value2, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBQualifiedNotBetween(String value1, String value2) {
            addCriterion("b_qualified not between", value1, value2, "bQualified");
            return (Criteria) this;
        }

        public Criteria andBTimeIsNull() {
            addCriterion("b_time is null");
            return (Criteria) this;
        }

        public Criteria andBTimeIsNotNull() {
            addCriterion("b_time is not null");
            return (Criteria) this;
        }

        public Criteria andBTimeEqualTo(Date value) {
            addCriterion("b_time =", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeNotEqualTo(Date value) {
            addCriterion("b_time <>", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeGreaterThan(Date value) {
            addCriterion("b_time >", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("b_time >=", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeLessThan(Date value) {
            addCriterion("b_time <", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeLessThanOrEqualTo(Date value) {
            addCriterion("b_time <=", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeIn(List<Date> values) {
            addCriterion("b_time in", values, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeNotIn(List<Date> values) {
            addCriterion("b_time not in", values, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeBetween(Date value1, Date value2) {
            addCriterion("b_time between", value1, value2, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeNotBetween(Date value1, Date value2) {
            addCriterion("b_time not between", value1, value2, "bTime");
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