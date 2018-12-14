package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class NewsCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsCategoryExample() {
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
        
        //由protected改成了public
        public void addCriterion(String condition) {
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

        public Criteria andNewscateIdIsNull() {
            addCriterion("newscate_id is null");
            return (Criteria) this;
        }

        public Criteria andNewscateIdIsNotNull() {
            addCriterion("newscate_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewscateIdEqualTo(Integer value) {
            addCriterion("newscate_id =", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdNotEqualTo(Integer value) {
            addCriterion("newscate_id <>", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdGreaterThan(Integer value) {
            addCriterion("newscate_id >", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("newscate_id >=", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdLessThan(Integer value) {
            addCriterion("newscate_id <", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdLessThanOrEqualTo(Integer value) {
            addCriterion("newscate_id <=", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdIn(List<Integer> values) {
            addCriterion("newscate_id in", values, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdNotIn(List<Integer> values) {
            addCriterion("newscate_id not in", values, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdBetween(Integer value1, Integer value2) {
            addCriterion("newscate_id between", value1, value2, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("newscate_id not between", value1, value2, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleIsNull() {
            addCriterion("newscate_title is null");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleIsNotNull() {
            addCriterion("newscate_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleEqualTo(String value) {
            addCriterion("newscate_title =", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleNotEqualTo(String value) {
            addCriterion("newscate_title <>", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleGreaterThan(String value) {
            addCriterion("newscate_title >", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleGreaterThanOrEqualTo(String value) {
            addCriterion("newscate_title >=", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleLessThan(String value) {
            addCriterion("newscate_title <", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleLessThanOrEqualTo(String value) {
            addCriterion("newscate_title <=", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleLike(String value) {
            addCriterion("newscate_title like", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleNotLike(String value) {
            addCriterion("newscate_title not like", value, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleIn(List<String> values) {
            addCriterion("newscate_title in", values, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleNotIn(List<String> values) {
            addCriterion("newscate_title not in", values, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleBetween(String value1, String value2) {
            addCriterion("newscate_title between", value1, value2, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateTitleNotBetween(String value1, String value2) {
            addCriterion("newscate_title not between", value1, value2, "newscateTitle");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefIsNull() {
            addCriterion("newscate_brief is null");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefIsNotNull() {
            addCriterion("newscate_brief is not null");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefEqualTo(String value) {
            addCriterion("newscate_brief =", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefNotEqualTo(String value) {
            addCriterion("newscate_brief <>", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefGreaterThan(String value) {
            addCriterion("newscate_brief >", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefGreaterThanOrEqualTo(String value) {
            addCriterion("newscate_brief >=", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefLessThan(String value) {
            addCriterion("newscate_brief <", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefLessThanOrEqualTo(String value) {
            addCriterion("newscate_brief <=", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefLike(String value) {
            addCriterion("newscate_brief like", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefNotLike(String value) {
            addCriterion("newscate_brief not like", value, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefIn(List<String> values) {
            addCriterion("newscate_brief in", values, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefNotIn(List<String> values) {
            addCriterion("newscate_brief not in", values, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefBetween(String value1, String value2) {
            addCriterion("newscate_brief between", value1, value2, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateBriefNotBetween(String value1, String value2) {
            addCriterion("newscate_brief not between", value1, value2, "newscateBrief");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkIsNull() {
            addCriterion("newscate_mark is null");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkIsNotNull() {
            addCriterion("newscate_mark is not null");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkEqualTo(String value) {
            addCriterion("newscate_mark =", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkNotEqualTo(String value) {
            addCriterion("newscate_mark <>", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkGreaterThan(String value) {
            addCriterion("newscate_mark >", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkGreaterThanOrEqualTo(String value) {
            addCriterion("newscate_mark >=", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkLessThan(String value) {
            addCriterion("newscate_mark <", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkLessThanOrEqualTo(String value) {
            addCriterion("newscate_mark <=", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkLike(String value) {
            addCriterion("newscate_mark like", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkNotLike(String value) {
            addCriterion("newscate_mark not like", value, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkIn(List<String> values) {
            addCriterion("newscate_mark in", values, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkNotIn(List<String> values) {
            addCriterion("newscate_mark not in", values, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkBetween(String value1, String value2) {
            addCriterion("newscate_mark between", value1, value2, "newscateMark");
            return (Criteria) this;
        }

        public Criteria andNewscateMarkNotBetween(String value1, String value2) {
            addCriterion("newscate_mark not between", value1, value2, "newscateMark");
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