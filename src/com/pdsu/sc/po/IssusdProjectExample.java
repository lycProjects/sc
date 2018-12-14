package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class IssusdProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IssusdProjectExample() {
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

        public Criteria andIpIdIsNull() {
            addCriterion("ip_id is null");
            return (Criteria) this;
        }

        public Criteria andIpIdIsNotNull() {
            addCriterion("ip_id is not null");
            return (Criteria) this;
        }

        public Criteria andIpIdEqualTo(Integer value) {
            addCriterion("ip_id =", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdNotEqualTo(Integer value) {
            addCriterion("ip_id <>", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdGreaterThan(Integer value) {
            addCriterion("ip_id >", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ip_id >=", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdLessThan(Integer value) {
            addCriterion("ip_id <", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdLessThanOrEqualTo(Integer value) {
            addCriterion("ip_id <=", value, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdIn(List<Integer> values) {
            addCriterion("ip_id in", values, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdNotIn(List<Integer> values) {
            addCriterion("ip_id not in", values, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdBetween(Integer value1, Integer value2) {
            addCriterion("ip_id between", value1, value2, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ip_id not between", value1, value2, "ipId");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameIsNull() {
            addCriterion("ip_projectname is null");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameIsNotNull() {
            addCriterion("ip_projectname is not null");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameEqualTo(String value) {
            addCriterion("ip_projectname =", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameNotEqualTo(String value) {
            addCriterion("ip_projectname <>", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameGreaterThan(String value) {
            addCriterion("ip_projectname >", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ip_projectname >=", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameLessThan(String value) {
            addCriterion("ip_projectname <", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ip_projectname <=", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameLike(String value) {
            addCriterion("ip_projectname like", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameNotLike(String value) {
            addCriterion("ip_projectname not like", value, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameIn(List<String> values) {
            addCriterion("ip_projectname in", values, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameNotIn(List<String> values) {
            addCriterion("ip_projectname not in", values, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameBetween(String value1, String value2) {
            addCriterion("ip_projectname between", value1, value2, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andIpProjectnameNotBetween(String value1, String value2) {
            addCriterion("ip_projectname not between", value1, value2, "ipProjectname");
            return (Criteria) this;
        }

        public Criteria andEnIdIsNull() {
            addCriterion("en_id is null");
            return (Criteria) this;
        }

        public Criteria andEnIdIsNotNull() {
            addCriterion("en_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnIdEqualTo(Integer value) {
            addCriterion("en_id =", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotEqualTo(Integer value) {
            addCriterion("en_id <>", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThan(Integer value) {
            addCriterion("en_id >", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("en_id >=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThan(Integer value) {
            addCriterion("en_id <", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThanOrEqualTo(Integer value) {
            addCriterion("en_id <=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdIn(List<Integer> values) {
            addCriterion("en_id in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotIn(List<Integer> values) {
            addCriterion("en_id not in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdBetween(Integer value1, Integer value2) {
            addCriterion("en_id between", value1, value2, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("en_id not between", value1, value2, "enId");
            return (Criteria) this;
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

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionIsNull() {
            addCriterion("ip_briefintroduction is null");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionIsNotNull() {
            addCriterion("ip_briefintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionEqualTo(String value) {
            addCriterion("ip_briefintroduction =", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionNotEqualTo(String value) {
            addCriterion("ip_briefintroduction <>", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionGreaterThan(String value) {
            addCriterion("ip_briefintroduction >", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("ip_briefintroduction >=", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionLessThan(String value) {
            addCriterion("ip_briefintroduction <", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionLessThanOrEqualTo(String value) {
            addCriterion("ip_briefintroduction <=", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionLike(String value) {
            addCriterion("ip_briefintroduction like", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionNotLike(String value) {
            addCriterion("ip_briefintroduction not like", value, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionIn(List<String> values) {
            addCriterion("ip_briefintroduction in", values, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionNotIn(List<String> values) {
            addCriterion("ip_briefintroduction not in", values, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionBetween(String value1, String value2) {
            addCriterion("ip_briefintroduction between", value1, value2, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andIpBriefintroductionNotBetween(String value1, String value2) {
            addCriterion("ip_briefintroduction not between", value1, value2, "ipBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateIsNull() {
            addCriterion("en_projectstate is null");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateIsNotNull() {
            addCriterion("en_projectstate is not null");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateEqualTo(Integer value) {
            addCriterion("en_projectstate =", value, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateNotEqualTo(Integer value) {
            addCriterion("en_projectstate <>", value, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateGreaterThan(Integer value) {
            addCriterion("en_projectstate >", value, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("en_projectstate >=", value, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateLessThan(Integer value) {
            addCriterion("en_projectstate <", value, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateLessThanOrEqualTo(Integer value) {
            addCriterion("en_projectstate <=", value, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateIn(List<Integer> values) {
            addCriterion("en_projectstate in", values, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateNotIn(List<Integer> values) {
            addCriterion("en_projectstate not in", values, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateBetween(Integer value1, Integer value2) {
            addCriterion("en_projectstate between", value1, value2, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnProjectstateNotBetween(Integer value1, Integer value2) {
            addCriterion("en_projectstate not between", value1, value2, "enProjectstate");
            return (Criteria) this;
        }

        public Criteria andEnStatenameIsNull() {
            addCriterion("en_statename is null");
            return (Criteria) this;
        }

        public Criteria andEnStatenameIsNotNull() {
            addCriterion("en_statename is not null");
            return (Criteria) this;
        }

        public Criteria andEnStatenameEqualTo(String value) {
            addCriterion("en_statename =", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameNotEqualTo(String value) {
            addCriterion("en_statename <>", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameGreaterThan(String value) {
            addCriterion("en_statename >", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameGreaterThanOrEqualTo(String value) {
            addCriterion("en_statename >=", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameLessThan(String value) {
            addCriterion("en_statename <", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameLessThanOrEqualTo(String value) {
            addCriterion("en_statename <=", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameLike(String value) {
            addCriterion("en_statename like", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameNotLike(String value) {
            addCriterion("en_statename not like", value, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameIn(List<String> values) {
            addCriterion("en_statename in", values, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameNotIn(List<String> values) {
            addCriterion("en_statename not in", values, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameBetween(String value1, String value2) {
            addCriterion("en_statename between", value1, value2, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnStatenameNotBetween(String value1, String value2) {
            addCriterion("en_statename not between", value1, value2, "enStatename");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeIsNull() {
            addCriterion("en_issusdtime is null");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeIsNotNull() {
            addCriterion("en_issusdtime is not null");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeEqualTo(String value) {
            addCriterion("en_issusdtime =", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeNotEqualTo(String value) {
            addCriterion("en_issusdtime <>", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeGreaterThan(String value) {
            addCriterion("en_issusdtime >", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeGreaterThanOrEqualTo(String value) {
            addCriterion("en_issusdtime >=", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeLessThan(String value) {
            addCriterion("en_issusdtime <", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeLessThanOrEqualTo(String value) {
            addCriterion("en_issusdtime <=", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeLike(String value) {
            addCriterion("en_issusdtime like", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeNotLike(String value) {
            addCriterion("en_issusdtime not like", value, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeIn(List<String> values) {
            addCriterion("en_issusdtime in", values, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeNotIn(List<String> values) {
            addCriterion("en_issusdtime not in", values, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeBetween(String value1, String value2) {
            addCriterion("en_issusdtime between", value1, value2, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnIssusdtimeNotBetween(String value1, String value2) {
            addCriterion("en_issusdtime not between", value1, value2, "enIssusdtime");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverIsNull() {
            addCriterion("en_projectover is null");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverIsNotNull() {
            addCriterion("en_projectover is not null");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverEqualTo(String value) {
            addCriterion("en_projectover =", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverNotEqualTo(String value) {
            addCriterion("en_projectover <>", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverGreaterThan(String value) {
            addCriterion("en_projectover >", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverGreaterThanOrEqualTo(String value) {
            addCriterion("en_projectover >=", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverLessThan(String value) {
            addCriterion("en_projectover <", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverLessThanOrEqualTo(String value) {
            addCriterion("en_projectover <=", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverLike(String value) {
            addCriterion("en_projectover like", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverNotLike(String value) {
            addCriterion("en_projectover not like", value, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverIn(List<String> values) {
            addCriterion("en_projectover in", values, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverNotIn(List<String> values) {
            addCriterion("en_projectover not in", values, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverBetween(String value1, String value2) {
            addCriterion("en_projectover between", value1, value2, "enProjectover");
            return (Criteria) this;
        }

        public Criteria andEnProjectoverNotBetween(String value1, String value2) {
            addCriterion("en_projectover not between", value1, value2, "enProjectover");
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