package com.pdsu.sc.po;

import java.util.ArrayList;
import java.util.List;

public class DemoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DemoExample() {
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

        public Criteria andDeIdIsNull() {
            addCriterion("de_id is null");
            return (Criteria) this;
        }

        public Criteria andDeIdIsNotNull() {
            addCriterion("de_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeIdEqualTo(Integer value) {
            addCriterion("de_id =", value, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdNotEqualTo(Integer value) {
            addCriterion("de_id <>", value, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdGreaterThan(Integer value) {
            addCriterion("de_id >", value, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("de_id >=", value, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdLessThan(Integer value) {
            addCriterion("de_id <", value, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdLessThanOrEqualTo(Integer value) {
            addCriterion("de_id <=", value, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdIn(List<Integer> values) {
            addCriterion("de_id in", values, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdNotIn(List<Integer> values) {
            addCriterion("de_id not in", values, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdBetween(Integer value1, Integer value2) {
            addCriterion("de_id between", value1, value2, "deId");
            return (Criteria) this;
        }

        public Criteria andDeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("de_id not between", value1, value2, "deId");
            return (Criteria) this;
        }

        public Criteria andDeTeamidIsNull() {
            addCriterion("de_teamid is null");
            return (Criteria) this;
        }

        public Criteria andDeTeamidIsNotNull() {
            addCriterion("de_teamid is not null");
            return (Criteria) this;
        }

        public Criteria andDeTeamidEqualTo(Integer value) {
            addCriterion("de_teamid =", value, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidNotEqualTo(Integer value) {
            addCriterion("de_teamid <>", value, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidGreaterThan(Integer value) {
            addCriterion("de_teamid >", value, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("de_teamid >=", value, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidLessThan(Integer value) {
            addCriterion("de_teamid <", value, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("de_teamid <=", value, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidIn(List<Integer> values) {
            addCriterion("de_teamid in", values, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidNotIn(List<Integer> values) {
            addCriterion("de_teamid not in", values, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidBetween(Integer value1, Integer value2) {
            addCriterion("de_teamid between", value1, value2, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("de_teamid not between", value1, value2, "deTeamid");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameIsNull() {
            addCriterion("de_teamname is null");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameIsNotNull() {
            addCriterion("de_teamname is not null");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameEqualTo(String value) {
            addCriterion("de_teamname =", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameNotEqualTo(String value) {
            addCriterion("de_teamname <>", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameGreaterThan(String value) {
            addCriterion("de_teamname >", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("de_teamname >=", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameLessThan(String value) {
            addCriterion("de_teamname <", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameLessThanOrEqualTo(String value) {
            addCriterion("de_teamname <=", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameLike(String value) {
            addCriterion("de_teamname like", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameNotLike(String value) {
            addCriterion("de_teamname not like", value, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameIn(List<String> values) {
            addCriterion("de_teamname in", values, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameNotIn(List<String> values) {
            addCriterion("de_teamname not in", values, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameBetween(String value1, String value2) {
            addCriterion("de_teamname between", value1, value2, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeTeamnameNotBetween(String value1, String value2) {
            addCriterion("de_teamname not between", value1, value2, "deTeamname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameIsNull() {
            addCriterion("de_projectname is null");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameIsNotNull() {
            addCriterion("de_projectname is not null");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameEqualTo(String value) {
            addCriterion("de_projectname =", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameNotEqualTo(String value) {
            addCriterion("de_projectname <>", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameGreaterThan(String value) {
            addCriterion("de_projectname >", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("de_projectname >=", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameLessThan(String value) {
            addCriterion("de_projectname <", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameLessThanOrEqualTo(String value) {
            addCriterion("de_projectname <=", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameLike(String value) {
            addCriterion("de_projectname like", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameNotLike(String value) {
            addCriterion("de_projectname not like", value, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameIn(List<String> values) {
            addCriterion("de_projectname in", values, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameNotIn(List<String> values) {
            addCriterion("de_projectname not in", values, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameBetween(String value1, String value2) {
            addCriterion("de_projectname between", value1, value2, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeProjectnameNotBetween(String value1, String value2) {
            addCriterion("de_projectname not between", value1, value2, "deProjectname");
            return (Criteria) this;
        }

        public Criteria andDeTitileidIsNull() {
            addCriterion("de_titileid is null");
            return (Criteria) this;
        }

        public Criteria andDeTitileidIsNotNull() {
            addCriterion("de_titileid is not null");
            return (Criteria) this;
        }

        public Criteria andDeTitileidEqualTo(Integer value) {
            addCriterion("de_titileid =", value, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidNotEqualTo(Integer value) {
            addCriterion("de_titileid <>", value, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidGreaterThan(Integer value) {
            addCriterion("de_titileid >", value, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("de_titileid >=", value, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidLessThan(Integer value) {
            addCriterion("de_titileid <", value, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidLessThanOrEqualTo(Integer value) {
            addCriterion("de_titileid <=", value, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidIn(List<Integer> values) {
            addCriterion("de_titileid in", values, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidNotIn(List<Integer> values) {
            addCriterion("de_titileid not in", values, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidBetween(Integer value1, Integer value2) {
            addCriterion("de_titileid between", value1, value2, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDeTitileidNotBetween(Integer value1, Integer value2) {
            addCriterion("de_titileid not between", value1, value2, "deTitileid");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressIsNull() {
            addCriterion("de_pictureaddress is null");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressIsNotNull() {
            addCriterion("de_pictureaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressEqualTo(String value) {
            addCriterion("de_pictureaddress =", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressNotEqualTo(String value) {
            addCriterion("de_pictureaddress <>", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressGreaterThan(String value) {
            addCriterion("de_pictureaddress >", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressGreaterThanOrEqualTo(String value) {
            addCriterion("de_pictureaddress >=", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressLessThan(String value) {
            addCriterion("de_pictureaddress <", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressLessThanOrEqualTo(String value) {
            addCriterion("de_pictureaddress <=", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressLike(String value) {
            addCriterion("de_pictureaddress like", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressNotLike(String value) {
            addCriterion("de_pictureaddress not like", value, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressIn(List<String> values) {
            addCriterion("de_pictureaddress in", values, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressNotIn(List<String> values) {
            addCriterion("de_pictureaddress not in", values, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressBetween(String value1, String value2) {
            addCriterion("de_pictureaddress between", value1, value2, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDePictureaddressNotBetween(String value1, String value2) {
            addCriterion("de_pictureaddress not between", value1, value2, "dePictureaddress");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherIsNull() {
            addCriterion("de_projectteacher is null");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherIsNotNull() {
            addCriterion("de_projectteacher is not null");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherEqualTo(String value) {
            addCriterion("de_projectteacher =", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherNotEqualTo(String value) {
            addCriterion("de_projectteacher <>", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherGreaterThan(String value) {
            addCriterion("de_projectteacher >", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherGreaterThanOrEqualTo(String value) {
            addCriterion("de_projectteacher >=", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherLessThan(String value) {
            addCriterion("de_projectteacher <", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherLessThanOrEqualTo(String value) {
            addCriterion("de_projectteacher <=", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherLike(String value) {
            addCriterion("de_projectteacher like", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherNotLike(String value) {
            addCriterion("de_projectteacher not like", value, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherIn(List<String> values) {
            addCriterion("de_projectteacher in", values, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherNotIn(List<String> values) {
            addCriterion("de_projectteacher not in", values, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherBetween(String value1, String value2) {
            addCriterion("de_projectteacher between", value1, value2, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeProjectteacherNotBetween(String value1, String value2) {
            addCriterion("de_projectteacher not between", value1, value2, "deProjectteacher");
            return (Criteria) this;
        }

        public Criteria andDeTimeIsNull() {
            addCriterion("de_time is null");
            return (Criteria) this;
        }

        public Criteria andDeTimeIsNotNull() {
            addCriterion("de_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeTimeEqualTo(String value) {
            addCriterion("de_time =", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotEqualTo(String value) {
            addCriterion("de_time <>", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeGreaterThan(String value) {
            addCriterion("de_time >", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("de_time >=", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeLessThan(String value) {
            addCriterion("de_time <", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeLessThanOrEqualTo(String value) {
            addCriterion("de_time <=", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeLike(String value) {
            addCriterion("de_time like", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotLike(String value) {
            addCriterion("de_time not like", value, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeIn(List<String> values) {
            addCriterion("de_time in", values, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotIn(List<String> values) {
            addCriterion("de_time not in", values, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeBetween(String value1, String value2) {
            addCriterion("de_time between", value1, value2, "deTime");
            return (Criteria) this;
        }

        public Criteria andDeTimeNotBetween(String value1, String value2) {
            addCriterion("de_time not between", value1, value2, "deTime");
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