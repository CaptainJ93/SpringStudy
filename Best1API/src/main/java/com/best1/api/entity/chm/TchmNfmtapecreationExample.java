package com.best1.api.entity.chm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TchmNfmtapecreationExample {

    protected String orderByClause;


    protected boolean distinct;

    protected List<Criteria> oredCriteria;


    public TchmNfmtapecreationExample() {
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

        public Criteria andTapeidIsNull() {
            addCriterion("TAPEID is null");
            return (Criteria) this;
        }

        public Criteria andTapeidIsNotNull() {
            addCriterion("TAPEID is not null");
            return (Criteria) this;
        }

        public Criteria andTapeidEqualTo(Long value) {
            addCriterion("TAPEID =", value, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidNotEqualTo(Long value) {
            addCriterion("TAPEID <>", value, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidGreaterThan(Long value) {
            addCriterion("TAPEID >", value, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidGreaterThanOrEqualTo(Long value) {
            addCriterion("TAPEID >=", value, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidLessThan(Long value) {
            addCriterion("TAPEID <", value, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidLessThanOrEqualTo(Long value) {
            addCriterion("TAPEID <=", value, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidIn(List<Long> values) {
            addCriterion("TAPEID in", values, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidNotIn(List<Long> values) {
            addCriterion("TAPEID not in", values, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidBetween(Long value1, Long value2) {
            addCriterion("TAPEID between", value1, value2, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapeidNotBetween(Long value1, Long value2) {
            addCriterion("TAPEID not between", value1, value2, "tapeid");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateIsNull() {
            addCriterion("TAPECREATIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateIsNotNull() {
            addCriterion("TAPECREATIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateEqualTo(Date value) {
            addCriterion("TAPECREATIONDATE =", value, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateNotEqualTo(Date value) {
            addCriterion("TAPECREATIONDATE <>", value, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateGreaterThan(Date value) {
            addCriterion("TAPECREATIONDATE >", value, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("TAPECREATIONDATE >=", value, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateLessThan(Date value) {
            addCriterion("TAPECREATIONDATE <", value, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateLessThanOrEqualTo(Date value) {
            addCriterion("TAPECREATIONDATE <=", value, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateIn(List<Date> values) {
            addCriterion("TAPECREATIONDATE in", values, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateNotIn(List<Date> values) {
            addCriterion("TAPECREATIONDATE not in", values, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateBetween(Date value1, Date value2) {
            addCriterion("TAPECREATIONDATE between", value1, value2, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationdateNotBetween(Date value1, Date value2) {
            addCriterion("TAPECREATIONDATE not between", value1, value2, "tapecreationdate");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeIsNull() {
            addCriterion("TAPECREATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeIsNotNull() {
            addCriterion("TAPECREATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeEqualTo(Date value) {
            addCriterion("TAPECREATIONTIME =", value, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeNotEqualTo(Date value) {
            addCriterion("TAPECREATIONTIME <>", value, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeGreaterThan(Date value) {
            addCriterion("TAPECREATIONTIME >", value, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TAPECREATIONTIME >=", value, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeLessThan(Date value) {
            addCriterion("TAPECREATIONTIME <", value, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("TAPECREATIONTIME <=", value, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeIn(List<Date> values) {
            addCriterion("TAPECREATIONTIME in", values, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeNotIn(List<Date> values) {
            addCriterion("TAPECREATIONTIME not in", values, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeBetween(Date value1, Date value2) {
            addCriterion("TAPECREATIONTIME between", value1, value2, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andTapecreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("TAPECREATIONTIME not between", value1, value2, "tapecreationtime");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidIsNull() {
            addCriterion("NFMPGMSCHEDULEID is null");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidIsNotNull() {
            addCriterion("NFMPGMSCHEDULEID is not null");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidEqualTo(Long value) {
            addCriterion("NFMPGMSCHEDULEID =", value, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidNotEqualTo(Long value) {
            addCriterion("NFMPGMSCHEDULEID <>", value, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidGreaterThan(Long value) {
            addCriterion("NFMPGMSCHEDULEID >", value, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidGreaterThanOrEqualTo(Long value) {
            addCriterion("NFMPGMSCHEDULEID >=", value, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidLessThan(Long value) {
            addCriterion("NFMPGMSCHEDULEID <", value, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidLessThanOrEqualTo(Long value) {
            addCriterion("NFMPGMSCHEDULEID <=", value, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidIn(List<Long> values) {
            addCriterion("NFMPGMSCHEDULEID in", values, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidNotIn(List<Long> values) {
            addCriterion("NFMPGMSCHEDULEID not in", values, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidBetween(Long value1, Long value2) {
            addCriterion("NFMPGMSCHEDULEID between", value1, value2, "nfmpgmscheduleid");
            return (Criteria) this;
        }

        public Criteria andNfmpgmscheduleidNotBetween(Long value1, Long value2) {
            addCriterion("NFMPGMSCHEDULEID not between", value1, value2, "nfmpgmscheduleid");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andManualeditremarksIsNull() {
            addCriterion("MANUALEDITREMARKS is null");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksIsNotNull() {
            addCriterion("MANUALEDITREMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksEqualTo(String value) {
            addCriterion("MANUALEDITREMARKS =", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksNotEqualTo(String value) {
            addCriterion("MANUALEDITREMARKS <>", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksGreaterThan(String value) {
            addCriterion("MANUALEDITREMARKS >", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksGreaterThanOrEqualTo(String value) {
            addCriterion("MANUALEDITREMARKS >=", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksLessThan(String value) {
            addCriterion("MANUALEDITREMARKS <", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksLessThanOrEqualTo(String value) {
            addCriterion("MANUALEDITREMARKS <=", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksLike(String value) {
            addCriterion("MANUALEDITREMARKS like", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksNotLike(String value) {
            addCriterion("MANUALEDITREMARKS not like", value, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksIn(List<String> values) {
            addCriterion("MANUALEDITREMARKS in", values, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksNotIn(List<String> values) {
            addCriterion("MANUALEDITREMARKS not in", values, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksBetween(String value1, String value2) {
            addCriterion("MANUALEDITREMARKS between", value1, value2, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andManualeditremarksNotBetween(String value1, String value2) {
            addCriterion("MANUALEDITREMARKS not between", value1, value2, "manualeditremarks");
            return (Criteria) this;
        }

        public Criteria andChildtapeidIsNull() {
            addCriterion("CHILDTAPEID is null");
            return (Criteria) this;
        }

        public Criteria andChildtapeidIsNotNull() {
            addCriterion("CHILDTAPEID is not null");
            return (Criteria) this;
        }

        public Criteria andChildtapeidEqualTo(Long value) {
            addCriterion("CHILDTAPEID =", value, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidNotEqualTo(Long value) {
            addCriterion("CHILDTAPEID <>", value, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidGreaterThan(Long value) {
            addCriterion("CHILDTAPEID >", value, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidGreaterThanOrEqualTo(Long value) {
            addCriterion("CHILDTAPEID >=", value, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidLessThan(Long value) {
            addCriterion("CHILDTAPEID <", value, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidLessThanOrEqualTo(Long value) {
            addCriterion("CHILDTAPEID <=", value, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidIn(List<Long> values) {
            addCriterion("CHILDTAPEID in", values, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidNotIn(List<Long> values) {
            addCriterion("CHILDTAPEID not in", values, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidBetween(Long value1, Long value2) {
            addCriterion("CHILDTAPEID between", value1, value2, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andChildtapeidNotBetween(Long value1, Long value2) {
            addCriterion("CHILDTAPEID not between", value1, value2, "childtapeid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("PRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("PRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Long value) {
            addCriterion("PRODUCTID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Long value) {
            addCriterion("PRODUCTID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Long value) {
            addCriterion("PRODUCTID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCTID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Long value) {
            addCriterion("PRODUCTID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCTID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Long> values) {
            addCriterion("PRODUCTID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Long> values) {
            addCriterion("PRODUCTID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Long value1, Long value2) {
            addCriterion("PRODUCTID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCTID not between", value1, value2, "productid");
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