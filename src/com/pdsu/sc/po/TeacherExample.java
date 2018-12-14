package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeIdIsNull() {
            addCriterion("te_id is null");
            return (Criteria) this;
        }

        public Criteria andTeIdIsNotNull() {
            addCriterion("te_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeIdEqualTo(Integer value) {
            addCriterion("te_id =", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotEqualTo(Integer value) {
            addCriterion("te_id <>", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThan(Integer value) {
            addCriterion("te_id >", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("te_id >=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThan(Integer value) {
            addCriterion("te_id <", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThanOrEqualTo(Integer value) {
            addCriterion("te_id <=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdIn(List<Integer> values) {
            addCriterion("te_id in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotIn(List<Integer> values) {
            addCriterion("te_id not in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdBetween(Integer value1, Integer value2) {
            addCriterion("te_id between", value1, value2, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("te_id not between", value1, value2, "teId");
            return (Criteria) this;
        }

        public Criteria andTeNameIsNull() {
            addCriterion("te_name is null");
            return (Criteria) this;
        }

        public Criteria andTeNameIsNotNull() {
            addCriterion("te_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeNameEqualTo(String value) {
            addCriterion("te_name =", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotEqualTo(String value) {
            addCriterion("te_name <>", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameGreaterThan(String value) {
            addCriterion("te_name >", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameGreaterThanOrEqualTo(String value) {
            addCriterion("te_name >=", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLessThan(String value) {
            addCriterion("te_name <", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLessThanOrEqualTo(String value) {
            addCriterion("te_name <=", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLike(String value) {
            addCriterion("te_name like", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotLike(String value) {
            addCriterion("te_name not like", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameIn(List<String> values) {
            addCriterion("te_name in", values, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotIn(List<String> values) {
            addCriterion("te_name not in", values, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameBetween(String value1, String value2) {
            addCriterion("te_name between", value1, value2, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotBetween(String value1, String value2) {
            addCriterion("te_name not between", value1, value2, "teName");
            return (Criteria) this;
        }

        public Criteria andTeUnitIsNull() {
            addCriterion("te_unit is null");
            return (Criteria) this;
        }

        public Criteria andTeUnitIsNotNull() {
            addCriterion("te_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTeUnitEqualTo(String value) {
            addCriterion("te_unit =", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitNotEqualTo(String value) {
            addCriterion("te_unit <>", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitGreaterThan(String value) {
            addCriterion("te_unit >", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("te_unit >=", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitLessThan(String value) {
            addCriterion("te_unit <", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitLessThanOrEqualTo(String value) {
            addCriterion("te_unit <=", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitLike(String value) {
            addCriterion("te_unit like", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitNotLike(String value) {
            addCriterion("te_unit not like", value, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitIn(List<String> values) {
            addCriterion("te_unit in", values, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitNotIn(List<String> values) {
            addCriterion("te_unit not in", values, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitBetween(String value1, String value2) {
            addCriterion("te_unit between", value1, value2, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTeUnitNotBetween(String value1, String value2) {
            addCriterion("te_unit not between", value1, value2, "teUnit");
            return (Criteria) this;
        }

        public Criteria andTePhoneIsNull() {
            addCriterion("te_phone is null");
            return (Criteria) this;
        }

        public Criteria andTePhoneIsNotNull() {
            addCriterion("te_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTePhoneEqualTo(String value) {
            addCriterion("te_phone =", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotEqualTo(String value) {
            addCriterion("te_phone <>", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneGreaterThan(String value) {
            addCriterion("te_phone >", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("te_phone >=", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneLessThan(String value) {
            addCriterion("te_phone <", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneLessThanOrEqualTo(String value) {
            addCriterion("te_phone <=", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneLike(String value) {
            addCriterion("te_phone like", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotLike(String value) {
            addCriterion("te_phone not like", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneIn(List<String> values) {
            addCriterion("te_phone in", values, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotIn(List<String> values) {
            addCriterion("te_phone not in", values, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneBetween(String value1, String value2) {
            addCriterion("te_phone between", value1, value2, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotBetween(String value1, String value2) {
            addCriterion("te_phone not between", value1, value2, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePositionIsNull() {
            addCriterion("te_position is null");
            return (Criteria) this;
        }

        public Criteria andTePositionIsNotNull() {
            addCriterion("te_position is not null");
            return (Criteria) this;
        }

        public Criteria andTePositionEqualTo(String value) {
            addCriterion("te_position =", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionNotEqualTo(String value) {
            addCriterion("te_position <>", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionGreaterThan(String value) {
            addCriterion("te_position >", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionGreaterThanOrEqualTo(String value) {
            addCriterion("te_position >=", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionLessThan(String value) {
            addCriterion("te_position <", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionLessThanOrEqualTo(String value) {
            addCriterion("te_position <=", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionLike(String value) {
            addCriterion("te_position like", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionNotLike(String value) {
            addCriterion("te_position not like", value, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionIn(List<String> values) {
            addCriterion("te_position in", values, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionNotIn(List<String> values) {
            addCriterion("te_position not in", values, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionBetween(String value1, String value2) {
            addCriterion("te_position between", value1, value2, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTePositionNotBetween(String value1, String value2) {
            addCriterion("te_position not between", value1, value2, "tePosition");
            return (Criteria) this;
        }

        public Criteria andTeIdcardIsNull() {
            addCriterion("te_IDcard is null");
            return (Criteria) this;
        }

        public Criteria andTeIdcardIsNotNull() {
            addCriterion("te_IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andTeIdcardEqualTo(String value) {
            addCriterion("te_IDcard =", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardNotEqualTo(String value) {
            addCriterion("te_IDcard <>", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardGreaterThan(String value) {
            addCriterion("te_IDcard >", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("te_IDcard >=", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardLessThan(String value) {
            addCriterion("te_IDcard <", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardLessThanOrEqualTo(String value) {
            addCriterion("te_IDcard <=", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardLike(String value) {
            addCriterion("te_IDcard like", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardNotLike(String value) {
            addCriterion("te_IDcard not like", value, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardIn(List<String> values) {
            addCriterion("te_IDcard in", values, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardNotIn(List<String> values) {
            addCriterion("te_IDcard not in", values, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardBetween(String value1, String value2) {
            addCriterion("te_IDcard between", value1, value2, "teIdcard");
            return (Criteria) this;
        }

        public Criteria andTeIdcardNotBetween(String value1, String value2) {
            addCriterion("te_IDcard not between", value1, value2, "teIdcard");
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