package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class SummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SummaryExample() {
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

        public Criteria andSuIdIsNull() {
            addCriterion("su_id is null");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNotNull() {
            addCriterion("su_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuIdEqualTo(Integer value) {
            addCriterion("su_id =", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotEqualTo(Integer value) {
            addCriterion("su_id <>", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThan(Integer value) {
            addCriterion("su_id >", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_id >=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThan(Integer value) {
            addCriterion("su_id <", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThanOrEqualTo(Integer value) {
            addCriterion("su_id <=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdIn(List<Integer> values) {
            addCriterion("su_id in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotIn(List<Integer> values) {
            addCriterion("su_id not in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdBetween(Integer value1, Integer value2) {
            addCriterion("su_id between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("su_id not between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuTeamIsNull() {
            addCriterion("su_team is null");
            return (Criteria) this;
        }

        public Criteria andSuTeamIsNotNull() {
            addCriterion("su_team is not null");
            return (Criteria) this;
        }

        public Criteria andSuTeamEqualTo(Integer value) {
            addCriterion("su_team =", value, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamNotEqualTo(Integer value) {
            addCriterion("su_team <>", value, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamGreaterThan(Integer value) {
            addCriterion("su_team >", value, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_team >=", value, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamLessThan(Integer value) {
            addCriterion("su_team <", value, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamLessThanOrEqualTo(Integer value) {
            addCriterion("su_team <=", value, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamIn(List<Integer> values) {
            addCriterion("su_team in", values, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamNotIn(List<Integer> values) {
            addCriterion("su_team not in", values, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamBetween(Integer value1, Integer value2) {
            addCriterion("su_team between", value1, value2, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("su_team not between", value1, value2, "suTeam");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceIsNull() {
            addCriterion("su_absence is null");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceIsNotNull() {
            addCriterion("su_absence is not null");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceEqualTo(Integer value) {
            addCriterion("su_absence =", value, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceNotEqualTo(Integer value) {
            addCriterion("su_absence <>", value, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceGreaterThan(Integer value) {
            addCriterion("su_absence >", value, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_absence >=", value, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceLessThan(Integer value) {
            addCriterion("su_absence <", value, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceLessThanOrEqualTo(Integer value) {
            addCriterion("su_absence <=", value, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceIn(List<Integer> values) {
            addCriterion("su_absence in", values, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceNotIn(List<Integer> values) {
            addCriterion("su_absence not in", values, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceBetween(Integer value1, Integer value2) {
            addCriterion("su_absence between", value1, value2, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuAbsenceNotBetween(Integer value1, Integer value2) {
            addCriterion("su_absence not between", value1, value2, "suAbsence");
            return (Criteria) this;
        }

        public Criteria andSuWeishengIsNull() {
            addCriterion("su_weisheng is null");
            return (Criteria) this;
        }

        public Criteria andSuWeishengIsNotNull() {
            addCriterion("su_weisheng is not null");
            return (Criteria) this;
        }

        public Criteria andSuWeishengEqualTo(Integer value) {
            addCriterion("su_weisheng =", value, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengNotEqualTo(Integer value) {
            addCriterion("su_weisheng <>", value, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengGreaterThan(Integer value) {
            addCriterion("su_weisheng >", value, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_weisheng >=", value, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengLessThan(Integer value) {
            addCriterion("su_weisheng <", value, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengLessThanOrEqualTo(Integer value) {
            addCriterion("su_weisheng <=", value, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengIn(List<Integer> values) {
            addCriterion("su_weisheng in", values, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengNotIn(List<Integer> values) {
            addCriterion("su_weisheng not in", values, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengBetween(Integer value1, Integer value2) {
            addCriterion("su_weisheng between", value1, value2, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuWeishengNotBetween(Integer value1, Integer value2) {
            addCriterion("su_weisheng not between", value1, value2, "suWeisheng");
            return (Criteria) this;
        }

        public Criteria andSuJilvIsNull() {
            addCriterion("su_jilv is null");
            return (Criteria) this;
        }

        public Criteria andSuJilvIsNotNull() {
            addCriterion("su_jilv is not null");
            return (Criteria) this;
        }

        public Criteria andSuJilvEqualTo(Integer value) {
            addCriterion("su_jilv =", value, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvNotEqualTo(Integer value) {
            addCriterion("su_jilv <>", value, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvGreaterThan(Integer value) {
            addCriterion("su_jilv >", value, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_jilv >=", value, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvLessThan(Integer value) {
            addCriterion("su_jilv <", value, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvLessThanOrEqualTo(Integer value) {
            addCriterion("su_jilv <=", value, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvIn(List<Integer> values) {
            addCriterion("su_jilv in", values, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvNotIn(List<Integer> values) {
            addCriterion("su_jilv not in", values, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvBetween(Integer value1, Integer value2) {
            addCriterion("su_jilv between", value1, value2, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuJilvNotBetween(Integer value1, Integer value2) {
            addCriterion("su_jilv not between", value1, value2, "suJilv");
            return (Criteria) this;
        }

        public Criteria andSuTotalIsNull() {
            addCriterion("su_total is null");
            return (Criteria) this;
        }

        public Criteria andSuTotalIsNotNull() {
            addCriterion("su_total is not null");
            return (Criteria) this;
        }

        public Criteria andSuTotalEqualTo(Integer value) {
            addCriterion("su_total =", value, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalNotEqualTo(Integer value) {
            addCriterion("su_total <>", value, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalGreaterThan(Integer value) {
            addCriterion("su_total >", value, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_total >=", value, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalLessThan(Integer value) {
            addCriterion("su_total <", value, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalLessThanOrEqualTo(Integer value) {
            addCriterion("su_total <=", value, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalIn(List<Integer> values) {
            addCriterion("su_total in", values, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalNotIn(List<Integer> values) {
            addCriterion("su_total not in", values, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalBetween(Integer value1, Integer value2) {
            addCriterion("su_total between", value1, value2, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("su_total not between", value1, value2, "suTotal");
            return (Criteria) this;
        }

        public Criteria andSuOrderIsNull() {
            addCriterion("su_order is null");
            return (Criteria) this;
        }

        public Criteria andSuOrderIsNotNull() {
            addCriterion("su_order is not null");
            return (Criteria) this;
        }

        public Criteria andSuOrderEqualTo(Integer value) {
            addCriterion("su_order =", value, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderNotEqualTo(Integer value) {
            addCriterion("su_order <>", value, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderGreaterThan(Integer value) {
            addCriterion("su_order >", value, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_order >=", value, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderLessThan(Integer value) {
            addCriterion("su_order <", value, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderLessThanOrEqualTo(Integer value) {
            addCriterion("su_order <=", value, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderIn(List<Integer> values) {
            addCriterion("su_order in", values, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderNotIn(List<Integer> values) {
            addCriterion("su_order not in", values, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderBetween(Integer value1, Integer value2) {
            addCriterion("su_order between", value1, value2, "suOrder");
            return (Criteria) this;
        }

        public Criteria andSuOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("su_order not between", value1, value2, "suOrder");
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