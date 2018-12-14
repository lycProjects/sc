package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JlruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JlruleExample() {
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

        public Criteria andJlIdIsNull() {
            addCriterion("jl_id is null");
            return (Criteria) this;
        }

        public Criteria andJlIdIsNotNull() {
            addCriterion("jl_id is not null");
            return (Criteria) this;
        }

        public Criteria andJlIdEqualTo(Integer value) {
            addCriterion("jl_id =", value, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdNotEqualTo(Integer value) {
            addCriterion("jl_id <>", value, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdGreaterThan(Integer value) {
            addCriterion("jl_id >", value, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jl_id >=", value, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdLessThan(Integer value) {
            addCriterion("jl_id <", value, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdLessThanOrEqualTo(Integer value) {
            addCriterion("jl_id <=", value, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdIn(List<Integer> values) {
            addCriterion("jl_id in", values, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdNotIn(List<Integer> values) {
            addCriterion("jl_id not in", values, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdBetween(Integer value1, Integer value2) {
            addCriterion("jl_id between", value1, value2, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jl_id not between", value1, value2, "jlId");
            return (Criteria) this;
        }

        public Criteria andJlTeamIsNull() {
            addCriterion("jl_team is null");
            return (Criteria) this;
        }

        public Criteria andJlTeamIsNotNull() {
            addCriterion("jl_team is not null");
            return (Criteria) this;
        }

        public Criteria andJlTeamEqualTo(Integer value) {
            addCriterion("jl_team =", value, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamNotEqualTo(Integer value) {
            addCriterion("jl_team <>", value, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamGreaterThan(Integer value) {
            addCriterion("jl_team >", value, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("jl_team >=", value, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamLessThan(Integer value) {
            addCriterion("jl_team <", value, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamLessThanOrEqualTo(Integer value) {
            addCriterion("jl_team <=", value, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamIn(List<Integer> values) {
            addCriterion("jl_team in", values, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamNotIn(List<Integer> values) {
            addCriterion("jl_team not in", values, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamBetween(Integer value1, Integer value2) {
            addCriterion("jl_team between", value1, value2, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("jl_team not between", value1, value2, "jlTeam");
            return (Criteria) this;
        }

        public Criteria andJlRecodeIsNull() {
            addCriterion("jl_recode is null");
            return (Criteria) this;
        }

        public Criteria andJlRecodeIsNotNull() {
            addCriterion("jl_recode is not null");
            return (Criteria) this;
        }

        public Criteria andJlRecodeEqualTo(String value) {
            addCriterion("jl_recode =", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeNotEqualTo(String value) {
            addCriterion("jl_recode <>", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeGreaterThan(String value) {
            addCriterion("jl_recode >", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeGreaterThanOrEqualTo(String value) {
            addCriterion("jl_recode >=", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeLessThan(String value) {
            addCriterion("jl_recode <", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeLessThanOrEqualTo(String value) {
            addCriterion("jl_recode <=", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeLike(String value) {
            addCriterion("jl_recode like", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeNotLike(String value) {
            addCriterion("jl_recode not like", value, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeIn(List<String> values) {
            addCriterion("jl_recode in", values, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeNotIn(List<String> values) {
            addCriterion("jl_recode not in", values, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeBetween(String value1, String value2) {
            addCriterion("jl_recode between", value1, value2, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlRecodeNotBetween(String value1, String value2) {
            addCriterion("jl_recode not between", value1, value2, "jlRecode");
            return (Criteria) this;
        }

        public Criteria andJlTimeIsNull() {
            addCriterion("jl_time is null");
            return (Criteria) this;
        }

        public Criteria andJlTimeIsNotNull() {
            addCriterion("jl_time is not null");
            return (Criteria) this;
        }

        public Criteria andJlTimeEqualTo(Date value) {
            addCriterionForJDBCDate("jl_time =", value, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("jl_time <>", value, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("jl_time >", value, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jl_time >=", value, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeLessThan(Date value) {
            addCriterionForJDBCDate("jl_time <", value, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jl_time <=", value, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeIn(List<Date> values) {
            addCriterionForJDBCDate("jl_time in", values, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("jl_time not in", values, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jl_time between", value1, value2, "jlTime");
            return (Criteria) this;
        }

        public Criteria andJlTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jl_time not between", value1, value2, "jlTime");
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