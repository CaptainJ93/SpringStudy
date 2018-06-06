package com.best1.api.entity.crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcrmCustomeraccountdetailsExample {
 
    protected String orderByClause;
 
    protected boolean distinct;
 
    protected List<Criteria> oredCriteria;
 
    public TcrmCustomeraccountdetailsExample() {
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

        public Criteria andAccountnumberIsNull() {
            addCriterion("ACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNotNull() {
            addCriterion("ACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER =", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER <>", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThan(Long value) {
            addCriterion("ACCOUNTNUMBER >", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER >=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThan(Long value) {
            addCriterion("ACCOUNTNUMBER <", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER <=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIn(List<Long> values) {
            addCriterion("ACCOUNTNUMBER in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotIn(List<Long> values) {
            addCriterion("ACCOUNTNUMBER not in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTNUMBER between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTNUMBER not between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidIsNull() {
            addCriterion("ACCOUNTTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidIsNotNull() {
            addCriterion("ACCOUNTTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID =", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidNotEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID <>", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidGreaterThan(Integer value) {
            addCriterion("ACCOUNTTYPEID >", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID >=", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidLessThan(Integer value) {
            addCriterion("ACCOUNTTYPEID <", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID <=", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidIn(List<Integer> values) {
            addCriterion("ACCOUNTTYPEID in", values, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidNotIn(List<Integer> values) {
            addCriterion("ACCOUNTTYPEID not in", values, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTTYPEID between", value1, value2, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTTYPEID not between", value1, value2, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Long value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Long value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Long value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Long value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Long value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Long> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Long> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Long value1, Long value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Long value1, Long value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoIsNull() {
            addCriterion("SOURCECONVACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoIsNotNull() {
            addCriterion("SOURCECONVACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoEqualTo(Long value) {
            addCriterion("SOURCECONVACCOUNTNO =", value, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoNotEqualTo(Long value) {
            addCriterion("SOURCECONVACCOUNTNO <>", value, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoGreaterThan(Long value) {
            addCriterion("SOURCECONVACCOUNTNO >", value, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SOURCECONVACCOUNTNO >=", value, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoLessThan(Long value) {
            addCriterion("SOURCECONVACCOUNTNO <", value, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoLessThanOrEqualTo(Long value) {
            addCriterion("SOURCECONVACCOUNTNO <=", value, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoIn(List<Long> values) {
            addCriterion("SOURCECONVACCOUNTNO in", values, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoNotIn(List<Long> values) {
            addCriterion("SOURCECONVACCOUNTNO not in", values, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoBetween(Long value1, Long value2) {
            addCriterion("SOURCECONVACCOUNTNO between", value1, value2, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconvaccountnoNotBetween(Long value1, Long value2) {
            addCriterion("SOURCECONVACCOUNTNO not between", value1, value2, "sourceconvaccountno");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorIsNull() {
            addCriterion("SOURCECONVERSIONFACTOR is null");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorIsNotNull() {
            addCriterion("SOURCECONVERSIONFACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorEqualTo(Long value) {
            addCriterion("SOURCECONVERSIONFACTOR =", value, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorNotEqualTo(Long value) {
            addCriterion("SOURCECONVERSIONFACTOR <>", value, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorGreaterThan(Long value) {
            addCriterion("SOURCECONVERSIONFACTOR >", value, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorGreaterThanOrEqualTo(Long value) {
            addCriterion("SOURCECONVERSIONFACTOR >=", value, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorLessThan(Long value) {
            addCriterion("SOURCECONVERSIONFACTOR <", value, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorLessThanOrEqualTo(Long value) {
            addCriterion("SOURCECONVERSIONFACTOR <=", value, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorIn(List<Long> values) {
            addCriterion("SOURCECONVERSIONFACTOR in", values, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorNotIn(List<Long> values) {
            addCriterion("SOURCECONVERSIONFACTOR not in", values, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorBetween(Long value1, Long value2) {
            addCriterion("SOURCECONVERSIONFACTOR between", value1, value2, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andSourceconversionfactorNotBetween(Long value1, Long value2) {
            addCriterion("SOURCECONVERSIONFACTOR not between", value1, value2, "sourceconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorIsNull() {
            addCriterion("TARGETCONVERSIONFACTOR is null");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorIsNotNull() {
            addCriterion("TARGETCONVERSIONFACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorEqualTo(Long value) {
            addCriterion("TARGETCONVERSIONFACTOR =", value, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorNotEqualTo(Long value) {
            addCriterion("TARGETCONVERSIONFACTOR <>", value, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorGreaterThan(Long value) {
            addCriterion("TARGETCONVERSIONFACTOR >", value, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorGreaterThanOrEqualTo(Long value) {
            addCriterion("TARGETCONVERSIONFACTOR >=", value, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorLessThan(Long value) {
            addCriterion("TARGETCONVERSIONFACTOR <", value, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorLessThanOrEqualTo(Long value) {
            addCriterion("TARGETCONVERSIONFACTOR <=", value, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorIn(List<Long> values) {
            addCriterion("TARGETCONVERSIONFACTOR in", values, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorNotIn(List<Long> values) {
            addCriterion("TARGETCONVERSIONFACTOR not in", values, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorBetween(Long value1, Long value2) {
            addCriterion("TARGETCONVERSIONFACTOR between", value1, value2, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andTargetconversionfactorNotBetween(Long value1, Long value2) {
            addCriterion("TARGETCONVERSIONFACTOR not between", value1, value2, "targetconversionfactor");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("ACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("ACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("ACCOUNTNAME =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("ACCOUNTNAME <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("ACCOUNTNAME >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("ACCOUNTNAME <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("ACCOUNTNAME like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("ACCOUNTNAME not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("ACCOUNTNAME in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("ACCOUNTNAME not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CREATEDBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CREATEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("CREATEDBY =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("CREATEDBY <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("CREATEDBY >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATEDBY >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("CREATEDBY <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("CREATEDBY <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("CREATEDBY in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("CREATEDBY not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("CREATEDBY between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("CREATEDBY not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIsNull() {
            addCriterion("CREATEDTIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIsNotNull() {
            addCriterion("CREATEDTIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP =", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP <>", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampGreaterThan(Date value) {
            addCriterion("CREATEDTIMESTAMP >", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP >=", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampLessThan(Date value) {
            addCriterion("CREATEDTIMESTAMP <", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP <=", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIn(List<Date> values) {
            addCriterion("CREATEDTIMESTAMP in", values, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotIn(List<Date> values) {
            addCriterion("CREATEDTIMESTAMP not in", values, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampBetween(Date value1, Date value2) {
            addCriterion("CREATEDTIMESTAMP between", value1, value2, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDTIMESTAMP not between", value1, value2, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNull() {
            addCriterion("LASTMODIFIEDBY is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNotNull() {
            addCriterion("LASTMODIFIEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY =", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY <>", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThan(Long value) {
            addCriterion("LASTMODIFIEDBY >", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY >=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThan(Long value) {
            addCriterion("LASTMODIFIEDBY <", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThanOrEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY <=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIn(List<Long> values) {
            addCriterion("LASTMODIFIEDBY in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotIn(List<Long> values) {
            addCriterion("LASTMODIFIEDBY not in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyBetween(Long value1, Long value2) {
            addCriterion("LASTMODIFIEDBY between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotBetween(Long value1, Long value2) {
            addCriterion("LASTMODIFIEDBY not between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIsNull() {
            addCriterion("LASTMODIFIEDTIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIsNotNull() {
            addCriterion("LASTMODIFIEDTIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP =", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <>", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampGreaterThan(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP >", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP >=", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampLessThan(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <=", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIn(List<Date> values) {
            addCriterion("LASTMODIFIEDTIMESTAMP in", values, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotIn(List<Date> values) {
            addCriterion("LASTMODIFIEDTIMESTAMP not in", values, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDTIMESTAMP between", value1, value2, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDTIMESTAMP not between", value1, value2, "lastmodifiedtimestamp");
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