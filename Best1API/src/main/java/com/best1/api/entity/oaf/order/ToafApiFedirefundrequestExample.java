package com.best1.api.entity.oaf.order;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToafApiFedirefundrequestExample {

    protected String orderByClause;


    protected boolean distinct;


    protected List<Criteria> oredCriteria;

 
    public ToafApiFedirefundrequestExample() {
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

        public Criteria andRefundidIsNull() {
            addCriterion("REFUNDID is null");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNotNull() {
            addCriterion("REFUNDID is not null");
            return (Criteria) this;
        }

        public Criteria andRefundidEqualTo(Long value) {
            addCriterion("REFUNDID =", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotEqualTo(Long value) {
            addCriterion("REFUNDID <>", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThan(Long value) {
            addCriterion("REFUNDID >", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThanOrEqualTo(Long value) {
            addCriterion("REFUNDID >=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThan(Long value) {
            addCriterion("REFUNDID <", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThanOrEqualTo(Long value) {
            addCriterion("REFUNDID <=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidIn(List<Long> values) {
            addCriterion("REFUNDID in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotIn(List<Long> values) {
            addCriterion("REFUNDID not in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidBetween(Long value1, Long value2) {
            addCriterion("REFUNDID between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotBetween(Long value1, Long value2) {
            addCriterion("REFUNDID not between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("CUSTOMERID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CUSTOMERID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Long value) {
            addCriterion("CUSTOMERID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Long value) {
            addCriterion("CUSTOMERID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Long value) {
            addCriterion("CUSTOMERID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Long value) {
            addCriterion("CUSTOMERID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Long> values) {
            addCriterion("CUSTOMERID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Long> values) {
            addCriterion("CUSTOMERID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Long value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Long value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Long value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Long value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Long value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Long> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Long> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Long value1, Long value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Long value1, Long value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("ITEMID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("ITEMID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("ITEMID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("ITEMID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("ITEMID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEMID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("ITEMID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("ITEMID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Integer> values) {
            addCriterion("ITEMID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Integer> values) {
            addCriterion("ITEMID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("ITEMID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEMID not between", value1, value2, "itemid");
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

        public Criteria andCompanynameIsNull() {
            addCriterion("COMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("COMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("COMPANYNAME =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("COMPANYNAME <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("COMPANYNAME >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("COMPANYNAME <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("COMPANYNAME like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("COMPANYNAME not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("COMPANYNAME in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("COMPANYNAME not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("COMPANYNAME between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("COMPANYNAME not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNull() {
            addCriterion("REFUNDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNotNull() {
            addCriterion("REFUNDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundamountEqualTo(Double value) {
            addCriterion("REFUNDAMOUNT =", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotEqualTo(Double value) {
            addCriterion("REFUNDAMOUNT <>", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThan(Double value) {
            addCriterion("REFUNDAMOUNT >", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThanOrEqualTo(Double value) {
            addCriterion("REFUNDAMOUNT >=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThan(Double value) {
            addCriterion("REFUNDAMOUNT <", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThanOrEqualTo(Double value) {
            addCriterion("REFUNDAMOUNT <=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIn(List<Double> values) {
            addCriterion("REFUNDAMOUNT in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotIn(List<Double> values) {
            addCriterion("REFUNDAMOUNT not in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountBetween(Double value1, Double value2) {
            addCriterion("REFUNDAMOUNT between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotBetween(Double value1, Double value2) {
            addCriterion("REFUNDAMOUNT not between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefunddateIsNull() {
            addCriterion("REFUNDDATE is null");
            return (Criteria) this;
        }

        public Criteria andRefunddateIsNotNull() {
            addCriterion("REFUNDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefunddateEqualTo(Date value) {
            addCriterion("REFUNDDATE =", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotEqualTo(Date value) {
            addCriterion("REFUNDDATE <>", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateGreaterThan(Date value) {
            addCriterion("REFUNDDATE >", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUNDDATE >=", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateLessThan(Date value) {
            addCriterion("REFUNDDATE <", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateLessThanOrEqualTo(Date value) {
            addCriterion("REFUNDDATE <=", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateIn(List<Date> values) {
            addCriterion("REFUNDDATE in", values, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotIn(List<Date> values) {
            addCriterion("REFUNDDATE not in", values, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateBetween(Date value1, Date value2) {
            addCriterion("REFUNDDATE between", value1, value2, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotBetween(Date value1, Date value2) {
            addCriterion("REFUNDDATE not between", value1, value2, "refunddate");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccholdernameIsNull() {
            addCriterion("ACCHOLDERNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccholdernameIsNotNull() {
            addCriterion("ACCHOLDERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccholdernameEqualTo(String value) {
            addCriterion("ACCHOLDERNAME =", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameNotEqualTo(String value) {
            addCriterion("ACCHOLDERNAME <>", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameGreaterThan(String value) {
            addCriterion("ACCHOLDERNAME >", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCHOLDERNAME >=", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameLessThan(String value) {
            addCriterion("ACCHOLDERNAME <", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameLessThanOrEqualTo(String value) {
            addCriterion("ACCHOLDERNAME <=", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameLike(String value) {
            addCriterion("ACCHOLDERNAME like", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameNotLike(String value) {
            addCriterion("ACCHOLDERNAME not like", value, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameIn(List<String> values) {
            addCriterion("ACCHOLDERNAME in", values, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameNotIn(List<String> values) {
            addCriterion("ACCHOLDERNAME not in", values, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameBetween(String value1, String value2) {
            addCriterion("ACCHOLDERNAME between", value1, value2, "accholdername");
            return (Criteria) this;
        }

        public Criteria andAccholdernameNotBetween(String value1, String value2) {
            addCriterion("ACCHOLDERNAME not between", value1, value2, "accholdername");
            return (Criteria) this;
        }

        public Criteria andPersonalidIsNull() {
            addCriterion("PERSONALID is null");
            return (Criteria) this;
        }

        public Criteria andPersonalidIsNotNull() {
            addCriterion("PERSONALID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalidEqualTo(String value) {
            addCriterion("PERSONALID =", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotEqualTo(String value) {
            addCriterion("PERSONALID <>", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidGreaterThan(String value) {
            addCriterion("PERSONALID >", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONALID >=", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidLessThan(String value) {
            addCriterion("PERSONALID <", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidLessThanOrEqualTo(String value) {
            addCriterion("PERSONALID <=", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidLike(String value) {
            addCriterion("PERSONALID like", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotLike(String value) {
            addCriterion("PERSONALID not like", value, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidIn(List<String> values) {
            addCriterion("PERSONALID in", values, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotIn(List<String> values) {
            addCriterion("PERSONALID not in", values, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidBetween(String value1, String value2) {
            addCriterion("PERSONALID between", value1, value2, "personalid");
            return (Criteria) this;
        }

        public Criteria andPersonalidNotBetween(String value1, String value2) {
            addCriterion("PERSONALID not between", value1, value2, "personalid");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberIsNull() {
            addCriterion("HOMETELEPHONENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberIsNotNull() {
            addCriterion("HOMETELEPHONENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberEqualTo(String value) {
            addCriterion("HOMETELEPHONENUMBER =", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberNotEqualTo(String value) {
            addCriterion("HOMETELEPHONENUMBER <>", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberGreaterThan(String value) {
            addCriterion("HOMETELEPHONENUMBER >", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("HOMETELEPHONENUMBER >=", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberLessThan(String value) {
            addCriterion("HOMETELEPHONENUMBER <", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberLessThanOrEqualTo(String value) {
            addCriterion("HOMETELEPHONENUMBER <=", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberLike(String value) {
            addCriterion("HOMETELEPHONENUMBER like", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberNotLike(String value) {
            addCriterion("HOMETELEPHONENUMBER not like", value, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberIn(List<String> values) {
            addCriterion("HOMETELEPHONENUMBER in", values, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberNotIn(List<String> values) {
            addCriterion("HOMETELEPHONENUMBER not in", values, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberBetween(String value1, String value2) {
            addCriterion("HOMETELEPHONENUMBER between", value1, value2, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andHometelephonenumberNotBetween(String value1, String value2) {
            addCriterion("HOMETELEPHONENUMBER not between", value1, value2, "hometelephonenumber");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("BANKID is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("BANKID is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Long value) {
            addCriterion("BANKID =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Long value) {
            addCriterion("BANKID <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Long value) {
            addCriterion("BANKID >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Long value) {
            addCriterion("BANKID >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Long value) {
            addCriterion("BANKID <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Long value) {
            addCriterion("BANKID <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Long> values) {
            addCriterion("BANKID in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Long> values) {
            addCriterion("BANKID not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Long value1, Long value2) {
            addCriterion("BANKID between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Long value1, Long value2) {
            addCriterion("BANKID not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("BANKCODE =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("BANKCODE <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("BANKCODE >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODE >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("BANKCODE <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("BANKCODE <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("BANKCODE like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("BANKCODE not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("BANKCODE in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("BANKCODE not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("BANKCODE between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("BANKCODE not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankrequestidIsNull() {
            addCriterion("BANKREQUESTID is null");
            return (Criteria) this;
        }

        public Criteria andBankrequestidIsNotNull() {
            addCriterion("BANKREQUESTID is not null");
            return (Criteria) this;
        }

        public Criteria andBankrequestidEqualTo(Long value) {
            addCriterion("BANKREQUESTID =", value, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidNotEqualTo(Long value) {
            addCriterion("BANKREQUESTID <>", value, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidGreaterThan(Long value) {
            addCriterion("BANKREQUESTID >", value, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidGreaterThanOrEqualTo(Long value) {
            addCriterion("BANKREQUESTID >=", value, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidLessThan(Long value) {
            addCriterion("BANKREQUESTID <", value, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidLessThanOrEqualTo(Long value) {
            addCriterion("BANKREQUESTID <=", value, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidIn(List<Long> values) {
            addCriterion("BANKREQUESTID in", values, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidNotIn(List<Long> values) {
            addCriterion("BANKREQUESTID not in", values, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidBetween(Long value1, Long value2) {
            addCriterion("BANKREQUESTID between", value1, value2, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andBankrequestidNotBetween(Long value1, Long value2) {
            addCriterion("BANKREQUESTID not between", value1, value2, "bankrequestid");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeIsNull() {
            addCriterion("RECORDCREATEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeIsNotNull() {
            addCriterion("RECORDCREATEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME =", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeNotEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME <>", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeGreaterThan(Date value) {
            addCriterion("RECORDCREATEDTIME >", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME >=", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeLessThan(Date value) {
            addCriterion("RECORDCREATEDTIME <", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME <=", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeIn(List<Date> values) {
            addCriterion("RECORDCREATEDTIME in", values, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeNotIn(List<Date> values) {
            addCriterion("RECORDCREATEDTIME not in", values, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeBetween(Date value1, Date value2) {
            addCriterion("RECORDCREATEDTIME between", value1, value2, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("RECORDCREATEDTIME not between", value1, value2, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TOAF_API_FEDIREFUNDREQUEST
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 28 13:46:34 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TOAF_API_FEDIREFUNDREQUEST
     *
     * @mbggenerated Fri Oct 28 13:46:34 CST 2016
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