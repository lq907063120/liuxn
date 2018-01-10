package com.liuxn.entity.raw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVcloginnameIsNull() {
            addCriterion("vcloginname is null");
            return (Criteria) this;
        }

        public Criteria andVcloginnameIsNotNull() {
            addCriterion("vcloginname is not null");
            return (Criteria) this;
        }

        public Criteria andVcloginnameEqualTo(String value) {
            addCriterion("vcloginname =", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameNotEqualTo(String value) {
            addCriterion("vcloginname <>", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameGreaterThan(String value) {
            addCriterion("vcloginname >", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("vcloginname >=", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameLessThan(String value) {
            addCriterion("vcloginname <", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameLessThanOrEqualTo(String value) {
            addCriterion("vcloginname <=", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameLike(String value) {
            addCriterion("vcloginname like", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameNotLike(String value) {
            addCriterion("vcloginname not like", value, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameIn(List<String> values) {
            addCriterion("vcloginname in", values, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameNotIn(List<String> values) {
            addCriterion("vcloginname not in", values, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameBetween(String value1, String value2) {
            addCriterion("vcloginname between", value1, value2, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginnameNotBetween(String value1, String value2) {
            addCriterion("vcloginname not between", value1, value2, "vcloginname");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdIsNull() {
            addCriterion("vcloginpwd is null");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdIsNotNull() {
            addCriterion("vcloginpwd is not null");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdEqualTo(String value) {
            addCriterion("vcloginpwd =", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdNotEqualTo(String value) {
            addCriterion("vcloginpwd <>", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdGreaterThan(String value) {
            addCriterion("vcloginpwd >", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdGreaterThanOrEqualTo(String value) {
            addCriterion("vcloginpwd >=", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdLessThan(String value) {
            addCriterion("vcloginpwd <", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdLessThanOrEqualTo(String value) {
            addCriterion("vcloginpwd <=", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdLike(String value) {
            addCriterion("vcloginpwd like", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdNotLike(String value) {
            addCriterion("vcloginpwd not like", value, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdIn(List<String> values) {
            addCriterion("vcloginpwd in", values, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdNotIn(List<String> values) {
            addCriterion("vcloginpwd not in", values, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdBetween(String value1, String value2) {
            addCriterion("vcloginpwd between", value1, value2, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andVcloginpwdNotBetween(String value1, String value2) {
            addCriterion("vcloginpwd not between", value1, value2, "vcloginpwd");
            return (Criteria) this;
        }

        public Criteria andDatcreateIsNull() {
            addCriterion("datcreate is null");
            return (Criteria) this;
        }

        public Criteria andDatcreateIsNotNull() {
            addCriterion("datcreate is not null");
            return (Criteria) this;
        }

        public Criteria andDatcreateEqualTo(Date value) {
            addCriterion("datcreate =", value, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateNotEqualTo(Date value) {
            addCriterion("datcreate <>", value, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateGreaterThan(Date value) {
            addCriterion("datcreate >", value, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateGreaterThanOrEqualTo(Date value) {
            addCriterion("datcreate >=", value, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateLessThan(Date value) {
            addCriterion("datcreate <", value, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateLessThanOrEqualTo(Date value) {
            addCriterion("datcreate <=", value, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateIn(List<Date> values) {
            addCriterion("datcreate in", values, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateNotIn(List<Date> values) {
            addCriterion("datcreate not in", values, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateBetween(Date value1, Date value2) {
            addCriterion("datcreate between", value1, value2, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatcreateNotBetween(Date value1, Date value2) {
            addCriterion("datcreate not between", value1, value2, "datcreate");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeIsNull() {
            addCriterion("datlasttime is null");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeIsNotNull() {
            addCriterion("datlasttime is not null");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeEqualTo(Date value) {
            addCriterion("datlasttime =", value, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeNotEqualTo(Date value) {
            addCriterion("datlasttime <>", value, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeGreaterThan(Date value) {
            addCriterion("datlasttime >", value, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datlasttime >=", value, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeLessThan(Date value) {
            addCriterion("datlasttime <", value, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeLessThanOrEqualTo(Date value) {
            addCriterion("datlasttime <=", value, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeIn(List<Date> values) {
            addCriterion("datlasttime in", values, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeNotIn(List<Date> values) {
            addCriterion("datlasttime not in", values, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeBetween(Date value1, Date value2) {
            addCriterion("datlasttime between", value1, value2, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatlasttimeNotBetween(Date value1, Date value2) {
            addCriterion("datlasttime not between", value1, value2, "datlasttime");
            return (Criteria) this;
        }

        public Criteria andDatupdateIsNull() {
            addCriterion("datupdate is null");
            return (Criteria) this;
        }

        public Criteria andDatupdateIsNotNull() {
            addCriterion("datupdate is not null");
            return (Criteria) this;
        }

        public Criteria andDatupdateEqualTo(Date value) {
            addCriterion("datupdate =", value, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateNotEqualTo(Date value) {
            addCriterion("datupdate <>", value, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateGreaterThan(Date value) {
            addCriterion("datupdate >", value, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("datupdate >=", value, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateLessThan(Date value) {
            addCriterion("datupdate <", value, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateLessThanOrEqualTo(Date value) {
            addCriterion("datupdate <=", value, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateIn(List<Date> values) {
            addCriterion("datupdate in", values, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateNotIn(List<Date> values) {
            addCriterion("datupdate not in", values, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateBetween(Date value1, Date value2) {
            addCriterion("datupdate between", value1, value2, "datupdate");
            return (Criteria) this;
        }

        public Criteria andDatupdateNotBetween(Date value1, Date value2) {
            addCriterion("datupdate not between", value1, value2, "datupdate");
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