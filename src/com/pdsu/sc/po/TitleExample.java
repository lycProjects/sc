package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class TitleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TitleExample() {
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

        public Criteria andTiIdIsNull() {
            addCriterion("ti_id is null");
            return (Criteria) this;
        }

        public Criteria andTiIdIsNotNull() {
            addCriterion("ti_id is not null");
            return (Criteria) this;
        }

        public Criteria andTiIdEqualTo(Integer value) {
            addCriterion("ti_id =", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotEqualTo(Integer value) {
            addCriterion("ti_id <>", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThan(Integer value) {
            addCriterion("ti_id >", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ti_id >=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThan(Integer value) {
            addCriterion("ti_id <", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ti_id <=", value, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdIn(List<Integer> values) {
            addCriterion("ti_id in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotIn(List<Integer> values) {
            addCriterion("ti_id not in", values, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdBetween(Integer value1, Integer value2) {
            addCriterion("ti_id between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ti_id not between", value1, value2, "tiId");
            return (Criteria) this;
        }

        public Criteria andTiTypeIsNull() {
            addCriterion("ti_type is null");
            return (Criteria) this;
        }

        public Criteria andTiTypeIsNotNull() {
            addCriterion("ti_type is not null");
            return (Criteria) this;
        }

        public Criteria andTiTypeEqualTo(Integer value) {
            addCriterion("ti_type =", value, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeNotEqualTo(Integer value) {
            addCriterion("ti_type <>", value, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeGreaterThan(Integer value) {
            addCriterion("ti_type >", value, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ti_type >=", value, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeLessThan(Integer value) {
            addCriterion("ti_type <", value, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ti_type <=", value, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeIn(List<Integer> values) {
            addCriterion("ti_type in", values, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeNotIn(List<Integer> values) {
            addCriterion("ti_type not in", values, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeBetween(Integer value1, Integer value2) {
            addCriterion("ti_type between", value1, value2, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ti_type not between", value1, value2, "tiType");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveIsNull() {
            addCriterion("ti_mentionedabove is null");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveIsNotNull() {
            addCriterion("ti_mentionedabove is not null");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveEqualTo(String value) {
            addCriterion("ti_mentionedabove =", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveNotEqualTo(String value) {
            addCriterion("ti_mentionedabove <>", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveGreaterThan(String value) {
            addCriterion("ti_mentionedabove >", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveGreaterThanOrEqualTo(String value) {
            addCriterion("ti_mentionedabove >=", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveLessThan(String value) {
            addCriterion("ti_mentionedabove <", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveLessThanOrEqualTo(String value) {
            addCriterion("ti_mentionedabove <=", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveLike(String value) {
            addCriterion("ti_mentionedabove like", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveNotLike(String value) {
            addCriterion("ti_mentionedabove not like", value, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveIn(List<String> values) {
            addCriterion("ti_mentionedabove in", values, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveNotIn(List<String> values) {
            addCriterion("ti_mentionedabove not in", values, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveBetween(String value1, String value2) {
            addCriterion("ti_mentionedabove between", value1, value2, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiMentionedaboveNotBetween(String value1, String value2) {
            addCriterion("ti_mentionedabove not between", value1, value2, "tiMentionedabove");
            return (Criteria) this;
        }

        public Criteria andTiAutherIsNull() {
            addCriterion("ti_auther is null");
            return (Criteria) this;
        }

        public Criteria andTiAutherIsNotNull() {
            addCriterion("ti_auther is not null");
            return (Criteria) this;
        }

        public Criteria andTiAutherEqualTo(String value) {
            addCriterion("ti_auther =", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherNotEqualTo(String value) {
            addCriterion("ti_auther <>", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherGreaterThan(String value) {
            addCriterion("ti_auther >", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherGreaterThanOrEqualTo(String value) {
            addCriterion("ti_auther >=", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherLessThan(String value) {
            addCriterion("ti_auther <", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherLessThanOrEqualTo(String value) {
            addCriterion("ti_auther <=", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherLike(String value) {
            addCriterion("ti_auther like", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherNotLike(String value) {
            addCriterion("ti_auther not like", value, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherIn(List<String> values) {
            addCriterion("ti_auther in", values, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherNotIn(List<String> values) {
            addCriterion("ti_auther not in", values, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherBetween(String value1, String value2) {
            addCriterion("ti_auther between", value1, value2, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutherNotBetween(String value1, String value2) {
            addCriterion("ti_auther not between", value1, value2, "tiAuther");
            return (Criteria) this;
        }

        public Criteria andTiAutheridIsNull() {
            addCriterion("ti_autherid is null");
            return (Criteria) this;
        }

        public Criteria andTiAutheridIsNotNull() {
            addCriterion("ti_autherid is not null");
            return (Criteria) this;
        }

        public Criteria andTiAutheridEqualTo(Integer value) {
            addCriterion("ti_autherid =", value, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridNotEqualTo(Integer value) {
            addCriterion("ti_autherid <>", value, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridGreaterThan(Integer value) {
            addCriterion("ti_autherid >", value, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ti_autherid >=", value, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridLessThan(Integer value) {
            addCriterion("ti_autherid <", value, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridLessThanOrEqualTo(Integer value) {
            addCriterion("ti_autherid <=", value, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridIn(List<Integer> values) {
            addCriterion("ti_autherid in", values, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridNotIn(List<Integer> values) {
            addCriterion("ti_autherid not in", values, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridBetween(Integer value1, Integer value2) {
            addCriterion("ti_autherid between", value1, value2, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAutheridNotBetween(Integer value1, Integer value2) {
            addCriterion("ti_autherid not between", value1, value2, "tiAutherid");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlIsNull() {
            addCriterion("ti_addressurl is null");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlIsNotNull() {
            addCriterion("ti_addressurl is not null");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlEqualTo(String value) {
            addCriterion("ti_addressurl =", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlNotEqualTo(String value) {
            addCriterion("ti_addressurl <>", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlGreaterThan(String value) {
            addCriterion("ti_addressurl >", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlGreaterThanOrEqualTo(String value) {
            addCriterion("ti_addressurl >=", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlLessThan(String value) {
            addCriterion("ti_addressurl <", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlLessThanOrEqualTo(String value) {
            addCriterion("ti_addressurl <=", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlLike(String value) {
            addCriterion("ti_addressurl like", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlNotLike(String value) {
            addCriterion("ti_addressurl not like", value, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlIn(List<String> values) {
            addCriterion("ti_addressurl in", values, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlNotIn(List<String> values) {
            addCriterion("ti_addressurl not in", values, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlBetween(String value1, String value2) {
            addCriterion("ti_addressurl between", value1, value2, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiAddressurlNotBetween(String value1, String value2) {
            addCriterion("ti_addressurl not between", value1, value2, "tiAddressurl");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeIsNull() {
            addCriterion("ti_releasetime is null");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeIsNotNull() {
            addCriterion("ti_releasetime is not null");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeEqualTo(String value) {
            addCriterion("ti_releasetime =", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeNotEqualTo(String value) {
            addCriterion("ti_releasetime <>", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeGreaterThan(String value) {
            addCriterion("ti_releasetime >", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ti_releasetime >=", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeLessThan(String value) {
            addCriterion("ti_releasetime <", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeLessThanOrEqualTo(String value) {
            addCriterion("ti_releasetime <=", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeLike(String value) {
            addCriterion("ti_releasetime like", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeNotLike(String value) {
            addCriterion("ti_releasetime not like", value, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeIn(List<String> values) {
            addCriterion("ti_releasetime in", values, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeNotIn(List<String> values) {
            addCriterion("ti_releasetime not in", values, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeBetween(String value1, String value2) {
            addCriterion("ti_releasetime between", value1, value2, "tiReleasetime");
            return (Criteria) this;
        }

        public Criteria andTiReleasetimeNotBetween(String value1, String value2) {
            addCriterion("ti_releasetime not between", value1, value2, "tiReleasetime");
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