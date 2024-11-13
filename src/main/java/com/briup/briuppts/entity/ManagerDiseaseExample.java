package com.briup.briuppts.entity;

import java.util.ArrayList;
import java.util.List;

public class ManagerDiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerDiseaseExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDDescIsNull() {
            addCriterion("d_desc is null");
            return (Criteria) this;
        }

        public Criteria andDDescIsNotNull() {
            addCriterion("d_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDDescEqualTo(String value) {
            addCriterion("d_desc =", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotEqualTo(String value) {
            addCriterion("d_desc <>", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThan(String value) {
            addCriterion("d_desc >", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescGreaterThanOrEqualTo(String value) {
            addCriterion("d_desc >=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThan(String value) {
            addCriterion("d_desc <", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLessThanOrEqualTo(String value) {
            addCriterion("d_desc <=", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescLike(String value) {
            addCriterion("d_desc like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotLike(String value) {
            addCriterion("d_desc not like", value, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescIn(List<String> values) {
            addCriterion("d_desc in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotIn(List<String> values) {
            addCriterion("d_desc not in", values, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescBetween(String value1, String value2) {
            addCriterion("d_desc between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDDescNotBetween(String value1, String value2) {
            addCriterion("d_desc not between", value1, value2, "dDesc");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNull() {
            addCriterion("d_type is null");
            return (Criteria) this;
        }

        public Criteria andDTypeIsNotNull() {
            addCriterion("d_type is not null");
            return (Criteria) this;
        }

        public Criteria andDTypeEqualTo(String value) {
            addCriterion("d_type =", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotEqualTo(String value) {
            addCriterion("d_type <>", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThan(String value) {
            addCriterion("d_type >", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeGreaterThanOrEqualTo(String value) {
            addCriterion("d_type >=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThan(String value) {
            addCriterion("d_type <", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLessThanOrEqualTo(String value) {
            addCriterion("d_type <=", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeLike(String value) {
            addCriterion("d_type like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotLike(String value) {
            addCriterion("d_type not like", value, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeIn(List<String> values) {
            addCriterion("d_type in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotIn(List<String> values) {
            addCriterion("d_type not in", values, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeBetween(String value1, String value2) {
            addCriterion("d_type between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDTypeNotBetween(String value1, String value2) {
            addCriterion("d_type not between", value1, value2, "dType");
            return (Criteria) this;
        }

        public Criteria andDEtiologyIsNull() {
            addCriterion("d_etiology is null");
            return (Criteria) this;
        }

        public Criteria andDEtiologyIsNotNull() {
            addCriterion("d_etiology is not null");
            return (Criteria) this;
        }

        public Criteria andDEtiologyEqualTo(String value) {
            addCriterion("d_etiology =", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyNotEqualTo(String value) {
            addCriterion("d_etiology <>", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyGreaterThan(String value) {
            addCriterion("d_etiology >", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyGreaterThanOrEqualTo(String value) {
            addCriterion("d_etiology >=", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyLessThan(String value) {
            addCriterion("d_etiology <", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyLessThanOrEqualTo(String value) {
            addCriterion("d_etiology <=", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyLike(String value) {
            addCriterion("d_etiology like", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyNotLike(String value) {
            addCriterion("d_etiology not like", value, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyIn(List<String> values) {
            addCriterion("d_etiology in", values, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyNotIn(List<String> values) {
            addCriterion("d_etiology not in", values, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyBetween(String value1, String value2) {
            addCriterion("d_etiology between", value1, value2, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDEtiologyNotBetween(String value1, String value2) {
            addCriterion("d_etiology not between", value1, value2, "dEtiology");
            return (Criteria) this;
        }

        public Criteria andDSymptomIsNull() {
            addCriterion("d_symptom is null");
            return (Criteria) this;
        }

        public Criteria andDSymptomIsNotNull() {
            addCriterion("d_symptom is not null");
            return (Criteria) this;
        }

        public Criteria andDSymptomEqualTo(String value) {
            addCriterion("d_symptom =", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomNotEqualTo(String value) {
            addCriterion("d_symptom <>", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomGreaterThan(String value) {
            addCriterion("d_symptom >", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomGreaterThanOrEqualTo(String value) {
            addCriterion("d_symptom >=", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomLessThan(String value) {
            addCriterion("d_symptom <", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomLessThanOrEqualTo(String value) {
            addCriterion("d_symptom <=", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomLike(String value) {
            addCriterion("d_symptom like", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomNotLike(String value) {
            addCriterion("d_symptom not like", value, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomIn(List<String> values) {
            addCriterion("d_symptom in", values, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomNotIn(List<String> values) {
            addCriterion("d_symptom not in", values, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomBetween(String value1, String value2) {
            addCriterion("d_symptom between", value1, value2, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDSymptomNotBetween(String value1, String value2) {
            addCriterion("d_symptom not between", value1, value2, "dSymptom");
            return (Criteria) this;
        }

        public Criteria andDPreventionIsNull() {
            addCriterion("d_prevention is null");
            return (Criteria) this;
        }

        public Criteria andDPreventionIsNotNull() {
            addCriterion("d_prevention is not null");
            return (Criteria) this;
        }

        public Criteria andDPreventionEqualTo(String value) {
            addCriterion("d_prevention =", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionNotEqualTo(String value) {
            addCriterion("d_prevention <>", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionGreaterThan(String value) {
            addCriterion("d_prevention >", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionGreaterThanOrEqualTo(String value) {
            addCriterion("d_prevention >=", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionLessThan(String value) {
            addCriterion("d_prevention <", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionLessThanOrEqualTo(String value) {
            addCriterion("d_prevention <=", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionLike(String value) {
            addCriterion("d_prevention like", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionNotLike(String value) {
            addCriterion("d_prevention not like", value, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionIn(List<String> values) {
            addCriterion("d_prevention in", values, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionNotIn(List<String> values) {
            addCriterion("d_prevention not in", values, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionBetween(String value1, String value2) {
            addCriterion("d_prevention between", value1, value2, "dPrevention");
            return (Criteria) this;
        }

        public Criteria andDPreventionNotBetween(String value1, String value2) {
            addCriterion("d_prevention not between", value1, value2, "dPrevention");
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