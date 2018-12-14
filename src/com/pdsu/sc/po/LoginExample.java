package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class LoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginExample() {
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

        public Criteria andLoIdIsNull() {
            addCriterion("lo_id is null");
            return (Criteria) this;
        }

        public Criteria andLoIdIsNotNull() {
            addCriterion("lo_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoIdEqualTo(Integer value) {
            addCriterion("lo_id =", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdNotEqualTo(Integer value) {
            addCriterion("lo_id <>", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdGreaterThan(Integer value) {
            addCriterion("lo_id >", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lo_id >=", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdLessThan(Integer value) {
            addCriterion("lo_id <", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdLessThanOrEqualTo(Integer value) {
            addCriterion("lo_id <=", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdIn(List<Integer> values) {
            addCriterion("lo_id in", values, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdNotIn(List<Integer> values) {
            addCriterion("lo_id not in", values, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdBetween(Integer value1, Integer value2) {
            addCriterion("lo_id between", value1, value2, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lo_id not between", value1, value2, "loId");
            return (Criteria) this;
        }

        public Criteria andLoUsernameIsNull() {
            addCriterion("lo_username is null");
            return (Criteria) this;
        }

        public Criteria andLoUsernameIsNotNull() {
            addCriterion("lo_username is not null");
            return (Criteria) this;
        }

        public Criteria andLoUsernameEqualTo(String value) {
            addCriterion("lo_username =", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameNotEqualTo(String value) {
            addCriterion("lo_username <>", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameGreaterThan(String value) {
            addCriterion("lo_username >", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("lo_username >=", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameLessThan(String value) {
            addCriterion("lo_username <", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameLessThanOrEqualTo(String value) {
            addCriterion("lo_username <=", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameLike(String value) {
            addCriterion("lo_username like", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameNotLike(String value) {
            addCriterion("lo_username not like", value, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameIn(List<String> values) {
            addCriterion("lo_username in", values, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameNotIn(List<String> values) {
            addCriterion("lo_username not in", values, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameBetween(String value1, String value2) {
            addCriterion("lo_username between", value1, value2, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoUsernameNotBetween(String value1, String value2) {
            addCriterion("lo_username not between", value1, value2, "loUsername");
            return (Criteria) this;
        }

        public Criteria andLoPasswordIsNull() {
            addCriterion("lo_password is null");
            return (Criteria) this;
        }

        public Criteria andLoPasswordIsNotNull() {
            addCriterion("lo_password is not null");
            return (Criteria) this;
        }

        public Criteria andLoPasswordEqualTo(String value) {
            addCriterion("lo_password =", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordNotEqualTo(String value) {
            addCriterion("lo_password <>", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordGreaterThan(String value) {
            addCriterion("lo_password >", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("lo_password >=", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordLessThan(String value) {
            addCriterion("lo_password <", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordLessThanOrEqualTo(String value) {
            addCriterion("lo_password <=", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordLike(String value) {
            addCriterion("lo_password like", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordNotLike(String value) {
            addCriterion("lo_password not like", value, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordIn(List<String> values) {
            addCriterion("lo_password in", values, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordNotIn(List<String> values) {
            addCriterion("lo_password not in", values, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordBetween(String value1, String value2) {
            addCriterion("lo_password between", value1, value2, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoPasswordNotBetween(String value1, String value2) {
            addCriterion("lo_password not between", value1, value2, "loPassword");
            return (Criteria) this;
        }

        public Criteria andLoRoleIsNull() {
            addCriterion("lo_role is null");
            return (Criteria) this;
        }

        public Criteria andLoRoleIsNotNull() {
            addCriterion("lo_role is not null");
            return (Criteria) this;
        }

        public Criteria andLoRoleEqualTo(Integer value) {
            addCriterion("lo_role =", value, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleNotEqualTo(Integer value) {
            addCriterion("lo_role <>", value, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleGreaterThan(Integer value) {
            addCriterion("lo_role >", value, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("lo_role >=", value, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleLessThan(Integer value) {
            addCriterion("lo_role <", value, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleLessThanOrEqualTo(Integer value) {
            addCriterion("lo_role <=", value, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleIn(List<Integer> values) {
            addCriterion("lo_role in", values, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleNotIn(List<Integer> values) {
            addCriterion("lo_role not in", values, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleBetween(Integer value1, Integer value2) {
            addCriterion("lo_role between", value1, value2, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("lo_role not between", value1, value2, "loRole");
            return (Criteria) this;
        }

        public Criteria andLoTeamIsNull() {
            addCriterion("lo_team is null");
            return (Criteria) this;
        }

        public Criteria andLoTeamIsNotNull() {
            addCriterion("lo_team is not null");
            return (Criteria) this;
        }

        public Criteria andLoTeamEqualTo(Integer value) {
            addCriterion("lo_team =", value, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamNotEqualTo(Integer value) {
            addCriterion("lo_team <>", value, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamGreaterThan(Integer value) {
            addCriterion("lo_team >", value, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("lo_team >=", value, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamLessThan(Integer value) {
            addCriterion("lo_team <", value, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamLessThanOrEqualTo(Integer value) {
            addCriterion("lo_team <=", value, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamIn(List<Integer> values) {
            addCriterion("lo_team in", values, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamNotIn(List<Integer> values) {
            addCriterion("lo_team not in", values, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamBetween(Integer value1, Integer value2) {
            addCriterion("lo_team between", value1, value2, "loTeam");
            return (Criteria) this;
        }

        public Criteria andLoTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("lo_team not between", value1, value2, "loTeam");
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