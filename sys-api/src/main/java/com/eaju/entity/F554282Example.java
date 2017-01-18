package com.eaju.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class F554282Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F554282Example() {
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

        public Criteria andSdn001IsNull() {
            addCriterion("SDN001 is null");
            return (Criteria) this;
        }

        public Criteria andSdn001IsNotNull() {
            addCriterion("SDN001 is not null");
            return (Criteria) this;
        }

        public Criteria andSdn001EqualTo(BigDecimal value) {
            addCriterion("SDN001 =", value, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001NotEqualTo(BigDecimal value) {
            addCriterion("SDN001 <>", value, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001GreaterThan(BigDecimal value) {
            addCriterion("SDN001 >", value, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDN001 >=", value, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001LessThan(BigDecimal value) {
            addCriterion("SDN001 <", value, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDN001 <=", value, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001In(List<BigDecimal> values) {
            addCriterion("SDN001 in", values, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001NotIn(List<BigDecimal> values) {
            addCriterion("SDN001 not in", values, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDN001 between", value1, value2, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSdn001NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDN001 not between", value1, value2, "sdn001");
            return (Criteria) this;
        }

        public Criteria andSddocoIsNull() {
            addCriterion("SDDOCO is null");
            return (Criteria) this;
        }

        public Criteria andSddocoIsNotNull() {
            addCriterion("SDDOCO is not null");
            return (Criteria) this;
        }

        public Criteria andSddocoEqualTo(BigDecimal value) {
            addCriterion("SDDOCO =", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotEqualTo(BigDecimal value) {
            addCriterion("SDDOCO <>", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoGreaterThan(BigDecimal value) {
            addCriterion("SDDOCO >", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDDOCO >=", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoLessThan(BigDecimal value) {
            addCriterion("SDDOCO <", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDDOCO <=", value, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoIn(List<BigDecimal> values) {
            addCriterion("SDDOCO in", values, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotIn(List<BigDecimal> values) {
            addCriterion("SDDOCO not in", values, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDDOCO between", value1, value2, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSddocoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDDOCO not between", value1, value2, "sddoco");
            return (Criteria) this;
        }

        public Criteria andSdkcooIsNull() {
            addCriterion("SDKCOO is null");
            return (Criteria) this;
        }

        public Criteria andSdkcooIsNotNull() {
            addCriterion("SDKCOO is not null");
            return (Criteria) this;
        }

        public Criteria andSdkcooEqualTo(Object value) {
            addCriterion("SDKCOO =", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotEqualTo(Object value) {
            addCriterion("SDKCOO <>", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooGreaterThan(Object value) {
            addCriterion("SDKCOO >", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooGreaterThanOrEqualTo(Object value) {
            addCriterion("SDKCOO >=", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLessThan(Object value) {
            addCriterion("SDKCOO <", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooLessThanOrEqualTo(Object value) {
            addCriterion("SDKCOO <=", value, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooIn(List<Object> values) {
            addCriterion("SDKCOO in", values, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotIn(List<Object> values) {
            addCriterion("SDKCOO not in", values, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooBetween(Object value1, Object value2) {
            addCriterion("SDKCOO between", value1, value2, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSdkcooNotBetween(Object value1, Object value2) {
            addCriterion("SDKCOO not between", value1, value2, "sdkcoo");
            return (Criteria) this;
        }

        public Criteria andSddctoIsNull() {
            addCriterion("SDDCTO is null");
            return (Criteria) this;
        }

        public Criteria andSddctoIsNotNull() {
            addCriterion("SDDCTO is not null");
            return (Criteria) this;
        }

        public Criteria andSddctoEqualTo(Object value) {
            addCriterion("SDDCTO =", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotEqualTo(Object value) {
            addCriterion("SDDCTO <>", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoGreaterThan(Object value) {
            addCriterion("SDDCTO >", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoGreaterThanOrEqualTo(Object value) {
            addCriterion("SDDCTO >=", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLessThan(Object value) {
            addCriterion("SDDCTO <", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoLessThanOrEqualTo(Object value) {
            addCriterion("SDDCTO <=", value, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoIn(List<Object> values) {
            addCriterion("SDDCTO in", values, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotIn(List<Object> values) {
            addCriterion("SDDCTO not in", values, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoBetween(Object value1, Object value2) {
            addCriterion("SDDCTO between", value1, value2, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSddctoNotBetween(Object value1, Object value2) {
            addCriterion("SDDCTO not between", value1, value2, "sddcto");
            return (Criteria) this;
        }

        public Criteria andSdlnidIsNull() {
            addCriterion("SDLNID is null");
            return (Criteria) this;
        }

        public Criteria andSdlnidIsNotNull() {
            addCriterion("SDLNID is not null");
            return (Criteria) this;
        }

        public Criteria andSdlnidEqualTo(BigDecimal value) {
            addCriterion("SDLNID =", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotEqualTo(BigDecimal value) {
            addCriterion("SDLNID <>", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidGreaterThan(BigDecimal value) {
            addCriterion("SDLNID >", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDLNID >=", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidLessThan(BigDecimal value) {
            addCriterion("SDLNID <", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDLNID <=", value, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidIn(List<BigDecimal> values) {
            addCriterion("SDLNID in", values, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotIn(List<BigDecimal> values) {
            addCriterion("SDLNID not in", values, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDLNID between", value1, value2, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSdlnidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDLNID not between", value1, value2, "sdlnid");
            return (Criteria) this;
        }

        public Criteria andSditmIsNull() {
            addCriterion("SDITM is null");
            return (Criteria) this;
        }

        public Criteria andSditmIsNotNull() {
            addCriterion("SDITM is not null");
            return (Criteria) this;
        }

        public Criteria andSditmEqualTo(BigDecimal value) {
            addCriterion("SDITM =", value, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmNotEqualTo(BigDecimal value) {
            addCriterion("SDITM <>", value, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmGreaterThan(BigDecimal value) {
            addCriterion("SDITM >", value, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDITM >=", value, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmLessThan(BigDecimal value) {
            addCriterion("SDITM <", value, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDITM <=", value, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmIn(List<BigDecimal> values) {
            addCriterion("SDITM in", values, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmNotIn(List<BigDecimal> values) {
            addCriterion("SDITM not in", values, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDITM between", value1, value2, "sditm");
            return (Criteria) this;
        }

        public Criteria andSditmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDITM not between", value1, value2, "sditm");
            return (Criteria) this;
        }

        public Criteria andSdlitmIsNull() {
            addCriterion("SDLITM is null");
            return (Criteria) this;
        }

        public Criteria andSdlitmIsNotNull() {
            addCriterion("SDLITM is not null");
            return (Criteria) this;
        }

        public Criteria andSdlitmEqualTo(Object value) {
            addCriterion("SDLITM =", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotEqualTo(Object value) {
            addCriterion("SDLITM <>", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmGreaterThan(Object value) {
            addCriterion("SDLITM >", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmGreaterThanOrEqualTo(Object value) {
            addCriterion("SDLITM >=", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLessThan(Object value) {
            addCriterion("SDLITM <", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmLessThanOrEqualTo(Object value) {
            addCriterion("SDLITM <=", value, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmIn(List<Object> values) {
            addCriterion("SDLITM in", values, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotIn(List<Object> values) {
            addCriterion("SDLITM not in", values, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmBetween(Object value1, Object value2) {
            addCriterion("SDLITM between", value1, value2, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSdlitmNotBetween(Object value1, Object value2) {
            addCriterion("SDLITM not between", value1, value2, "sdlitm");
            return (Criteria) this;
        }

        public Criteria andSddsc1IsNull() {
            addCriterion("SDDSC1 is null");
            return (Criteria) this;
        }

        public Criteria andSddsc1IsNotNull() {
            addCriterion("SDDSC1 is not null");
            return (Criteria) this;
        }

        public Criteria andSddsc1EqualTo(Object value) {
            addCriterion("SDDSC1 =", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1NotEqualTo(Object value) {
            addCriterion("SDDSC1 <>", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1GreaterThan(Object value) {
            addCriterion("SDDSC1 >", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDSC1 >=", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1LessThan(Object value) {
            addCriterion("SDDSC1 <", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1LessThanOrEqualTo(Object value) {
            addCriterion("SDDSC1 <=", value, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1In(List<Object> values) {
            addCriterion("SDDSC1 in", values, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1NotIn(List<Object> values) {
            addCriterion("SDDSC1 not in", values, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1Between(Object value1, Object value2) {
            addCriterion("SDDSC1 between", value1, value2, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSddsc1NotBetween(Object value1, Object value2) {
            addCriterion("SDDSC1 not between", value1, value2, "sddsc1");
            return (Criteria) this;
        }

        public Criteria andSduorgIsNull() {
            addCriterion("SDUORG is null");
            return (Criteria) this;
        }

        public Criteria andSduorgIsNotNull() {
            addCriterion("SDUORG is not null");
            return (Criteria) this;
        }

        public Criteria andSduorgEqualTo(BigDecimal value) {
            addCriterion("SDUORG =", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgNotEqualTo(BigDecimal value) {
            addCriterion("SDUORG <>", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgGreaterThan(BigDecimal value) {
            addCriterion("SDUORG >", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUORG >=", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgLessThan(BigDecimal value) {
            addCriterion("SDUORG <", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUORG <=", value, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgIn(List<BigDecimal> values) {
            addCriterion("SDUORG in", values, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgNotIn(List<BigDecimal> values) {
            addCriterion("SDUORG not in", values, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUORG between", value1, value2, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSduorgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUORG not between", value1, value2, "sduorg");
            return (Criteria) this;
        }

        public Criteria andSditvlIsNull() {
            addCriterion("SDITVL is null");
            return (Criteria) this;
        }

        public Criteria andSditvlIsNotNull() {
            addCriterion("SDITVL is not null");
            return (Criteria) this;
        }

        public Criteria andSditvlEqualTo(BigDecimal value) {
            addCriterion("SDITVL =", value, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlNotEqualTo(BigDecimal value) {
            addCriterion("SDITVL <>", value, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlGreaterThan(BigDecimal value) {
            addCriterion("SDITVL >", value, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDITVL >=", value, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlLessThan(BigDecimal value) {
            addCriterion("SDITVL <", value, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDITVL <=", value, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlIn(List<BigDecimal> values) {
            addCriterion("SDITVL in", values, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlNotIn(List<BigDecimal> values) {
            addCriterion("SDITVL not in", values, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDITVL between", value1, value2, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditvlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDITVL not between", value1, value2, "sditvl");
            return (Criteria) this;
        }

        public Criteria andSditwtIsNull() {
            addCriterion("SDITWT is null");
            return (Criteria) this;
        }

        public Criteria andSditwtIsNotNull() {
            addCriterion("SDITWT is not null");
            return (Criteria) this;
        }

        public Criteria andSditwtEqualTo(BigDecimal value) {
            addCriterion("SDITWT =", value, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtNotEqualTo(BigDecimal value) {
            addCriterion("SDITWT <>", value, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtGreaterThan(BigDecimal value) {
            addCriterion("SDITWT >", value, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDITWT >=", value, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtLessThan(BigDecimal value) {
            addCriterion("SDITWT <", value, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDITWT <=", value, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtIn(List<BigDecimal> values) {
            addCriterion("SDITWT in", values, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtNotIn(List<BigDecimal> values) {
            addCriterion("SDITWT not in", values, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDITWT between", value1, value2, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSditwtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDITWT not between", value1, value2, "sditwt");
            return (Criteria) this;
        }

        public Criteria andSdlocnIsNull() {
            addCriterion("SDLOCN is null");
            return (Criteria) this;
        }

        public Criteria andSdlocnIsNotNull() {
            addCriterion("SDLOCN is not null");
            return (Criteria) this;
        }

        public Criteria andSdlocnEqualTo(Object value) {
            addCriterion("SDLOCN =", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotEqualTo(Object value) {
            addCriterion("SDLOCN <>", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnGreaterThan(Object value) {
            addCriterion("SDLOCN >", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnGreaterThanOrEqualTo(Object value) {
            addCriterion("SDLOCN >=", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLessThan(Object value) {
            addCriterion("SDLOCN <", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnLessThanOrEqualTo(Object value) {
            addCriterion("SDLOCN <=", value, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnIn(List<Object> values) {
            addCriterion("SDLOCN in", values, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotIn(List<Object> values) {
            addCriterion("SDLOCN not in", values, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnBetween(Object value1, Object value2) {
            addCriterion("SDLOCN between", value1, value2, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSdlocnNotBetween(Object value1, Object value2) {
            addCriterion("SDLOCN not between", value1, value2, "sdlocn");
            return (Criteria) this;
        }

        public Criteria andSddl01IsNull() {
            addCriterion("SDDL01 is null");
            return (Criteria) this;
        }

        public Criteria andSddl01IsNotNull() {
            addCriterion("SDDL01 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl01EqualTo(Object value) {
            addCriterion("SDDL01 =", value, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01NotEqualTo(Object value) {
            addCriterion("SDDL01 <>", value, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01GreaterThan(Object value) {
            addCriterion("SDDL01 >", value, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL01 >=", value, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01LessThan(Object value) {
            addCriterion("SDDL01 <", value, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01LessThanOrEqualTo(Object value) {
            addCriterion("SDDL01 <=", value, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01In(List<Object> values) {
            addCriterion("SDDL01 in", values, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01NotIn(List<Object> values) {
            addCriterion("SDDL01 not in", values, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01Between(Object value1, Object value2) {
            addCriterion("SDDL01 between", value1, value2, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSddl01NotBetween(Object value1, Object value2) {
            addCriterion("SDDL01 not between", value1, value2, "sddl01");
            return (Criteria) this;
        }

        public Criteria andSdprp1IsNull() {
            addCriterion("SDPRP1 is null");
            return (Criteria) this;
        }

        public Criteria andSdprp1IsNotNull() {
            addCriterion("SDPRP1 is not null");
            return (Criteria) this;
        }

        public Criteria andSdprp1EqualTo(Object value) {
            addCriterion("SDPRP1 =", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1NotEqualTo(Object value) {
            addCriterion("SDPRP1 <>", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1GreaterThan(Object value) {
            addCriterion("SDPRP1 >", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1GreaterThanOrEqualTo(Object value) {
            addCriterion("SDPRP1 >=", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1LessThan(Object value) {
            addCriterion("SDPRP1 <", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1LessThanOrEqualTo(Object value) {
            addCriterion("SDPRP1 <=", value, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1In(List<Object> values) {
            addCriterion("SDPRP1 in", values, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1NotIn(List<Object> values) {
            addCriterion("SDPRP1 not in", values, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1Between(Object value1, Object value2) {
            addCriterion("SDPRP1 between", value1, value2, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSdprp1NotBetween(Object value1, Object value2) {
            addCriterion("SDPRP1 not between", value1, value2, "sdprp1");
            return (Criteria) this;
        }

        public Criteria andSddl02IsNull() {
            addCriterion("SDDL02 is null");
            return (Criteria) this;
        }

        public Criteria andSddl02IsNotNull() {
            addCriterion("SDDL02 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl02EqualTo(Object value) {
            addCriterion("SDDL02 =", value, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02NotEqualTo(Object value) {
            addCriterion("SDDL02 <>", value, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02GreaterThan(Object value) {
            addCriterion("SDDL02 >", value, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL02 >=", value, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02LessThan(Object value) {
            addCriterion("SDDL02 <", value, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02LessThanOrEqualTo(Object value) {
            addCriterion("SDDL02 <=", value, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02In(List<Object> values) {
            addCriterion("SDDL02 in", values, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02NotIn(List<Object> values) {
            addCriterion("SDDL02 not in", values, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02Between(Object value1, Object value2) {
            addCriterion("SDDL02 between", value1, value2, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl02NotBetween(Object value1, Object value2) {
            addCriterion("SDDL02 not between", value1, value2, "sddl02");
            return (Criteria) this;
        }

        public Criteria andSddl03IsNull() {
            addCriterion("SDDL03 is null");
            return (Criteria) this;
        }

        public Criteria andSddl03IsNotNull() {
            addCriterion("SDDL03 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl03EqualTo(Object value) {
            addCriterion("SDDL03 =", value, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03NotEqualTo(Object value) {
            addCriterion("SDDL03 <>", value, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03GreaterThan(Object value) {
            addCriterion("SDDL03 >", value, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL03 >=", value, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03LessThan(Object value) {
            addCriterion("SDDL03 <", value, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03LessThanOrEqualTo(Object value) {
            addCriterion("SDDL03 <=", value, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03In(List<Object> values) {
            addCriterion("SDDL03 in", values, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03NotIn(List<Object> values) {
            addCriterion("SDDL03 not in", values, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03Between(Object value1, Object value2) {
            addCriterion("SDDL03 between", value1, value2, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl03NotBetween(Object value1, Object value2) {
            addCriterion("SDDL03 not between", value1, value2, "sddl03");
            return (Criteria) this;
        }

        public Criteria andSddl04IsNull() {
            addCriterion("SDDL04 is null");
            return (Criteria) this;
        }

        public Criteria andSddl04IsNotNull() {
            addCriterion("SDDL04 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl04EqualTo(Object value) {
            addCriterion("SDDL04 =", value, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04NotEqualTo(Object value) {
            addCriterion("SDDL04 <>", value, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04GreaterThan(Object value) {
            addCriterion("SDDL04 >", value, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL04 >=", value, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04LessThan(Object value) {
            addCriterion("SDDL04 <", value, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04LessThanOrEqualTo(Object value) {
            addCriterion("SDDL04 <=", value, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04In(List<Object> values) {
            addCriterion("SDDL04 in", values, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04NotIn(List<Object> values) {
            addCriterion("SDDL04 not in", values, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04Between(Object value1, Object value2) {
            addCriterion("SDDL04 between", value1, value2, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSddl04NotBetween(Object value1, Object value2) {
            addCriterion("SDDL04 not between", value1, value2, "sddl04");
            return (Criteria) this;
        }

        public Criteria andSduprcIsNull() {
            addCriterion("SDUPRC is null");
            return (Criteria) this;
        }

        public Criteria andSduprcIsNotNull() {
            addCriterion("SDUPRC is not null");
            return (Criteria) this;
        }

        public Criteria andSduprcEqualTo(BigDecimal value) {
            addCriterion("SDUPRC =", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcNotEqualTo(BigDecimal value) {
            addCriterion("SDUPRC <>", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcGreaterThan(BigDecimal value) {
            addCriterion("SDUPRC >", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUPRC >=", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcLessThan(BigDecimal value) {
            addCriterion("SDUPRC <", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUPRC <=", value, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcIn(List<BigDecimal> values) {
            addCriterion("SDUPRC in", values, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcNotIn(List<BigDecimal> values) {
            addCriterion("SDUPRC not in", values, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUPRC between", value1, value2, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSduprcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUPRC not between", value1, value2, "sduprc");
            return (Criteria) this;
        }

        public Criteria andSdaa1IsNull() {
            addCriterion("SDAA1 is null");
            return (Criteria) this;
        }

        public Criteria andSdaa1IsNotNull() {
            addCriterion("SDAA1 is not null");
            return (Criteria) this;
        }

        public Criteria andSdaa1EqualTo(BigDecimal value) {
            addCriterion("SDAA1 =", value, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1NotEqualTo(BigDecimal value) {
            addCriterion("SDAA1 <>", value, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1GreaterThan(BigDecimal value) {
            addCriterion("SDAA1 >", value, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDAA1 >=", value, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1LessThan(BigDecimal value) {
            addCriterion("SDAA1 <", value, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDAA1 <=", value, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1In(List<BigDecimal> values) {
            addCriterion("SDAA1 in", values, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1NotIn(List<BigDecimal> values) {
            addCriterion("SDAA1 not in", values, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDAA1 between", value1, value2, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdaa1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDAA1 not between", value1, value2, "sdaa1");
            return (Criteria) this;
        }

        public Criteria andSdmcuIsNull() {
            addCriterion("SDMCU is null");
            return (Criteria) this;
        }

        public Criteria andSdmcuIsNotNull() {
            addCriterion("SDMCU is not null");
            return (Criteria) this;
        }

        public Criteria andSdmcuEqualTo(Object value) {
            addCriterion("SDMCU =", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotEqualTo(Object value) {
            addCriterion("SDMCU <>", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuGreaterThan(Object value) {
            addCriterion("SDMCU >", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuGreaterThanOrEqualTo(Object value) {
            addCriterion("SDMCU >=", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLessThan(Object value) {
            addCriterion("SDMCU <", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuLessThanOrEqualTo(Object value) {
            addCriterion("SDMCU <=", value, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuIn(List<Object> values) {
            addCriterion("SDMCU in", values, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotIn(List<Object> values) {
            addCriterion("SDMCU not in", values, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuBetween(Object value1, Object value2) {
            addCriterion("SDMCU between", value1, value2, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSdmcuNotBetween(Object value1, Object value2) {
            addCriterion("SDMCU not between", value1, value2, "sdmcu");
            return (Criteria) this;
        }

        public Criteria andSddcIsNull() {
            addCriterion("SDDC is null");
            return (Criteria) this;
        }

        public Criteria andSddcIsNotNull() {
            addCriterion("SDDC is not null");
            return (Criteria) this;
        }

        public Criteria andSddcEqualTo(Object value) {
            addCriterion("SDDC =", value, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcNotEqualTo(Object value) {
            addCriterion("SDDC <>", value, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcGreaterThan(Object value) {
            addCriterion("SDDC >", value, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcGreaterThanOrEqualTo(Object value) {
            addCriterion("SDDC >=", value, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcLessThan(Object value) {
            addCriterion("SDDC <", value, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcLessThanOrEqualTo(Object value) {
            addCriterion("SDDC <=", value, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcIn(List<Object> values) {
            addCriterion("SDDC in", values, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcNotIn(List<Object> values) {
            addCriterion("SDDC not in", values, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcBetween(Object value1, Object value2) {
            addCriterion("SDDC between", value1, value2, "sddc");
            return (Criteria) this;
        }

        public Criteria andSddcNotBetween(Object value1, Object value2) {
            addCriterion("SDDC not between", value1, value2, "sddc");
            return (Criteria) this;
        }

        public Criteria andSdmcu3IsNull() {
            addCriterion("SDMCU3 is null");
            return (Criteria) this;
        }

        public Criteria andSdmcu3IsNotNull() {
            addCriterion("SDMCU3 is not null");
            return (Criteria) this;
        }

        public Criteria andSdmcu3EqualTo(Object value) {
            addCriterion("SDMCU3 =", value, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3NotEqualTo(Object value) {
            addCriterion("SDMCU3 <>", value, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3GreaterThan(Object value) {
            addCriterion("SDMCU3 >", value, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3GreaterThanOrEqualTo(Object value) {
            addCriterion("SDMCU3 >=", value, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3LessThan(Object value) {
            addCriterion("SDMCU3 <", value, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3LessThanOrEqualTo(Object value) {
            addCriterion("SDMCU3 <=", value, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3In(List<Object> values) {
            addCriterion("SDMCU3 in", values, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3NotIn(List<Object> values) {
            addCriterion("SDMCU3 not in", values, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3Between(Object value1, Object value2) {
            addCriterion("SDMCU3 between", value1, value2, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSdmcu3NotBetween(Object value1, Object value2) {
            addCriterion("SDMCU3 not between", value1, value2, "sdmcu3");
            return (Criteria) this;
        }

        public Criteria andSddc20IsNull() {
            addCriterion("SDDC20 is null");
            return (Criteria) this;
        }

        public Criteria andSddc20IsNotNull() {
            addCriterion("SDDC20 is not null");
            return (Criteria) this;
        }

        public Criteria andSddc20EqualTo(Object value) {
            addCriterion("SDDC20 =", value, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20NotEqualTo(Object value) {
            addCriterion("SDDC20 <>", value, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20GreaterThan(Object value) {
            addCriterion("SDDC20 >", value, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDC20 >=", value, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20LessThan(Object value) {
            addCriterion("SDDC20 <", value, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20LessThanOrEqualTo(Object value) {
            addCriterion("SDDC20 <=", value, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20In(List<Object> values) {
            addCriterion("SDDC20 in", values, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20NotIn(List<Object> values) {
            addCriterion("SDDC20 not in", values, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20Between(Object value1, Object value2) {
            addCriterion("SDDC20 between", value1, value2, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSddc20NotBetween(Object value1, Object value2) {
            addCriterion("SDDC20 not between", value1, value2, "sddc20");
            return (Criteria) this;
        }

        public Criteria andSdlotnIsNull() {
            addCriterion("SDLOTN is null");
            return (Criteria) this;
        }

        public Criteria andSdlotnIsNotNull() {
            addCriterion("SDLOTN is not null");
            return (Criteria) this;
        }

        public Criteria andSdlotnEqualTo(Object value) {
            addCriterion("SDLOTN =", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotEqualTo(Object value) {
            addCriterion("SDLOTN <>", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnGreaterThan(Object value) {
            addCriterion("SDLOTN >", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnGreaterThanOrEqualTo(Object value) {
            addCriterion("SDLOTN >=", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLessThan(Object value) {
            addCriterion("SDLOTN <", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnLessThanOrEqualTo(Object value) {
            addCriterion("SDLOTN <=", value, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnIn(List<Object> values) {
            addCriterion("SDLOTN in", values, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotIn(List<Object> values) {
            addCriterion("SDLOTN not in", values, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnBetween(Object value1, Object value2) {
            addCriterion("SDLOTN between", value1, value2, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdlotnNotBetween(Object value1, Object value2) {
            addCriterion("SDLOTN not between", value1, value2, "sdlotn");
            return (Criteria) this;
        }

        public Criteria andSdvr01IsNull() {
            addCriterion("SDVR01 is null");
            return (Criteria) this;
        }

        public Criteria andSdvr01IsNotNull() {
            addCriterion("SDVR01 is not null");
            return (Criteria) this;
        }

        public Criteria andSdvr01EqualTo(Object value) {
            addCriterion("SDVR01 =", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01NotEqualTo(Object value) {
            addCriterion("SDVR01 <>", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01GreaterThan(Object value) {
            addCriterion("SDVR01 >", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01GreaterThanOrEqualTo(Object value) {
            addCriterion("SDVR01 >=", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01LessThan(Object value) {
            addCriterion("SDVR01 <", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01LessThanOrEqualTo(Object value) {
            addCriterion("SDVR01 <=", value, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01In(List<Object> values) {
            addCriterion("SDVR01 in", values, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01NotIn(List<Object> values) {
            addCriterion("SDVR01 not in", values, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01Between(Object value1, Object value2) {
            addCriterion("SDVR01 between", value1, value2, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSdvr01NotBetween(Object value1, Object value2) {
            addCriterion("SDVR01 not between", value1, value2, "sdvr01");
            return (Criteria) this;
        }

        public Criteria andSddl20IsNull() {
            addCriterion("SDDL20 is null");
            return (Criteria) this;
        }

        public Criteria andSddl20IsNotNull() {
            addCriterion("SDDL20 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl20EqualTo(Object value) {
            addCriterion("SDDL20 =", value, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20NotEqualTo(Object value) {
            addCriterion("SDDL20 <>", value, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20GreaterThan(Object value) {
            addCriterion("SDDL20 >", value, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL20 >=", value, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20LessThan(Object value) {
            addCriterion("SDDL20 <", value, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20LessThanOrEqualTo(Object value) {
            addCriterion("SDDL20 <=", value, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20In(List<Object> values) {
            addCriterion("SDDL20 in", values, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20NotIn(List<Object> values) {
            addCriterion("SDDL20 not in", values, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20Between(Object value1, Object value2) {
            addCriterion("SDDL20 between", value1, value2, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSddl20NotBetween(Object value1, Object value2) {
            addCriterion("SDDL20 not between", value1, value2, "sddl20");
            return (Criteria) this;
        }

        public Criteria andSdremkIsNull() {
            addCriterion("SDREMK is null");
            return (Criteria) this;
        }

        public Criteria andSdremkIsNotNull() {
            addCriterion("SDREMK is not null");
            return (Criteria) this;
        }

        public Criteria andSdremkEqualTo(Object value) {
            addCriterion("SDREMK =", value, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkNotEqualTo(Object value) {
            addCriterion("SDREMK <>", value, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkGreaterThan(Object value) {
            addCriterion("SDREMK >", value, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkGreaterThanOrEqualTo(Object value) {
            addCriterion("SDREMK >=", value, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkLessThan(Object value) {
            addCriterion("SDREMK <", value, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkLessThanOrEqualTo(Object value) {
            addCriterion("SDREMK <=", value, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkIn(List<Object> values) {
            addCriterion("SDREMK in", values, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkNotIn(List<Object> values) {
            addCriterion("SDREMK not in", values, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkBetween(Object value1, Object value2) {
            addCriterion("SDREMK between", value1, value2, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdremkNotBetween(Object value1, Object value2) {
            addCriterion("SDREMK not between", value1, value2, "sdremk");
            return (Criteria) this;
        }

        public Criteria andSdstyeIsNull() {
            addCriterion("SDSTYE is null");
            return (Criteria) this;
        }

        public Criteria andSdstyeIsNotNull() {
            addCriterion("SDSTYE is not null");
            return (Criteria) this;
        }

        public Criteria andSdstyeEqualTo(Object value) {
            addCriterion("SDSTYE =", value, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeNotEqualTo(Object value) {
            addCriterion("SDSTYE <>", value, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeGreaterThan(Object value) {
            addCriterion("SDSTYE >", value, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeGreaterThanOrEqualTo(Object value) {
            addCriterion("SDSTYE >=", value, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeLessThan(Object value) {
            addCriterion("SDSTYE <", value, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeLessThanOrEqualTo(Object value) {
            addCriterion("SDSTYE <=", value, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeIn(List<Object> values) {
            addCriterion("SDSTYE in", values, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeNotIn(List<Object> values) {
            addCriterion("SDSTYE not in", values, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeBetween(Object value1, Object value2) {
            addCriterion("SDSTYE between", value1, value2, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdstyeNotBetween(Object value1, Object value2) {
            addCriterion("SDSTYE not between", value1, value2, "sdstye");
            return (Criteria) this;
        }

        public Criteria andSdn002IsNull() {
            addCriterion("SDN002 is null");
            return (Criteria) this;
        }

        public Criteria andSdn002IsNotNull() {
            addCriterion("SDN002 is not null");
            return (Criteria) this;
        }

        public Criteria andSdn002EqualTo(BigDecimal value) {
            addCriterion("SDN002 =", value, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002NotEqualTo(BigDecimal value) {
            addCriterion("SDN002 <>", value, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002GreaterThan(BigDecimal value) {
            addCriterion("SDN002 >", value, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDN002 >=", value, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002LessThan(BigDecimal value) {
            addCriterion("SDN002 <", value, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDN002 <=", value, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002In(List<BigDecimal> values) {
            addCriterion("SDN002 in", values, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002NotIn(List<BigDecimal> values) {
            addCriterion("SDN002 not in", values, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDN002 between", value1, value2, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdn002NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDN002 not between", value1, value2, "sdn002");
            return (Criteria) this;
        }

        public Criteria andSdedspIsNull() {
            addCriterion("SDEDSP is null");
            return (Criteria) this;
        }

        public Criteria andSdedspIsNotNull() {
            addCriterion("SDEDSP is not null");
            return (Criteria) this;
        }

        public Criteria andSdedspEqualTo(Object value) {
            addCriterion("SDEDSP =", value, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspNotEqualTo(Object value) {
            addCriterion("SDEDSP <>", value, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspGreaterThan(Object value) {
            addCriterion("SDEDSP >", value, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspGreaterThanOrEqualTo(Object value) {
            addCriterion("SDEDSP >=", value, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspLessThan(Object value) {
            addCriterion("SDEDSP <", value, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspLessThanOrEqualTo(Object value) {
            addCriterion("SDEDSP <=", value, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspIn(List<Object> values) {
            addCriterion("SDEDSP in", values, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspNotIn(List<Object> values) {
            addCriterion("SDEDSP not in", values, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspBetween(Object value1, Object value2) {
            addCriterion("SDEDSP between", value1, value2, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSdedspNotBetween(Object value1, Object value2) {
            addCriterion("SDEDSP not between", value1, value2, "sdedsp");
            return (Criteria) this;
        }

        public Criteria andSduserIsNull() {
            addCriterion("SDUSER is null");
            return (Criteria) this;
        }

        public Criteria andSduserIsNotNull() {
            addCriterion("SDUSER is not null");
            return (Criteria) this;
        }

        public Criteria andSduserEqualTo(Object value) {
            addCriterion("SDUSER =", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserNotEqualTo(Object value) {
            addCriterion("SDUSER <>", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserGreaterThan(Object value) {
            addCriterion("SDUSER >", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserGreaterThanOrEqualTo(Object value) {
            addCriterion("SDUSER >=", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserLessThan(Object value) {
            addCriterion("SDUSER <", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserLessThanOrEqualTo(Object value) {
            addCriterion("SDUSER <=", value, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserIn(List<Object> values) {
            addCriterion("SDUSER in", values, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserNotIn(List<Object> values) {
            addCriterion("SDUSER not in", values, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserBetween(Object value1, Object value2) {
            addCriterion("SDUSER between", value1, value2, "sduser");
            return (Criteria) this;
        }

        public Criteria andSduserNotBetween(Object value1, Object value2) {
            addCriterion("SDUSER not between", value1, value2, "sduser");
            return (Criteria) this;
        }

        public Criteria andSdpidIsNull() {
            addCriterion("SDPID is null");
            return (Criteria) this;
        }

        public Criteria andSdpidIsNotNull() {
            addCriterion("SDPID is not null");
            return (Criteria) this;
        }

        public Criteria andSdpidEqualTo(Object value) {
            addCriterion("SDPID =", value, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidNotEqualTo(Object value) {
            addCriterion("SDPID <>", value, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidGreaterThan(Object value) {
            addCriterion("SDPID >", value, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidGreaterThanOrEqualTo(Object value) {
            addCriterion("SDPID >=", value, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidLessThan(Object value) {
            addCriterion("SDPID <", value, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidLessThanOrEqualTo(Object value) {
            addCriterion("SDPID <=", value, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidIn(List<Object> values) {
            addCriterion("SDPID in", values, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidNotIn(List<Object> values) {
            addCriterion("SDPID not in", values, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidBetween(Object value1, Object value2) {
            addCriterion("SDPID between", value1, value2, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdpidNotBetween(Object value1, Object value2) {
            addCriterion("SDPID not between", value1, value2, "sdpid");
            return (Criteria) this;
        }

        public Criteria andSdupmjIsNull() {
            addCriterion("SDUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andSdupmjIsNotNull() {
            addCriterion("SDUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andSdupmjEqualTo(Integer value) {
            addCriterion("SDUPMJ =", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjNotEqualTo(Integer value) {
            addCriterion("SDUPMJ <>", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjGreaterThan(Integer value) {
            addCriterion("SDUPMJ >", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjGreaterThanOrEqualTo(Integer value) {
            addCriterion("SDUPMJ >=", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjLessThan(Integer value) {
            addCriterion("SDUPMJ <", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjLessThanOrEqualTo(Integer value) {
            addCriterion("SDUPMJ <=", value, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjIn(List<Integer> values) {
            addCriterion("SDUPMJ in", values, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjNotIn(List<Integer> values) {
            addCriterion("SDUPMJ not in", values, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjBetween(Integer value1, Integer value2) {
            addCriterion("SDUPMJ between", value1, value2, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmjNotBetween(Integer value1, Integer value2) {
            addCriterion("SDUPMJ not between", value1, value2, "sdupmj");
            return (Criteria) this;
        }

        public Criteria andSdupmtIsNull() {
            addCriterion("SDUPMT is null");
            return (Criteria) this;
        }

        public Criteria andSdupmtIsNotNull() {
            addCriterion("SDUPMT is not null");
            return (Criteria) this;
        }

        public Criteria andSdupmtEqualTo(BigDecimal value) {
            addCriterion("SDUPMT =", value, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtNotEqualTo(BigDecimal value) {
            addCriterion("SDUPMT <>", value, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtGreaterThan(BigDecimal value) {
            addCriterion("SDUPMT >", value, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUPMT >=", value, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtLessThan(BigDecimal value) {
            addCriterion("SDUPMT <", value, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDUPMT <=", value, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtIn(List<BigDecimal> values) {
            addCriterion("SDUPMT in", values, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtNotIn(List<BigDecimal> values) {
            addCriterion("SDUPMT not in", values, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUPMT between", value1, value2, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSdupmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDUPMT not between", value1, value2, "sdupmt");
            return (Criteria) this;
        }

        public Criteria andSddl26IsNull() {
            addCriterion("SDDL26 is null");
            return (Criteria) this;
        }

        public Criteria andSddl26IsNotNull() {
            addCriterion("SDDL26 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl26EqualTo(Object value) {
            addCriterion("SDDL26 =", value, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26NotEqualTo(Object value) {
            addCriterion("SDDL26 <>", value, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26GreaterThan(Object value) {
            addCriterion("SDDL26 >", value, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL26 >=", value, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26LessThan(Object value) {
            addCriterion("SDDL26 <", value, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26LessThanOrEqualTo(Object value) {
            addCriterion("SDDL26 <=", value, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26In(List<Object> values) {
            addCriterion("SDDL26 in", values, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26NotIn(List<Object> values) {
            addCriterion("SDDL26 not in", values, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26Between(Object value1, Object value2) {
            addCriterion("SDDL26 between", value1, value2, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl26NotBetween(Object value1, Object value2) {
            addCriterion("SDDL26 not between", value1, value2, "sddl26");
            return (Criteria) this;
        }

        public Criteria andSddl27IsNull() {
            addCriterion("SDDL27 is null");
            return (Criteria) this;
        }

        public Criteria andSddl27IsNotNull() {
            addCriterion("SDDL27 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl27EqualTo(Object value) {
            addCriterion("SDDL27 =", value, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27NotEqualTo(Object value) {
            addCriterion("SDDL27 <>", value, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27GreaterThan(Object value) {
            addCriterion("SDDL27 >", value, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL27 >=", value, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27LessThan(Object value) {
            addCriterion("SDDL27 <", value, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27LessThanOrEqualTo(Object value) {
            addCriterion("SDDL27 <=", value, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27In(List<Object> values) {
            addCriterion("SDDL27 in", values, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27NotIn(List<Object> values) {
            addCriterion("SDDL27 not in", values, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27Between(Object value1, Object value2) {
            addCriterion("SDDL27 between", value1, value2, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl27NotBetween(Object value1, Object value2) {
            addCriterion("SDDL27 not between", value1, value2, "sddl27");
            return (Criteria) this;
        }

        public Criteria andSddl28IsNull() {
            addCriterion("SDDL28 is null");
            return (Criteria) this;
        }

        public Criteria andSddl28IsNotNull() {
            addCriterion("SDDL28 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl28EqualTo(Object value) {
            addCriterion("SDDL28 =", value, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28NotEqualTo(Object value) {
            addCriterion("SDDL28 <>", value, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28GreaterThan(Object value) {
            addCriterion("SDDL28 >", value, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL28 >=", value, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28LessThan(Object value) {
            addCriterion("SDDL28 <", value, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28LessThanOrEqualTo(Object value) {
            addCriterion("SDDL28 <=", value, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28In(List<Object> values) {
            addCriterion("SDDL28 in", values, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28NotIn(List<Object> values) {
            addCriterion("SDDL28 not in", values, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28Between(Object value1, Object value2) {
            addCriterion("SDDL28 between", value1, value2, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl28NotBetween(Object value1, Object value2) {
            addCriterion("SDDL28 not between", value1, value2, "sddl28");
            return (Criteria) this;
        }

        public Criteria andSddl29IsNull() {
            addCriterion("SDDL29 is null");
            return (Criteria) this;
        }

        public Criteria andSddl29IsNotNull() {
            addCriterion("SDDL29 is not null");
            return (Criteria) this;
        }

        public Criteria andSddl29EqualTo(Object value) {
            addCriterion("SDDL29 =", value, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29NotEqualTo(Object value) {
            addCriterion("SDDL29 <>", value, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29GreaterThan(Object value) {
            addCriterion("SDDL29 >", value, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDL29 >=", value, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29LessThan(Object value) {
            addCriterion("SDDL29 <", value, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29LessThanOrEqualTo(Object value) {
            addCriterion("SDDL29 <=", value, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29In(List<Object> values) {
            addCriterion("SDDL29 in", values, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29NotIn(List<Object> values) {
            addCriterion("SDDL29 not in", values, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29Between(Object value1, Object value2) {
            addCriterion("SDDL29 between", value1, value2, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddl29NotBetween(Object value1, Object value2) {
            addCriterion("SDDL29 not between", value1, value2, "sddl29");
            return (Criteria) this;
        }

        public Criteria andSddate01IsNull() {
            addCriterion("SDDATE01 is null");
            return (Criteria) this;
        }

        public Criteria andSddate01IsNotNull() {
            addCriterion("SDDATE01 is not null");
            return (Criteria) this;
        }

        public Criteria andSddate01EqualTo(Integer value) {
            addCriterion("SDDATE01 =", value, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01NotEqualTo(Integer value) {
            addCriterion("SDDATE01 <>", value, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01GreaterThan(Integer value) {
            addCriterion("SDDATE01 >", value, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01GreaterThanOrEqualTo(Integer value) {
            addCriterion("SDDATE01 >=", value, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01LessThan(Integer value) {
            addCriterion("SDDATE01 <", value, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01LessThanOrEqualTo(Integer value) {
            addCriterion("SDDATE01 <=", value, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01In(List<Integer> values) {
            addCriterion("SDDATE01 in", values, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01NotIn(List<Integer> values) {
            addCriterion("SDDATE01 not in", values, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01Between(Integer value1, Integer value2) {
            addCriterion("SDDATE01 between", value1, value2, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate01NotBetween(Integer value1, Integer value2) {
            addCriterion("SDDATE01 not between", value1, value2, "sddate01");
            return (Criteria) this;
        }

        public Criteria andSddate02IsNull() {
            addCriterion("SDDATE02 is null");
            return (Criteria) this;
        }

        public Criteria andSddate02IsNotNull() {
            addCriterion("SDDATE02 is not null");
            return (Criteria) this;
        }

        public Criteria andSddate02EqualTo(Integer value) {
            addCriterion("SDDATE02 =", value, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02NotEqualTo(Integer value) {
            addCriterion("SDDATE02 <>", value, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02GreaterThan(Integer value) {
            addCriterion("SDDATE02 >", value, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02GreaterThanOrEqualTo(Integer value) {
            addCriterion("SDDATE02 >=", value, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02LessThan(Integer value) {
            addCriterion("SDDATE02 <", value, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02LessThanOrEqualTo(Integer value) {
            addCriterion("SDDATE02 <=", value, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02In(List<Integer> values) {
            addCriterion("SDDATE02 in", values, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02NotIn(List<Integer> values) {
            addCriterion("SDDATE02 not in", values, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02Between(Integer value1, Integer value2) {
            addCriterion("SDDATE02 between", value1, value2, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSddate02NotBetween(Integer value1, Integer value2) {
            addCriterion("SDDATE02 not between", value1, value2, "sddate02");
            return (Criteria) this;
        }

        public Criteria andSdlocne1IsNull() {
            addCriterion("SDLOCNE1 is null");
            return (Criteria) this;
        }

        public Criteria andSdlocne1IsNotNull() {
            addCriterion("SDLOCNE1 is not null");
            return (Criteria) this;
        }

        public Criteria andSdlocne1EqualTo(Object value) {
            addCriterion("SDLOCNE1 =", value, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1NotEqualTo(Object value) {
            addCriterion("SDLOCNE1 <>", value, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1GreaterThan(Object value) {
            addCriterion("SDLOCNE1 >", value, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1GreaterThanOrEqualTo(Object value) {
            addCriterion("SDLOCNE1 >=", value, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1LessThan(Object value) {
            addCriterion("SDLOCNE1 <", value, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1LessThanOrEqualTo(Object value) {
            addCriterion("SDLOCNE1 <=", value, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1In(List<Object> values) {
            addCriterion("SDLOCNE1 in", values, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1NotIn(List<Object> values) {
            addCriterion("SDLOCNE1 not in", values, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1Between(Object value1, Object value2) {
            addCriterion("SDLOCNE1 between", value1, value2, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSdlocne1NotBetween(Object value1, Object value2) {
            addCriterion("SDLOCNE1 not between", value1, value2, "sdlocne1");
            return (Criteria) this;
        }

        public Criteria andSddsc2IsNull() {
            addCriterion("SDDSC2 is null");
            return (Criteria) this;
        }

        public Criteria andSddsc2IsNotNull() {
            addCriterion("SDDSC2 is not null");
            return (Criteria) this;
        }

        public Criteria andSddsc2EqualTo(Object value) {
            addCriterion("SDDSC2 =", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2NotEqualTo(Object value) {
            addCriterion("SDDSC2 <>", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2GreaterThan(Object value) {
            addCriterion("SDDSC2 >", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2GreaterThanOrEqualTo(Object value) {
            addCriterion("SDDSC2 >=", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2LessThan(Object value) {
            addCriterion("SDDSC2 <", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2LessThanOrEqualTo(Object value) {
            addCriterion("SDDSC2 <=", value, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2In(List<Object> values) {
            addCriterion("SDDSC2 in", values, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2NotIn(List<Object> values) {
            addCriterion("SDDSC2 not in", values, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2Between(Object value1, Object value2) {
            addCriterion("SDDSC2 between", value1, value2, "sddsc2");
            return (Criteria) this;
        }

        public Criteria andSddsc2NotBetween(Object value1, Object value2) {
            addCriterion("SDDSC2 not between", value1, value2, "sddsc2");
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