package com.briup.briuppts.entity;

import java.util.ArrayList;
import java.util.List;

public class QuarantineRegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuarantineRegistrationExample() {
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

        public Criteria andGrIdIsNull() {
            addCriterion("gr_id is null");
            return (Criteria) this;
        }

        public Criteria andGrIdIsNotNull() {
            addCriterion("gr_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrIdEqualTo(Integer value) {
            addCriterion("gr_id =", value, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdNotEqualTo(Integer value) {
            addCriterion("gr_id <>", value, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdGreaterThan(Integer value) {
            addCriterion("gr_id >", value, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gr_id >=", value, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdLessThan(Integer value) {
            addCriterion("gr_id <", value, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdLessThanOrEqualTo(Integer value) {
            addCriterion("gr_id <=", value, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdIn(List<Integer> values) {
            addCriterion("gr_id in", values, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdNotIn(List<Integer> values) {
            addCriterion("gr_id not in", values, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdBetween(Integer value1, Integer value2) {
            addCriterion("gr_id between", value1, value2, "grId");
            return (Criteria) this;
        }

        public Criteria andGrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gr_id not between", value1, value2, "grId");
            return (Criteria) this;
        }

        public Criteria andGrTimeIsNull() {
            addCriterion("gr_time is null");
            return (Criteria) this;
        }

        public Criteria andGrTimeIsNotNull() {
            addCriterion("gr_time is not null");
            return (Criteria) this;
        }

        public Criteria andGrTimeEqualTo(String value) {
            addCriterion("gr_time =", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeNotEqualTo(String value) {
            addCriterion("gr_time <>", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeGreaterThan(String value) {
            addCriterion("gr_time >", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeGreaterThanOrEqualTo(String value) {
            addCriterion("gr_time >=", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeLessThan(String value) {
            addCriterion("gr_time <", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeLessThanOrEqualTo(String value) {
            addCriterion("gr_time <=", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeLike(String value) {
            addCriterion("gr_time like", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeNotLike(String value) {
            addCriterion("gr_time not like", value, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeIn(List<String> values) {
            addCriterion("gr_time in", values, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeNotIn(List<String> values) {
            addCriterion("gr_time not in", values, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeBetween(String value1, String value2) {
            addCriterion("gr_time between", value1, value2, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrTimeNotBetween(String value1, String value2) {
            addCriterion("gr_time not between", value1, value2, "grTime");
            return (Criteria) this;
        }

        public Criteria andGrImgIsNull() {
            addCriterion("gr_img is null");
            return (Criteria) this;
        }

        public Criteria andGrImgIsNotNull() {
            addCriterion("gr_img is not null");
            return (Criteria) this;
        }

        public Criteria andGrImgEqualTo(String value) {
            addCriterion("gr_img =", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgNotEqualTo(String value) {
            addCriterion("gr_img <>", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgGreaterThan(String value) {
            addCriterion("gr_img >", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgGreaterThanOrEqualTo(String value) {
            addCriterion("gr_img >=", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgLessThan(String value) {
            addCriterion("gr_img <", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgLessThanOrEqualTo(String value) {
            addCriterion("gr_img <=", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgLike(String value) {
            addCriterion("gr_img like", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgNotLike(String value) {
            addCriterion("gr_img not like", value, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgIn(List<String> values) {
            addCriterion("gr_img in", values, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgNotIn(List<String> values) {
            addCriterion("gr_img not in", values, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgBetween(String value1, String value2) {
            addCriterion("gr_img between", value1, value2, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrImgNotBetween(String value1, String value2) {
            addCriterion("gr_img not between", value1, value2, "grImg");
            return (Criteria) this;
        }

        public Criteria andGrMechanismIsNull() {
            addCriterion("gr_mechanism is null");
            return (Criteria) this;
        }

        public Criteria andGrMechanismIsNotNull() {
            addCriterion("gr_mechanism is not null");
            return (Criteria) this;
        }

        public Criteria andGrMechanismEqualTo(String value) {
            addCriterion("gr_mechanism =", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismNotEqualTo(String value) {
            addCriterion("gr_mechanism <>", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismGreaterThan(String value) {
            addCriterion("gr_mechanism >", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("gr_mechanism >=", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismLessThan(String value) {
            addCriterion("gr_mechanism <", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismLessThanOrEqualTo(String value) {
            addCriterion("gr_mechanism <=", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismLike(String value) {
            addCriterion("gr_mechanism like", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismNotLike(String value) {
            addCriterion("gr_mechanism not like", value, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismIn(List<String> values) {
            addCriterion("gr_mechanism in", values, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismNotIn(List<String> values) {
            addCriterion("gr_mechanism not in", values, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismBetween(String value1, String value2) {
            addCriterion("gr_mechanism between", value1, value2, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrMechanismNotBetween(String value1, String value2) {
            addCriterion("gr_mechanism not between", value1, value2, "grMechanism");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdIsNull() {
            addCriterion("gr_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdIsNotNull() {
            addCriterion("gr_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdEqualTo(String value) {
            addCriterion("gr_batch_id =", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdNotEqualTo(String value) {
            addCriterion("gr_batch_id <>", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdGreaterThan(String value) {
            addCriterion("gr_batch_id >", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("gr_batch_id >=", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdLessThan(String value) {
            addCriterion("gr_batch_id <", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdLessThanOrEqualTo(String value) {
            addCriterion("gr_batch_id <=", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdLike(String value) {
            addCriterion("gr_batch_id like", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdNotLike(String value) {
            addCriterion("gr_batch_id not like", value, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdIn(List<String> values) {
            addCriterion("gr_batch_id in", values, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdNotIn(List<String> values) {
            addCriterion("gr_batch_id not in", values, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdBetween(String value1, String value2) {
            addCriterion("gr_batch_id between", value1, value2, "grBatchId");
            return (Criteria) this;
        }

        public Criteria andGrBatchIdNotBetween(String value1, String value2) {
            addCriterion("gr_batch_id not between", value1, value2, "grBatchId");
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