package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveExample() {
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

        public Criteria andLeIdIsNull() {
            addCriterion("le_id is null");
            return (Criteria) this;
        }

        public Criteria andLeIdIsNotNull() {
            addCriterion("le_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeIdEqualTo(Integer value) {
            addCriterion("le_id =", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotEqualTo(Integer value) {
            addCriterion("le_id <>", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdGreaterThan(Integer value) {
            addCriterion("le_id >", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_id >=", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdLessThan(Integer value) {
            addCriterion("le_id <", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdLessThanOrEqualTo(Integer value) {
            addCriterion("le_id <=", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdIn(List<Integer> values) {
            addCriterion("le_id in", values, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotIn(List<Integer> values) {
            addCriterion("le_id not in", values, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdBetween(Integer value1, Integer value2) {
            addCriterion("le_id between", value1, value2, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("le_id not between", value1, value2, "leId");
            return (Criteria) this;
        }

        public Criteria andLeNameIsNull() {
            addCriterion("le_name is null");
            return (Criteria) this;
        }

        public Criteria andLeNameIsNotNull() {
            addCriterion("le_name is not null");
            return (Criteria) this;
        }

        public Criteria andLeNameEqualTo(String value) {
            addCriterion("le_name =", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameNotEqualTo(String value) {
            addCriterion("le_name <>", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameGreaterThan(String value) {
            addCriterion("le_name >", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameGreaterThanOrEqualTo(String value) {
            addCriterion("le_name >=", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameLessThan(String value) {
            addCriterion("le_name <", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameLessThanOrEqualTo(String value) {
            addCriterion("le_name <=", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameLike(String value) {
            addCriterion("le_name like", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameNotLike(String value) {
            addCriterion("le_name not like", value, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameIn(List<String> values) {
            addCriterion("le_name in", values, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameNotIn(List<String> values) {
            addCriterion("le_name not in", values, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameBetween(String value1, String value2) {
            addCriterion("le_name between", value1, value2, "leName");
            return (Criteria) this;
        }

        public Criteria andLeNameNotBetween(String value1, String value2) {
            addCriterion("le_name not between", value1, value2, "leName");
            return (Criteria) this;
        }

        public Criteria andLeTeamIsNull() {
            addCriterion("le_team is null");
            return (Criteria) this;
        }

        public Criteria andLeTeamIsNotNull() {
            addCriterion("le_team is not null");
            return (Criteria) this;
        }

        public Criteria andLeTeamEqualTo(Integer value) {
            addCriterion("le_team =", value, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamNotEqualTo(Integer value) {
            addCriterion("le_team <>", value, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamGreaterThan(Integer value) {
            addCriterion("le_team >", value, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_team >=", value, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamLessThan(Integer value) {
            addCriterion("le_team <", value, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamLessThanOrEqualTo(Integer value) {
            addCriterion("le_team <=", value, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamIn(List<Integer> values) {
            addCriterion("le_team in", values, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamNotIn(List<Integer> values) {
            addCriterion("le_team not in", values, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamBetween(Integer value1, Integer value2) {
            addCriterion("le_team between", value1, value2, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("le_team not between", value1, value2, "leTeam");
            return (Criteria) this;
        }

        public Criteria andLeTimeIsNull() {
            addCriterion("le_time is null");
            return (Criteria) this;
        }

        public Criteria andLeTimeIsNotNull() {
            addCriterion("le_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeTimeEqualTo(Integer value) {
            addCriterion("le_time =", value, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeNotEqualTo(Integer value) {
            addCriterion("le_time <>", value, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeGreaterThan(Integer value) {
            addCriterion("le_time >", value, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_time >=", value, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeLessThan(Integer value) {
            addCriterion("le_time <", value, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("le_time <=", value, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeIn(List<Integer> values) {
            addCriterion("le_time in", values, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeNotIn(List<Integer> values) {
            addCriterion("le_time not in", values, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeBetween(Integer value1, Integer value2) {
            addCriterion("le_time between", value1, value2, "leTime");
            return (Criteria) this;
        }

        public Criteria andLeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("le_time not between", value1, value2, "leTime");
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