package com.best1.api.entity.oaf.order;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToafApiFedirefundresponseExample {
  
    protected String orderByClause;

    
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

   
    public ToafApiFedirefundresponseExample() {
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

        public Criteria andRefundstatusIsNull() {
            addCriterion("REFUNDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNotNull() {
            addCriterion("REFUNDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusEqualTo(Integer value) {
            addCriterion("REFUNDSTATUS =", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotEqualTo(Integer value) {
            addCriterion("REFUNDSTATUS <>", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThan(Integer value) {
            addCriterion("REFUNDSTATUS >", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFUNDSTATUS >=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThan(Integer value) {
            addCriterion("REFUNDSTATUS <", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThanOrEqualTo(Integer value) {
            addCriterion("REFUNDSTATUS <=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIn(List<Integer> values) {
            addCriterion("REFUNDSTATUS in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotIn(List<Integer> values) {
            addCriterion("REFUNDSTATUS not in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusBetween(Integer value1, Integer value2) {
            addCriterion("REFUNDSTATUS between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("REFUNDSTATUS not between", value1, value2, "refundstatus");
            return (Criteria) this;
        }
        
   
        
        public Criteria andRecordstatusEqualTo(Integer value) {
            addCriterion("RECORDSTATUS =", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusNotEqualTo(Integer value) {
            addCriterion("RECORDSTATUS <>", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusGreaterThan(Integer value) {
            addCriterion("RECORDSTATUS >", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORDSTATUS >=", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusLessThan(Integer value) {
            addCriterion("RECORDSTATUS <", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusLessThanOrEqualTo(Integer value) {
            addCriterion("RECORDSTATUS <=", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusIn(List<Integer> values) {
            addCriterion("RECORDSTATUS in", values, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusNotIn(List<Integer> values) {
            addCriterion("RECORDSTATUS not in", values, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusBetween(Integer value1, Integer value2) {
            addCriterion("RECORDSTATUS between", value1, value2, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORDSTATUS not between", value1, value2, "recordstatus");
            return (Criteria) this;
        }
        

        public Criteria andTransactionsequenceIsNull() {
            addCriterion("TRANSACTIONSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceIsNotNull() {
            addCriterion("TRANSACTIONSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceEqualTo(String value) {
            addCriterion("TRANSACTIONSEQUENCE =", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceNotEqualTo(String value) {
            addCriterion("TRANSACTIONSEQUENCE <>", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceGreaterThan(String value) {
            addCriterion("TRANSACTIONSEQUENCE >", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONSEQUENCE >=", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceLessThan(String value) {
            addCriterion("TRANSACTIONSEQUENCE <", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONSEQUENCE <=", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceLike(String value) {
            addCriterion("TRANSACTIONSEQUENCE like", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceNotLike(String value) {
            addCriterion("TRANSACTIONSEQUENCE not like", value, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceIn(List<String> values) {
            addCriterion("TRANSACTIONSEQUENCE in", values, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceNotIn(List<String> values) {
            addCriterion("TRANSACTIONSEQUENCE not in", values, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceBetween(String value1, String value2) {
            addCriterion("TRANSACTIONSEQUENCE between", value1, value2, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andTransactionsequenceNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONSEQUENCE not between", value1, value2, "transactionsequence");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNull() {
            addCriterion("PAYMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIsNotNull() {
            addCriterion("PAYMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdateEqualTo(Date value) {
            addCriterion("PAYMENTDATE =", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotEqualTo(Date value) {
            addCriterion("PAYMENTDATE <>", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThan(Date value) {
            addCriterion("PAYMENTDATE >", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMENTDATE >=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThan(Date value) {
            addCriterion("PAYMENTDATE <", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("PAYMENTDATE <=", value, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateIn(List<Date> values) {
            addCriterion("PAYMENTDATE in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotIn(List<Date> values) {
            addCriterion("PAYMENTDATE not in", values, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateBetween(Date value1, Date value2) {
            addCriterion("PAYMENTDATE between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("PAYMENTDATE not between", value1, value2, "paymentdate");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberIsNull() {
            addCriterion("PAYINGACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberIsNotNull() {
            addCriterion("PAYINGACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberEqualTo(String value) {
            addCriterion("PAYINGACCOUNTNUMBER =", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberNotEqualTo(String value) {
            addCriterion("PAYINGACCOUNTNUMBER <>", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberGreaterThan(String value) {
            addCriterion("PAYINGACCOUNTNUMBER >", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("PAYINGACCOUNTNUMBER >=", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberLessThan(String value) {
            addCriterion("PAYINGACCOUNTNUMBER <", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("PAYINGACCOUNTNUMBER <=", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberLike(String value) {
            addCriterion("PAYINGACCOUNTNUMBER like", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberNotLike(String value) {
            addCriterion("PAYINGACCOUNTNUMBER not like", value, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberIn(List<String> values) {
            addCriterion("PAYINGACCOUNTNUMBER in", values, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberNotIn(List<String> values) {
            addCriterion("PAYINGACCOUNTNUMBER not in", values, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberBetween(String value1, String value2) {
            addCriterion("PAYINGACCOUNTNUMBER between", value1, value2, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andPayingaccountnumberNotBetween(String value1, String value2) {
            addCriterion("PAYINGACCOUNTNUMBER not between", value1, value2, "payingaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountIsNull() {
            addCriterion("RECIPIENTACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountIsNotNull() {
            addCriterion("RECIPIENTACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountEqualTo(String value) {
            addCriterion("RECIPIENTACCOUNT =", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountNotEqualTo(String value) {
            addCriterion("RECIPIENTACCOUNT <>", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountGreaterThan(String value) {
            addCriterion("RECIPIENTACCOUNT >", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPIENTACCOUNT >=", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountLessThan(String value) {
            addCriterion("RECIPIENTACCOUNT <", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountLessThanOrEqualTo(String value) {
            addCriterion("RECIPIENTACCOUNT <=", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountLike(String value) {
            addCriterion("RECIPIENTACCOUNT like", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountNotLike(String value) {
            addCriterion("RECIPIENTACCOUNT not like", value, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountIn(List<String> values) {
            addCriterion("RECIPIENTACCOUNT in", values, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountNotIn(List<String> values) {
            addCriterion("RECIPIENTACCOUNT not in", values, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountBetween(String value1, String value2) {
            addCriterion("RECIPIENTACCOUNT between", value1, value2, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientaccountNotBetween(String value1, String value2) {
            addCriterion("RECIPIENTACCOUNT not between", value1, value2, "recipientaccount");
            return (Criteria) this;
        }

        public Criteria andRecipientnameIsNull() {
            addCriterion("RECIPIENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andRecipientnameIsNotNull() {
            addCriterion("RECIPIENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientnameEqualTo(String value) {
            addCriterion("RECIPIENTNAME =", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotEqualTo(String value) {
            addCriterion("RECIPIENTNAME <>", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameGreaterThan(String value) {
            addCriterion("RECIPIENTNAME >", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPIENTNAME >=", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameLessThan(String value) {
            addCriterion("RECIPIENTNAME <", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameLessThanOrEqualTo(String value) {
            addCriterion("RECIPIENTNAME <=", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameLike(String value) {
            addCriterion("RECIPIENTNAME like", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotLike(String value) {
            addCriterion("RECIPIENTNAME not like", value, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameIn(List<String> values) {
            addCriterion("RECIPIENTNAME in", values, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotIn(List<String> values) {
            addCriterion("RECIPIENTNAME not in", values, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameBetween(String value1, String value2) {
            addCriterion("RECIPIENTNAME between", value1, value2, "recipientname");
            return (Criteria) this;
        }

        public Criteria andRecipientnameNotBetween(String value1, String value2) {
            addCriterion("RECIPIENTNAME not between", value1, value2, "recipientname");
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

        
        
        public Criteria andPayingbankidIsNull() {
            addCriterion("PAYINGBANKID is null");
            return (Criteria) this;
        }

        public Criteria andPayingbankidIsNotNull() {
            addCriterion("PAYINGBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andPayingbankidEqualTo(Long value) {
            addCriterion("PAYINGBANKID =", value, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidNotEqualTo(Long value) {
            addCriterion("PAYINGBANKID <>", value, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidGreaterThan(Long value) {
            addCriterion("PAYINGBANKID >", value, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYINGBANKID >=", value, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidLessThan(Long value) {
            addCriterion("PAYINGBANKID <", value, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidLessThanOrEqualTo(Long value) {
            addCriterion("PAYINGBANKID <=", value, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidIn(List<Long> values) {
            addCriterion("PAYINGBANKID in", values, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidNotIn(List<Long> values) {
            addCriterion("PAYINGBANKID not in", values, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidBetween(Long value1, Long value2) {
            addCriterion("PAYINGBANKID between", value1, value2, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andPayingbankidNotBetween(Long value1, Long value2) {
            addCriterion("PAYINGBANKID not between", value1, value2, "payingbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidIsNull() {
            addCriterion("RECIPIENTBANKID is null");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidIsNotNull() {
            addCriterion("RECIPIENTBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidEqualTo(Long value) {
            addCriterion("RECIPIENTBANKID =", value, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidNotEqualTo(Long value) {
            addCriterion("RECIPIENTBANKID <>", value, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidGreaterThan(Long value) {
            addCriterion("RECIPIENTBANKID >", value, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidGreaterThanOrEqualTo(Long value) {
            addCriterion("RECIPIENTBANKID >=", value, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidLessThan(Long value) {
            addCriterion("RECIPIENTBANKID <", value, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidLessThanOrEqualTo(Long value) {
            addCriterion("RECIPIENTBANKID <=", value, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidIn(List<Long> values) {
            addCriterion("RECIPIENTBANKID in", values, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidNotIn(List<Long> values) {
            addCriterion("RECIPIENTBANKID not in", values, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidBetween(Long value1, Long value2) {
            addCriterion("RECIPIENTBANKID between", value1, value2, "recipientbankid");
            return (Criteria) this;
        }

        public Criteria andRecipientbankidNotBetween(Long value1, Long value2) {
            addCriterion("RECIPIENTBANKID not between", value1, value2, "recipientbankid");
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

        public Criteria andServicefeeIsNull() {
            addCriterion("SERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andServicefeeIsNotNull() {
            addCriterion("SERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andServicefeeEqualTo(Double value) {
            addCriterion("SERVICEFEE =", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotEqualTo(Double value) {
            addCriterion("SERVICEFEE <>", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeGreaterThan(Double value) {
            addCriterion("SERVICEFEE >", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeGreaterThanOrEqualTo(Double value) {
            addCriterion("SERVICEFEE >=", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeLessThan(Double value) {
            addCriterion("SERVICEFEE <", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeLessThanOrEqualTo(Double value) {
            addCriterion("SERVICEFEE <=", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeLike(Double value) {
            addCriterion("SERVICEFEE like", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotLike(Double value) {
            addCriterion("SERVICEFEE not like", value, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeIn(List<Double> values) {
            addCriterion("SERVICEFEE in", values, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotIn(List<Double> values) {
            addCriterion("SERVICEFEE not in", values, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeBetween(Double value1, Double value2) {
            addCriterion("SERVICEFEE between", value1, value2, "servicefee");
            return (Criteria) this;
        }

        public Criteria andServicefeeNotBetween(Double value1, Double value2) {
            addCriterion("SERVICEFEE not between", value1, value2, "servicefee");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNull() {
            addCriterion("BUSINESSCODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNotNull() {
            addCriterion("BUSINESSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeEqualTo(String value) {
            addCriterion("BUSINESSCODE =", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotEqualTo(String value) {
            addCriterion("BUSINESSCODE <>", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThan(String value) {
            addCriterion("BUSINESSCODE >", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSCODE >=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThan(String value) {
            addCriterion("BUSINESSCODE <", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSCODE <=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLike(String value) {
            addCriterion("BUSINESSCODE like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotLike(String value) {
            addCriterion("BUSINESSCODE not like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIn(List<String> values) {
            addCriterion("BUSINESSCODE in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotIn(List<String> values) {
            addCriterion("BUSINESSCODE not in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeBetween(String value1, String value2) {
            addCriterion("BUSINESSCODE between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSCODE not between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNull() {
            addCriterion("PAYERNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayernameIsNotNull() {
            addCriterion("PAYERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayernameEqualTo(String value) {
            addCriterion("PAYERNAME =", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotEqualTo(String value) {
            addCriterion("PAYERNAME <>", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThan(String value) {
            addCriterion("PAYERNAME >", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERNAME >=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThan(String value) {
            addCriterion("PAYERNAME <", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLessThanOrEqualTo(String value) {
            addCriterion("PAYERNAME <=", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameLike(String value) {
            addCriterion("PAYERNAME like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotLike(String value) {
            addCriterion("PAYERNAME not like", value, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameIn(List<String> values) {
            addCriterion("PAYERNAME in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotIn(List<String> values) {
            addCriterion("PAYERNAME not in", values, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameBetween(String value1, String value2) {
            addCriterion("PAYERNAME between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andPayernameNotBetween(String value1, String value2) {
            addCriterion("PAYERNAME not between", value1, value2, "payername");
            return (Criteria) this;
        }

        public Criteria andRepayidIsNull() {
            addCriterion("REPAYID is null");
            return (Criteria) this;
        }

        public Criteria andRepayidIsNotNull() {
            addCriterion("REPAYID is not null");
            return (Criteria) this;
        }

        public Criteria andRepayidEqualTo(Long value) {
            addCriterion("REPAYID =", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidNotEqualTo(Long value) {
            addCriterion("REPAYID <>", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidGreaterThan(Long value) {
            addCriterion("REPAYID >", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidGreaterThanOrEqualTo(Long value) {
            addCriterion("REPAYID >=", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidLessThan(Long value) {
            addCriterion("REPAYID <", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidLessThanOrEqualTo(Long value) {
            addCriterion("REPAYID <=", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidIn(List<Long> values) {
            addCriterion("REPAYID in", values, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidNotIn(List<Long> values) {
            addCriterion("REPAYID not in", values, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidBetween(Long value1, Long value2) {
            addCriterion("REPAYID between", value1, value2, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidNotBetween(Long value1, Long value2) {
            addCriterion("REPAYID not between", value1, value2, "repayid");
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