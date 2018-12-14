package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class NewsNewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsNewExample() {
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

        //由protected改成了public
        /**
         * 添加一个自定义的条件在 and 之后
         * @param condition
         */
        public void addCriterion(String condition) {
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

        public Criteria andNewsnewIdIsNull() {
            addCriterion("newsnew_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdIsNotNull() {
            addCriterion("newsnew_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdEqualTo(Integer value) {
            addCriterion("newsnew_id =", value, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdNotEqualTo(Integer value) {
            addCriterion("newsnew_id <>", value, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdGreaterThan(Integer value) {
            addCriterion("newsnew_id >", value, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsnew_id >=", value, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdLessThan(Integer value) {
            addCriterion("newsnew_id <", value, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdLessThanOrEqualTo(Integer value) {
            addCriterion("newsnew_id <=", value, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdIn(List<Integer> values) {
            addCriterion("newsnew_id in", values, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdNotIn(List<Integer> values) {
            addCriterion("newsnew_id not in", values, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdBetween(Integer value1, Integer value2) {
            addCriterion("newsnew_id between", value1, value2, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("newsnew_id not between", value1, value2, "newsnewId");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleIsNull() {
            addCriterion("newsnew_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleIsNotNull() {
            addCriterion("newsnew_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleEqualTo(String value) {
            addCriterion("newsnew_title =", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleNotEqualTo(String value) {
            addCriterion("newsnew_title <>", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleGreaterThan(String value) {
            addCriterion("newsnew_title >", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleGreaterThanOrEqualTo(String value) {
            addCriterion("newsnew_title >=", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleLessThan(String value) {
            addCriterion("newsnew_title <", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleLessThanOrEqualTo(String value) {
            addCriterion("newsnew_title <=", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleLike(String value) {
            addCriterion("newsnew_title like", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleNotLike(String value) {
            addCriterion("newsnew_title not like", value, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleIn(List<String> values) {
            addCriterion("newsnew_title in", values, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleNotIn(List<String> values) {
            addCriterion("newsnew_title not in", values, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleBetween(String value1, String value2) {
            addCriterion("newsnew_title between", value1, value2, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewTitleNotBetween(String value1, String value2) {
            addCriterion("newsnew_title not between", value1, value2, "newsnewTitle");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefIsNull() {
            addCriterion("newsnew_brief is null");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefIsNotNull() {
            addCriterion("newsnew_brief is not null");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefEqualTo(String value) {
            addCriterion("newsnew_brief =", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefNotEqualTo(String value) {
            addCriterion("newsnew_brief <>", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefGreaterThan(String value) {
            addCriterion("newsnew_brief >", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefGreaterThanOrEqualTo(String value) {
            addCriterion("newsnew_brief >=", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefLessThan(String value) {
            addCriterion("newsnew_brief <", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefLessThanOrEqualTo(String value) {
            addCriterion("newsnew_brief <=", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefLike(String value) {
            addCriterion("newsnew_brief like", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefNotLike(String value) {
            addCriterion("newsnew_brief not like", value, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefIn(List<String> values) {
            addCriterion("newsnew_brief in", values, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefNotIn(List<String> values) {
            addCriterion("newsnew_brief not in", values, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefBetween(String value1, String value2) {
            addCriterion("newsnew_brief between", value1, value2, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewBriefNotBetween(String value1, String value2) {
            addCriterion("newsnew_brief not between", value1, value2, "newsnewBrief");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameIsNull() {
            addCriterion("newsnew_authorName is null");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameIsNotNull() {
            addCriterion("newsnew_authorName is not null");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameEqualTo(String value) {
            addCriterion("newsnew_authorName =", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameNotEqualTo(String value) {
            addCriterion("newsnew_authorName <>", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameGreaterThan(String value) {
            addCriterion("newsnew_authorName >", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameGreaterThanOrEqualTo(String value) {
            addCriterion("newsnew_authorName >=", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameLessThan(String value) {
            addCriterion("newsnew_authorName <", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameLessThanOrEqualTo(String value) {
            addCriterion("newsnew_authorName <=", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameLike(String value) {
            addCriterion("newsnew_authorName like", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameNotLike(String value) {
            addCriterion("newsnew_authorName not like", value, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameIn(List<String> values) {
            addCriterion("newsnew_authorName in", values, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameNotIn(List<String> values) {
            addCriterion("newsnew_authorName not in", values, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameBetween(String value1, String value2) {
            addCriterion("newsnew_authorName between", value1, value2, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewAuthornameNotBetween(String value1, String value2) {
            addCriterion("newsnew_authorName not between", value1, value2, "newsnewAuthorname");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriIsNull() {
            addCriterion("newsnew_htmlUri is null");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriIsNotNull() {
            addCriterion("newsnew_htmlUri is not null");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriEqualTo(String value) {
            addCriterion("newsnew_htmlUri =", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriNotEqualTo(String value) {
            addCriterion("newsnew_htmlUri <>", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriGreaterThan(String value) {
            addCriterion("newsnew_htmlUri >", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriGreaterThanOrEqualTo(String value) {
            addCriterion("newsnew_htmlUri >=", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriLessThan(String value) {
            addCriterion("newsnew_htmlUri <", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriLessThanOrEqualTo(String value) {
            addCriterion("newsnew_htmlUri <=", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriLike(String value) {
            addCriterion("newsnew_htmlUri like", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriNotLike(String value) {
            addCriterion("newsnew_htmlUri not like", value, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriIn(List<String> values) {
            addCriterion("newsnew_htmlUri in", values, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriNotIn(List<String> values) {
            addCriterion("newsnew_htmlUri not in", values, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriBetween(String value1, String value2) {
            addCriterion("newsnew_htmlUri between", value1, value2, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewHtmluriNotBetween(String value1, String value2) {
            addCriterion("newsnew_htmlUri not between", value1, value2, "newsnewHtmluri");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeIsNull() {
            addCriterion("newsnew_pubTime is null");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeIsNotNull() {
            addCriterion("newsnew_pubTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeEqualTo(String value) {
            addCriterion("newsnew_pubTime =", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeNotEqualTo(String value) {
            addCriterion("newsnew_pubTime <>", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeGreaterThan(String value) {
            addCriterion("newsnew_pubTime >", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeGreaterThanOrEqualTo(String value) {
            addCriterion("newsnew_pubTime >=", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeLessThan(String value) {
            addCriterion("newsnew_pubTime <", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeLessThanOrEqualTo(String value) {
            addCriterion("newsnew_pubTime <=", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeLike(String value) {
            addCriterion("newsnew_pubTime like", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeNotLike(String value) {
            addCriterion("newsnew_pubTime not like", value, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeIn(List<String> values) {
            addCriterion("newsnew_pubTime in", values, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeNotIn(List<String> values) {
            addCriterion("newsnew_pubTime not in", values, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeBetween(String value1, String value2) {
            addCriterion("newsnew_pubTime between", value1, value2, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewsnewPubtimeNotBetween(String value1, String value2) {
            addCriterion("newsnew_pubTime not between", value1, value2, "newsnewPubtime");
            return (Criteria) this;
        }

        public Criteria andNewscateIdIsNull() {
            addCriterion("newscate_id is null");
            return (Criteria) this;
        }

        public Criteria andNewscateIdIsNotNull() {
            addCriterion("newscate_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewscateIdEqualTo(Integer value) {
            addCriterion("newscate_id =", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdNotEqualTo(Integer value) {
            addCriterion("newscate_id <>", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdGreaterThan(Integer value) {
            addCriterion("newscate_id >", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("newscate_id >=", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdLessThan(Integer value) {
            addCriterion("newscate_id <", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdLessThanOrEqualTo(Integer value) {
            addCriterion("newscate_id <=", value, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdIn(List<Integer> values) {
            addCriterion("newscate_id in", values, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdNotIn(List<Integer> values) {
            addCriterion("newscate_id not in", values, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdBetween(Integer value1, Integer value2) {
            addCriterion("newscate_id between", value1, value2, "newscateId");
            return (Criteria) this;
        }

        public Criteria andNewscateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("newscate_id not between", value1, value2, "newscateId");
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