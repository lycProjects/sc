package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class EquipborrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipborrowExample() {
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

        public Criteria andEqbIdIsNull() {
            addCriterion("eqb_id is null");
            return (Criteria) this;
        }

        public Criteria andEqbIdIsNotNull() {
            addCriterion("eqb_id is not null");
            return (Criteria) this;
        }

        public Criteria andEqbIdEqualTo(Integer value) {
            addCriterion("eqb_id =", value, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdNotEqualTo(Integer value) {
            addCriterion("eqb_id <>", value, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdGreaterThan(Integer value) {
            addCriterion("eqb_id >", value, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqb_id >=", value, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdLessThan(Integer value) {
            addCriterion("eqb_id <", value, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdLessThanOrEqualTo(Integer value) {
            addCriterion("eqb_id <=", value, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdIn(List<Integer> values) {
            addCriterion("eqb_id in", values, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdNotIn(List<Integer> values) {
            addCriterion("eqb_id not in", values, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdBetween(Integer value1, Integer value2) {
            addCriterion("eqb_id between", value1, value2, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eqb_id not between", value1, value2, "eqbId");
            return (Criteria) this;
        }

        public Criteria andEqbTeamIsNull() {
            addCriterion("eqb_team is null");
            return (Criteria) this;
        }

        public Criteria andEqbTeamIsNotNull() {
            addCriterion("eqb_team is not null");
            return (Criteria) this;
        }

        public Criteria andEqbTeamEqualTo(Integer value) {
            addCriterion("eqb_team =", value, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamNotEqualTo(Integer value) {
            addCriterion("eqb_team <>", value, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamGreaterThan(Integer value) {
            addCriterion("eqb_team >", value, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqb_team >=", value, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamLessThan(Integer value) {
            addCriterion("eqb_team <", value, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamLessThanOrEqualTo(Integer value) {
            addCriterion("eqb_team <=", value, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamIn(List<Integer> values) {
            addCriterion("eqb_team in", values, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamNotIn(List<Integer> values) {
            addCriterion("eqb_team not in", values, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamBetween(Integer value1, Integer value2) {
            addCriterion("eqb_team between", value1, value2, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("eqb_team not between", value1, value2, "eqbTeam");
            return (Criteria) this;
        }

        public Criteria andEqbZfourIsNull() {
            addCriterion("eqb_zfour is null");
            return (Criteria) this;
        }

        public Criteria andEqbZfourIsNotNull() {
            addCriterion("eqb_zfour is not null");
            return (Criteria) this;
        }

        public Criteria andEqbZfourEqualTo(Integer value) {
            addCriterion("eqb_zfour =", value, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourNotEqualTo(Integer value) {
            addCriterion("eqb_zfour <>", value, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourGreaterThan(Integer value) {
            addCriterion("eqb_zfour >", value, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqb_zfour >=", value, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourLessThan(Integer value) {
            addCriterion("eqb_zfour <", value, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourLessThanOrEqualTo(Integer value) {
            addCriterion("eqb_zfour <=", value, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourIn(List<Integer> values) {
            addCriterion("eqb_zfour in", values, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourNotIn(List<Integer> values) {
            addCriterion("eqb_zfour not in", values, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourBetween(Integer value1, Integer value2) {
            addCriterion("eqb_zfour between", value1, value2, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbZfourNotBetween(Integer value1, Integer value2) {
            addCriterion("eqb_zfour not between", value1, value2, "eqbZfour");
            return (Criteria) this;
        }

        public Criteria andEqbOnegIsNull() {
            addCriterion("eqb_oneg is null");
            return (Criteria) this;
        }

        public Criteria andEqbOnegIsNotNull() {
            addCriterion("eqb_oneg is not null");
            return (Criteria) this;
        }

        public Criteria andEqbOnegEqualTo(Integer value) {
            addCriterion("eqb_oneg =", value, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegNotEqualTo(Integer value) {
            addCriterion("eqb_oneg <>", value, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegGreaterThan(Integer value) {
            addCriterion("eqb_oneg >", value, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqb_oneg >=", value, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegLessThan(Integer value) {
            addCriterion("eqb_oneg <", value, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegLessThanOrEqualTo(Integer value) {
            addCriterion("eqb_oneg <=", value, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegIn(List<Integer> values) {
            addCriterion("eqb_oneg in", values, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegNotIn(List<Integer> values) {
            addCriterion("eqb_oneg not in", values, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegBetween(Integer value1, Integer value2) {
            addCriterion("eqb_oneg between", value1, value2, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbOnegNotBetween(Integer value1, Integer value2) {
            addCriterion("eqb_oneg not between", value1, value2, "eqbOneg");
            return (Criteria) this;
        }

        public Criteria andEqbTwogIsNull() {
            addCriterion("eqb_twog is null");
            return (Criteria) this;
        }

        public Criteria andEqbTwogIsNotNull() {
            addCriterion("eqb_twog is not null");
            return (Criteria) this;
        }

        public Criteria andEqbTwogEqualTo(Integer value) {
            addCriterion("eqb_twog =", value, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogNotEqualTo(Integer value) {
            addCriterion("eqb_twog <>", value, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogGreaterThan(Integer value) {
            addCriterion("eqb_twog >", value, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqb_twog >=", value, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogLessThan(Integer value) {
            addCriterion("eqb_twog <", value, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogLessThanOrEqualTo(Integer value) {
            addCriterion("eqb_twog <=", value, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogIn(List<Integer> values) {
            addCriterion("eqb_twog in", values, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogNotIn(List<Integer> values) {
            addCriterion("eqb_twog not in", values, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogBetween(Integer value1, Integer value2) {
            addCriterion("eqb_twog between", value1, value2, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbTwogNotBetween(Integer value1, Integer value2) {
            addCriterion("eqb_twog not between", value1, value2, "eqbTwog");
            return (Criteria) this;
        }

        public Criteria andEqbFourgIsNull() {
            addCriterion("eqb_fourg is null");
            return (Criteria) this;
        }

        public Criteria andEqbFourgIsNotNull() {
            addCriterion("eqb_fourg is not null");
            return (Criteria) this;
        }

        public Criteria andEqbFourgEqualTo(Integer value) {
            addCriterion("eqb_fourg =", value, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgNotEqualTo(Integer value) {
            addCriterion("eqb_fourg <>", value, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgGreaterThan(Integer value) {
            addCriterion("eqb_fourg >", value, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgGreaterThanOrEqualTo(Integer value) {
            addCriterion("eqb_fourg >=", value, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgLessThan(Integer value) {
            addCriterion("eqb_fourg <", value, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgLessThanOrEqualTo(Integer value) {
            addCriterion("eqb_fourg <=", value, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgIn(List<Integer> values) {
            addCriterion("eqb_fourg in", values, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgNotIn(List<Integer> values) {
            addCriterion("eqb_fourg not in", values, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgBetween(Integer value1, Integer value2) {
            addCriterion("eqb_fourg between", value1, value2, "eqbFourg");
            return (Criteria) this;
        }

        public Criteria andEqbFourgNotBetween(Integer value1, Integer value2) {
            addCriterion("eqb_fourg not between", value1, value2, "eqbFourg");
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