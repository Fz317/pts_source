package com.briup.briuppts.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiseaseRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseRecordExample() {
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

        public Criteria andDrIdIsNull() {
            addCriterion("dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDrIdIsNotNull() {
            addCriterion("dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrIdEqualTo(Integer value) {
            addCriterion("dr_id =", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotEqualTo(Integer value) {
            addCriterion("dr_id <>", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThan(Integer value) {
            addCriterion("dr_id >", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_id >=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThan(Integer value) {
            addCriterion("dr_id <", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThanOrEqualTo(Integer value) {
            addCriterion("dr_id <=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdIn(List<Integer> values) {
            addCriterion("dr_id in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotIn(List<Integer> values) {
            addCriterion("dr_id not in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdBetween(Integer value1, Integer value2) {
            addCriterion("dr_id between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_id not between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdIsNull() {
            addCriterion("dr_animal_id is null");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdIsNotNull() {
            addCriterion("dr_animal_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdEqualTo(String value) {
            addCriterion("dr_animal_id =", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdNotEqualTo(String value) {
            addCriterion("dr_animal_id <>", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdGreaterThan(String value) {
            addCriterion("dr_animal_id >", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdGreaterThanOrEqualTo(String value) {
            addCriterion("dr_animal_id >=", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdLessThan(String value) {
            addCriterion("dr_animal_id <", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdLessThanOrEqualTo(String value) {
            addCriterion("dr_animal_id <=", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdLike(String value) {
            addCriterion("dr_animal_id like", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdNotLike(String value) {
            addCriterion("dr_animal_id not like", value, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdIn(List<String> values) {
            addCriterion("dr_animal_id in", values, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdNotIn(List<String> values) {
            addCriterion("dr_animal_id not in", values, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdBetween(String value1, String value2) {
            addCriterion("dr_animal_id between", value1, value2, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrAnimalIdNotBetween(String value1, String value2) {
            addCriterion("dr_animal_id not between", value1, value2, "drAnimalId");
            return (Criteria) this;
        }

        public Criteria andDrDescIsNull() {
            addCriterion("dr_desc is null");
            return (Criteria) this;
        }

        public Criteria andDrDescIsNotNull() {
            addCriterion("dr_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDrDescEqualTo(String value) {
            addCriterion("dr_desc =", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescNotEqualTo(String value) {
            addCriterion("dr_desc <>", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescGreaterThan(String value) {
            addCriterion("dr_desc >", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescGreaterThanOrEqualTo(String value) {
            addCriterion("dr_desc >=", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescLessThan(String value) {
            addCriterion("dr_desc <", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescLessThanOrEqualTo(String value) {
            addCriterion("dr_desc <=", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescLike(String value) {
            addCriterion("dr_desc like", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescNotLike(String value) {
            addCriterion("dr_desc not like", value, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescIn(List<String> values) {
            addCriterion("dr_desc in", values, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescNotIn(List<String> values) {
            addCriterion("dr_desc not in", values, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescBetween(String value1, String value2) {
            addCriterion("dr_desc between", value1, value2, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrDescNotBetween(String value1, String value2) {
            addCriterion("dr_desc not between", value1, value2, "drDesc");
            return (Criteria) this;
        }

        public Criteria andDrCureIsNull() {
            addCriterion("dr_cure is null");
            return (Criteria) this;
        }

        public Criteria andDrCureIsNotNull() {
            addCriterion("dr_cure is not null");
            return (Criteria) this;
        }

        public Criteria andDrCureEqualTo(String value) {
            addCriterion("dr_cure =", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureNotEqualTo(String value) {
            addCriterion("dr_cure <>", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureGreaterThan(String value) {
            addCriterion("dr_cure >", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureGreaterThanOrEqualTo(String value) {
            addCriterion("dr_cure >=", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureLessThan(String value) {
            addCriterion("dr_cure <", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureLessThanOrEqualTo(String value) {
            addCriterion("dr_cure <=", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureLike(String value) {
            addCriterion("dr_cure like", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureNotLike(String value) {
            addCriterion("dr_cure not like", value, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureIn(List<String> values) {
            addCriterion("dr_cure in", values, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureNotIn(List<String> values) {
            addCriterion("dr_cure not in", values, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureBetween(String value1, String value2) {
            addCriterion("dr_cure between", value1, value2, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrCureNotBetween(String value1, String value2) {
            addCriterion("dr_cure not between", value1, value2, "drCure");
            return (Criteria) this;
        }

        public Criteria andDrTimeIsNull() {
            addCriterion("dr_time is null");
            return (Criteria) this;
        }

        public Criteria andDrTimeIsNotNull() {
            addCriterion("dr_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrTimeEqualTo(Date value) {
            addCriterion("dr_time =", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeNotEqualTo(Date value) {
            addCriterion("dr_time <>", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeGreaterThan(Date value) {
            addCriterion("dr_time >", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dr_time >=", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeLessThan(Date value) {
            addCriterion("dr_time <", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeLessThanOrEqualTo(Date value) {
            addCriterion("dr_time <=", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeIn(List<Date> values) {
            addCriterion("dr_time in", values, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeNotIn(List<Date> values) {
            addCriterion("dr_time not in", values, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeBetween(Date value1, Date value2) {
            addCriterion("dr_time between", value1, value2, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeNotBetween(Date value1, Date value2) {
            addCriterion("dr_time not between", value1, value2, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrStatusIsNull() {
            addCriterion("dr_status is null");
            return (Criteria) this;
        }

        public Criteria andDrStatusIsNotNull() {
            addCriterion("dr_status is not null");
            return (Criteria) this;
        }

        public Criteria andDrStatusEqualTo(String value) {
            addCriterion("dr_status =", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusNotEqualTo(String value) {
            addCriterion("dr_status <>", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusGreaterThan(String value) {
            addCriterion("dr_status >", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("dr_status >=", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusLessThan(String value) {
            addCriterion("dr_status <", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusLessThanOrEqualTo(String value) {
            addCriterion("dr_status <=", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusLike(String value) {
            addCriterion("dr_status like", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusNotLike(String value) {
            addCriterion("dr_status not like", value, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusIn(List<String> values) {
            addCriterion("dr_status in", values, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusNotIn(List<String> values) {
            addCriterion("dr_status not in", values, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusBetween(String value1, String value2) {
            addCriterion("dr_status between", value1, value2, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrStatusNotBetween(String value1, String value2) {
            addCriterion("dr_status not between", value1, value2, "drStatus");
            return (Criteria) this;
        }

        public Criteria andDrDIdIsNull() {
            addCriterion("dr_d_id is null");
            return (Criteria) this;
        }

        public Criteria andDrDIdIsNotNull() {
            addCriterion("dr_d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrDIdEqualTo(Integer value) {
            addCriterion("dr_d_id =", value, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdNotEqualTo(Integer value) {
            addCriterion("dr_d_id <>", value, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdGreaterThan(Integer value) {
            addCriterion("dr_d_id >", value, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_d_id >=", value, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdLessThan(Integer value) {
            addCriterion("dr_d_id <", value, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdLessThanOrEqualTo(Integer value) {
            addCriterion("dr_d_id <=", value, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdIn(List<Integer> values) {
            addCriterion("dr_d_id in", values, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdNotIn(List<Integer> values) {
            addCriterion("dr_d_id not in", values, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdBetween(Integer value1, Integer value2) {
            addCriterion("dr_d_id between", value1, value2, "drDId");
            return (Criteria) this;
        }

        public Criteria andDrDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_d_id not between", value1, value2, "drDId");
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