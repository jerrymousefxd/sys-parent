package com.eaju.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VoiceCallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoiceCallExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromIsNull() {
            addCriterion("PHONENUMBERFROM is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromIsNotNull() {
            addCriterion("PHONENUMBERFROM is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromEqualTo(String value) {
            addCriterion("PHONENUMBERFROM =", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromNotEqualTo(String value) {
            addCriterion("PHONENUMBERFROM <>", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromGreaterThan(String value) {
            addCriterion("PHONENUMBERFROM >", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromGreaterThanOrEqualTo(String value) {
            addCriterion("PHONENUMBERFROM >=", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromLessThan(String value) {
            addCriterion("PHONENUMBERFROM <", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromLessThanOrEqualTo(String value) {
            addCriterion("PHONENUMBERFROM <=", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromLike(String value) {
            addCriterion("PHONENUMBERFROM like", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromNotLike(String value) {
            addCriterion("PHONENUMBERFROM not like", value, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromIn(List<String> values) {
            addCriterion("PHONENUMBERFROM in", values, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromNotIn(List<String> values) {
            addCriterion("PHONENUMBERFROM not in", values, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromBetween(String value1, String value2) {
            addCriterion("PHONENUMBERFROM between", value1, value2, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumberfromNotBetween(String value1, String value2) {
            addCriterion("PHONENUMBERFROM not between", value1, value2, "phonenumberfrom");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoIsNull() {
            addCriterion("PHONENUMBERTO is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoIsNotNull() {
            addCriterion("PHONENUMBERTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoEqualTo(String value) {
            addCriterion("PHONENUMBERTO =", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoNotEqualTo(String value) {
            addCriterion("PHONENUMBERTO <>", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoGreaterThan(String value) {
            addCriterion("PHONENUMBERTO >", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONENUMBERTO >=", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoLessThan(String value) {
            addCriterion("PHONENUMBERTO <", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoLessThanOrEqualTo(String value) {
            addCriterion("PHONENUMBERTO <=", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoLike(String value) {
            addCriterion("PHONENUMBERTO like", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoNotLike(String value) {
            addCriterion("PHONENUMBERTO not like", value, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoIn(List<String> values) {
            addCriterion("PHONENUMBERTO in", values, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoNotIn(List<String> values) {
            addCriterion("PHONENUMBERTO not in", values, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoBetween(String value1, String value2) {
            addCriterion("PHONENUMBERTO between", value1, value2, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andPhonenumbertoNotBetween(String value1, String value2) {
            addCriterion("PHONENUMBERTO not between", value1, value2, "phonenumberto");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LOGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LOGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LOGINNAME =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LOGINNAME <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LOGINNAME >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGINNAME >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LOGINNAME <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LOGINNAME <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LOGINNAME like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LOGINNAME not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LOGINNAME in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LOGINNAME not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LOGINNAME between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LOGINNAME not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoIsNull() {
            addCriterion("ORIGINALORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoIsNotNull() {
            addCriterion("ORIGINALORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoEqualTo(String value) {
            addCriterion("ORIGINALORDERNO =", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoNotEqualTo(String value) {
            addCriterion("ORIGINALORDERNO <>", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoGreaterThan(String value) {
            addCriterion("ORIGINALORDERNO >", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINALORDERNO >=", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoLessThan(String value) {
            addCriterion("ORIGINALORDERNO <", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoLessThanOrEqualTo(String value) {
            addCriterion("ORIGINALORDERNO <=", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoLike(String value) {
            addCriterion("ORIGINALORDERNO like", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoNotLike(String value) {
            addCriterion("ORIGINALORDERNO not like", value, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoIn(List<String> values) {
            addCriterion("ORIGINALORDERNO in", values, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoNotIn(List<String> values) {
            addCriterion("ORIGINALORDERNO not in", values, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoBetween(String value1, String value2) {
            addCriterion("ORIGINALORDERNO between", value1, value2, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andOriginalordernoNotBetween(String value1, String value2) {
            addCriterion("ORIGINALORDERNO not between", value1, value2, "originalorderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoIsNull() {
            addCriterion("EOORORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andEoorordernoIsNotNull() {
            addCriterion("EOORORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andEoorordernoEqualTo(String value) {
            addCriterion("EOORORDERNO =", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoNotEqualTo(String value) {
            addCriterion("EOORORDERNO <>", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoGreaterThan(String value) {
            addCriterion("EOORORDERNO >", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoGreaterThanOrEqualTo(String value) {
            addCriterion("EOORORDERNO >=", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoLessThan(String value) {
            addCriterion("EOORORDERNO <", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoLessThanOrEqualTo(String value) {
            addCriterion("EOORORDERNO <=", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoLike(String value) {
            addCriterion("EOORORDERNO like", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoNotLike(String value) {
            addCriterion("EOORORDERNO not like", value, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoIn(List<String> values) {
            addCriterion("EOORORDERNO in", values, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoNotIn(List<String> values) {
            addCriterion("EOORORDERNO not in", values, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoBetween(String value1, String value2) {
            addCriterion("EOORORDERNO between", value1, value2, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEoorordernoNotBetween(String value1, String value2) {
            addCriterion("EOORORDERNO not between", value1, value2, "eoororderno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoIsNull() {
            addCriterion("ETDLNO is null");
            return (Criteria) this;
        }

        public Criteria andEtdlnoIsNotNull() {
            addCriterion("ETDLNO is not null");
            return (Criteria) this;
        }

        public Criteria andEtdlnoEqualTo(String value) {
            addCriterion("ETDLNO =", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoNotEqualTo(String value) {
            addCriterion("ETDLNO <>", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoGreaterThan(String value) {
            addCriterion("ETDLNO >", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoGreaterThanOrEqualTo(String value) {
            addCriterion("ETDLNO >=", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoLessThan(String value) {
            addCriterion("ETDLNO <", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoLessThanOrEqualTo(String value) {
            addCriterion("ETDLNO <=", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoLike(String value) {
            addCriterion("ETDLNO like", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoNotLike(String value) {
            addCriterion("ETDLNO not like", value, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoIn(List<String> values) {
            addCriterion("ETDLNO in", values, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoNotIn(List<String> values) {
            addCriterion("ETDLNO not in", values, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoBetween(String value1, String value2) {
            addCriterion("ETDLNO between", value1, value2, "etdlno");
            return (Criteria) this;
        }

        public Criteria andEtdlnoNotBetween(String value1, String value2) {
            addCriterion("ETDLNO not between", value1, value2, "etdlno");
            return (Criteria) this;
        }

        public Criteria andCallidentifierIsNull() {
            addCriterion("CALLIDENTIFIER is null");
            return (Criteria) this;
        }

        public Criteria andCallidentifierIsNotNull() {
            addCriterion("CALLIDENTIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andCallidentifierEqualTo(String value) {
            addCriterion("CALLIDENTIFIER =", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierNotEqualTo(String value) {
            addCriterion("CALLIDENTIFIER <>", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierGreaterThan(String value) {
            addCriterion("CALLIDENTIFIER >", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierGreaterThanOrEqualTo(String value) {
            addCriterion("CALLIDENTIFIER >=", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierLessThan(String value) {
            addCriterion("CALLIDENTIFIER <", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierLessThanOrEqualTo(String value) {
            addCriterion("CALLIDENTIFIER <=", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierLike(String value) {
            addCriterion("CALLIDENTIFIER like", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierNotLike(String value) {
            addCriterion("CALLIDENTIFIER not like", value, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierIn(List<String> values) {
            addCriterion("CALLIDENTIFIER in", values, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierNotIn(List<String> values) {
            addCriterion("CALLIDENTIFIER not in", values, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierBetween(String value1, String value2) {
            addCriterion("CALLIDENTIFIER between", value1, value2, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andCallidentifierNotBetween(String value1, String value2) {
            addCriterion("CALLIDENTIFIER not between", value1, value2, "callidentifier");
            return (Criteria) this;
        }

        public Criteria andPhoneid1IsNull() {
            addCriterion("PHONEID1 is null");
            return (Criteria) this;
        }

        public Criteria andPhoneid1IsNotNull() {
            addCriterion("PHONEID1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneid1EqualTo(String value) {
            addCriterion("PHONEID1 =", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1NotEqualTo(String value) {
            addCriterion("PHONEID1 <>", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1GreaterThan(String value) {
            addCriterion("PHONEID1 >", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1GreaterThanOrEqualTo(String value) {
            addCriterion("PHONEID1 >=", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1LessThan(String value) {
            addCriterion("PHONEID1 <", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1LessThanOrEqualTo(String value) {
            addCriterion("PHONEID1 <=", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1Like(String value) {
            addCriterion("PHONEID1 like", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1NotLike(String value) {
            addCriterion("PHONEID1 not like", value, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1In(List<String> values) {
            addCriterion("PHONEID1 in", values, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1NotIn(List<String> values) {
            addCriterion("PHONEID1 not in", values, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1Between(String value1, String value2) {
            addCriterion("PHONEID1 between", value1, value2, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid1NotBetween(String value1, String value2) {
            addCriterion("PHONEID1 not between", value1, value2, "phoneid1");
            return (Criteria) this;
        }

        public Criteria andPhoneid2IsNull() {
            addCriterion("PHONEID2 is null");
            return (Criteria) this;
        }

        public Criteria andPhoneid2IsNotNull() {
            addCriterion("PHONEID2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneid2EqualTo(String value) {
            addCriterion("PHONEID2 =", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2NotEqualTo(String value) {
            addCriterion("PHONEID2 <>", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2GreaterThan(String value) {
            addCriterion("PHONEID2 >", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2GreaterThanOrEqualTo(String value) {
            addCriterion("PHONEID2 >=", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2LessThan(String value) {
            addCriterion("PHONEID2 <", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2LessThanOrEqualTo(String value) {
            addCriterion("PHONEID2 <=", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2Like(String value) {
            addCriterion("PHONEID2 like", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2NotLike(String value) {
            addCriterion("PHONEID2 not like", value, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2In(List<String> values) {
            addCriterion("PHONEID2 in", values, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2NotIn(List<String> values) {
            addCriterion("PHONEID2 not in", values, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2Between(String value1, String value2) {
            addCriterion("PHONEID2 between", value1, value2, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andPhoneid2NotBetween(String value1, String value2) {
            addCriterion("PHONEID2 not between", value1, value2, "phoneid2");
            return (Criteria) this;
        }

        public Criteria andRecordfileIsNull() {
            addCriterion("RECORDFILE is null");
            return (Criteria) this;
        }

        public Criteria andRecordfileIsNotNull() {
            addCriterion("RECORDFILE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordfileEqualTo(String value) {
            addCriterion("RECORDFILE =", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileNotEqualTo(String value) {
            addCriterion("RECORDFILE <>", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileGreaterThan(String value) {
            addCriterion("RECORDFILE >", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDFILE >=", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileLessThan(String value) {
            addCriterion("RECORDFILE <", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileLessThanOrEqualTo(String value) {
            addCriterion("RECORDFILE <=", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileLike(String value) {
            addCriterion("RECORDFILE like", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileNotLike(String value) {
            addCriterion("RECORDFILE not like", value, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileIn(List<String> values) {
            addCriterion("RECORDFILE in", values, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileNotIn(List<String> values) {
            addCriterion("RECORDFILE not in", values, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileBetween(String value1, String value2) {
            addCriterion("RECORDFILE between", value1, value2, "recordfile");
            return (Criteria) this;
        }

        public Criteria andRecordfileNotBetween(String value1, String value2) {
            addCriterion("RECORDFILE not between", value1, value2, "recordfile");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("UPDATOR is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("UPDATOR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("UPDATOR =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("UPDATOR <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("UPDATOR >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATOR >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("UPDATOR <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("UPDATOR <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("UPDATOR like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("UPDATOR not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("UPDATOR in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("UPDATOR not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("UPDATOR between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("UPDATOR not between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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