package com.briup.briuppts.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerHurdlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerHurdlesExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(String value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(String value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(String value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(String value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(String value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(String value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLike(String value) {
            addCriterion("h_id like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotLike(String value) {
            addCriterion("h_id not like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<String> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<String> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(String value1, String value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(String value1, String value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHDescIsNull() {
            addCriterion("h_desc is null");
            return (Criteria) this;
        }

        public Criteria andHDescIsNotNull() {
            addCriterion("h_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHDescEqualTo(String value) {
            addCriterion("h_desc =", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotEqualTo(String value) {
            addCriterion("h_desc <>", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescGreaterThan(String value) {
            addCriterion("h_desc >", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescGreaterThanOrEqualTo(String value) {
            addCriterion("h_desc >=", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLessThan(String value) {
            addCriterion("h_desc <", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLessThanOrEqualTo(String value) {
            addCriterion("h_desc <=", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescLike(String value) {
            addCriterion("h_desc like", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotLike(String value) {
            addCriterion("h_desc not like", value, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescIn(List<String> values) {
            addCriterion("h_desc in", values, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotIn(List<String> values) {
            addCriterion("h_desc not in", values, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescBetween(String value1, String value2) {
            addCriterion("h_desc between", value1, value2, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHDescNotBetween(String value1, String value2) {
            addCriterion("h_desc not between", value1, value2, "hDesc");
            return (Criteria) this;
        }

        public Criteria andHMaxIsNull() {
            addCriterion("h_max is null");
            return (Criteria) this;
        }

        public Criteria andHMaxIsNotNull() {
            addCriterion("h_max is not null");
            return (Criteria) this;
        }

        public Criteria andHMaxEqualTo(Integer value) {
            addCriterion("h_max =", value, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxNotEqualTo(Integer value) {
            addCriterion("h_max <>", value, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxGreaterThan(Integer value) {
            addCriterion("h_max >", value, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_max >=", value, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxLessThan(Integer value) {
            addCriterion("h_max <", value, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxLessThanOrEqualTo(Integer value) {
            addCriterion("h_max <=", value, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxIn(List<Integer> values) {
            addCriterion("h_max in", values, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxNotIn(List<Integer> values) {
            addCriterion("h_max not in", values, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxBetween(Integer value1, Integer value2) {
            addCriterion("h_max between", value1, value2, "hMax");
            return (Criteria) this;
        }

        public Criteria andHMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("h_max not between", value1, value2, "hMax");
            return (Criteria) this;
        }

        public Criteria andHSavedIsNull() {
            addCriterion("h_saved is null");
            return (Criteria) this;
        }

        public Criteria andHSavedIsNotNull() {
            addCriterion("h_saved is not null");
            return (Criteria) this;
        }

        public Criteria andHSavedEqualTo(Integer value) {
            addCriterion("h_saved =", value, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedNotEqualTo(Integer value) {
            addCriterion("h_saved <>", value, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedGreaterThan(Integer value) {
            addCriterion("h_saved >", value, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_saved >=", value, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedLessThan(Integer value) {
            addCriterion("h_saved <", value, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedLessThanOrEqualTo(Integer value) {
            addCriterion("h_saved <=", value, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedIn(List<Integer> values) {
            addCriterion("h_saved in", values, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedNotIn(List<Integer> values) {
            addCriterion("h_saved not in", values, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedBetween(Integer value1, Integer value2) {
            addCriterion("h_saved between", value1, value2, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHSavedNotBetween(Integer value1, Integer value2) {
            addCriterion("h_saved not between", value1, value2, "hSaved");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNull() {
            addCriterion("h_time is null");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNotNull() {
            addCriterion("h_time is not null");
            return (Criteria) this;
        }

        public Criteria andHTimeEqualTo(Date value) {
            addCriterion("h_time =", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotEqualTo(Date value) {
            addCriterion("h_time <>", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThan(Date value) {
            addCriterion("h_time >", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("h_time >=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThan(Date value) {
            addCriterion("h_time <", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThanOrEqualTo(Date value) {
            addCriterion("h_time <=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeIn(List<Date> values) {
            addCriterion("h_time in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotIn(List<Date> values) {
            addCriterion("h_time not in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeBetween(Date value1, Date value2) {
            addCriterion("h_time between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotBetween(Date value1, Date value2) {
            addCriterion("h_time not between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHEnableIsNull() {
            addCriterion("h_enable is null");
            return (Criteria) this;
        }

        public Criteria andHEnableIsNotNull() {
            addCriterion("h_enable is not null");
            return (Criteria) this;
        }

        public Criteria andHEnableEqualTo(String value) {
            addCriterion("h_enable =", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableNotEqualTo(String value) {
            addCriterion("h_enable <>", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableGreaterThan(String value) {
            addCriterion("h_enable >", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableGreaterThanOrEqualTo(String value) {
            addCriterion("h_enable >=", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableLessThan(String value) {
            addCriterion("h_enable <", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableLessThanOrEqualTo(String value) {
            addCriterion("h_enable <=", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableLike(String value) {
            addCriterion("h_enable like", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableNotLike(String value) {
            addCriterion("h_enable not like", value, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableIn(List<String> values) {
            addCriterion("h_enable in", values, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableNotIn(List<String> values) {
            addCriterion("h_enable not in", values, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableBetween(String value1, String value2) {
            addCriterion("h_enable between", value1, value2, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHEnableNotBetween(String value1, String value2) {
            addCriterion("h_enable not between", value1, value2, "hEnable");
            return (Criteria) this;
        }

        public Criteria andHFullIsNull() {
            addCriterion("h_full is null");
            return (Criteria) this;
        }

        public Criteria andHFullIsNotNull() {
            addCriterion("h_full is not null");
            return (Criteria) this;
        }

        public Criteria andHFullEqualTo(String value) {
            addCriterion("h_full =", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullNotEqualTo(String value) {
            addCriterion("h_full <>", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullGreaterThan(String value) {
            addCriterion("h_full >", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullGreaterThanOrEqualTo(String value) {
            addCriterion("h_full >=", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullLessThan(String value) {
            addCriterion("h_full <", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullLessThanOrEqualTo(String value) {
            addCriterion("h_full <=", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullLike(String value) {
            addCriterion("h_full like", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullNotLike(String value) {
            addCriterion("h_full not like", value, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullIn(List<String> values) {
            addCriterion("h_full in", values, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullNotIn(List<String> values) {
            addCriterion("h_full not in", values, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullBetween(String value1, String value2) {
            addCriterion("h_full between", value1, value2, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFullNotBetween(String value1, String value2) {
            addCriterion("h_full not between", value1, value2, "hFull");
            return (Criteria) this;
        }

        public Criteria andHFenceIdIsNull() {
            addCriterion("h_fence_id is null");
            return (Criteria) this;
        }

        public Criteria andHFenceIdIsNotNull() {
            addCriterion("h_fence_id is not null");
            return (Criteria) this;
        }

        public Criteria andHFenceIdEqualTo(String value) {
            addCriterion("h_fence_id =", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdNotEqualTo(String value) {
            addCriterion("h_fence_id <>", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdGreaterThan(String value) {
            addCriterion("h_fence_id >", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("h_fence_id >=", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdLessThan(String value) {
            addCriterion("h_fence_id <", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdLessThanOrEqualTo(String value) {
            addCriterion("h_fence_id <=", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdLike(String value) {
            addCriterion("h_fence_id like", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdNotLike(String value) {
            addCriterion("h_fence_id not like", value, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdIn(List<String> values) {
            addCriterion("h_fence_id in", values, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdNotIn(List<String> values) {
            addCriterion("h_fence_id not in", values, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdBetween(String value1, String value2) {
            addCriterion("h_fence_id between", value1, value2, "hFenceId");
            return (Criteria) this;
        }

        public Criteria andHFenceIdNotBetween(String value1, String value2) {
            addCriterion("h_fence_id not between", value1, value2, "hFenceId");
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