package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class AbsenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AbsenceExample() {
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

        public Criteria andAbIdIsNull() {
            addCriterion("ab_id is null");
            return (Criteria) this;
        }

        public Criteria andAbIdIsNotNull() {
            addCriterion("ab_id is not null");
            return (Criteria) this;
        }

        public Criteria andAbIdEqualTo(Integer value) {
            addCriterion("ab_id =", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdNotEqualTo(Integer value) {
            addCriterion("ab_id <>", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdGreaterThan(Integer value) {
            addCriterion("ab_id >", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ab_id >=", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdLessThan(Integer value) {
            addCriterion("ab_id <", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdLessThanOrEqualTo(Integer value) {
            addCriterion("ab_id <=", value, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdIn(List<Integer> values) {
            addCriterion("ab_id in", values, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdNotIn(List<Integer> values) {
            addCriterion("ab_id not in", values, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdBetween(Integer value1, Integer value2) {
            addCriterion("ab_id between", value1, value2, "abId");
            return (Criteria) this;
        }

        public Criteria andAbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ab_id not between", value1, value2, "abId");
            return (Criteria) this;
        }

        public Criteria andAbNameIsNull() {
            addCriterion("ab_name is null");
            return (Criteria) this;
        }

        public Criteria andAbNameIsNotNull() {
            addCriterion("ab_name is not null");
            return (Criteria) this;
        }

        public Criteria andAbNameEqualTo(String value) {
            addCriterion("ab_name =", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotEqualTo(String value) {
            addCriterion("ab_name <>", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameGreaterThan(String value) {
            addCriterion("ab_name >", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameGreaterThanOrEqualTo(String value) {
            addCriterion("ab_name >=", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameLessThan(String value) {
            addCriterion("ab_name <", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameLessThanOrEqualTo(String value) {
            addCriterion("ab_name <=", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameLike(String value) {
            addCriterion("ab_name like", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotLike(String value) {
            addCriterion("ab_name not like", value, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameIn(List<String> values) {
            addCriterion("ab_name in", values, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotIn(List<String> values) {
            addCriterion("ab_name not in", values, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameBetween(String value1, String value2) {
            addCriterion("ab_name between", value1, value2, "abName");
            return (Criteria) this;
        }

        public Criteria andAbNameNotBetween(String value1, String value2) {
            addCriterion("ab_name not between", value1, value2, "abName");
            return (Criteria) this;
        }

        public Criteria andAbTeamIsNull() {
            addCriterion("ab_team is null");
            return (Criteria) this;
        }

        public Criteria andAbTeamIsNotNull() {
            addCriterion("ab_team is not null");
            return (Criteria) this;
        }

        public Criteria andAbTeamEqualTo(Integer value) {
            addCriterion("ab_team =", value, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamNotEqualTo(Integer value) {
            addCriterion("ab_team <>", value, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamGreaterThan(Integer value) {
            addCriterion("ab_team >", value, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("ab_team >=", value, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamLessThan(Integer value) {
            addCriterion("ab_team <", value, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamLessThanOrEqualTo(Integer value) {
            addCriterion("ab_team <=", value, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamIn(List<Integer> values) {
            addCriterion("ab_team in", values, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamNotIn(List<Integer> values) {
            addCriterion("ab_team not in", values, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamBetween(Integer value1, Integer value2) {
            addCriterion("ab_team between", value1, value2, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("ab_team not between", value1, value2, "abTeam");
            return (Criteria) this;
        }

        public Criteria andAbTimeIsNull() {
            addCriterion("ab_time is null");
            return (Criteria) this;
        }

        public Criteria andAbTimeIsNotNull() {
            addCriterion("ab_time is not null");
            return (Criteria) this;
        }

        public Criteria andAbTimeEqualTo(Integer value) {
            addCriterion("ab_time =", value, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeNotEqualTo(Integer value) {
            addCriterion("ab_time <>", value, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeGreaterThan(Integer value) {
            addCriterion("ab_time >", value, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ab_time >=", value, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeLessThan(Integer value) {
            addCriterion("ab_time <", value, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ab_time <=", value, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeIn(List<Integer> values) {
            addCriterion("ab_time in", values, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeNotIn(List<Integer> values) {
            addCriterion("ab_time not in", values, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeBetween(Integer value1, Integer value2) {
            addCriterion("ab_time between", value1, value2, "abTime");
            return (Criteria) this;
        }

        public Criteria andAbTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ab_time not between", value1, value2, "abTime");
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