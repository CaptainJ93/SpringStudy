package com.best1.api.entity.scm.supplier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TscmSupplieraddressExample {
   
    protected String orderByClause;

 
    protected boolean distinct;

  
    protected List<Criteria> oredCriteria;

  
    public TscmSupplieraddressExample() {
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

        public Criteria andSupplieridIsNull() {
            addCriterion("SUPPLIERID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SUPPLIERID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Long value) {
            addCriterion("SUPPLIERID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Long value) {
            addCriterion("SUPPLIERID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Long value) {
            addCriterion("SUPPLIERID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Long value) {
            addCriterion("SUPPLIERID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Long> values) {
            addCriterion("SUPPLIERID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Long> values) {
            addCriterion("SUPPLIERID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andAddresstypeIsNull() {
            addCriterion("ADDRESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAddresstypeIsNotNull() {
            addCriterion("ADDRESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAddresstypeEqualTo(Integer value) {
            addCriterion("ADDRESSTYPE =", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeNotEqualTo(Integer value) {
            addCriterion("ADDRESSTYPE <>", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeGreaterThan(Integer value) {
            addCriterion("ADDRESSTYPE >", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADDRESSTYPE >=", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeLessThan(Integer value) {
            addCriterion("ADDRESSTYPE <", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeLessThanOrEqualTo(Integer value) {
            addCriterion("ADDRESSTYPE <=", value, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeIn(List<Integer> values) {
            addCriterion("ADDRESSTYPE in", values, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeNotIn(List<Integer> values) {
            addCriterion("ADDRESSTYPE not in", values, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESSTYPE between", value1, value2, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESSTYPE not between", value1, value2, "addresstype");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceIsNull() {
            addCriterion("ADDRESSSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceIsNotNull() {
            addCriterion("ADDRESSSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceEqualTo(Integer value) {
            addCriterion("ADDRESSSEQUENCE =", value, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceNotEqualTo(Integer value) {
            addCriterion("ADDRESSSEQUENCE <>", value, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceGreaterThan(Integer value) {
            addCriterion("ADDRESSSEQUENCE >", value, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADDRESSSEQUENCE >=", value, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceLessThan(Integer value) {
            addCriterion("ADDRESSSEQUENCE <", value, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceLessThanOrEqualTo(Integer value) {
            addCriterion("ADDRESSSEQUENCE <=", value, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceIn(List<Integer> values) {
            addCriterion("ADDRESSSEQUENCE in", values, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceNotIn(List<Integer> values) {
            addCriterion("ADDRESSSEQUENCE not in", values, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESSSEQUENCE between", value1, value2, "addresssequence");
            return (Criteria) this;
        }

        public Criteria andAddresssequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESSSEQUENCE not between", value1, value2, "addresssequence");
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

        public Criteria andAddress2IsNull() {
            addCriterion("ADDRESS2 is null");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNotNull() {
            addCriterion("ADDRESS2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress2EqualTo(String value) {
            addCriterion("ADDRESS2 =", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotEqualTo(String value) {
            addCriterion("ADDRESS2 <>", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThan(String value) {
            addCriterion("ADDRESS2 >", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS2 >=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThan(String value) {
            addCriterion("ADDRESS2 <", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS2 <=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Like(String value) {
            addCriterion("ADDRESS2 like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotLike(String value) {
            addCriterion("ADDRESS2 not like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2In(List<String> values) {
            addCriterion("ADDRESS2 in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotIn(List<String> values) {
            addCriterion("ADDRESS2 not in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Between(String value1, String value2) {
            addCriterion("ADDRESS2 between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotBetween(String value1, String value2) {
            addCriterion("ADDRESS2 not between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNull() {
            addCriterion("ADDRESS1 is null");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNotNull() {
            addCriterion("ADDRESS1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress1EqualTo(String value) {
            addCriterion("ADDRESS1 =", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotEqualTo(String value) {
            addCriterion("ADDRESS1 <>", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThan(String value) {
            addCriterion("ADDRESS1 >", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS1 >=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThan(String value) {
            addCriterion("ADDRESS1 <", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS1 <=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Like(String value) {
            addCriterion("ADDRESS1 like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotLike(String value) {
            addCriterion("ADDRESS1 not like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1In(List<String> values) {
            addCriterion("ADDRESS1 in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotIn(List<String> values) {
            addCriterion("ADDRESS1 not in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Between(String value1, String value2) {
            addCriterion("ADDRESS1 between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotBetween(String value1, String value2) {
            addCriterion("ADDRESS1 not between", value1, value2, "address1");
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

        public Criteria andMobilenumberIsNull() {
            addCriterion("MOBILENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MOBILENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("MOBILENUMBER =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("MOBILENUMBER <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("MOBILENUMBER >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("MOBILENUMBER <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("MOBILENUMBER like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("MOBILENUMBER not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("MOBILENUMBER in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("MOBILENUMBER not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeIsNull() {
            addCriterion("OFFICEPHONECOUNTRYCODE is null");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeIsNotNull() {
            addCriterion("OFFICEPHONECOUNTRYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeEqualTo(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE =", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeNotEqualTo(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE <>", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeGreaterThan(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE >", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE >=", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeLessThan(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE <", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeLessThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE <=", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeLike(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE like", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeNotLike(String value) {
            addCriterion("OFFICEPHONECOUNTRYCODE not like", value, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeIn(List<String> values) {
            addCriterion("OFFICEPHONECOUNTRYCODE in", values, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeNotIn(List<String> values) {
            addCriterion("OFFICEPHONECOUNTRYCODE not in", values, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeBetween(String value1, String value2) {
            addCriterion("OFFICEPHONECOUNTRYCODE between", value1, value2, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephonecountrycodeNotBetween(String value1, String value2) {
            addCriterion("OFFICEPHONECOUNTRYCODE not between", value1, value2, "officephonecountrycode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeIsNull() {
            addCriterion("OFFICEPHONEAREACODE is null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeIsNotNull() {
            addCriterion("OFFICEPHONEAREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeEqualTo(String value) {
            addCriterion("OFFICEPHONEAREACODE =", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeNotEqualTo(String value) {
            addCriterion("OFFICEPHONEAREACODE <>", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeGreaterThan(String value) {
            addCriterion("OFFICEPHONEAREACODE >", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONEAREACODE >=", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeLessThan(String value) {
            addCriterion("OFFICEPHONEAREACODE <", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeLessThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONEAREACODE <=", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeLike(String value) {
            addCriterion("OFFICEPHONEAREACODE like", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeNotLike(String value) {
            addCriterion("OFFICEPHONEAREACODE not like", value, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeIn(List<String> values) {
            addCriterion("OFFICEPHONEAREACODE in", values, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeNotIn(List<String> values) {
            addCriterion("OFFICEPHONEAREACODE not in", values, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeBetween(String value1, String value2) {
            addCriterion("OFFICEPHONEAREACODE between", value1, value2, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephoneareacodeNotBetween(String value1, String value2) {
            addCriterion("OFFICEPHONEAREACODE not between", value1, value2, "officephoneareacode");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberIsNull() {
            addCriterion("OFFICEPHONENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberIsNotNull() {
            addCriterion("OFFICEPHONENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberEqualTo(String value) {
            addCriterion("OFFICEPHONENUMBER =", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberNotEqualTo(String value) {
            addCriterion("OFFICEPHONENUMBER <>", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberGreaterThan(String value) {
            addCriterion("OFFICEPHONENUMBER >", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONENUMBER >=", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberLessThan(String value) {
            addCriterion("OFFICEPHONENUMBER <", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberLessThanOrEqualTo(String value) {
            addCriterion("OFFICEPHONENUMBER <=", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberLike(String value) {
            addCriterion("OFFICEPHONENUMBER like", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberNotLike(String value) {
            addCriterion("OFFICEPHONENUMBER not like", value, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberIn(List<String> values) {
            addCriterion("OFFICEPHONENUMBER in", values, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberNotIn(List<String> values) {
            addCriterion("OFFICEPHONENUMBER not in", values, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberBetween(String value1, String value2) {
            addCriterion("OFFICEPHONENUMBER between", value1, value2, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficephonenumberNotBetween(String value1, String value2) {
            addCriterion("OFFICEPHONENUMBER not between", value1, value2, "officephonenumber");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionIsNull() {
            addCriterion("OFFICEEXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionIsNotNull() {
            addCriterion("OFFICEEXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionEqualTo(String value) {
            addCriterion("OFFICEEXTENSION =", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionNotEqualTo(String value) {
            addCriterion("OFFICEEXTENSION <>", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionGreaterThan(String value) {
            addCriterion("OFFICEEXTENSION >", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICEEXTENSION >=", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionLessThan(String value) {
            addCriterion("OFFICEEXTENSION <", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionLessThanOrEqualTo(String value) {
            addCriterion("OFFICEEXTENSION <=", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionLike(String value) {
            addCriterion("OFFICEEXTENSION like", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionNotLike(String value) {
            addCriterion("OFFICEEXTENSION not like", value, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionIn(List<String> values) {
            addCriterion("OFFICEEXTENSION in", values, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionNotIn(List<String> values) {
            addCriterion("OFFICEEXTENSION not in", values, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionBetween(String value1, String value2) {
            addCriterion("OFFICEEXTENSION between", value1, value2, "officeextension");
            return (Criteria) this;
        }

        public Criteria andOfficeextensionNotBetween(String value1, String value2) {
            addCriterion("OFFICEEXTENSION not between", value1, value2, "officeextension");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeIsNull() {
            addCriterion("FAXCOUNTRYCODE is null");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeIsNotNull() {
            addCriterion("FAXCOUNTRYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeEqualTo(String value) {
            addCriterion("FAXCOUNTRYCODE =", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeNotEqualTo(String value) {
            addCriterion("FAXCOUNTRYCODE <>", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeGreaterThan(String value) {
            addCriterion("FAXCOUNTRYCODE >", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("FAXCOUNTRYCODE >=", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeLessThan(String value) {
            addCriterion("FAXCOUNTRYCODE <", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeLessThanOrEqualTo(String value) {
            addCriterion("FAXCOUNTRYCODE <=", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeLike(String value) {
            addCriterion("FAXCOUNTRYCODE like", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeNotLike(String value) {
            addCriterion("FAXCOUNTRYCODE not like", value, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeIn(List<String> values) {
            addCriterion("FAXCOUNTRYCODE in", values, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeNotIn(List<String> values) {
            addCriterion("FAXCOUNTRYCODE not in", values, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeBetween(String value1, String value2) {
            addCriterion("FAXCOUNTRYCODE between", value1, value2, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxcountrycodeNotBetween(String value1, String value2) {
            addCriterion("FAXCOUNTRYCODE not between", value1, value2, "faxcountrycode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeIsNull() {
            addCriterion("FAXAREACODE is null");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeIsNotNull() {
            addCriterion("FAXAREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeEqualTo(String value) {
            addCriterion("FAXAREACODE =", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeNotEqualTo(String value) {
            addCriterion("FAXAREACODE <>", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeGreaterThan(String value) {
            addCriterion("FAXAREACODE >", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeGreaterThanOrEqualTo(String value) {
            addCriterion("FAXAREACODE >=", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeLessThan(String value) {
            addCriterion("FAXAREACODE <", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeLessThanOrEqualTo(String value) {
            addCriterion("FAXAREACODE <=", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeLike(String value) {
            addCriterion("FAXAREACODE like", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeNotLike(String value) {
            addCriterion("FAXAREACODE not like", value, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeIn(List<String> values) {
            addCriterion("FAXAREACODE in", values, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeNotIn(List<String> values) {
            addCriterion("FAXAREACODE not in", values, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeBetween(String value1, String value2) {
            addCriterion("FAXAREACODE between", value1, value2, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxareacodeNotBetween(String value1, String value2) {
            addCriterion("FAXAREACODE not between", value1, value2, "faxareacode");
            return (Criteria) this;
        }

        public Criteria andFaxnumberIsNull() {
            addCriterion("FAXNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFaxnumberIsNotNull() {
            addCriterion("FAXNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFaxnumberEqualTo(String value) {
            addCriterion("FAXNUMBER =", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberNotEqualTo(String value) {
            addCriterion("FAXNUMBER <>", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberGreaterThan(String value) {
            addCriterion("FAXNUMBER >", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberGreaterThanOrEqualTo(String value) {
            addCriterion("FAXNUMBER >=", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberLessThan(String value) {
            addCriterion("FAXNUMBER <", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberLessThanOrEqualTo(String value) {
            addCriterion("FAXNUMBER <=", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberLike(String value) {
            addCriterion("FAXNUMBER like", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberNotLike(String value) {
            addCriterion("FAXNUMBER not like", value, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberIn(List<String> values) {
            addCriterion("FAXNUMBER in", values, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberNotIn(List<String> values) {
            addCriterion("FAXNUMBER not in", values, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberBetween(String value1, String value2) {
            addCriterion("FAXNUMBER between", value1, value2, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andFaxnumberNotBetween(String value1, String value2) {
            addCriterion("FAXNUMBER not between", value1, value2, "faxnumber");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("ISDEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("ISDEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(String value) {
            addCriterion("ISDEFAULT =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(String value) {
            addCriterion("ISDEFAULT <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(String value) {
            addCriterion("ISDEFAULT >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEFAULT >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(String value) {
            addCriterion("ISDEFAULT <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(String value) {
            addCriterion("ISDEFAULT <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLike(String value) {
            addCriterion("ISDEFAULT like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotLike(String value) {
            addCriterion("ISDEFAULT not like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<String> values) {
            addCriterion("ISDEFAULT in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<String> values) {
            addCriterion("ISDEFAULT not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(String value1, String value2) {
            addCriterion("ISDEFAULT between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(String value1, String value2) {
            addCriterion("ISDEFAULT not between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andContactpersonameIsNull() {
            addCriterion("CONTACTPERSONAME is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonameIsNotNull() {
            addCriterion("CONTACTPERSONAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonameEqualTo(String value) {
            addCriterion("CONTACTPERSONAME =", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameNotEqualTo(String value) {
            addCriterion("CONTACTPERSONAME <>", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameGreaterThan(String value) {
            addCriterion("CONTACTPERSONAME >", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONAME >=", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameLessThan(String value) {
            addCriterion("CONTACTPERSONAME <", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONAME <=", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameLike(String value) {
            addCriterion("CONTACTPERSONAME like", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameNotLike(String value) {
            addCriterion("CONTACTPERSONAME not like", value, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameIn(List<String> values) {
            addCriterion("CONTACTPERSONAME in", values, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameNotIn(List<String> values) {
            addCriterion("CONTACTPERSONAME not in", values, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONAME between", value1, value2, "contactpersoname");
            return (Criteria) this;
        }

        public Criteria andContactpersonameNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONAME not between", value1, value2, "contactpersoname");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSCM_SUPPLIERADDRESS
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 17 09:35:30 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSCM_SUPPLIERADDRESS
     *
     * @mbggenerated Fri Oct 17 09:35:30 CST 2014
     */
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