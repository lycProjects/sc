package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class ApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationExample() {
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

        public Criteria andApIdIsNull() {
            addCriterion("ap_id is null");
            return (Criteria) this;
        }

        public Criteria andApIdIsNotNull() {
            addCriterion("ap_id is not null");
            return (Criteria) this;
        }

        public Criteria andApIdEqualTo(Integer value) {
            addCriterion("ap_id =", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotEqualTo(Integer value) {
            addCriterion("ap_id <>", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThan(Integer value) {
            addCriterion("ap_id >", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap_id >=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThan(Integer value) {
            addCriterion("ap_id <", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap_id <=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdIn(List<Integer> values) {
            addCriterion("ap_id in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotIn(List<Integer> values) {
            addCriterion("ap_id not in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdBetween(Integer value1, Integer value2) {
            addCriterion("ap_id between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap_id not between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApStateIsNull() {
            addCriterion("ap_state is null");
            return (Criteria) this;
        }

        public Criteria andApStateIsNotNull() {
            addCriterion("ap_state is not null");
            return (Criteria) this;
        }

        public Criteria andApStateEqualTo(Integer value) {
            addCriterion("ap_state =", value, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateNotEqualTo(Integer value) {
            addCriterion("ap_state <>", value, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateGreaterThan(Integer value) {
            addCriterion("ap_state >", value, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap_state >=", value, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateLessThan(Integer value) {
            addCriterion("ap_state <", value, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateLessThanOrEqualTo(Integer value) {
            addCriterion("ap_state <=", value, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateIn(List<Integer> values) {
            addCriterion("ap_state in", values, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateNotIn(List<Integer> values) {
            addCriterion("ap_state not in", values, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateBetween(Integer value1, Integer value2) {
            addCriterion("ap_state between", value1, value2, "apState");
            return (Criteria) this;
        }

        public Criteria andApStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ap_state not between", value1, value2, "apState");
            return (Criteria) this;
        }

        public Criteria andApStatenameIsNull() {
            addCriterion("ap_statename is null");
            return (Criteria) this;
        }

        public Criteria andApStatenameIsNotNull() {
            addCriterion("ap_statename is not null");
            return (Criteria) this;
        }

        public Criteria andApStatenameEqualTo(String value) {
            addCriterion("ap_statename =", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameNotEqualTo(String value) {
            addCriterion("ap_statename <>", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameGreaterThan(String value) {
            addCriterion("ap_statename >", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameGreaterThanOrEqualTo(String value) {
            addCriterion("ap_statename >=", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameLessThan(String value) {
            addCriterion("ap_statename <", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameLessThanOrEqualTo(String value) {
            addCriterion("ap_statename <=", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameLike(String value) {
            addCriterion("ap_statename like", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameNotLike(String value) {
            addCriterion("ap_statename not like", value, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameIn(List<String> values) {
            addCriterion("ap_statename in", values, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameNotIn(List<String> values) {
            addCriterion("ap_statename not in", values, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameBetween(String value1, String value2) {
            addCriterion("ap_statename between", value1, value2, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApStatenameNotBetween(String value1, String value2) {
            addCriterion("ap_statename not between", value1, value2, "apStatename");
            return (Criteria) this;
        }

        public Criteria andApProjectidIsNull() {
            addCriterion("ap_projectid is null");
            return (Criteria) this;
        }

        public Criteria andApProjectidIsNotNull() {
            addCriterion("ap_projectid is not null");
            return (Criteria) this;
        }

        public Criteria andApProjectidEqualTo(Integer value) {
            addCriterion("ap_projectid =", value, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidNotEqualTo(Integer value) {
            addCriterion("ap_projectid <>", value, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidGreaterThan(Integer value) {
            addCriterion("ap_projectid >", value, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap_projectid >=", value, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidLessThan(Integer value) {
            addCriterion("ap_projectid <", value, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("ap_projectid <=", value, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidIn(List<Integer> values) {
            addCriterion("ap_projectid in", values, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidNotIn(List<Integer> values) {
            addCriterion("ap_projectid not in", values, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidBetween(Integer value1, Integer value2) {
            addCriterion("ap_projectid between", value1, value2, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("ap_projectid not between", value1, value2, "apProjectid");
            return (Criteria) this;
        }

        public Criteria andApProjectnameIsNull() {
            addCriterion("ap_projectname is null");
            return (Criteria) this;
        }

        public Criteria andApProjectnameIsNotNull() {
            addCriterion("ap_projectname is not null");
            return (Criteria) this;
        }

        public Criteria andApProjectnameEqualTo(String value) {
            addCriterion("ap_projectname =", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameNotEqualTo(String value) {
            addCriterion("ap_projectname <>", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameGreaterThan(String value) {
            addCriterion("ap_projectname >", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ap_projectname >=", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameLessThan(String value) {
            addCriterion("ap_projectname <", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ap_projectname <=", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameLike(String value) {
            addCriterion("ap_projectname like", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameNotLike(String value) {
            addCriterion("ap_projectname not like", value, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameIn(List<String> values) {
            addCriterion("ap_projectname in", values, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameNotIn(List<String> values) {
            addCriterion("ap_projectname not in", values, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameBetween(String value1, String value2) {
            addCriterion("ap_projectname between", value1, value2, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApProjectnameNotBetween(String value1, String value2) {
            addCriterion("ap_projectname not between", value1, value2, "apProjectname");
            return (Criteria) this;
        }

        public Criteria andApTeamidIsNull() {
            addCriterion("ap_teamid is null");
            return (Criteria) this;
        }

        public Criteria andApTeamidIsNotNull() {
            addCriterion("ap_teamid is not null");
            return (Criteria) this;
        }

        public Criteria andApTeamidEqualTo(Integer value) {
            addCriterion("ap_teamid =", value, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidNotEqualTo(Integer value) {
            addCriterion("ap_teamid <>", value, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidGreaterThan(Integer value) {
            addCriterion("ap_teamid >", value, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap_teamid >=", value, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidLessThan(Integer value) {
            addCriterion("ap_teamid <", value, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("ap_teamid <=", value, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidIn(List<Integer> values) {
            addCriterion("ap_teamid in", values, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidNotIn(List<Integer> values) {
            addCriterion("ap_teamid not in", values, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidBetween(Integer value1, Integer value2) {
            addCriterion("ap_teamid between", value1, value2, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("ap_teamid not between", value1, value2, "apTeamid");
            return (Criteria) this;
        }

        public Criteria andApTeamnameIsNull() {
            addCriterion("ap_teamname is null");
            return (Criteria) this;
        }

        public Criteria andApTeamnameIsNotNull() {
            addCriterion("ap_teamname is not null");
            return (Criteria) this;
        }

        public Criteria andApTeamnameEqualTo(String value) {
            addCriterion("ap_teamname =", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameNotEqualTo(String value) {
            addCriterion("ap_teamname <>", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameGreaterThan(String value) {
            addCriterion("ap_teamname >", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("ap_teamname >=", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameLessThan(String value) {
            addCriterion("ap_teamname <", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameLessThanOrEqualTo(String value) {
            addCriterion("ap_teamname <=", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameLike(String value) {
            addCriterion("ap_teamname like", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameNotLike(String value) {
            addCriterion("ap_teamname not like", value, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameIn(List<String> values) {
            addCriterion("ap_teamname in", values, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameNotIn(List<String> values) {
            addCriterion("ap_teamname not in", values, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameBetween(String value1, String value2) {
            addCriterion("ap_teamname between", value1, value2, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTeamnameNotBetween(String value1, String value2) {
            addCriterion("ap_teamname not between", value1, value2, "apTeamname");
            return (Criteria) this;
        }

        public Criteria andApTimeIsNull() {
            addCriterion("ap_time is null");
            return (Criteria) this;
        }

        public Criteria andApTimeIsNotNull() {
            addCriterion("ap_time is not null");
            return (Criteria) this;
        }

        public Criteria andApTimeEqualTo(String value) {
            addCriterion("ap_time =", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeNotEqualTo(String value) {
            addCriterion("ap_time <>", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeGreaterThan(String value) {
            addCriterion("ap_time >", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ap_time >=", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeLessThan(String value) {
            addCriterion("ap_time <", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeLessThanOrEqualTo(String value) {
            addCriterion("ap_time <=", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeLike(String value) {
            addCriterion("ap_time like", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeNotLike(String value) {
            addCriterion("ap_time not like", value, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeIn(List<String> values) {
            addCriterion("ap_time in", values, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeNotIn(List<String> values) {
            addCriterion("ap_time not in", values, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeBetween(String value1, String value2) {
            addCriterion("ap_time between", value1, value2, "apTime");
            return (Criteria) this;
        }

        public Criteria andApTimeNotBetween(String value1, String value2) {
            addCriterion("ap_time not between", value1, value2, "apTime");
            return (Criteria) this;
        }

        public Criteria andApReasonIsNull() {
            addCriterion("ap_reason is null");
            return (Criteria) this;
        }

        public Criteria andApReasonIsNotNull() {
            addCriterion("ap_reason is not null");
            return (Criteria) this;
        }

        public Criteria andApReasonEqualTo(String value) {
            addCriterion("ap_reason =", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonNotEqualTo(String value) {
            addCriterion("ap_reason <>", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonGreaterThan(String value) {
            addCriterion("ap_reason >", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonGreaterThanOrEqualTo(String value) {
            addCriterion("ap_reason >=", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonLessThan(String value) {
            addCriterion("ap_reason <", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonLessThanOrEqualTo(String value) {
            addCriterion("ap_reason <=", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonLike(String value) {
            addCriterion("ap_reason like", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonNotLike(String value) {
            addCriterion("ap_reason not like", value, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonIn(List<String> values) {
            addCriterion("ap_reason in", values, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonNotIn(List<String> values) {
            addCriterion("ap_reason not in", values, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonBetween(String value1, String value2) {
            addCriterion("ap_reason between", value1, value2, "apReason");
            return (Criteria) this;
        }

        public Criteria andApReasonNotBetween(String value1, String value2) {
            addCriterion("ap_reason not between", value1, value2, "apReason");
            return (Criteria) this;
        }

        public Criteria andApHandletimeIsNull() {
            addCriterion("ap_handletime is null");
            return (Criteria) this;
        }

        public Criteria andApHandletimeIsNotNull() {
            addCriterion("ap_handletime is not null");
            return (Criteria) this;
        }

        public Criteria andApHandletimeEqualTo(String value) {
            addCriterion("ap_handletime =", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeNotEqualTo(String value) {
            addCriterion("ap_handletime <>", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeGreaterThan(String value) {
            addCriterion("ap_handletime >", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeGreaterThanOrEqualTo(String value) {
            addCriterion("ap_handletime >=", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeLessThan(String value) {
            addCriterion("ap_handletime <", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeLessThanOrEqualTo(String value) {
            addCriterion("ap_handletime <=", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeLike(String value) {
            addCriterion("ap_handletime like", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeNotLike(String value) {
            addCriterion("ap_handletime not like", value, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeIn(List<String> values) {
            addCriterion("ap_handletime in", values, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeNotIn(List<String> values) {
            addCriterion("ap_handletime not in", values, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeBetween(String value1, String value2) {
            addCriterion("ap_handletime between", value1, value2, "apHandletime");
            return (Criteria) this;
        }

        public Criteria andApHandletimeNotBetween(String value1, String value2) {
            addCriterion("ap_handletime not between", value1, value2, "apHandletime");
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