package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class TeammappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeammappingExample() {
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

        public Criteria andTmmIdIsNull() {
            addCriterion("tmm_id is null");
            return (Criteria) this;
        }

        public Criteria andTmmIdIsNotNull() {
            addCriterion("tmm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTmmIdEqualTo(Integer value) {
            addCriterion("tmm_id =", value, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdNotEqualTo(Integer value) {
            addCriterion("tmm_id <>", value, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdGreaterThan(Integer value) {
            addCriterion("tmm_id >", value, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tmm_id >=", value, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdLessThan(Integer value) {
            addCriterion("tmm_id <", value, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdLessThanOrEqualTo(Integer value) {
            addCriterion("tmm_id <=", value, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdIn(List<Integer> values) {
            addCriterion("tmm_id in", values, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdNotIn(List<Integer> values) {
            addCriterion("tmm_id not in", values, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdBetween(Integer value1, Integer value2) {
            addCriterion("tmm_id between", value1, value2, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tmm_id not between", value1, value2, "tmmId");
            return (Criteria) this;
        }

        public Criteria andTmmNameIsNull() {
            addCriterion("tmm_name is null");
            return (Criteria) this;
        }

        public Criteria andTmmNameIsNotNull() {
            addCriterion("tmm_name is not null");
            return (Criteria) this;
        }

        public Criteria andTmmNameEqualTo(String value) {
            addCriterion("tmm_name =", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameNotEqualTo(String value) {
            addCriterion("tmm_name <>", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameGreaterThan(String value) {
            addCriterion("tmm_name >", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameGreaterThanOrEqualTo(String value) {
            addCriterion("tmm_name >=", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameLessThan(String value) {
            addCriterion("tmm_name <", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameLessThanOrEqualTo(String value) {
            addCriterion("tmm_name <=", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameLike(String value) {
            addCriterion("tmm_name like", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameNotLike(String value) {
            addCriterion("tmm_name not like", value, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameIn(List<String> values) {
            addCriterion("tmm_name in", values, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameNotIn(List<String> values) {
            addCriterion("tmm_name not in", values, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameBetween(String value1, String value2) {
            addCriterion("tmm_name between", value1, value2, "tmmName");
            return (Criteria) this;
        }

        public Criteria andTmmNameNotBetween(String value1, String value2) {
            addCriterion("tmm_name not between", value1, value2, "tmmName");
            return (Criteria) this;
        }

        public Criteria andEnIdIsNull() {
            addCriterion("en_id is null");
            return (Criteria) this;
        }

        public Criteria andEnIdIsNotNull() {
            addCriterion("en_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnIdEqualTo(Integer value) {
            addCriterion("en_id =", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotEqualTo(Integer value) {
            addCriterion("en_id <>", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThan(Integer value) {
            addCriterion("en_id >", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("en_id >=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThan(Integer value) {
            addCriterion("en_id <", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThanOrEqualTo(Integer value) {
            addCriterion("en_id <=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdIn(List<Integer> values) {
            addCriterion("en_id in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotIn(List<Integer> values) {
            addCriterion("en_id not in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdBetween(Integer value1, Integer value2) {
            addCriterion("en_id between", value1, value2, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("en_id not between", value1, value2, "enId");
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