package com.eaju.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class F554281Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F554281Example() {
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

        public Criteria andSon001IsNull() {
            addCriterion("SON001 is null");
            return (Criteria) this;
        }

        public Criteria andSon001IsNotNull() {
            addCriterion("SON001 is not null");
            return (Criteria) this;
        }

        public Criteria andSon001EqualTo(BigDecimal value) {
            addCriterion("SON001 =", value, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001NotEqualTo(BigDecimal value) {
            addCriterion("SON001 <>", value, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001GreaterThan(BigDecimal value) {
            addCriterion("SON001 >", value, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SON001 >=", value, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001LessThan(BigDecimal value) {
            addCriterion("SON001 <", value, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SON001 <=", value, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001In(List<BigDecimal> values) {
            addCriterion("SON001 in", values, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001NotIn(List<BigDecimal> values) {
            addCriterion("SON001 not in", values, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SON001 between", value1, value2, "son001");
            return (Criteria) this;
        }

        public Criteria andSon001NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SON001 not between", value1, value2, "son001");
            return (Criteria) this;
        }

        public Criteria andSokcooIsNull() {
            addCriterion("SOKCOO is null");
            return (Criteria) this;
        }

        public Criteria andSokcooIsNotNull() {
            addCriterion("SOKCOO is not null");
            return (Criteria) this;
        }

        public Criteria andSokcooEqualTo(Object value) {
            addCriterion("SOKCOO =", value, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooNotEqualTo(Object value) {
            addCriterion("SOKCOO <>", value, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooGreaterThan(Object value) {
            addCriterion("SOKCOO >", value, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooGreaterThanOrEqualTo(Object value) {
            addCriterion("SOKCOO >=", value, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooLessThan(Object value) {
            addCriterion("SOKCOO <", value, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooLessThanOrEqualTo(Object value) {
            addCriterion("SOKCOO <=", value, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooIn(List<Object> values) {
            addCriterion("SOKCOO in", values, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooNotIn(List<Object> values) {
            addCriterion("SOKCOO not in", values, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooBetween(Object value1, Object value2) {
            addCriterion("SOKCOO between", value1, value2, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSokcooNotBetween(Object value1, Object value2) {
            addCriterion("SOKCOO not between", value1, value2, "sokcoo");
            return (Criteria) this;
        }

        public Criteria andSodocoIsNull() {
            addCriterion("SODOCO is null");
            return (Criteria) this;
        }

        public Criteria andSodocoIsNotNull() {
            addCriterion("SODOCO is not null");
            return (Criteria) this;
        }

        public Criteria andSodocoEqualTo(BigDecimal value) {
            addCriterion("SODOCO =", value, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoNotEqualTo(BigDecimal value) {
            addCriterion("SODOCO <>", value, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoGreaterThan(BigDecimal value) {
            addCriterion("SODOCO >", value, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SODOCO >=", value, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoLessThan(BigDecimal value) {
            addCriterion("SODOCO <", value, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SODOCO <=", value, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoIn(List<BigDecimal> values) {
            addCriterion("SODOCO in", values, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoNotIn(List<BigDecimal> values) {
            addCriterion("SODOCO not in", values, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SODOCO between", value1, value2, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodocoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SODOCO not between", value1, value2, "sodoco");
            return (Criteria) this;
        }

        public Criteria andSodctoIsNull() {
            addCriterion("SODCTO is null");
            return (Criteria) this;
        }

        public Criteria andSodctoIsNotNull() {
            addCriterion("SODCTO is not null");
            return (Criteria) this;
        }

        public Criteria andSodctoEqualTo(Object value) {
            addCriterion("SODCTO =", value, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoNotEqualTo(Object value) {
            addCriterion("SODCTO <>", value, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoGreaterThan(Object value) {
            addCriterion("SODCTO >", value, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoGreaterThanOrEqualTo(Object value) {
            addCriterion("SODCTO >=", value, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoLessThan(Object value) {
            addCriterion("SODCTO <", value, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoLessThanOrEqualTo(Object value) {
            addCriterion("SODCTO <=", value, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoIn(List<Object> values) {
            addCriterion("SODCTO in", values, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoNotIn(List<Object> values) {
            addCriterion("SODCTO not in", values, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoBetween(Object value1, Object value2) {
            addCriterion("SODCTO between", value1, value2, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSodctoNotBetween(Object value1, Object value2) {
            addCriterion("SODCTO not between", value1, value2, "sodcto");
            return (Criteria) this;
        }

        public Criteria andSo55seIsNull() {
            addCriterion("SO55SE is null");
            return (Criteria) this;
        }

        public Criteria andSo55seIsNotNull() {
            addCriterion("SO55SE is not null");
            return (Criteria) this;
        }

        public Criteria andSo55seEqualTo(Object value) {
            addCriterion("SO55SE =", value, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seNotEqualTo(Object value) {
            addCriterion("SO55SE <>", value, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seGreaterThan(Object value) {
            addCriterion("SO55SE >", value, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seGreaterThanOrEqualTo(Object value) {
            addCriterion("SO55SE >=", value, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seLessThan(Object value) {
            addCriterion("SO55SE <", value, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seLessThanOrEqualTo(Object value) {
            addCriterion("SO55SE <=", value, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seIn(List<Object> values) {
            addCriterion("SO55SE in", values, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seNotIn(List<Object> values) {
            addCriterion("SO55SE not in", values, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seBetween(Object value1, Object value2) {
            addCriterion("SO55SE between", value1, value2, "so55se");
            return (Criteria) this;
        }

        public Criteria andSo55seNotBetween(Object value1, Object value2) {
            addCriterion("SO55SE not between", value1, value2, "so55se");
            return (Criteria) this;
        }

        public Criteria andSocpn1IsNull() {
            addCriterion("SOCPN1 is null");
            return (Criteria) this;
        }

        public Criteria andSocpn1IsNotNull() {
            addCriterion("SOCPN1 is not null");
            return (Criteria) this;
        }

        public Criteria andSocpn1EqualTo(Object value) {
            addCriterion("SOCPN1 =", value, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1NotEqualTo(Object value) {
            addCriterion("SOCPN1 <>", value, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1GreaterThan(Object value) {
            addCriterion("SOCPN1 >", value, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1GreaterThanOrEqualTo(Object value) {
            addCriterion("SOCPN1 >=", value, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1LessThan(Object value) {
            addCriterion("SOCPN1 <", value, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1LessThanOrEqualTo(Object value) {
            addCriterion("SOCPN1 <=", value, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1In(List<Object> values) {
            addCriterion("SOCPN1 in", values, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1NotIn(List<Object> values) {
            addCriterion("SOCPN1 not in", values, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1Between(Object value1, Object value2) {
            addCriterion("SOCPN1 between", value1, value2, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSocpn1NotBetween(Object value1, Object value2) {
            addCriterion("SOCPN1 not between", value1, value2, "socpn1");
            return (Criteria) this;
        }

        public Criteria andSovr01IsNull() {
            addCriterion("trim(SOVR01) is null");
            return (Criteria) this;
        }

        public Criteria andSovr01IsNotNull() {
            addCriterion("trim(SOVR01) is not null");
            return (Criteria) this;
        }

        public Criteria andSovr01EqualTo(Object value) {
            addCriterion("trim(SOVR01) =", value, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01NotEqualTo(Object value) {
            addCriterion("trim(SOVR01) <>", value, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01GreaterThan(Object value) {
            addCriterion("trim(SOVR01) >", value, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01GreaterThanOrEqualTo(Object value) {
            addCriterion("trim(SOVR01) >=", value, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01LessThan(Object value) {
            addCriterion("trim(SOVR01) <", value, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01LessThanOrEqualTo(Object value) {
            addCriterion("trim(SOVR01) <=", value, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01In(List<Object> values) {
            addCriterion("trim(SOVR01) in", values, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01NotIn(List<Object> values) {
            addCriterion("trim(SOVR01) not in", values, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01Between(Object value1, Object value2) {
            addCriterion("trim(SOVR01) between", value1, value2, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSovr01NotBetween(Object value1, Object value2) {
            addCriterion("trim(SOVR01) not between", value1, value2, "sovr01");
            return (Criteria) this;
        }

        public Criteria andSo55lyIsNull() {
            addCriterion("SO55LY is null");
            return (Criteria) this;
        }

        public Criteria andSo55lyIsNotNull() {
            addCriterion("SO55LY is not null");
            return (Criteria) this;
        }

        public Criteria andSo55lyEqualTo(Object value) {
            addCriterion("SO55LY =", value, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyNotEqualTo(Object value) {
            addCriterion("SO55LY <>", value, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyGreaterThan(Object value) {
            addCriterion("SO55LY >", value, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyGreaterThanOrEqualTo(Object value) {
            addCriterion("SO55LY >=", value, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyLessThan(Object value) {
            addCriterion("SO55LY <", value, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyLessThanOrEqualTo(Object value) {
            addCriterion("SO55LY <=", value, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyIn(List<Object> values) {
            addCriterion("SO55LY in", values, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyNotIn(List<Object> values) {
            addCriterion("SO55LY not in", values, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyBetween(Object value1, Object value2) {
            addCriterion("SO55LY between", value1, value2, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSo55lyNotBetween(Object value1, Object value2) {
            addCriterion("SO55LY not between", value1, value2, "so55ly");
            return (Criteria) this;
        }

        public Criteria andSodl01IsNull() {
            addCriterion("SODL01 is null");
            return (Criteria) this;
        }

        public Criteria andSodl01IsNotNull() {
            addCriterion("SODL01 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl01EqualTo(Object value) {
            addCriterion("SODL01 =", value, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01NotEqualTo(Object value) {
            addCriterion("SODL01 <>", value, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01GreaterThan(Object value) {
            addCriterion("SODL01 >", value, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL01 >=", value, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01LessThan(Object value) {
            addCriterion("SODL01 <", value, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01LessThanOrEqualTo(Object value) {
            addCriterion("SODL01 <=", value, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01In(List<Object> values) {
            addCriterion("SODL01 in", values, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01NotIn(List<Object> values) {
            addCriterion("SODL01 not in", values, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01Between(Object value1, Object value2) {
            addCriterion("SODL01 between", value1, value2, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl01NotBetween(Object value1, Object value2) {
            addCriterion("SODL01 not between", value1, value2, "sodl01");
            return (Criteria) this;
        }

        public Criteria andSodl02IsNull() {
            addCriterion("SODL02 is null");
            return (Criteria) this;
        }

        public Criteria andSodl02IsNotNull() {
            addCriterion("SODL02 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl02EqualTo(Object value) {
            addCriterion("SODL02 =", value, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02NotEqualTo(Object value) {
            addCriterion("SODL02 <>", value, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02GreaterThan(Object value) {
            addCriterion("SODL02 >", value, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL02 >=", value, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02LessThan(Object value) {
            addCriterion("SODL02 <", value, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02LessThanOrEqualTo(Object value) {
            addCriterion("SODL02 <=", value, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02In(List<Object> values) {
            addCriterion("SODL02 in", values, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02NotIn(List<Object> values) {
            addCriterion("SODL02 not in", values, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02Between(Object value1, Object value2) {
            addCriterion("SODL02 between", value1, value2, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodl02NotBetween(Object value1, Object value2) {
            addCriterion("SODL02 not between", value1, value2, "sodl02");
            return (Criteria) this;
        }

        public Criteria andSodrqjIsNull() {
            addCriterion("SODRQJ is null");
            return (Criteria) this;
        }

        public Criteria andSodrqjIsNotNull() {
            addCriterion("SODRQJ is not null");
            return (Criteria) this;
        }

        public Criteria andSodrqjEqualTo(Integer value) {
            addCriterion("SODRQJ =", value, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjNotEqualTo(Integer value) {
            addCriterion("SODRQJ <>", value, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjGreaterThan(Integer value) {
            addCriterion("SODRQJ >", value, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SODRQJ >=", value, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjLessThan(Integer value) {
            addCriterion("SODRQJ <", value, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjLessThanOrEqualTo(Integer value) {
            addCriterion("SODRQJ <=", value, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjIn(List<Integer> values) {
            addCriterion("SODRQJ in", values, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjNotIn(List<Integer> values) {
            addCriterion("SODRQJ not in", values, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjBetween(Integer value1, Integer value2) {
            addCriterion("SODRQJ between", value1, value2, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodrqjNotBetween(Integer value1, Integer value2) {
            addCriterion("SODRQJ not between", value1, value2, "sodrqj");
            return (Criteria) this;
        }

        public Criteria andSodl24IsNull() {
            addCriterion("SODL24 is null");
            return (Criteria) this;
        }

        public Criteria andSodl24IsNotNull() {
            addCriterion("SODL24 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl24EqualTo(Object value) {
            addCriterion("SODL24 =", value, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24NotEqualTo(Object value) {
            addCriterion("SODL24 <>", value, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24GreaterThan(Object value) {
            addCriterion("SODL24 >", value, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL24 >=", value, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24LessThan(Object value) {
            addCriterion("SODL24 <", value, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24LessThanOrEqualTo(Object value) {
            addCriterion("SODL24 <=", value, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24In(List<Object> values) {
            addCriterion("SODL24 in", values, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24NotIn(List<Object> values) {
            addCriterion("SODL24 not in", values, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24Between(Object value1, Object value2) {
            addCriterion("SODL24 between", value1, value2, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodl24NotBetween(Object value1, Object value2) {
            addCriterion("SODL24 not between", value1, value2, "sodl24");
            return (Criteria) this;
        }

        public Criteria andSodcIsNull() {
            addCriterion("SODC is null");
            return (Criteria) this;
        }

        public Criteria andSodcIsNotNull() {
            addCriterion("SODC is not null");
            return (Criteria) this;
        }

        public Criteria andSodcEqualTo(Object value) {
            addCriterion("SODC =", value, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcNotEqualTo(Object value) {
            addCriterion("SODC <>", value, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcGreaterThan(Object value) {
            addCriterion("SODC >", value, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcGreaterThanOrEqualTo(Object value) {
            addCriterion("SODC >=", value, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcLessThan(Object value) {
            addCriterion("SODC <", value, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcLessThanOrEqualTo(Object value) {
            addCriterion("SODC <=", value, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcIn(List<Object> values) {
            addCriterion("SODC in", values, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcNotIn(List<Object> values) {
            addCriterion("SODC not in", values, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcBetween(Object value1, Object value2) {
            addCriterion("SODC between", value1, value2, "sodc");
            return (Criteria) this;
        }

        public Criteria andSodcNotBetween(Object value1, Object value2) {
            addCriterion("SODC not between", value1, value2, "sodc");
            return (Criteria) this;
        }

        public Criteria andSostyeIsNull() {
            addCriterion("SOSTYE is null");
            return (Criteria) this;
        }

        public Criteria andSostyeIsNotNull() {
            addCriterion("SOSTYE is not null");
            return (Criteria) this;
        }

        public Criteria andSostyeEqualTo(Object value) {
            addCriterion("SOSTYE =", value, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeNotEqualTo(Object value) {
            addCriterion("SOSTYE <>", value, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeGreaterThan(Object value) {
            addCriterion("SOSTYE >", value, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeGreaterThanOrEqualTo(Object value) {
            addCriterion("SOSTYE >=", value, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeLessThan(Object value) {
            addCriterion("SOSTYE <", value, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeLessThanOrEqualTo(Object value) {
            addCriterion("SOSTYE <=", value, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeIn(List<Object> values) {
            addCriterion("SOSTYE in", values, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeNotIn(List<Object> values) {
            addCriterion("SOSTYE not in", values, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeBetween(Object value1, Object value2) {
            addCriterion("SOSTYE between", value1, value2, "sostye");
            return (Criteria) this;
        }

        public Criteria andSostyeNotBetween(Object value1, Object value2) {
            addCriterion("SOSTYE not between", value1, value2, "sostye");
            return (Criteria) this;
        }

        public Criteria andSotyptIsNull() {
            addCriterion("SOTYPT is null");
            return (Criteria) this;
        }

        public Criteria andSotyptIsNotNull() {
            addCriterion("SOTYPT is not null");
            return (Criteria) this;
        }

        public Criteria andSotyptEqualTo(Object value) {
            addCriterion("SOTYPT =", value, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptNotEqualTo(Object value) {
            addCriterion("SOTYPT <>", value, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptGreaterThan(Object value) {
            addCriterion("SOTYPT >", value, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptGreaterThanOrEqualTo(Object value) {
            addCriterion("SOTYPT >=", value, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptLessThan(Object value) {
            addCriterion("SOTYPT <", value, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptLessThanOrEqualTo(Object value) {
            addCriterion("SOTYPT <=", value, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptIn(List<Object> values) {
            addCriterion("SOTYPT in", values, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptNotIn(List<Object> values) {
            addCriterion("SOTYPT not in", values, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptBetween(Object value1, Object value2) {
            addCriterion("SOTYPT between", value1, value2, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSotyptNotBetween(Object value1, Object value2) {
            addCriterion("SOTYPT not between", value1, value2, "sotypt");
            return (Criteria) this;
        }

        public Criteria andSo55cyIsNull() {
            addCriterion("SO55CY is null");
            return (Criteria) this;
        }

        public Criteria andSo55cyIsNotNull() {
            addCriterion("SO55CY is not null");
            return (Criteria) this;
        }

        public Criteria andSo55cyEqualTo(Object value) {
            addCriterion("SO55CY =", value, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyNotEqualTo(Object value) {
            addCriterion("SO55CY <>", value, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyGreaterThan(Object value) {
            addCriterion("SO55CY >", value, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyGreaterThanOrEqualTo(Object value) {
            addCriterion("SO55CY >=", value, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyLessThan(Object value) {
            addCriterion("SO55CY <", value, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyLessThanOrEqualTo(Object value) {
            addCriterion("SO55CY <=", value, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyIn(List<Object> values) {
            addCriterion("SO55CY in", values, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyNotIn(List<Object> values) {
            addCriterion("SO55CY not in", values, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyBetween(Object value1, Object value2) {
            addCriterion("SO55CY between", value1, value2, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSo55cyNotBetween(Object value1, Object value2) {
            addCriterion("SO55CY not between", value1, value2, "so55cy");
            return (Criteria) this;
        }

        public Criteria andSoalph3IsNull() {
            addCriterion("SOALPH3 is null");
            return (Criteria) this;
        }

        public Criteria andSoalph3IsNotNull() {
            addCriterion("SOALPH3 is not null");
            return (Criteria) this;
        }

        public Criteria andSoalph3EqualTo(Object value) {
            addCriterion("SOALPH3 =", value, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3NotEqualTo(Object value) {
            addCriterion("SOALPH3 <>", value, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3GreaterThan(Object value) {
            addCriterion("SOALPH3 >", value, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3GreaterThanOrEqualTo(Object value) {
            addCriterion("SOALPH3 >=", value, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3LessThan(Object value) {
            addCriterion("SOALPH3 <", value, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3LessThanOrEqualTo(Object value) {
            addCriterion("SOALPH3 <=", value, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3In(List<Object> values) {
            addCriterion("SOALPH3 in", values, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3NotIn(List<Object> values) {
            addCriterion("SOALPH3 not in", values, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3Between(Object value1, Object value2) {
            addCriterion("SOALPH3 between", value1, value2, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoalph3NotBetween(Object value1, Object value2) {
            addCriterion("SOALPH3 not between", value1, value2, "soalph3");
            return (Criteria) this;
        }

        public Criteria andSoaaidIsNull() {
            addCriterion("SOAAID is null");
            return (Criteria) this;
        }

        public Criteria andSoaaidIsNotNull() {
            addCriterion("SOAAID is not null");
            return (Criteria) this;
        }

        public Criteria andSoaaidEqualTo(BigDecimal value) {
            addCriterion("SOAAID =", value, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidNotEqualTo(BigDecimal value) {
            addCriterion("SOAAID <>", value, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidGreaterThan(BigDecimal value) {
            addCriterion("SOAAID >", value, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOAAID >=", value, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidLessThan(BigDecimal value) {
            addCriterion("SOAAID <", value, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOAAID <=", value, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidIn(List<BigDecimal> values) {
            addCriterion("SOAAID in", values, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidNotIn(List<BigDecimal> values) {
            addCriterion("SOAAID not in", values, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOAAID between", value1, value2, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSoaaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOAAID not between", value1, value2, "soaaid");
            return (Criteria) this;
        }

        public Criteria andSodl03IsNull() {
            addCriterion("SODL03 is null");
            return (Criteria) this;
        }

        public Criteria andSodl03IsNotNull() {
            addCriterion("SODL03 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl03EqualTo(Object value) {
            addCriterion("SODL03 =", value, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03NotEqualTo(Object value) {
            addCriterion("SODL03 <>", value, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03GreaterThan(Object value) {
            addCriterion("SODL03 >", value, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL03 >=", value, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03LessThan(Object value) {
            addCriterion("SODL03 <", value, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03LessThanOrEqualTo(Object value) {
            addCriterion("SODL03 <=", value, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03In(List<Object> values) {
            addCriterion("SODL03 in", values, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03NotIn(List<Object> values) {
            addCriterion("SODL03 not in", values, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03Between(Object value1, Object value2) {
            addCriterion("SODL03 between", value1, value2, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSodl03NotBetween(Object value1, Object value2) {
            addCriterion("SODL03 not between", value1, value2, "sodl03");
            return (Criteria) this;
        }

        public Criteria andSotpurIsNull() {
            addCriterion("SOTPUR is null");
            return (Criteria) this;
        }

        public Criteria andSotpurIsNotNull() {
            addCriterion("SOTPUR is not null");
            return (Criteria) this;
        }

        public Criteria andSotpurEqualTo(Object value) {
            addCriterion("SOTPUR =", value, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurNotEqualTo(Object value) {
            addCriterion("SOTPUR <>", value, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurGreaterThan(Object value) {
            addCriterion("SOTPUR >", value, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurGreaterThanOrEqualTo(Object value) {
            addCriterion("SOTPUR >=", value, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurLessThan(Object value) {
            addCriterion("SOTPUR <", value, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurLessThanOrEqualTo(Object value) {
            addCriterion("SOTPUR <=", value, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurIn(List<Object> values) {
            addCriterion("SOTPUR in", values, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurNotIn(List<Object> values) {
            addCriterion("SOTPUR not in", values, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurBetween(Object value1, Object value2) {
            addCriterion("SOTPUR between", value1, value2, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSotpurNotBetween(Object value1, Object value2) {
            addCriterion("SOTPUR not between", value1, value2, "sotpur");
            return (Criteria) this;
        }

        public Criteria andSoaIsNull() {
            addCriterion("SOA is null");
            return (Criteria) this;
        }

        public Criteria andSoaIsNotNull() {
            addCriterion("SOA is not null");
            return (Criteria) this;
        }

        public Criteria andSoaEqualTo(Object value) {
            addCriterion("SOA =", value, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaNotEqualTo(Object value) {
            addCriterion("SOA <>", value, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaGreaterThan(Object value) {
            addCriterion("SOA >", value, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaGreaterThanOrEqualTo(Object value) {
            addCriterion("SOA >=", value, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaLessThan(Object value) {
            addCriterion("SOA <", value, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaLessThanOrEqualTo(Object value) {
            addCriterion("SOA <=", value, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaIn(List<Object> values) {
            addCriterion("SOA in", values, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaNotIn(List<Object> values) {
            addCriterion("SOA not in", values, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaBetween(Object value1, Object value2) {
            addCriterion("SOA between", value1, value2, "soa");
            return (Criteria) this;
        }

        public Criteria andSoaNotBetween(Object value1, Object value2) {
            addCriterion("SOA not between", value1, value2, "soa");
            return (Criteria) this;
        }

        public Criteria andSoalphIsNull() {
            addCriterion("SOALPH is null");
            return (Criteria) this;
        }

        public Criteria andSoalphIsNotNull() {
            addCriterion("SOALPH is not null");
            return (Criteria) this;
        }

        public Criteria andSoalphEqualTo(Object value) {
            addCriterion("SOALPH =", value, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphNotEqualTo(Object value) {
            addCriterion("SOALPH <>", value, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphGreaterThan(Object value) {
            addCriterion("SOALPH >", value, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphGreaterThanOrEqualTo(Object value) {
            addCriterion("SOALPH >=", value, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphLessThan(Object value) {
            addCriterion("SOALPH <", value, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphLessThanOrEqualTo(Object value) {
            addCriterion("SOALPH <=", value, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphIn(List<Object> values) {
            addCriterion("SOALPH in", values, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphNotIn(List<Object> values) {
            addCriterion("SOALPH not in", values, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphBetween(Object value1, Object value2) {
            addCriterion("SOALPH between", value1, value2, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoalphNotBetween(Object value1, Object value2) {
            addCriterion("SOALPH not between", value1, value2, "soalph");
            return (Criteria) this;
        }

        public Criteria andSoph1IsNull() {
            addCriterion("SOPH1 is null");
            return (Criteria) this;
        }

        public Criteria andSoph1IsNotNull() {
            addCriterion("SOPH1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoph1EqualTo(Object value) {
            addCriterion("SOPH1 =", value, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1NotEqualTo(Object value) {
            addCriterion("SOPH1 <>", value, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1GreaterThan(Object value) {
            addCriterion("SOPH1 >", value, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1GreaterThanOrEqualTo(Object value) {
            addCriterion("SOPH1 >=", value, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1LessThan(Object value) {
            addCriterion("SOPH1 <", value, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1LessThanOrEqualTo(Object value) {
            addCriterion("SOPH1 <=", value, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1In(List<Object> values) {
            addCriterion("SOPH1 in", values, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1NotIn(List<Object> values) {
            addCriterion("SOPH1 not in", values, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1Between(Object value1, Object value2) {
            addCriterion("SOPH1 between", value1, value2, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoph1NotBetween(Object value1, Object value2) {
            addCriterion("SOPH1 not between", value1, value2, "soph1");
            return (Criteria) this;
        }

        public Criteria andSoaddsIsNull() {
            addCriterion("SOADDS is null");
            return (Criteria) this;
        }

        public Criteria andSoaddsIsNotNull() {
            addCriterion("SOADDS is not null");
            return (Criteria) this;
        }

        public Criteria andSoaddsEqualTo(Object value) {
            addCriterion("SOADDS =", value, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsNotEqualTo(Object value) {
            addCriterion("SOADDS <>", value, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsGreaterThan(Object value) {
            addCriterion("SOADDS >", value, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsGreaterThanOrEqualTo(Object value) {
            addCriterion("SOADDS >=", value, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsLessThan(Object value) {
            addCriterion("SOADDS <", value, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsLessThanOrEqualTo(Object value) {
            addCriterion("SOADDS <=", value, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsIn(List<Object> values) {
            addCriterion("SOADDS in", values, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsNotIn(List<Object> values) {
            addCriterion("SOADDS not in", values, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsBetween(Object value1, Object value2) {
            addCriterion("SOADDS between", value1, value2, "soadds");
            return (Criteria) this;
        }

        public Criteria andSoaddsNotBetween(Object value1, Object value2) {
            addCriterion("SOADDS not between", value1, value2, "soadds");
            return (Criteria) this;
        }

        public Criteria andSonameIsNull() {
            addCriterion("SONAME is null");
            return (Criteria) this;
        }

        public Criteria andSonameIsNotNull() {
            addCriterion("SONAME is not null");
            return (Criteria) this;
        }

        public Criteria andSonameEqualTo(Object value) {
            addCriterion("SONAME =", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameNotEqualTo(Object value) {
            addCriterion("SONAME <>", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameGreaterThan(Object value) {
            addCriterion("SONAME >", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameGreaterThanOrEqualTo(Object value) {
            addCriterion("SONAME >=", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameLessThan(Object value) {
            addCriterion("SONAME <", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameLessThanOrEqualTo(Object value) {
            addCriterion("SONAME <=", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameIn(List<Object> values) {
            addCriterion("SONAME in", values, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameNotIn(List<Object> values) {
            addCriterion("SONAME not in", values, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameBetween(Object value1, Object value2) {
            addCriterion("SONAME between", value1, value2, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameNotBetween(Object value1, Object value2) {
            addCriterion("SONAME not between", value1, value2, "soname");
            return (Criteria) this;
        }

        public Criteria andSoaddzIsNull() {
            addCriterion("SOADDZ is null");
            return (Criteria) this;
        }

        public Criteria andSoaddzIsNotNull() {
            addCriterion("SOADDZ is not null");
            return (Criteria) this;
        }

        public Criteria andSoaddzEqualTo(Object value) {
            addCriterion("SOADDZ =", value, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzNotEqualTo(Object value) {
            addCriterion("SOADDZ <>", value, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzGreaterThan(Object value) {
            addCriterion("SOADDZ >", value, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzGreaterThanOrEqualTo(Object value) {
            addCriterion("SOADDZ >=", value, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzLessThan(Object value) {
            addCriterion("SOADDZ <", value, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzLessThanOrEqualTo(Object value) {
            addCriterion("SOADDZ <=", value, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzIn(List<Object> values) {
            addCriterion("SOADDZ in", values, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzNotIn(List<Object> values) {
            addCriterion("SOADDZ not in", values, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzBetween(Object value1, Object value2) {
            addCriterion("SOADDZ between", value1, value2, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSoaddzNotBetween(Object value1, Object value2) {
            addCriterion("SOADDZ not between", value1, value2, "soaddz");
            return (Criteria) this;
        }

        public Criteria andSonameeIsNull() {
            addCriterion("SONAMEE is null");
            return (Criteria) this;
        }

        public Criteria andSonameeIsNotNull() {
            addCriterion("SONAMEE is not null");
            return (Criteria) this;
        }

        public Criteria andSonameeEqualTo(Object value) {
            addCriterion("SONAMEE =", value, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeNotEqualTo(Object value) {
            addCriterion("SONAMEE <>", value, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeGreaterThan(Object value) {
            addCriterion("SONAMEE >", value, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeGreaterThanOrEqualTo(Object value) {
            addCriterion("SONAMEE >=", value, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeLessThan(Object value) {
            addCriterion("SONAMEE <", value, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeLessThanOrEqualTo(Object value) {
            addCriterion("SONAMEE <=", value, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeIn(List<Object> values) {
            addCriterion("SONAMEE in", values, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeNotIn(List<Object> values) {
            addCriterion("SONAMEE not in", values, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeBetween(Object value1, Object value2) {
            addCriterion("SONAMEE between", value1, value2, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSonameeNotBetween(Object value1, Object value2) {
            addCriterion("SONAMEE not between", value1, value2, "sonamee");
            return (Criteria) this;
        }

        public Criteria andSocounIsNull() {
            addCriterion("SOCOUN is null");
            return (Criteria) this;
        }

        public Criteria andSocounIsNotNull() {
            addCriterion("SOCOUN is not null");
            return (Criteria) this;
        }

        public Criteria andSocounEqualTo(Object value) {
            addCriterion("SOCOUN =", value, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounNotEqualTo(Object value) {
            addCriterion("SOCOUN <>", value, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounGreaterThan(Object value) {
            addCriterion("SOCOUN >", value, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounGreaterThanOrEqualTo(Object value) {
            addCriterion("SOCOUN >=", value, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounLessThan(Object value) {
            addCriterion("SOCOUN <", value, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounLessThanOrEqualTo(Object value) {
            addCriterion("SOCOUN <=", value, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounIn(List<Object> values) {
            addCriterion("SOCOUN in", values, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounNotIn(List<Object> values) {
            addCriterion("SOCOUN not in", values, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounBetween(Object value1, Object value2) {
            addCriterion("SOCOUN between", value1, value2, "socoun");
            return (Criteria) this;
        }

        public Criteria andSocounNotBetween(Object value1, Object value2) {
            addCriterion("SOCOUN not between", value1, value2, "socoun");
            return (Criteria) this;
        }

        public Criteria andSonamedIsNull() {
            addCriterion("SONAMED is null");
            return (Criteria) this;
        }

        public Criteria andSonamedIsNotNull() {
            addCriterion("SONAMED is not null");
            return (Criteria) this;
        }

        public Criteria andSonamedEqualTo(Object value) {
            addCriterion("SONAMED =", value, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedNotEqualTo(Object value) {
            addCriterion("SONAMED <>", value, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedGreaterThan(Object value) {
            addCriterion("SONAMED >", value, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedGreaterThanOrEqualTo(Object value) {
            addCriterion("SONAMED >=", value, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedLessThan(Object value) {
            addCriterion("SONAMED <", value, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedLessThanOrEqualTo(Object value) {
            addCriterion("SONAMED <=", value, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedIn(List<Object> values) {
            addCriterion("SONAMED in", values, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedNotIn(List<Object> values) {
            addCriterion("SONAMED not in", values, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedBetween(Object value1, Object value2) {
            addCriterion("SONAMED between", value1, value2, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSonamedNotBetween(Object value1, Object value2) {
            addCriterion("SONAMED not between", value1, value2, "sonamed");
            return (Criteria) this;
        }

        public Criteria andSoadd1IsNull() {
            addCriterion("SOADD1 is null");
            return (Criteria) this;
        }

        public Criteria andSoadd1IsNotNull() {
            addCriterion("SOADD1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoadd1EqualTo(Object value) {
            addCriterion("SOADD1 =", value, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1NotEqualTo(Object value) {
            addCriterion("SOADD1 <>", value, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1GreaterThan(Object value) {
            addCriterion("SOADD1 >", value, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1GreaterThanOrEqualTo(Object value) {
            addCriterion("SOADD1 >=", value, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1LessThan(Object value) {
            addCriterion("SOADD1 <", value, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1LessThanOrEqualTo(Object value) {
            addCriterion("SOADD1 <=", value, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1In(List<Object> values) {
            addCriterion("SOADD1 in", values, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1NotIn(List<Object> values) {
            addCriterion("SOADD1 not in", values, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1Between(Object value1, Object value2) {
            addCriterion("SOADD1 between", value1, value2, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoadd1NotBetween(Object value1, Object value2) {
            addCriterion("SOADD1 not between", value1, value2, "soadd1");
            return (Criteria) this;
        }

        public Criteria andSoalph2IsNull() {
            addCriterion("SOALPH2 is null");
            return (Criteria) this;
        }

        public Criteria andSoalph2IsNotNull() {
            addCriterion("SOALPH2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoalph2EqualTo(Object value) {
            addCriterion("SOALPH2 =", value, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2NotEqualTo(Object value) {
            addCriterion("SOALPH2 <>", value, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2GreaterThan(Object value) {
            addCriterion("SOALPH2 >", value, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2GreaterThanOrEqualTo(Object value) {
            addCriterion("SOALPH2 >=", value, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2LessThan(Object value) {
            addCriterion("SOALPH2 <", value, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2LessThanOrEqualTo(Object value) {
            addCriterion("SOALPH2 <=", value, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2In(List<Object> values) {
            addCriterion("SOALPH2 in", values, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2NotIn(List<Object> values) {
            addCriterion("SOALPH2 not in", values, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2Between(Object value1, Object value2) {
            addCriterion("SOALPH2 between", value1, value2, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoalph2NotBetween(Object value1, Object value2) {
            addCriterion("SOALPH2 not between", value1, value2, "soalph2");
            return (Criteria) this;
        }

        public Criteria andSoph2IsNull() {
            addCriterion("SOPH2 is null");
            return (Criteria) this;
        }

        public Criteria andSoph2IsNotNull() {
            addCriterion("SOPH2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoph2EqualTo(Object value) {
            addCriterion("SOPH2 =", value, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2NotEqualTo(Object value) {
            addCriterion("SOPH2 <>", value, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2GreaterThan(Object value) {
            addCriterion("SOPH2 >", value, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2GreaterThanOrEqualTo(Object value) {
            addCriterion("SOPH2 >=", value, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2LessThan(Object value) {
            addCriterion("SOPH2 <", value, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2LessThanOrEqualTo(Object value) {
            addCriterion("SOPH2 <=", value, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2In(List<Object> values) {
            addCriterion("SOPH2 in", values, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2NotIn(List<Object> values) {
            addCriterion("SOPH2 not in", values, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2Between(Object value1, Object value2) {
            addCriterion("SOPH2 between", value1, value2, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph2NotBetween(Object value1, Object value2) {
            addCriterion("SOPH2 not between", value1, value2, "soph2");
            return (Criteria) this;
        }

        public Criteria andSoph3IsNull() {
            addCriterion("SOPH3 is null");
            return (Criteria) this;
        }

        public Criteria andSoph3IsNotNull() {
            addCriterion("SOPH3 is not null");
            return (Criteria) this;
        }

        public Criteria andSoph3EqualTo(Object value) {
            addCriterion("SOPH3 =", value, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3NotEqualTo(Object value) {
            addCriterion("SOPH3 <>", value, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3GreaterThan(Object value) {
            addCriterion("SOPH3 >", value, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3GreaterThanOrEqualTo(Object value) {
            addCriterion("SOPH3 >=", value, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3LessThan(Object value) {
            addCriterion("SOPH3 <", value, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3LessThanOrEqualTo(Object value) {
            addCriterion("SOPH3 <=", value, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3In(List<Object> values) {
            addCriterion("SOPH3 in", values, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3NotIn(List<Object> values) {
            addCriterion("SOPH3 not in", values, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3Between(Object value1, Object value2) {
            addCriterion("SOPH3 between", value1, value2, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoph3NotBetween(Object value1, Object value2) {
            addCriterion("SOPH3 not between", value1, value2, "soph3");
            return (Criteria) this;
        }

        public Criteria andSoelm01IsNull() {
            addCriterion("SOELM01 is null");
            return (Criteria) this;
        }

        public Criteria andSoelm01IsNotNull() {
            addCriterion("SOELM01 is not null");
            return (Criteria) this;
        }

        public Criteria andSoelm01EqualTo(Object value) {
            addCriterion("SOELM01 =", value, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01NotEqualTo(Object value) {
            addCriterion("SOELM01 <>", value, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01GreaterThan(Object value) {
            addCriterion("SOELM01 >", value, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01GreaterThanOrEqualTo(Object value) {
            addCriterion("SOELM01 >=", value, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01LessThan(Object value) {
            addCriterion("SOELM01 <", value, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01LessThanOrEqualTo(Object value) {
            addCriterion("SOELM01 <=", value, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01In(List<Object> values) {
            addCriterion("SOELM01 in", values, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01NotIn(List<Object> values) {
            addCriterion("SOELM01 not in", values, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01Between(Object value1, Object value2) {
            addCriterion("SOELM01 between", value1, value2, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSoelm01NotBetween(Object value1, Object value2) {
            addCriterion("SOELM01 not between", value1, value2, "soelm01");
            return (Criteria) this;
        }

        public Criteria andSowho1IsNull() {
            addCriterion("SOWHO1 is null");
            return (Criteria) this;
        }

        public Criteria andSowho1IsNotNull() {
            addCriterion("SOWHO1 is not null");
            return (Criteria) this;
        }

        public Criteria andSowho1EqualTo(Object value) {
            addCriterion("SOWHO1 =", value, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1NotEqualTo(Object value) {
            addCriterion("SOWHO1 <>", value, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1GreaterThan(Object value) {
            addCriterion("SOWHO1 >", value, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1GreaterThanOrEqualTo(Object value) {
            addCriterion("SOWHO1 >=", value, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1LessThan(Object value) {
            addCriterion("SOWHO1 <", value, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1LessThanOrEqualTo(Object value) {
            addCriterion("SOWHO1 <=", value, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1In(List<Object> values) {
            addCriterion("SOWHO1 in", values, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1NotIn(List<Object> values) {
            addCriterion("SOWHO1 not in", values, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1Between(Object value1, Object value2) {
            addCriterion("SOWHO1 between", value1, value2, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSowho1NotBetween(Object value1, Object value2) {
            addCriterion("SOWHO1 not between", value1, value2, "sowho1");
            return (Criteria) this;
        }

        public Criteria andSoelm02IsNull() {
            addCriterion("SOELM02 is null");
            return (Criteria) this;
        }

        public Criteria andSoelm02IsNotNull() {
            addCriterion("SOELM02 is not null");
            return (Criteria) this;
        }

        public Criteria andSoelm02EqualTo(Object value) {
            addCriterion("SOELM02 =", value, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02NotEqualTo(Object value) {
            addCriterion("SOELM02 <>", value, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02GreaterThan(Object value) {
            addCriterion("SOELM02 >", value, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02GreaterThanOrEqualTo(Object value) {
            addCriterion("SOELM02 >=", value, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02LessThan(Object value) {
            addCriterion("SOELM02 <", value, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02LessThanOrEqualTo(Object value) {
            addCriterion("SOELM02 <=", value, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02In(List<Object> values) {
            addCriterion("SOELM02 in", values, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02NotIn(List<Object> values) {
            addCriterion("SOELM02 not in", values, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02Between(Object value1, Object value2) {
            addCriterion("SOELM02 between", value1, value2, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSoelm02NotBetween(Object value1, Object value2) {
            addCriterion("SOELM02 not between", value1, value2, "soelm02");
            return (Criteria) this;
        }

        public Criteria andSowho2IsNull() {
            addCriterion("SOWHO2 is null");
            return (Criteria) this;
        }

        public Criteria andSowho2IsNotNull() {
            addCriterion("SOWHO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSowho2EqualTo(Object value) {
            addCriterion("SOWHO2 =", value, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2NotEqualTo(Object value) {
            addCriterion("SOWHO2 <>", value, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2GreaterThan(Object value) {
            addCriterion("SOWHO2 >", value, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2GreaterThanOrEqualTo(Object value) {
            addCriterion("SOWHO2 >=", value, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2LessThan(Object value) {
            addCriterion("SOWHO2 <", value, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2LessThanOrEqualTo(Object value) {
            addCriterion("SOWHO2 <=", value, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2In(List<Object> values) {
            addCriterion("SOWHO2 in", values, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2NotIn(List<Object> values) {
            addCriterion("SOWHO2 not in", values, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2Between(Object value1, Object value2) {
            addCriterion("SOWHO2 between", value1, value2, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSowho2NotBetween(Object value1, Object value2) {
            addCriterion("SOWHO2 not between", value1, value2, "sowho2");
            return (Criteria) this;
        }

        public Criteria andSoelm03IsNull() {
            addCriterion("SOELM03 is null");
            return (Criteria) this;
        }

        public Criteria andSoelm03IsNotNull() {
            addCriterion("SOELM03 is not null");
            return (Criteria) this;
        }

        public Criteria andSoelm03EqualTo(Object value) {
            addCriterion("SOELM03 =", value, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03NotEqualTo(Object value) {
            addCriterion("SOELM03 <>", value, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03GreaterThan(Object value) {
            addCriterion("SOELM03 >", value, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03GreaterThanOrEqualTo(Object value) {
            addCriterion("SOELM03 >=", value, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03LessThan(Object value) {
            addCriterion("SOELM03 <", value, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03LessThanOrEqualTo(Object value) {
            addCriterion("SOELM03 <=", value, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03In(List<Object> values) {
            addCriterion("SOELM03 in", values, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03NotIn(List<Object> values) {
            addCriterion("SOELM03 not in", values, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03Between(Object value1, Object value2) {
            addCriterion("SOELM03 between", value1, value2, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSoelm03NotBetween(Object value1, Object value2) {
            addCriterion("SOELM03 not between", value1, value2, "soelm03");
            return (Criteria) this;
        }

        public Criteria andSowho3IsNull() {
            addCriterion("SOWHO3 is null");
            return (Criteria) this;
        }

        public Criteria andSowho3IsNotNull() {
            addCriterion("SOWHO3 is not null");
            return (Criteria) this;
        }

        public Criteria andSowho3EqualTo(Object value) {
            addCriterion("SOWHO3 =", value, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3NotEqualTo(Object value) {
            addCriterion("SOWHO3 <>", value, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3GreaterThan(Object value) {
            addCriterion("SOWHO3 >", value, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3GreaterThanOrEqualTo(Object value) {
            addCriterion("SOWHO3 >=", value, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3LessThan(Object value) {
            addCriterion("SOWHO3 <", value, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3LessThanOrEqualTo(Object value) {
            addCriterion("SOWHO3 <=", value, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3In(List<Object> values) {
            addCriterion("SOWHO3 in", values, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3NotIn(List<Object> values) {
            addCriterion("SOWHO3 not in", values, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3Between(Object value1, Object value2) {
            addCriterion("SOWHO3 between", value1, value2, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSowho3NotBetween(Object value1, Object value2) {
            addCriterion("SOWHO3 not between", value1, value2, "sowho3");
            return (Criteria) this;
        }

        public Criteria andSoadd2IsNull() {
            addCriterion("SOADD2 is null");
            return (Criteria) this;
        }

        public Criteria andSoadd2IsNotNull() {
            addCriterion("SOADD2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoadd2EqualTo(Object value) {
            addCriterion("SOADD2 =", value, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2NotEqualTo(Object value) {
            addCriterion("SOADD2 <>", value, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2GreaterThan(Object value) {
            addCriterion("SOADD2 >", value, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2GreaterThanOrEqualTo(Object value) {
            addCriterion("SOADD2 >=", value, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2LessThan(Object value) {
            addCriterion("SOADD2 <", value, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2LessThanOrEqualTo(Object value) {
            addCriterion("SOADD2 <=", value, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2In(List<Object> values) {
            addCriterion("SOADD2 in", values, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2NotIn(List<Object> values) {
            addCriterion("SOADD2 not in", values, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2Between(Object value1, Object value2) {
            addCriterion("SOADD2 between", value1, value2, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSoadd2NotBetween(Object value1, Object value2) {
            addCriterion("SOADD2 not between", value1, value2, "soadd2");
            return (Criteria) this;
        }

        public Criteria andSofil2IsNull() {
            addCriterion("SOFIL2 is null");
            return (Criteria) this;
        }

        public Criteria andSofil2IsNotNull() {
            addCriterion("SOFIL2 is not null");
            return (Criteria) this;
        }

        public Criteria andSofil2EqualTo(Object value) {
            addCriterion("SOFIL2 =", value, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2NotEqualTo(Object value) {
            addCriterion("SOFIL2 <>", value, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2GreaterThan(Object value) {
            addCriterion("SOFIL2 >", value, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2GreaterThanOrEqualTo(Object value) {
            addCriterion("SOFIL2 >=", value, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2LessThan(Object value) {
            addCriterion("SOFIL2 <", value, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2LessThanOrEqualTo(Object value) {
            addCriterion("SOFIL2 <=", value, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2In(List<Object> values) {
            addCriterion("SOFIL2 in", values, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2NotIn(List<Object> values) {
            addCriterion("SOFIL2 not in", values, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2Between(Object value1, Object value2) {
            addCriterion("SOFIL2 between", value1, value2, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil2NotBetween(Object value1, Object value2) {
            addCriterion("SOFIL2 not between", value1, value2, "sofil2");
            return (Criteria) this;
        }

        public Criteria andSofil3IsNull() {
            addCriterion("SOFIL3 is null");
            return (Criteria) this;
        }

        public Criteria andSofil3IsNotNull() {
            addCriterion("SOFIL3 is not null");
            return (Criteria) this;
        }

        public Criteria andSofil3EqualTo(Object value) {
            addCriterion("SOFIL3 =", value, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3NotEqualTo(Object value) {
            addCriterion("SOFIL3 <>", value, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3GreaterThan(Object value) {
            addCriterion("SOFIL3 >", value, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3GreaterThanOrEqualTo(Object value) {
            addCriterion("SOFIL3 >=", value, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3LessThan(Object value) {
            addCriterion("SOFIL3 <", value, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3LessThanOrEqualTo(Object value) {
            addCriterion("SOFIL3 <=", value, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3In(List<Object> values) {
            addCriterion("SOFIL3 in", values, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3NotIn(List<Object> values) {
            addCriterion("SOFIL3 not in", values, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3Between(Object value1, Object value2) {
            addCriterion("SOFIL3 between", value1, value2, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSofil3NotBetween(Object value1, Object value2) {
            addCriterion("SOFIL3 not between", value1, value2, "sofil3");
            return (Criteria) this;
        }

        public Criteria andSoa105IsNull() {
            addCriterion("SOA105 is null");
            return (Criteria) this;
        }

        public Criteria andSoa105IsNotNull() {
            addCriterion("SOA105 is not null");
            return (Criteria) this;
        }

        public Criteria andSoa105EqualTo(Object value) {
            addCriterion("SOA105 =", value, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105NotEqualTo(Object value) {
            addCriterion("SOA105 <>", value, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105GreaterThan(Object value) {
            addCriterion("SOA105 >", value, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105GreaterThanOrEqualTo(Object value) {
            addCriterion("SOA105 >=", value, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105LessThan(Object value) {
            addCriterion("SOA105 <", value, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105LessThanOrEqualTo(Object value) {
            addCriterion("SOA105 <=", value, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105In(List<Object> values) {
            addCriterion("SOA105 in", values, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105NotIn(List<Object> values) {
            addCriterion("SOA105 not in", values, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105Between(Object value1, Object value2) {
            addCriterion("SOA105 between", value1, value2, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoa105NotBetween(Object value1, Object value2) {
            addCriterion("SOA105 not between", value1, value2, "soa105");
            return (Criteria) this;
        }

        public Criteria andSoaaIsNull() {
            addCriterion("SOAA is null");
            return (Criteria) this;
        }

        public Criteria andSoaaIsNotNull() {
            addCriterion("SOAA is not null");
            return (Criteria) this;
        }

        public Criteria andSoaaEqualTo(BigDecimal value) {
            addCriterion("SOAA =", value, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaNotEqualTo(BigDecimal value) {
            addCriterion("SOAA <>", value, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaGreaterThan(BigDecimal value) {
            addCriterion("SOAA >", value, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOAA >=", value, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaLessThan(BigDecimal value) {
            addCriterion("SOAA <", value, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOAA <=", value, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaIn(List<BigDecimal> values) {
            addCriterion("SOAA in", values, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaNotIn(List<BigDecimal> values) {
            addCriterion("SOAA not in", values, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOAA between", value1, value2, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOAA not between", value1, value2, "soaa");
            return (Criteria) this;
        }

        public Criteria andSoaexpIsNull() {
            addCriterion("SOAEXP is null");
            return (Criteria) this;
        }

        public Criteria andSoaexpIsNotNull() {
            addCriterion("SOAEXP is not null");
            return (Criteria) this;
        }

        public Criteria andSoaexpEqualTo(BigDecimal value) {
            addCriterion("SOAEXP =", value, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpNotEqualTo(BigDecimal value) {
            addCriterion("SOAEXP <>", value, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpGreaterThan(BigDecimal value) {
            addCriterion("SOAEXP >", value, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOAEXP >=", value, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpLessThan(BigDecimal value) {
            addCriterion("SOAEXP <", value, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOAEXP <=", value, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpIn(List<BigDecimal> values) {
            addCriterion("SOAEXP in", values, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpNotIn(List<BigDecimal> values) {
            addCriterion("SOAEXP not in", values, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOAEXP between", value1, value2, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoaexpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOAEXP not between", value1, value2, "soaexp");
            return (Criteria) this;
        }

        public Criteria andSoa106IsNull() {
            addCriterion("SOA106 is null");
            return (Criteria) this;
        }

        public Criteria andSoa106IsNotNull() {
            addCriterion("SOA106 is not null");
            return (Criteria) this;
        }

        public Criteria andSoa106EqualTo(Object value) {
            addCriterion("SOA106 =", value, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106NotEqualTo(Object value) {
            addCriterion("SOA106 <>", value, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106GreaterThan(Object value) {
            addCriterion("SOA106 >", value, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106GreaterThanOrEqualTo(Object value) {
            addCriterion("SOA106 >=", value, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106LessThan(Object value) {
            addCriterion("SOA106 <", value, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106LessThanOrEqualTo(Object value) {
            addCriterion("SOA106 <=", value, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106In(List<Object> values) {
            addCriterion("SOA106 in", values, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106NotIn(List<Object> values) {
            addCriterion("SOA106 not in", values, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106Between(Object value1, Object value2) {
            addCriterion("SOA106 between", value1, value2, "soa106");
            return (Criteria) this;
        }

        public Criteria andSoa106NotBetween(Object value1, Object value2) {
            addCriterion("SOA106 not between", value1, value2, "soa106");
            return (Criteria) this;
        }

        public Criteria andSon002IsNull() {
            addCriterion("SON002 is null");
            return (Criteria) this;
        }

        public Criteria andSon002IsNotNull() {
            addCriterion("SON002 is not null");
            return (Criteria) this;
        }

        public Criteria andSon002EqualTo(BigDecimal value) {
            addCriterion("SON002 =", value, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002NotEqualTo(BigDecimal value) {
            addCriterion("SON002 <>", value, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002GreaterThan(BigDecimal value) {
            addCriterion("SON002 >", value, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SON002 >=", value, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002LessThan(BigDecimal value) {
            addCriterion("SON002 <", value, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SON002 <=", value, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002In(List<BigDecimal> values) {
            addCriterion("SON002 in", values, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002NotIn(List<BigDecimal> values) {
            addCriterion("SON002 not in", values, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SON002 between", value1, value2, "son002");
            return (Criteria) this;
        }

        public Criteria andSon002NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SON002 not between", value1, value2, "son002");
            return (Criteria) this;
        }

        public Criteria andSosrs2IsNull() {
            addCriterion("SOSRS2 is null");
            return (Criteria) this;
        }

        public Criteria andSosrs2IsNotNull() {
            addCriterion("SOSRS2 is not null");
            return (Criteria) this;
        }

        public Criteria andSosrs2EqualTo(Object value) {
            addCriterion("SOSRS2 =", value, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2NotEqualTo(Object value) {
            addCriterion("SOSRS2 <>", value, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2GreaterThan(Object value) {
            addCriterion("SOSRS2 >", value, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2GreaterThanOrEqualTo(Object value) {
            addCriterion("SOSRS2 >=", value, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2LessThan(Object value) {
            addCriterion("SOSRS2 <", value, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2LessThanOrEqualTo(Object value) {
            addCriterion("SOSRS2 <=", value, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2In(List<Object> values) {
            addCriterion("SOSRS2 in", values, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2NotIn(List<Object> values) {
            addCriterion("SOSRS2 not in", values, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2Between(Object value1, Object value2) {
            addCriterion("SOSRS2 between", value1, value2, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSosrs2NotBetween(Object value1, Object value2) {
            addCriterion("SOSRS2 not between", value1, value2, "sosrs2");
            return (Criteria) this;
        }

        public Criteria andSoedspIsNull() {
            addCriterion("SOEDSP is null");
            return (Criteria) this;
        }

        public Criteria andSoedspIsNotNull() {
            addCriterion("SOEDSP is not null");
            return (Criteria) this;
        }

        public Criteria andSoedspEqualTo(Object value) {
            addCriterion("SOEDSP =", value, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspNotEqualTo(Object value) {
            addCriterion("SOEDSP <>", value, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspGreaterThan(Object value) {
            addCriterion("SOEDSP >", value, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspGreaterThanOrEqualTo(Object value) {
            addCriterion("SOEDSP >=", value, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspLessThan(Object value) {
            addCriterion("SOEDSP <", value, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspLessThanOrEqualTo(Object value) {
            addCriterion("SOEDSP <=", value, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspIn(List<Object> values) {
            addCriterion("SOEDSP in", values, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspNotIn(List<Object> values) {
            addCriterion("SOEDSP not in", values, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspBetween(Object value1, Object value2) {
            addCriterion("SOEDSP between", value1, value2, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSoedspNotBetween(Object value1, Object value2) {
            addCriterion("SOEDSP not between", value1, value2, "soedsp");
            return (Criteria) this;
        }

        public Criteria andSomgtxIsNull() {
            addCriterion("SOMGTX is null");
            return (Criteria) this;
        }

        public Criteria andSomgtxIsNotNull() {
            addCriterion("SOMGTX is not null");
            return (Criteria) this;
        }

        public Criteria andSomgtxEqualTo(Object value) {
            addCriterion("SOMGTX =", value, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxNotEqualTo(Object value) {
            addCriterion("SOMGTX <>", value, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxGreaterThan(Object value) {
            addCriterion("SOMGTX >", value, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxGreaterThanOrEqualTo(Object value) {
            addCriterion("SOMGTX >=", value, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxLessThan(Object value) {
            addCriterion("SOMGTX <", value, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxLessThanOrEqualTo(Object value) {
            addCriterion("SOMGTX <=", value, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxIn(List<Object> values) {
            addCriterion("SOMGTX in", values, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxNotIn(List<Object> values) {
            addCriterion("SOMGTX not in", values, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxBetween(Object value1, Object value2) {
            addCriterion("SOMGTX between", value1, value2, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSomgtxNotBetween(Object value1, Object value2) {
            addCriterion("SOMGTX not between", value1, value2, "somgtx");
            return (Criteria) this;
        }

        public Criteria andSod200IsNull() {
            addCriterion("SOD200 is null");
            return (Criteria) this;
        }

        public Criteria andSod200IsNotNull() {
            addCriterion("SOD200 is not null");
            return (Criteria) this;
        }

        public Criteria andSod200EqualTo(Object value) {
            addCriterion("SOD200 =", value, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200NotEqualTo(Object value) {
            addCriterion("SOD200 <>", value, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200GreaterThan(Object value) {
            addCriterion("SOD200 >", value, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200GreaterThanOrEqualTo(Object value) {
            addCriterion("SOD200 >=", value, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200LessThan(Object value) {
            addCriterion("SOD200 <", value, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200LessThanOrEqualTo(Object value) {
            addCriterion("SOD200 <=", value, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200In(List<Object> values) {
            addCriterion("SOD200 in", values, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200NotIn(List<Object> values) {
            addCriterion("SOD200 not in", values, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200Between(Object value1, Object value2) {
            addCriterion("SOD200 between", value1, value2, "sod200");
            return (Criteria) this;
        }

        public Criteria andSod200NotBetween(Object value1, Object value2) {
            addCriterion("SOD200 not between", value1, value2, "sod200");
            return (Criteria) this;
        }

        public Criteria andSouserIsNull() {
            addCriterion("SOUSER is null");
            return (Criteria) this;
        }

        public Criteria andSouserIsNotNull() {
            addCriterion("SOUSER is not null");
            return (Criteria) this;
        }

        public Criteria andSouserEqualTo(Object value) {
            addCriterion("SOUSER =", value, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserNotEqualTo(Object value) {
            addCriterion("SOUSER <>", value, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserGreaterThan(Object value) {
            addCriterion("SOUSER >", value, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserGreaterThanOrEqualTo(Object value) {
            addCriterion("SOUSER >=", value, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserLessThan(Object value) {
            addCriterion("SOUSER <", value, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserLessThanOrEqualTo(Object value) {
            addCriterion("SOUSER <=", value, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserIn(List<Object> values) {
            addCriterion("SOUSER in", values, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserNotIn(List<Object> values) {
            addCriterion("SOUSER not in", values, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserBetween(Object value1, Object value2) {
            addCriterion("SOUSER between", value1, value2, "souser");
            return (Criteria) this;
        }

        public Criteria andSouserNotBetween(Object value1, Object value2) {
            addCriterion("SOUSER not between", value1, value2, "souser");
            return (Criteria) this;
        }

        public Criteria andSopidIsNull() {
            addCriterion("SOPID is null");
            return (Criteria) this;
        }

        public Criteria andSopidIsNotNull() {
            addCriterion("SOPID is not null");
            return (Criteria) this;
        }

        public Criteria andSopidEqualTo(Object value) {
            addCriterion("SOPID =", value, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidNotEqualTo(Object value) {
            addCriterion("SOPID <>", value, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidGreaterThan(Object value) {
            addCriterion("SOPID >", value, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidGreaterThanOrEqualTo(Object value) {
            addCriterion("SOPID >=", value, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidLessThan(Object value) {
            addCriterion("SOPID <", value, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidLessThanOrEqualTo(Object value) {
            addCriterion("SOPID <=", value, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidIn(List<Object> values) {
            addCriterion("SOPID in", values, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidNotIn(List<Object> values) {
            addCriterion("SOPID not in", values, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidBetween(Object value1, Object value2) {
            addCriterion("SOPID between", value1, value2, "sopid");
            return (Criteria) this;
        }

        public Criteria andSopidNotBetween(Object value1, Object value2) {
            addCriterion("SOPID not between", value1, value2, "sopid");
            return (Criteria) this;
        }

        public Criteria andSoupmjIsNull() {
            addCriterion("SOUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andSoupmjIsNotNull() {
            addCriterion("SOUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andSoupmjEqualTo(Integer value) {
            addCriterion("SOUPMJ =", value, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjNotEqualTo(Integer value) {
            addCriterion("SOUPMJ <>", value, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjGreaterThan(Integer value) {
            addCriterion("SOUPMJ >", value, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOUPMJ >=", value, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjLessThan(Integer value) {
            addCriterion("SOUPMJ <", value, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjLessThanOrEqualTo(Integer value) {
            addCriterion("SOUPMJ <=", value, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjIn(List<Integer> values) {
            addCriterion("SOUPMJ in", values, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjNotIn(List<Integer> values) {
            addCriterion("SOUPMJ not in", values, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjBetween(Integer value1, Integer value2) {
            addCriterion("SOUPMJ between", value1, value2, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmjNotBetween(Integer value1, Integer value2) {
            addCriterion("SOUPMJ not between", value1, value2, "soupmj");
            return (Criteria) this;
        }

        public Criteria andSoupmtIsNull() {
            addCriterion("SOUPMT is null");
            return (Criteria) this;
        }

        public Criteria andSoupmtIsNotNull() {
            addCriterion("SOUPMT is not null");
            return (Criteria) this;
        }

        public Criteria andSoupmtEqualTo(BigDecimal value) {
            addCriterion("SOUPMT =", value, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtNotEqualTo(BigDecimal value) {
            addCriterion("SOUPMT <>", value, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtGreaterThan(BigDecimal value) {
            addCriterion("SOUPMT >", value, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOUPMT >=", value, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtLessThan(BigDecimal value) {
            addCriterion("SOUPMT <", value, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOUPMT <=", value, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtIn(List<BigDecimal> values) {
            addCriterion("SOUPMT in", values, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtNotIn(List<BigDecimal> values) {
            addCriterion("SOUPMT not in", values, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOUPMT between", value1, value2, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSoupmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOUPMT not between", value1, value2, "soupmt");
            return (Criteria) this;
        }

        public Criteria andSodl20IsNull() {
            addCriterion("SODL20 is null");
            return (Criteria) this;
        }

        public Criteria andSodl20IsNotNull() {
            addCriterion("SODL20 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl20EqualTo(Object value) {
            addCriterion("SODL20 =", value, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20NotEqualTo(Object value) {
            addCriterion("SODL20 <>", value, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20GreaterThan(Object value) {
            addCriterion("SODL20 >", value, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL20 >=", value, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20LessThan(Object value) {
            addCriterion("SODL20 <", value, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20LessThanOrEqualTo(Object value) {
            addCriterion("SODL20 <=", value, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20In(List<Object> values) {
            addCriterion("SODL20 in", values, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20NotIn(List<Object> values) {
            addCriterion("SODL20 not in", values, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20Between(Object value1, Object value2) {
            addCriterion("SODL20 between", value1, value2, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl20NotBetween(Object value1, Object value2) {
            addCriterion("SODL20 not between", value1, value2, "sodl20");
            return (Criteria) this;
        }

        public Criteria andSodl21IsNull() {
            addCriterion("SODL21 is null");
            return (Criteria) this;
        }

        public Criteria andSodl21IsNotNull() {
            addCriterion("SODL21 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl21EqualTo(Object value) {
            addCriterion("SODL21 =", value, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21NotEqualTo(Object value) {
            addCriterion("SODL21 <>", value, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21GreaterThan(Object value) {
            addCriterion("SODL21 >", value, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL21 >=", value, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21LessThan(Object value) {
            addCriterion("SODL21 <", value, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21LessThanOrEqualTo(Object value) {
            addCriterion("SODL21 <=", value, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21In(List<Object> values) {
            addCriterion("SODL21 in", values, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21NotIn(List<Object> values) {
            addCriterion("SODL21 not in", values, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21Between(Object value1, Object value2) {
            addCriterion("SODL21 between", value1, value2, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl21NotBetween(Object value1, Object value2) {
            addCriterion("SODL21 not between", value1, value2, "sodl21");
            return (Criteria) this;
        }

        public Criteria andSodl22IsNull() {
            addCriterion("SODL22 is null");
            return (Criteria) this;
        }

        public Criteria andSodl22IsNotNull() {
            addCriterion("SODL22 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl22EqualTo(Object value) {
            addCriterion("SODL22 =", value, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22NotEqualTo(Object value) {
            addCriterion("SODL22 <>", value, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22GreaterThan(Object value) {
            addCriterion("SODL22 >", value, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL22 >=", value, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22LessThan(Object value) {
            addCriterion("SODL22 <", value, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22LessThanOrEqualTo(Object value) {
            addCriterion("SODL22 <=", value, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22In(List<Object> values) {
            addCriterion("SODL22 in", values, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22NotIn(List<Object> values) {
            addCriterion("SODL22 not in", values, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22Between(Object value1, Object value2) {
            addCriterion("SODL22 between", value1, value2, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl22NotBetween(Object value1, Object value2) {
            addCriterion("SODL22 not between", value1, value2, "sodl22");
            return (Criteria) this;
        }

        public Criteria andSodl23IsNull() {
            addCriterion("SODL23 is null");
            return (Criteria) this;
        }

        public Criteria andSodl23IsNotNull() {
            addCriterion("SODL23 is not null");
            return (Criteria) this;
        }

        public Criteria andSodl23EqualTo(Object value) {
            addCriterion("SODL23 =", value, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23NotEqualTo(Object value) {
            addCriterion("SODL23 <>", value, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23GreaterThan(Object value) {
            addCriterion("SODL23 >", value, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23GreaterThanOrEqualTo(Object value) {
            addCriterion("SODL23 >=", value, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23LessThan(Object value) {
            addCriterion("SODL23 <", value, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23LessThanOrEqualTo(Object value) {
            addCriterion("SODL23 <=", value, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23In(List<Object> values) {
            addCriterion("SODL23 in", values, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23NotIn(List<Object> values) {
            addCriterion("SODL23 not in", values, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23Between(Object value1, Object value2) {
            addCriterion("SODL23 between", value1, value2, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodl23NotBetween(Object value1, Object value2) {
            addCriterion("SODL23 not between", value1, value2, "sodl23");
            return (Criteria) this;
        }

        public Criteria andSodate01IsNull() {
            addCriterion("SODATE01 is null");
            return (Criteria) this;
        }

        public Criteria andSodate01IsNotNull() {
            addCriterion("SODATE01 is not null");
            return (Criteria) this;
        }

        public Criteria andSodate01EqualTo(Integer value) {
            addCriterion("SODATE01 =", value, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01NotEqualTo(Integer value) {
            addCriterion("SODATE01 <>", value, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01GreaterThan(Integer value) {
            addCriterion("SODATE01 >", value, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01GreaterThanOrEqualTo(Integer value) {
            addCriterion("SODATE01 >=", value, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01LessThan(Integer value) {
            addCriterion("SODATE01 <", value, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01LessThanOrEqualTo(Integer value) {
            addCriterion("SODATE01 <=", value, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01In(List<Integer> values) {
            addCriterion("SODATE01 in", values, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01NotIn(List<Integer> values) {
            addCriterion("SODATE01 not in", values, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01Between(Integer value1, Integer value2) {
            addCriterion("SODATE01 between", value1, value2, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate01NotBetween(Integer value1, Integer value2) {
            addCriterion("SODATE01 not between", value1, value2, "sodate01");
            return (Criteria) this;
        }

        public Criteria andSodate02IsNull() {
            addCriterion("SODATE02 is null");
            return (Criteria) this;
        }

        public Criteria andSodate02IsNotNull() {
            addCriterion("SODATE02 is not null");
            return (Criteria) this;
        }

        public Criteria andSodate02EqualTo(Integer value) {
            addCriterion("SODATE02 =", value, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02NotEqualTo(Integer value) {
            addCriterion("SODATE02 <>", value, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02GreaterThan(Integer value) {
            addCriterion("SODATE02 >", value, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02GreaterThanOrEqualTo(Integer value) {
            addCriterion("SODATE02 >=", value, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02LessThan(Integer value) {
            addCriterion("SODATE02 <", value, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02LessThanOrEqualTo(Integer value) {
            addCriterion("SODATE02 <=", value, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02In(List<Integer> values) {
            addCriterion("SODATE02 in", values, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02NotIn(List<Integer> values) {
            addCriterion("SODATE02 not in", values, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02Between(Integer value1, Integer value2) {
            addCriterion("SODATE02 between", value1, value2, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodate02NotBetween(Integer value1, Integer value2) {
            addCriterion("SODATE02 not between", value1, value2, "sodate02");
            return (Criteria) this;
        }

        public Criteria andSodoc2IsNull() {
            addCriterion("SODOC2 is null");
            return (Criteria) this;
        }

        public Criteria andSodoc2IsNotNull() {
            addCriterion("SODOC2 is not null");
            return (Criteria) this;
        }

        public Criteria andSodoc2EqualTo(BigDecimal value) {
            addCriterion("SODOC2 =", value, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2NotEqualTo(BigDecimal value) {
            addCriterion("SODOC2 <>", value, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2GreaterThan(BigDecimal value) {
            addCriterion("SODOC2 >", value, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SODOC2 >=", value, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2LessThan(BigDecimal value) {
            addCriterion("SODOC2 <", value, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SODOC2 <=", value, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2In(List<BigDecimal> values) {
            addCriterion("SODOC2 in", values, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2NotIn(List<BigDecimal> values) {
            addCriterion("SODOC2 not in", values, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SODOC2 between", value1, value2, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSodoc2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SODOC2 not between", value1, value2, "sodoc2");
            return (Criteria) this;
        }

        public Criteria andSoroutIsNull() {
            addCriterion("SOROUT is null");
            return (Criteria) this;
        }

        public Criteria andSoroutIsNotNull() {
            addCriterion("SOROUT is not null");
            return (Criteria) this;
        }

        public Criteria andSoroutEqualTo(Object value) {
            addCriterion("SOROUT =", value, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutNotEqualTo(Object value) {
            addCriterion("SOROUT <>", value, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutGreaterThan(Object value) {
            addCriterion("SOROUT >", value, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutGreaterThanOrEqualTo(Object value) {
            addCriterion("SOROUT >=", value, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutLessThan(Object value) {
            addCriterion("SOROUT <", value, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutLessThanOrEqualTo(Object value) {
            addCriterion("SOROUT <=", value, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutIn(List<Object> values) {
            addCriterion("SOROUT in", values, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutNotIn(List<Object> values) {
            addCriterion("SOROUT not in", values, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutBetween(Object value1, Object value2) {
            addCriterion("SOROUT between", value1, value2, "sorout");
            return (Criteria) this;
        }

        public Criteria andSoroutNotBetween(Object value1, Object value2) {
            addCriterion("SOROUT not between", value1, value2, "sorout");
            return (Criteria) this;
        }

        public Criteria andSomcuIsNull() {
            addCriterion("SOMCU is null");
            return (Criteria) this;
        }

        public Criteria andSomcuIsNotNull() {
            addCriterion("SOMCU is not null");
            return (Criteria) this;
        }

        public Criteria andSomcuEqualTo(Object value) {
            addCriterion("SOMCU =", value, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuNotEqualTo(Object value) {
            addCriterion("SOMCU <>", value, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuGreaterThan(Object value) {
            addCriterion("SOMCU >", value, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuGreaterThanOrEqualTo(Object value) {
            addCriterion("SOMCU >=", value, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuLessThan(Object value) {
            addCriterion("SOMCU <", value, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuLessThanOrEqualTo(Object value) {
            addCriterion("SOMCU <=", value, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuIn(List<Object> values) {
            addCriterion("SOMCU in", values, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuNotIn(List<Object> values) {
            addCriterion("SOMCU not in", values, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuBetween(Object value1, Object value2) {
            addCriterion("SOMCU between", value1, value2, "somcu");
            return (Criteria) this;
        }

        public Criteria andSomcuNotBetween(Object value1, Object value2) {
            addCriterion("SOMCU not between", value1, value2, "somcu");
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