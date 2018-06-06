package com.best1.api.entity.crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcrmLotterybonusExample {
  
    protected String orderByClause;

  
    protected boolean distinct;

  
    protected List<Criteria> oredCriteria;

   
    public TcrmLotterybonusExample() {
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

        public Criteria andTransactionidIsNull() {
            addCriterion("TRANSACTIONID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("TRANSACTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(Long value) {
            addCriterion("TRANSACTIONID =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(Long value) {
            addCriterion("TRANSACTIONID <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(Long value) {
            addCriterion("TRANSACTIONID >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSACTIONID >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(Long value) {
            addCriterion("TRANSACTIONID <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(Long value) {
            addCriterion("TRANSACTIONID <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<Long> values) {
            addCriterion("TRANSACTIONID in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<Long> values) {
            addCriterion("TRANSACTIONID not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(Long value1, Long value2) {
            addCriterion("TRANSACTIONID between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(Long value1, Long value2) {
            addCriterion("TRANSACTIONID not between", value1, value2, "transactionid");
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

        public Criteria andLotterybonusnoIsNull() {
            addCriterion("LOTTERYBONUSNO is null");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoIsNotNull() {
            addCriterion("LOTTERYBONUSNO is not null");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoEqualTo(Long value) {
            addCriterion("LOTTERYBONUSNO =", value, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoNotEqualTo(Long value) {
            addCriterion("LOTTERYBONUSNO <>", value, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoGreaterThan(Long value) {
            addCriterion("LOTTERYBONUSNO >", value, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoGreaterThanOrEqualTo(Long value) {
            addCriterion("LOTTERYBONUSNO >=", value, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoLessThan(Long value) {
            addCriterion("LOTTERYBONUSNO <", value, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoLessThanOrEqualTo(Long value) {
            addCriterion("LOTTERYBONUSNO <=", value, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoIn(List<Long> values) {
            addCriterion("LOTTERYBONUSNO in", values, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoNotIn(List<Long> values) {
            addCriterion("LOTTERYBONUSNO not in", values, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoBetween(Long value1, Long value2) {
            addCriterion("LOTTERYBONUSNO between", value1, value2, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andLotterybonusnoNotBetween(Long value1, Long value2) {
            addCriterion("LOTTERYBONUSNO not between", value1, value2, "lotterybonusno");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidIsNull() {
            addCriterion("TRANSACTIONTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidIsNotNull() {
            addCriterion("TRANSACTIONTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidEqualTo(Integer value) {
            addCriterion("TRANSACTIONTYPEID =", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidNotEqualTo(Integer value) {
            addCriterion("TRANSACTIONTYPEID <>", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidGreaterThan(Integer value) {
            addCriterion("TRANSACTIONTYPEID >", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTIONTYPEID >=", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidLessThan(Integer value) {
            addCriterion("TRANSACTIONTYPEID <", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTIONTYPEID <=", value, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidIn(List<Integer> values) {
            addCriterion("TRANSACTIONTYPEID in", values, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidNotIn(List<Integer> values) {
            addCriterion("TRANSACTIONTYPEID not in", values, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTIONTYPEID between", value1, value2, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTIONTYPEID not between", value1, value2, "transactiontypeid");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNull() {
            addCriterion("TRANSACTIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNotNull() {
            addCriterion("TRANSACTIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE =", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE <>", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThan(Date value) {
            addCriterion("TRANSACTIONDATE >", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE >=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThan(Date value) {
            addCriterion("TRANSACTIONDATE <", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThanOrEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE <=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIn(List<Date> values) {
            addCriterion("TRANSACTIONDATE in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotIn(List<Date> values) {
            addCriterion("TRANSACTIONDATE not in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateBetween(Date value1, Date value2) {
            addCriterion("TRANSACTIONDATE between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotBetween(Date value1, Date value2) {
            addCriterion("TRANSACTIONDATE not between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIsNull() {
            addCriterion("TRANSACTIONAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIsNotNull() {
            addCriterion("TRANSACTIONAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionamountEqualTo(Double value) {
            addCriterion("TRANSACTIONAMOUNT =", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotEqualTo(Double value) {
            addCriterion("TRANSACTIONAMOUNT <>", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountGreaterThan(Double value) {
            addCriterion("TRANSACTIONAMOUNT >", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountGreaterThanOrEqualTo(Double value) {
            addCriterion("TRANSACTIONAMOUNT >=", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountLessThan(Double value) {
            addCriterion("TRANSACTIONAMOUNT <", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountLessThanOrEqualTo(Double value) {
            addCriterion("TRANSACTIONAMOUNT <=", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIn(List<Double> values) {
            addCriterion("TRANSACTIONAMOUNT in", values, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotIn(List<Double> values) {
            addCriterion("TRANSACTIONAMOUNT not in", values, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountBetween(Double value1, Double value2) {
            addCriterion("TRANSACTIONAMOUNT between", value1, value2, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotBetween(Double value1, Double value2) {
            addCriterion("TRANSACTIONAMOUNT not between", value1, value2, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidIsNull() {
            addCriterion("REFERENCETYPEID is null");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidIsNotNull() {
            addCriterion("REFERENCETYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID =", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidNotEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID <>", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidGreaterThan(Integer value) {
            addCriterion("REFERENCETYPEID >", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID >=", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidLessThan(Integer value) {
            addCriterion("REFERENCETYPEID <", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID <=", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidIn(List<Integer> values) {
            addCriterion("REFERENCETYPEID in", values, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidNotIn(List<Integer> values) {
            addCriterion("REFERENCETYPEID not in", values, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCETYPEID between", value1, value2, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCETYPEID not between", value1, value2, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andExceptiondescIsNull() {
            addCriterion("EXCEPTIONDESC is null");
            return (Criteria) this;
        }

        public Criteria andExceptiondescIsNotNull() {
            addCriterion("EXCEPTIONDESC is not null");
            return (Criteria) this;
        }

        public Criteria andExceptiondescEqualTo(String value) {
            addCriterion("EXCEPTIONDESC =", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotEqualTo(String value) {
            addCriterion("EXCEPTIONDESC <>", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescGreaterThan(String value) {
            addCriterion("EXCEPTIONDESC >", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONDESC >=", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescLessThan(String value) {
            addCriterion("EXCEPTIONDESC <", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONDESC <=", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescLike(String value) {
            addCriterion("EXCEPTIONDESC like", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotLike(String value) {
            addCriterion("EXCEPTIONDESC not like", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescIn(List<String> values) {
            addCriterion("EXCEPTIONDESC in", values, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotIn(List<String> values) {
            addCriterion("EXCEPTIONDESC not in", values, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescBetween(String value1, String value2) {
            addCriterion("EXCEPTIONDESC between", value1, value2, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotBetween(String value1, String value2) {
            addCriterion("EXCEPTIONDESC not between", value1, value2, "exceptiondesc");
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

        public Criteria andReferencevalueIsNull() {
            addCriterion("REFERENCEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIsNotNull() {
            addCriterion("REFERENCEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andReferencevalueEqualTo(Long value) {
            addCriterion("REFERENCEVALUE =", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotEqualTo(Long value) {
            addCriterion("REFERENCEVALUE <>", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueGreaterThan(Long value) {
            addCriterion("REFERENCEVALUE >", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueGreaterThanOrEqualTo(Long value) {
            addCriterion("REFERENCEVALUE >=", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueLessThan(Long value) {
            addCriterion("REFERENCEVALUE <", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueLessThanOrEqualTo(Long value) {
            addCriterion("REFERENCEVALUE <=", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIn(List<Long> values) {
            addCriterion("REFERENCEVALUE in", values, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotIn(List<Long> values) {
            addCriterion("REFERENCEVALUE not in", values, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueBetween(Long value1, Long value2) {
            addCriterion("REFERENCEVALUE between", value1, value2, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotBetween(Long value1, Long value2) {
            addCriterion("REFERENCEVALUE not between", value1, value2, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferenceitemIsNull() {
            addCriterion("REFERENCEITEM is null");
            return (Criteria) this;
        }

        public Criteria andReferenceitemIsNotNull() {
            addCriterion("REFERENCEITEM is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceitemEqualTo(Integer value) {
            addCriterion("REFERENCEITEM =", value, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemNotEqualTo(Integer value) {
            addCriterion("REFERENCEITEM <>", value, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemGreaterThan(Integer value) {
            addCriterion("REFERENCEITEM >", value, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFERENCEITEM >=", value, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemLessThan(Integer value) {
            addCriterion("REFERENCEITEM <", value, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemLessThanOrEqualTo(Integer value) {
            addCriterion("REFERENCEITEM <=", value, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemIn(List<Integer> values) {
            addCriterion("REFERENCEITEM in", values, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemNotIn(List<Integer> values) {
            addCriterion("REFERENCEITEM not in", values, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCEITEM between", value1, value2, "referenceitem");
            return (Criteria) this;
        }

        public Criteria andReferenceitemNotBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCEITEM not between", value1, value2, "referenceitem");
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

        public Criteria andOriginallotterybonusnoIsNull() {
            addCriterion("ORIGINALLOTTERYBONUSNO is null");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoIsNotNull() {
            addCriterion("ORIGINALLOTTERYBONUSNO is not null");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoEqualTo(Long value) {
            addCriterion("ORIGINALLOTTERYBONUSNO =", value, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoNotEqualTo(Long value) {
            addCriterion("ORIGINALLOTTERYBONUSNO <>", value, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoGreaterThan(Long value) {
            addCriterion("ORIGINALLOTTERYBONUSNO >", value, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoGreaterThanOrEqualTo(Long value) {
            addCriterion("ORIGINALLOTTERYBONUSNO >=", value, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoLessThan(Long value) {
            addCriterion("ORIGINALLOTTERYBONUSNO <", value, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoLessThanOrEqualTo(Long value) {
            addCriterion("ORIGINALLOTTERYBONUSNO <=", value, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoIn(List<Long> values) {
            addCriterion("ORIGINALLOTTERYBONUSNO in", values, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoNotIn(List<Long> values) {
            addCriterion("ORIGINALLOTTERYBONUSNO not in", values, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoBetween(Long value1, Long value2) {
            addCriterion("ORIGINALLOTTERYBONUSNO between", value1, value2, "originallotterybonusno");
            return (Criteria) this;
        }

        public Criteria andOriginallotterybonusnoNotBetween(Long value1, Long value2) {
            addCriterion("ORIGINALLOTTERYBONUSNO not between", value1, value2, "originallotterybonusno");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TCRM_LOTTERYBONUS
     *
     * @mbggenerated do_not_delete_during_merge Mon Sep 01 16:27:33 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TCRM_LOTTERYBONUS
     *
     * @mbggenerated Mon Sep 01 16:27:33 CST 2014
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