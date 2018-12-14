package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStTeamIsNull() {
            addCriterion("st_team is null");
            return (Criteria) this;
        }

        public Criteria andStTeamIsNotNull() {
            addCriterion("st_team is not null");
            return (Criteria) this;
        }

        public Criteria andStTeamEqualTo(Integer value) {
            addCriterion("st_team =", value, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamNotEqualTo(Integer value) {
            addCriterion("st_team <>", value, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamGreaterThan(Integer value) {
            addCriterion("st_team >", value, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_team >=", value, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamLessThan(Integer value) {
            addCriterion("st_team <", value, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamLessThanOrEqualTo(Integer value) {
            addCriterion("st_team <=", value, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamIn(List<Integer> values) {
            addCriterion("st_team in", values, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamNotIn(List<Integer> values) {
            addCriterion("st_team not in", values, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamBetween(Integer value1, Integer value2) {
            addCriterion("st_team between", value1, value2, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("st_team not between", value1, value2, "stTeam");
            return (Criteria) this;
        }

        public Criteria andStNumberIsNull() {
            addCriterion("st_number is null");
            return (Criteria) this;
        }

        public Criteria andStNumberIsNotNull() {
            addCriterion("st_number is not null");
            return (Criteria) this;
        }

        public Criteria andStNumberEqualTo(Integer value) {
            addCriterion("st_number =", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberNotEqualTo(Integer value) {
            addCriterion("st_number <>", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberGreaterThan(Integer value) {
            addCriterion("st_number >", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_number >=", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberLessThan(Integer value) {
            addCriterion("st_number <", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberLessThanOrEqualTo(Integer value) {
            addCriterion("st_number <=", value, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberIn(List<Integer> values) {
            addCriterion("st_number in", values, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberNotIn(List<Integer> values) {
            addCriterion("st_number not in", values, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberBetween(Integer value1, Integer value2) {
            addCriterion("st_number between", value1, value2, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("st_number not between", value1, value2, "stNumber");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("st_name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("st_name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("st_name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("st_name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("st_name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("st_name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStSexIsNull() {
            addCriterion("st_sex is null");
            return (Criteria) this;
        }

        public Criteria andStSexIsNotNull() {
            addCriterion("st_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStSexEqualTo(String value) {
            addCriterion("st_sex =", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotEqualTo(String value) {
            addCriterion("st_sex <>", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexGreaterThan(String value) {
            addCriterion("st_sex >", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexGreaterThanOrEqualTo(String value) {
            addCriterion("st_sex >=", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLessThan(String value) {
            addCriterion("st_sex <", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLessThanOrEqualTo(String value) {
            addCriterion("st_sex <=", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexLike(String value) {
            addCriterion("st_sex like", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotLike(String value) {
            addCriterion("st_sex not like", value, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexIn(List<String> values) {
            addCriterion("st_sex in", values, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotIn(List<String> values) {
            addCriterion("st_sex not in", values, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexBetween(String value1, String value2) {
            addCriterion("st_sex between", value1, value2, "stSex");
            return (Criteria) this;
        }

        public Criteria andStSexNotBetween(String value1, String value2) {
            addCriterion("st_sex not between", value1, value2, "stSex");
            return (Criteria) this;
        }

        public Criteria andStClassIsNull() {
            addCriterion("st_class is null");
            return (Criteria) this;
        }

        public Criteria andStClassIsNotNull() {
            addCriterion("st_class is not null");
            return (Criteria) this;
        }

        public Criteria andStClassEqualTo(String value) {
            addCriterion("st_class =", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassNotEqualTo(String value) {
            addCriterion("st_class <>", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassGreaterThan(String value) {
            addCriterion("st_class >", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassGreaterThanOrEqualTo(String value) {
            addCriterion("st_class >=", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassLessThan(String value) {
            addCriterion("st_class <", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassLessThanOrEqualTo(String value) {
            addCriterion("st_class <=", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassLike(String value) {
            addCriterion("st_class like", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassNotLike(String value) {
            addCriterion("st_class not like", value, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassIn(List<String> values) {
            addCriterion("st_class in", values, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassNotIn(List<String> values) {
            addCriterion("st_class not in", values, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassBetween(String value1, String value2) {
            addCriterion("st_class between", value1, value2, "stClass");
            return (Criteria) this;
        }

        public Criteria andStClassNotBetween(String value1, String value2) {
            addCriterion("st_class not between", value1, value2, "stClass");
            return (Criteria) this;
        }

        public Criteria andStPhoneIsNull() {
            addCriterion("st_phone is null");
            return (Criteria) this;
        }

        public Criteria andStPhoneIsNotNull() {
            addCriterion("st_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStPhoneEqualTo(String value) {
            addCriterion("st_phone =", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneNotEqualTo(String value) {
            addCriterion("st_phone <>", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneGreaterThan(String value) {
            addCriterion("st_phone >", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("st_phone >=", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneLessThan(String value) {
            addCriterion("st_phone <", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneLessThanOrEqualTo(String value) {
            addCriterion("st_phone <=", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneLike(String value) {
            addCriterion("st_phone like", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneNotLike(String value) {
            addCriterion("st_phone not like", value, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneIn(List<String> values) {
            addCriterion("st_phone in", values, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneNotIn(List<String> values) {
            addCriterion("st_phone not in", values, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneBetween(String value1, String value2) {
            addCriterion("st_phone between", value1, value2, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStPhoneNotBetween(String value1, String value2) {
            addCriterion("st_phone not between", value1, value2, "stPhone");
            return (Criteria) this;
        }

        public Criteria andStIdcardIsNull() {
            addCriterion("st_IDcard is null");
            return (Criteria) this;
        }

        public Criteria andStIdcardIsNotNull() {
            addCriterion("st_IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andStIdcardEqualTo(String value) {
            addCriterion("st_IDcard =", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardNotEqualTo(String value) {
            addCriterion("st_IDcard <>", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardGreaterThan(String value) {
            addCriterion("st_IDcard >", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("st_IDcard >=", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardLessThan(String value) {
            addCriterion("st_IDcard <", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardLessThanOrEqualTo(String value) {
            addCriterion("st_IDcard <=", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardLike(String value) {
            addCriterion("st_IDcard like", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardNotLike(String value) {
            addCriterion("st_IDcard not like", value, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardIn(List<String> values) {
            addCriterion("st_IDcard in", values, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardNotIn(List<String> values) {
            addCriterion("st_IDcard not in", values, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardBetween(String value1, String value2) {
            addCriterion("st_IDcard between", value1, value2, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStIdcardNotBetween(String value1, String value2) {
            addCriterion("st_IDcard not between", value1, value2, "stIdcard");
            return (Criteria) this;
        }

        public Criteria andStTeacherIsNull() {
            addCriterion("st_teacher is null");
            return (Criteria) this;
        }

        public Criteria andStTeacherIsNotNull() {
            addCriterion("st_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andStTeacherEqualTo(String value) {
            addCriterion("st_teacher =", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherNotEqualTo(String value) {
            addCriterion("st_teacher <>", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherGreaterThan(String value) {
            addCriterion("st_teacher >", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("st_teacher >=", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherLessThan(String value) {
            addCriterion("st_teacher <", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherLessThanOrEqualTo(String value) {
            addCriterion("st_teacher <=", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherLike(String value) {
            addCriterion("st_teacher like", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherNotLike(String value) {
            addCriterion("st_teacher not like", value, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherIn(List<String> values) {
            addCriterion("st_teacher in", values, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherNotIn(List<String> values) {
            addCriterion("st_teacher not in", values, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherBetween(String value1, String value2) {
            addCriterion("st_teacher between", value1, value2, "stTeacher");
            return (Criteria) this;
        }

        public Criteria andStTeacherNotBetween(String value1, String value2) {
            addCriterion("st_teacher not between", value1, value2, "stTeacher");
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