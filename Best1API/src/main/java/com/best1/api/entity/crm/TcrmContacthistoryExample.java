package com.best1.api.entity.crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcrmContacthistoryExample {

    protected String orderByClause;


    protected boolean distinct;


    protected List<Criteria> oredCriteria;


    public TcrmContacthistoryExample() {
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

        public Criteria andContactidIsNull() {
            addCriterion("CONTACTID is null");
            return (Criteria) this;
        }

        public Criteria andContactidIsNotNull() {
            addCriterion("CONTACTID is not null");
            return (Criteria) this;
        }

        public Criteria andContactidEqualTo(Long value) {
            addCriterion("CONTACTID =", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotEqualTo(Long value) {
            addCriterion("CONTACTID <>", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThan(Long value) {
            addCriterion("CONTACTID >", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTACTID >=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThan(Long value) {
            addCriterion("CONTACTID <", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThanOrEqualTo(Long value) {
            addCriterion("CONTACTID <=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidIn(List<Long> values) {
            addCriterion("CONTACTID in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotIn(List<Long> values) {
            addCriterion("CONTACTID not in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidBetween(Long value1, Long value2) {
            addCriterion("CONTACTID between", value1, value2, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotBetween(Long value1, Long value2) {
            addCriterion("CONTACTID not between", value1, value2, "contactid");
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

        public Criteria andCallstartdateIsNull() {
            addCriterion("CALLSTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andCallstartdateIsNotNull() {
            addCriterion("CALLSTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCallstartdateEqualTo(Date value) {
            addCriterion("CALLSTARTDATE =", value, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateNotEqualTo(Date value) {
            addCriterion("CALLSTARTDATE <>", value, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateGreaterThan(Date value) {
            addCriterion("CALLSTARTDATE >", value, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CALLSTARTDATE >=", value, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateLessThan(Date value) {
            addCriterion("CALLSTARTDATE <", value, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateLessThanOrEqualTo(Date value) {
            addCriterion("CALLSTARTDATE <=", value, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateIn(List<Date> values) {
            addCriterion("CALLSTARTDATE in", values, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateNotIn(List<Date> values) {
            addCriterion("CALLSTARTDATE not in", values, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateBetween(Date value1, Date value2) {
            addCriterion("CALLSTARTDATE between", value1, value2, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallstartdateNotBetween(Date value1, Date value2) {
            addCriterion("CALLSTARTDATE not between", value1, value2, "callstartdate");
            return (Criteria) this;
        }

        public Criteria andCallenddateIsNull() {
            addCriterion("CALLENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andCallenddateIsNotNull() {
            addCriterion("CALLENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCallenddateEqualTo(Date value) {
            addCriterion("CALLENDDATE =", value, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateNotEqualTo(Date value) {
            addCriterion("CALLENDDATE <>", value, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateGreaterThan(Date value) {
            addCriterion("CALLENDDATE >", value, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("CALLENDDATE >=", value, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateLessThan(Date value) {
            addCriterion("CALLENDDATE <", value, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateLessThanOrEqualTo(Date value) {
            addCriterion("CALLENDDATE <=", value, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateIn(List<Date> values) {
            addCriterion("CALLENDDATE in", values, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateNotIn(List<Date> values) {
            addCriterion("CALLENDDATE not in", values, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateBetween(Date value1, Date value2) {
            addCriterion("CALLENDDATE between", value1, value2, "callenddate");
            return (Criteria) this;
        }

        public Criteria andCallenddateNotBetween(Date value1, Date value2) {
            addCriterion("CALLENDDATE not between", value1, value2, "callenddate");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNull() {
            addCriterion("CONTACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNotNull() {
            addCriterion("CONTACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContacttypeEqualTo(Integer value) {
            addCriterion("CONTACTTYPE =", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotEqualTo(Integer value) {
            addCriterion("CONTACTTYPE <>", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThan(Integer value) {
            addCriterion("CONTACTTYPE >", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTACTTYPE >=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThan(Integer value) {
            addCriterion("CONTACTTYPE <", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThanOrEqualTo(Integer value) {
            addCriterion("CONTACTTYPE <=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeIn(List<Integer> values) {
            addCriterion("CONTACTTYPE in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotIn(List<Integer> values) {
            addCriterion("CONTACTTYPE not in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeBetween(Integer value1, Integer value2) {
            addCriterion("CONTACTTYPE between", value1, value2, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTACTTYPE not between", value1, value2, "contacttype");
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

        public Criteria andEmoticonidIsNull() {
            addCriterion("EMOTICONID is null");
            return (Criteria) this;
        }

        public Criteria andEmoticonidIsNotNull() {
            addCriterion("EMOTICONID is not null");
            return (Criteria) this;
        }

        public Criteria andEmoticonidEqualTo(Integer value) {
            addCriterion("EMOTICONID =", value, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidNotEqualTo(Integer value) {
            addCriterion("EMOTICONID <>", value, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidGreaterThan(Integer value) {
            addCriterion("EMOTICONID >", value, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMOTICONID >=", value, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidLessThan(Integer value) {
            addCriterion("EMOTICONID <", value, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidLessThanOrEqualTo(Integer value) {
            addCriterion("EMOTICONID <=", value, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidIn(List<Integer> values) {
            addCriterion("EMOTICONID in", values, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidNotIn(List<Integer> values) {
            addCriterion("EMOTICONID not in", values, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidBetween(Integer value1, Integer value2) {
            addCriterion("EMOTICONID between", value1, value2, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andEmoticonidNotBetween(Integer value1, Integer value2) {
            addCriterion("EMOTICONID not between", value1, value2, "emoticonid");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andAcwenddateIsNull() {
            addCriterion("ACWENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andAcwenddateIsNotNull() {
            addCriterion("ACWENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcwenddateEqualTo(Date value) {
            addCriterion("ACWENDDATE =", value, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateNotEqualTo(Date value) {
            addCriterion("ACWENDDATE <>", value, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateGreaterThan(Date value) {
            addCriterion("ACWENDDATE >", value, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACWENDDATE >=", value, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateLessThan(Date value) {
            addCriterion("ACWENDDATE <", value, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateLessThanOrEqualTo(Date value) {
            addCriterion("ACWENDDATE <=", value, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateIn(List<Date> values) {
            addCriterion("ACWENDDATE in", values, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateNotIn(List<Date> values) {
            addCriterion("ACWENDDATE not in", values, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateBetween(Date value1, Date value2) {
            addCriterion("ACWENDDATE between", value1, value2, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andAcwenddateNotBetween(Date value1, Date value2) {
            addCriterion("ACWENDDATE not between", value1, value2, "acwenddate");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationIsNull() {
            addCriterion("VOICEFILELOCATION is null");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationIsNotNull() {
            addCriterion("VOICEFILELOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationEqualTo(String value) {
            addCriterion("VOICEFILELOCATION =", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationNotEqualTo(String value) {
            addCriterion("VOICEFILELOCATION <>", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationGreaterThan(String value) {
            addCriterion("VOICEFILELOCATION >", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationGreaterThanOrEqualTo(String value) {
            addCriterion("VOICEFILELOCATION >=", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationLessThan(String value) {
            addCriterion("VOICEFILELOCATION <", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationLessThanOrEqualTo(String value) {
            addCriterion("VOICEFILELOCATION <=", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationLike(String value) {
            addCriterion("VOICEFILELOCATION like", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationNotLike(String value) {
            addCriterion("VOICEFILELOCATION not like", value, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationIn(List<String> values) {
            addCriterion("VOICEFILELOCATION in", values, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationNotIn(List<String> values) {
            addCriterion("VOICEFILELOCATION not in", values, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationBetween(String value1, String value2) {
            addCriterion("VOICEFILELOCATION between", value1, value2, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andVoicefilelocationNotBetween(String value1, String value2) {
            addCriterion("VOICEFILELOCATION not between", value1, value2, "voicefilelocation");
            return (Criteria) this;
        }

        public Criteria andPlaceidIsNull() {
            addCriterion("PLACEID is null");
            return (Criteria) this;
        }

        public Criteria andPlaceidIsNotNull() {
            addCriterion("PLACEID is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceidEqualTo(String value) {
            addCriterion("PLACEID =", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotEqualTo(String value) {
            addCriterion("PLACEID <>", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThan(String value) {
            addCriterion("PLACEID >", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThanOrEqualTo(String value) {
            addCriterion("PLACEID >=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThan(String value) {
            addCriterion("PLACEID <", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThanOrEqualTo(String value) {
            addCriterion("PLACEID <=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLike(String value) {
            addCriterion("PLACEID like", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotLike(String value) {
            addCriterion("PLACEID not like", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidIn(List<String> values) {
            addCriterion("PLACEID in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotIn(List<String> values) {
            addCriterion("PLACEID not in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidBetween(String value1, String value2) {
            addCriterion("PLACEID between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotBetween(String value1, String value2) {
            addCriterion("PLACEID not between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andIvrpathIsNull() {
            addCriterion("IVRPATH is null");
            return (Criteria) this;
        }

        public Criteria andIvrpathIsNotNull() {
            addCriterion("IVRPATH is not null");
            return (Criteria) this;
        }

        public Criteria andIvrpathEqualTo(String value) {
            addCriterion("IVRPATH =", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathNotEqualTo(String value) {
            addCriterion("IVRPATH <>", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathGreaterThan(String value) {
            addCriterion("IVRPATH >", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathGreaterThanOrEqualTo(String value) {
            addCriterion("IVRPATH >=", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathLessThan(String value) {
            addCriterion("IVRPATH <", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathLessThanOrEqualTo(String value) {
            addCriterion("IVRPATH <=", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathLike(String value) {
            addCriterion("IVRPATH like", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathNotLike(String value) {
            addCriterion("IVRPATH not like", value, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathIn(List<String> values) {
            addCriterion("IVRPATH in", values, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathNotIn(List<String> values) {
            addCriterion("IVRPATH not in", values, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathBetween(String value1, String value2) {
            addCriterion("IVRPATH between", value1, value2, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andIvrpathNotBetween(String value1, String value2) {
            addCriterion("IVRPATH not between", value1, value2, "ivrpath");
            return (Criteria) this;
        }

        public Criteria andConnidIsNull() {
            addCriterion("CONNID is null");
            return (Criteria) this;
        }

        public Criteria andConnidIsNotNull() {
            addCriterion("CONNID is not null");
            return (Criteria) this;
        }

        public Criteria andConnidEqualTo(String value) {
            addCriterion("CONNID =", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidNotEqualTo(String value) {
            addCriterion("CONNID <>", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidGreaterThan(String value) {
            addCriterion("CONNID >", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidGreaterThanOrEqualTo(String value) {
            addCriterion("CONNID >=", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidLessThan(String value) {
            addCriterion("CONNID <", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidLessThanOrEqualTo(String value) {
            addCriterion("CONNID <=", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidLike(String value) {
            addCriterion("CONNID like", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidNotLike(String value) {
            addCriterion("CONNID not like", value, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidIn(List<String> values) {
            addCriterion("CONNID in", values, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidNotIn(List<String> values) {
            addCriterion("CONNID not in", values, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidBetween(String value1, String value2) {
            addCriterion("CONNID between", value1, value2, "connid");
            return (Criteria) this;
        }

        public Criteria andConnidNotBetween(String value1, String value2) {
            addCriterion("CONNID not between", value1, value2, "connid");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("CONTACTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("CONTACTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("CONTACTNUMBER =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("CONTACTNUMBER <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("CONTACTNUMBER >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTNUMBER >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("CONTACTNUMBER <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("CONTACTNUMBER <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("CONTACTNUMBER like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("CONTACTNUMBER not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("CONTACTNUMBER in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("CONTACTNUMBER not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("CONTACTNUMBER between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("CONTACTNUMBER not between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andVdncdIsNull() {
            addCriterion("VDNCD is null");
            return (Criteria) this;
        }

        public Criteria andVdncdIsNotNull() {
            addCriterion("VDNCD is not null");
            return (Criteria) this;
        }

        public Criteria andVdncdEqualTo(String value) {
            addCriterion("VDNCD =", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdNotEqualTo(String value) {
            addCriterion("VDNCD <>", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdGreaterThan(String value) {
            addCriterion("VDNCD >", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdGreaterThanOrEqualTo(String value) {
            addCriterion("VDNCD >=", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdLessThan(String value) {
            addCriterion("VDNCD <", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdLessThanOrEqualTo(String value) {
            addCriterion("VDNCD <=", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdLike(String value) {
            addCriterion("VDNCD like", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdNotLike(String value) {
            addCriterion("VDNCD not like", value, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdIn(List<String> values) {
            addCriterion("VDNCD in", values, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdNotIn(List<String> values) {
            addCriterion("VDNCD not in", values, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdBetween(String value1, String value2) {
            addCriterion("VDNCD between", value1, value2, "vdncd");
            return (Criteria) this;
        }

        public Criteria andVdncdNotBetween(String value1, String value2) {
            addCriterion("VDNCD not between", value1, value2, "vdncd");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyIsNull() {
            addCriterion("CALLATTENDEDBY is null");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyIsNotNull() {
            addCriterion("CALLATTENDEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyEqualTo(String value) {
            addCriterion("CALLATTENDEDBY =", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyNotEqualTo(String value) {
            addCriterion("CALLATTENDEDBY <>", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyGreaterThan(String value) {
            addCriterion("CALLATTENDEDBY >", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyGreaterThanOrEqualTo(String value) {
            addCriterion("CALLATTENDEDBY >=", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyLessThan(String value) {
            addCriterion("CALLATTENDEDBY <", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyLessThanOrEqualTo(String value) {
            addCriterion("CALLATTENDEDBY <=", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyLike(String value) {
            addCriterion("CALLATTENDEDBY like", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyNotLike(String value) {
            addCriterion("CALLATTENDEDBY not like", value, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyIn(List<String> values) {
            addCriterion("CALLATTENDEDBY in", values, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyNotIn(List<String> values) {
            addCriterion("CALLATTENDEDBY not in", values, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyBetween(String value1, String value2) {
            addCriterion("CALLATTENDEDBY between", value1, value2, "callattendedby");
            return (Criteria) this;
        }

        public Criteria andCallattendedbyNotBetween(String value1, String value2) {
            addCriterion("CALLATTENDEDBY not between", value1, value2, "callattendedby");
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