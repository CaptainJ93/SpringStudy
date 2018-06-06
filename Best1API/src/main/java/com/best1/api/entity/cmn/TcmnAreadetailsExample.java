package com.best1.api.entity.cmn;


import java.util.ArrayList;
import java.util.List;

public class TcmnAreadetailsExample {

    protected String orderByClause;


    protected boolean distinct;


    protected List<Criteria> oredCriteria;

 
    public TcmnAreadetailsExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("AREAID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AREAID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Long value) {
            addCriterion("AREAID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Long value) {
            addCriterion("AREAID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Long value) {
            addCriterion("AREAID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Long value) {
            addCriterion("AREAID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Long value) {
            addCriterion("AREAID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Long value) {
            addCriterion("AREAID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Long> values) {
            addCriterion("AREAID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Long> values) {
            addCriterion("AREAID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Long value1, Long value2) {
            addCriterion("AREAID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Long value1, Long value2) {
            addCriterion("AREAID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Integer value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Integer value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Integer value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Integer value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Integer> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Integer> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeIsNull() {
            addCriterion("TELPHONECODE is null");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeIsNotNull() {
            addCriterion("TELPHONECODE is not null");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeEqualTo(String value) {
            addCriterion("TELPHONECODE =", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeNotEqualTo(String value) {
            addCriterion("TELPHONECODE <>", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeGreaterThan(String value) {
            addCriterion("TELPHONECODE >", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeGreaterThanOrEqualTo(String value) {
            addCriterion("TELPHONECODE >=", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeLessThan(String value) {
            addCriterion("TELPHONECODE <", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeLessThanOrEqualTo(String value) {
            addCriterion("TELPHONECODE <=", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeLike(String value) {
            addCriterion("TELPHONECODE like", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeNotLike(String value) {
            addCriterion("TELPHONECODE not like", value, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeIn(List<String> values) {
            addCriterion("TELPHONECODE in", values, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeNotIn(List<String> values) {
            addCriterion("TELPHONECODE not in", values, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeBetween(String value1, String value2) {
            addCriterion("TELPHONECODE between", value1, value2, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andTelphonecodeNotBetween(String value1, String value2) {
            addCriterion("TELPHONECODE not between", value1, value2, "telphonecode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeIsNull() {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE is null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeIsNotNull() {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeEqualTo(Integer value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE =", value, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeNotEqualTo(Integer value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE <>", value, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeGreaterThan(Integer value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE >", value, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE >=", value, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeLessThan(Integer value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE <", value, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeLessThanOrEqualTo(Integer value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE <=", value, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeIn(List<Integer> values) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE in", values, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeNotIn(List<Integer> values) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE not in", values, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeBetween(Integer value1, Integer value2) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE between", value1, value2, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodeNotBetween(Integer value1, Integer value2) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODE not between", value1, value2, "offshoredeliverystatuscode");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandIsNull() {
            addCriterion("OFFSHOREISLAND is null");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandIsNotNull() {
            addCriterion("OFFSHOREISLAND is not null");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandEqualTo(String value) {
            addCriterion("OFFSHOREISLAND =", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandNotEqualTo(String value) {
            addCriterion("OFFSHOREISLAND <>", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandGreaterThan(String value) {
            addCriterion("OFFSHOREISLAND >", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSHOREISLAND >=", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandLessThan(String value) {
            addCriterion("OFFSHOREISLAND <", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandLessThanOrEqualTo(String value) {
            addCriterion("OFFSHOREISLAND <=", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandLike(String value) {
            addCriterion("OFFSHOREISLAND like", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandNotLike(String value) {
            addCriterion("OFFSHOREISLAND not like", value, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandIn(List<String> values) {
            addCriterion("OFFSHOREISLAND in", values, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandNotIn(List<String> values) {
            addCriterion("OFFSHOREISLAND not in", values, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandBetween(String value1, String value2) {
            addCriterion("OFFSHOREISLAND between", value1, value2, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andOffshoreislandNotBetween(String value1, String value2) {
            addCriterion("OFFSHOREISLAND not between", value1, value2, "offshoreisland");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AREANAME is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AREANAME =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AREANAME <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AREANAME >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AREANAME >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AREANAME <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AREANAME <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AREANAME like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AREANAME not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AREANAME in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AREANAME not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AREANAME between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AREANAME not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAddresslineIsNull() {
            addCriterion("ADDRESSLINE is null");
            return (Criteria) this;
        }

        public Criteria andAddresslineIsNotNull() {
            addCriterion("ADDRESSLINE is not null");
            return (Criteria) this;
        }

        public Criteria andAddresslineEqualTo(String value) {
            addCriterion("ADDRESSLINE =", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineNotEqualTo(String value) {
            addCriterion("ADDRESSLINE <>", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineGreaterThan(String value) {
            addCriterion("ADDRESSLINE >", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESSLINE >=", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineLessThan(String value) {
            addCriterion("ADDRESSLINE <", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineLessThanOrEqualTo(String value) {
            addCriterion("ADDRESSLINE <=", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineLike(String value) {
            addCriterion("ADDRESSLINE like", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineNotLike(String value) {
            addCriterion("ADDRESSLINE not like", value, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineIn(List<String> values) {
            addCriterion("ADDRESSLINE in", values, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineNotIn(List<String> values) {
            addCriterion("ADDRESSLINE not in", values, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineBetween(String value1, String value2) {
            addCriterion("ADDRESSLINE between", value1, value2, "addressline");
            return (Criteria) this;
        }

        public Criteria andAddresslineNotBetween(String value1, String value2) {
            addCriterion("ADDRESSLINE not between", value1, value2, "addressline");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescIsNull() {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC is null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescIsNotNull() {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC =", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescNotEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC <>", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescGreaterThan(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC >", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC >=", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescLessThan(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC <", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescLessThanOrEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC <=", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescLike(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC like", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescNotLike(String value) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC not like", value, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescIn(List<String> values) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC in", values, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescNotIn(List<String> values) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC not in", values, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescBetween(String value1, String value2) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC between", value1, value2, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliverystatuscodedescNotBetween(String value1, String value2) {
            addCriterion("OFFSHOREDELIVERYSTATUSCODEDESC not between", value1, value2, "offshoredeliverystatuscodedesc");
            return (Criteria) this;
        }

        public Criteria andOnedayshipIsNull() {
            addCriterion("ONEDAYSHIP is null");
            return (Criteria) this;
        }

        public Criteria andOnedayshipIsNotNull() {
            addCriterion("ONEDAYSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andOnedayshipEqualTo(String value) {
            addCriterion("ONEDAYSHIP =", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipNotEqualTo(String value) {
            addCriterion("ONEDAYSHIP <>", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipGreaterThan(String value) {
            addCriterion("ONEDAYSHIP >", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipGreaterThanOrEqualTo(String value) {
            addCriterion("ONEDAYSHIP >=", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipLessThan(String value) {
            addCriterion("ONEDAYSHIP <", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipLessThanOrEqualTo(String value) {
            addCriterion("ONEDAYSHIP <=", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipLike(String value) {
            addCriterion("ONEDAYSHIP like", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipNotLike(String value) {
            addCriterion("ONEDAYSHIP not like", value, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipIn(List<String> values) {
            addCriterion("ONEDAYSHIP in", values, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipNotIn(List<String> values) {
            addCriterion("ONEDAYSHIP not in", values, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipBetween(String value1, String value2) {
            addCriterion("ONEDAYSHIP between", value1, value2, "onedayship");
            return (Criteria) this;
        }

        public Criteria andOnedayshipNotBetween(String value1, String value2) {
            addCriterion("ONEDAYSHIP not between", value1, value2, "onedayship");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("ZIPCODE =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("ZIPCODE <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("ZIPCODE >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIPCODE >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("ZIPCODE <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("ZIPCODE <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("ZIPCODE like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("ZIPCODE not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("ZIPCODE in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("ZIPCODE not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("ZIPCODE between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("ZIPCODE not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNull() {
            addCriterion("AREALEVEL is null");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNotNull() {
            addCriterion("AREALEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andArealevelEqualTo(Long value) {
            addCriterion("AREALEVEL =", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotEqualTo(Long value) {
            addCriterion("AREALEVEL <>", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThan(Long value) {
            addCriterion("AREALEVEL >", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThanOrEqualTo(Long value) {
            addCriterion("AREALEVEL >=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThan(Long value) {
            addCriterion("AREALEVEL <", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThanOrEqualTo(Long value) {
            addCriterion("AREALEVEL <=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelIn(List<Long> values) {
            addCriterion("AREALEVEL in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotIn(List<Long> values) {
            addCriterion("AREALEVEL not in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelBetween(Long value1, Long value2) {
            addCriterion("AREALEVEL between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotBetween(Long value1, Long value2) {
            addCriterion("AREALEVEL not between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andAreaorderIsNull() {
            addCriterion("AREAORDER is null");
            return (Criteria) this;
        }

        public Criteria andAreaorderIsNotNull() {
            addCriterion("AREAORDER is not null");
            return (Criteria) this;
        }

        public Criteria andAreaorderEqualTo(Long value) {
            addCriterion("AREAORDER =", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderNotEqualTo(Long value) {
            addCriterion("AREAORDER <>", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderGreaterThan(Long value) {
            addCriterion("AREAORDER >", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderGreaterThanOrEqualTo(Long value) {
            addCriterion("AREAORDER >=", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderLessThan(Long value) {
            addCriterion("AREAORDER <", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderLessThanOrEqualTo(Long value) {
            addCriterion("AREAORDER <=", value, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderIn(List<Long> values) {
            addCriterion("AREAORDER in", values, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderNotIn(List<Long> values) {
            addCriterion("AREAORDER not in", values, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderBetween(Long value1, Long value2) {
            addCriterion("AREAORDER between", value1, value2, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreaorderNotBetween(Long value1, Long value2) {
            addCriterion("AREAORDER not between", value1, value2, "areaorder");
            return (Criteria) this;
        }

        public Criteria andAreanameenIsNull() {
            addCriterion("AREANAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andAreanameenIsNotNull() {
            addCriterion("AREANAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameenEqualTo(String value) {
            addCriterion("AREANAMEEN =", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenNotEqualTo(String value) {
            addCriterion("AREANAMEEN <>", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenGreaterThan(String value) {
            addCriterion("AREANAMEEN >", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenGreaterThanOrEqualTo(String value) {
            addCriterion("AREANAMEEN >=", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenLessThan(String value) {
            addCriterion("AREANAMEEN <", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenLessThanOrEqualTo(String value) {
            addCriterion("AREANAMEEN <=", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenLike(String value) {
            addCriterion("AREANAMEEN like", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenNotLike(String value) {
            addCriterion("AREANAMEEN not like", value, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenIn(List<String> values) {
            addCriterion("AREANAMEEN in", values, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenNotIn(List<String> values) {
            addCriterion("AREANAMEEN not in", values, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenBetween(String value1, String value2) {
            addCriterion("AREANAMEEN between", value1, value2, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreanameenNotBetween(String value1, String value2) {
            addCriterion("AREANAMEEN not between", value1, value2, "areanameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenIsNull() {
            addCriterion("AREAIntegerNAMEEN is null");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenIsNotNull() {
            addCriterion("AREAIntegerNAMEEN is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenEqualTo(String value) {
            addCriterion("AREAIntegerNAMEEN =", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenNotEqualTo(String value) {
            addCriterion("AREAIntegerNAMEEN <>", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenGreaterThan(String value) {
            addCriterion("AREAIntegerNAMEEN >", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenGreaterThanOrEqualTo(String value) {
            addCriterion("AREAIntegerNAMEEN >=", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenLessThan(String value) {
            addCriterion("AREAIntegerNAMEEN <", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenLessThanOrEqualTo(String value) {
            addCriterion("AREAIntegerNAMEEN <=", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenLike(String value) {
            addCriterion("AREAIntegerNAMEEN like", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenNotLike(String value) {
            addCriterion("AREAIntegerNAMEEN not like", value, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenIn(List<String> values) {
            addCriterion("AREAIntegerNAMEEN in", values, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenNotIn(List<String> values) {
            addCriterion("AREAIntegerNAMEEN not in", values, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenBetween(String value1, String value2) {
            addCriterion("AREAIntegerNAMEEN between", value1, value2, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAreaIntegernameenNotBetween(String value1, String value2) {
            addCriterion("AREAIntegerNAMEEN not between", value1, value2, "areaIntegernameen");
            return (Criteria) this;
        }

        public Criteria andAdcodeIsNull() {
            addCriterion("ADCODE is null");
            return (Criteria) this;
        }

        public Criteria andAdcodeIsNotNull() {
            addCriterion("ADCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAdcodeEqualTo(String value) {
            addCriterion("ADCODE =", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeNotEqualTo(String value) {
            addCriterion("ADCODE <>", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeGreaterThan(String value) {
            addCriterion("ADCODE >", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ADCODE >=", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeLessThan(String value) {
            addCriterion("ADCODE <", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeLessThanOrEqualTo(String value) {
            addCriterion("ADCODE <=", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeLike(String value) {
            addCriterion("ADCODE like", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeNotLike(String value) {
            addCriterion("ADCODE not like", value, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeIn(List<String> values) {
            addCriterion("ADCODE in", values, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeNotIn(List<String> values) {
            addCriterion("ADCODE not in", values, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeBetween(String value1, String value2) {
            addCriterion("ADCODE between", value1, value2, "adcode");
            return (Criteria) this;
        }

        public Criteria andAdcodeNotBetween(String value1, String value2) {
            addCriterion("ADCODE not between", value1, value2, "adcode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("CITYCODE =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("CITYCODE <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("CITYCODE >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITYCODE >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("CITYCODE <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("CITYCODE <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("CITYCODE like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("CITYCODE not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("CITYCODE in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("CITYCODE not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("CITYCODE between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("CITYCODE not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andAppcodeIsNull() {
            addCriterion("APPCODE is null");
            return (Criteria) this;
        }

        public Criteria andAppcodeIsNotNull() {
            addCriterion("APPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAppcodeEqualTo(Integer value) {
            addCriterion("APPCODE =", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotEqualTo(Integer value) {
            addCriterion("APPCODE <>", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeGreaterThan(Integer value) {
            addCriterion("APPCODE >", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPCODE >=", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLessThan(Integer value) {
            addCriterion("APPCODE <", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLessThanOrEqualTo(Integer value) {
            addCriterion("APPCODE <=", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeIn(List<Integer> values) {
            addCriterion("APPCODE in", values, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotIn(List<Integer> values) {
            addCriterion("APPCODE not in", values, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeBetween(Integer value1, Integer value2) {
            addCriterion("APPCODE between", value1, value2, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("APPCODE not between", value1, value2, "appcode");
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