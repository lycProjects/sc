package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseExample() {
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

        public Criteria andEnBriefintroductionIsNull() {
            addCriterion("en_briefintroduction is null");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionIsNotNull() {
            addCriterion("en_briefintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionEqualTo(String value) {
            addCriterion("en_briefintroduction =", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionNotEqualTo(String value) {
            addCriterion("en_briefintroduction <>", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionGreaterThan(String value) {
            addCriterion("en_briefintroduction >", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("en_briefintroduction >=", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionLessThan(String value) {
            addCriterion("en_briefintroduction <", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionLessThanOrEqualTo(String value) {
            addCriterion("en_briefintroduction <=", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionLike(String value) {
            addCriterion("en_briefintroduction like", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionNotLike(String value) {
            addCriterion("en_briefintroduction not like", value, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionIn(List<String> values) {
            addCriterion("en_briefintroduction in", values, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionNotIn(List<String> values) {
            addCriterion("en_briefintroduction not in", values, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionBetween(String value1, String value2) {
            addCriterion("en_briefintroduction between", value1, value2, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnBriefintroductionNotBetween(String value1, String value2) {
            addCriterion("en_briefintroduction not between", value1, value2, "enBriefintroduction");
            return (Criteria) this;
        }

        public Criteria andEnPhoneIsNull() {
            addCriterion("en_phone is null");
            return (Criteria) this;
        }

        public Criteria andEnPhoneIsNotNull() {
            addCriterion("en_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEnPhoneEqualTo(String value) {
            addCriterion("en_phone =", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotEqualTo(String value) {
            addCriterion("en_phone <>", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneGreaterThan(String value) {
            addCriterion("en_phone >", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("en_phone >=", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneLessThan(String value) {
            addCriterion("en_phone <", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneLessThanOrEqualTo(String value) {
            addCriterion("en_phone <=", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneLike(String value) {
            addCriterion("en_phone like", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotLike(String value) {
            addCriterion("en_phone not like", value, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneIn(List<String> values) {
            addCriterion("en_phone in", values, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotIn(List<String> values) {
            addCriterion("en_phone not in", values, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneBetween(String value1, String value2) {
            addCriterion("en_phone between", value1, value2, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnPhoneNotBetween(String value1, String value2) {
            addCriterion("en_phone not between", value1, value2, "enPhone");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentIsNull() {
            addCriterion("en_recruitment is null");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentIsNotNull() {
            addCriterion("en_recruitment is not null");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentEqualTo(String value) {
            addCriterion("en_recruitment =", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentNotEqualTo(String value) {
            addCriterion("en_recruitment <>", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentGreaterThan(String value) {
            addCriterion("en_recruitment >", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentGreaterThanOrEqualTo(String value) {
            addCriterion("en_recruitment >=", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentLessThan(String value) {
            addCriterion("en_recruitment <", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentLessThanOrEqualTo(String value) {
            addCriterion("en_recruitment <=", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentLike(String value) {
            addCriterion("en_recruitment like", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentNotLike(String value) {
            addCriterion("en_recruitment not like", value, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentIn(List<String> values) {
            addCriterion("en_recruitment in", values, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentNotIn(List<String> values) {
            addCriterion("en_recruitment not in", values, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentBetween(String value1, String value2) {
            addCriterion("en_recruitment between", value1, value2, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnRecruitmentNotBetween(String value1, String value2) {
            addCriterion("en_recruitment not between", value1, value2, "enRecruitment");
            return (Criteria) this;
        }

        public Criteria andEnPictureIsNull() {
            addCriterion("en_picture is null");
            return (Criteria) this;
        }

        public Criteria andEnPictureIsNotNull() {
            addCriterion("en_picture is not null");
            return (Criteria) this;
        }

        public Criteria andEnPictureEqualTo(String value) {
            addCriterion("en_picture =", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureNotEqualTo(String value) {
            addCriterion("en_picture <>", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureGreaterThan(String value) {
            addCriterion("en_picture >", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureGreaterThanOrEqualTo(String value) {
            addCriterion("en_picture >=", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureLessThan(String value) {
            addCriterion("en_picture <", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureLessThanOrEqualTo(String value) {
            addCriterion("en_picture <=", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureLike(String value) {
            addCriterion("en_picture like", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureNotLike(String value) {
            addCriterion("en_picture not like", value, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureIn(List<String> values) {
            addCriterion("en_picture in", values, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureNotIn(List<String> values) {
            addCriterion("en_picture not in", values, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureBetween(String value1, String value2) {
            addCriterion("en_picture between", value1, value2, "enPicture");
            return (Criteria) this;
        }

        public Criteria andEnPictureNotBetween(String value1, String value2) {
            addCriterion("en_picture not between", value1, value2, "enPicture");
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