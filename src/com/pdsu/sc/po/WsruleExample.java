package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WsruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsruleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andWsIdIsNull() {
            addCriterion("ws_id is null");
            return (Criteria) this;
        }

        public Criteria andWsIdIsNotNull() {
            addCriterion("ws_id is not null");
            return (Criteria) this;
        }

        public Criteria andWsIdEqualTo(Integer value) {
            addCriterion("ws_id =", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdNotEqualTo(Integer value) {
            addCriterion("ws_id <>", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdGreaterThan(Integer value) {
            addCriterion("ws_id >", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ws_id >=", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdLessThan(Integer value) {
            addCriterion("ws_id <", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ws_id <=", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdIn(List<Integer> values) {
            addCriterion("ws_id in", values, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdNotIn(List<Integer> values) {
            addCriterion("ws_id not in", values, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdBetween(Integer value1, Integer value2) {
            addCriterion("ws_id between", value1, value2, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ws_id not between", value1, value2, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsTeamIsNull() {
            addCriterion("ws_team is null");
            return (Criteria) this;
        }

        public Criteria andWsTeamIsNotNull() {
            addCriterion("ws_team is not null");
            return (Criteria) this;
        }

        public Criteria andWsTeamEqualTo(Integer value) {
            addCriterion("ws_team =", value, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamNotEqualTo(Integer value) {
            addCriterion("ws_team <>", value, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamGreaterThan(Integer value) {
            addCriterion("ws_team >", value, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("ws_team >=", value, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamLessThan(Integer value) {
            addCriterion("ws_team <", value, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamLessThanOrEqualTo(Integer value) {
            addCriterion("ws_team <=", value, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamIn(List<Integer> values) {
            addCriterion("ws_team in", values, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamNotIn(List<Integer> values) {
            addCriterion("ws_team not in", values, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamBetween(Integer value1, Integer value2) {
            addCriterion("ws_team between", value1, value2, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("ws_team not between", value1, value2, "wsTeam");
            return (Criteria) this;
        }

        public Criteria andWsRecodeIsNull() {
            addCriterion("ws_recode is null");
            return (Criteria) this;
        }

        public Criteria andWsRecodeIsNotNull() {
            addCriterion("ws_recode is not null");
            return (Criteria) this;
        }

        public Criteria andWsRecodeEqualTo(String value) {
            addCriterion("ws_recode =", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeNotEqualTo(String value) {
            addCriterion("ws_recode <>", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeGreaterThan(String value) {
            addCriterion("ws_recode >", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ws_recode >=", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeLessThan(String value) {
            addCriterion("ws_recode <", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeLessThanOrEqualTo(String value) {
            addCriterion("ws_recode <=", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeLike(String value) {
            addCriterion("ws_recode like", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeNotLike(String value) {
            addCriterion("ws_recode not like", value, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeIn(List<String> values) {
            addCriterion("ws_recode in", values, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeNotIn(List<String> values) {
            addCriterion("ws_recode not in", values, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeBetween(String value1, String value2) {
            addCriterion("ws_recode between", value1, value2, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsRecodeNotBetween(String value1, String value2) {
            addCriterion("ws_recode not between", value1, value2, "wsRecode");
            return (Criteria) this;
        }

        public Criteria andWsTimeIsNull() {
            addCriterion("ws_time is null");
            return (Criteria) this;
        }

        public Criteria andWsTimeIsNotNull() {
            addCriterion("ws_time is not null");
            return (Criteria) this;
        }

        public Criteria andWsTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ws_time =", value, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ws_time <>", value, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ws_time >", value, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ws_time >=", value, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeLessThan(Date value) {
            addCriterionForJDBCDate("ws_time <", value, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ws_time <=", value, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ws_time in", values, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ws_time not in", values, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ws_time between", value1, value2, "wsTime");
            return (Criteria) this;
        }

        public Criteria andWsTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ws_time not between", value1, value2, "wsTime");
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