package com.best1.api.entity.chm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TchmNfmtapedefinitionExample {

    protected String orderByClause;


    protected boolean distinct;

 
    protected List<Criteria> oredCriteria;

 
    public TchmNfmtapedefinitionExample() {
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

        public Criteria andNfmsubchannelidIsNull() {
            addCriterion("NFMSUBCHANNELID is null");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidIsNotNull() {
            addCriterion("NFMSUBCHANNELID is not null");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidEqualTo(Long value) {
            addCriterion("NFMSUBCHANNELID =", value, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidNotEqualTo(Long value) {
            addCriterion("NFMSUBCHANNELID <>", value, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidGreaterThan(Long value) {
            addCriterion("NFMSUBCHANNELID >", value, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidGreaterThanOrEqualTo(Long value) {
            addCriterion("NFMSUBCHANNELID >=", value, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidLessThan(Long value) {
            addCriterion("NFMSUBCHANNELID <", value, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidLessThanOrEqualTo(Long value) {
            addCriterion("NFMSUBCHANNELID <=", value, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidIn(List<Long> values) {
            addCriterion("NFMSUBCHANNELID in", values, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidNotIn(List<Long> values) {
            addCriterion("NFMSUBCHANNELID not in", values, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidBetween(Long value1, Long value2) {
            addCriterion("NFMSUBCHANNELID between", value1, value2, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andNfmsubchannelidNotBetween(Long value1, Long value2) {
            addCriterion("NFMSUBCHANNELID not between", value1, value2, "nfmsubchannelid");
            return (Criteria) this;
        }

        public Criteria andTapetypeIsNull() {
            addCriterion("TAPETYPE is null");
            return (Criteria) this;
        }

        public Criteria andTapetypeIsNotNull() {
            addCriterion("TAPETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTapetypeEqualTo(Integer value) {
            addCriterion("TAPETYPE =", value, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeNotEqualTo(Integer value) {
            addCriterion("TAPETYPE <>", value, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeGreaterThan(Integer value) {
            addCriterion("TAPETYPE >", value, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAPETYPE >=", value, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeLessThan(Integer value) {
            addCriterion("TAPETYPE <", value, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeLessThanOrEqualTo(Integer value) {
            addCriterion("TAPETYPE <=", value, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeIn(List<Integer> values) {
            addCriterion("TAPETYPE in", values, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeNotIn(List<Integer> values) {
            addCriterion("TAPETYPE not in", values, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeBetween(Integer value1, Integer value2) {
            addCriterion("TAPETYPE between", value1, value2, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TAPETYPE not between", value1, value2, "tapetype");
            return (Criteria) this;
        }

        public Criteria andTapestatusIsNull() {
            addCriterion("TAPESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTapestatusIsNotNull() {
            addCriterion("TAPESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTapestatusEqualTo(Integer value) {
            addCriterion("TAPESTATUS =", value, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusNotEqualTo(Integer value) {
            addCriterion("TAPESTATUS <>", value, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusGreaterThan(Integer value) {
            addCriterion("TAPESTATUS >", value, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAPESTATUS >=", value, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusLessThan(Integer value) {
            addCriterion("TAPESTATUS <", value, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusLessThanOrEqualTo(Integer value) {
            addCriterion("TAPESTATUS <=", value, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusIn(List<Integer> values) {
            addCriterion("TAPESTATUS in", values, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusNotIn(List<Integer> values) {
            addCriterion("TAPESTATUS not in", values, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusBetween(Integer value1, Integer value2) {
            addCriterion("TAPESTATUS between", value1, value2, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andTapestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TAPESTATUS not between", value1, value2, "tapestatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusIsNull() {
            addCriterion("CONTENTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andContentstatusIsNotNull() {
            addCriterion("CONTENTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andContentstatusEqualTo(Integer value) {
            addCriterion("CONTENTSTATUS =", value, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusNotEqualTo(Integer value) {
            addCriterion("CONTENTSTATUS <>", value, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusGreaterThan(Integer value) {
            addCriterion("CONTENTSTATUS >", value, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTENTSTATUS >=", value, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusLessThan(Integer value) {
            addCriterion("CONTENTSTATUS <", value, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusLessThanOrEqualTo(Integer value) {
            addCriterion("CONTENTSTATUS <=", value, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusIn(List<Integer> values) {
            addCriterion("CONTENTSTATUS in", values, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusNotIn(List<Integer> values) {
            addCriterion("CONTENTSTATUS not in", values, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusBetween(Integer value1, Integer value2) {
            addCriterion("CONTENTSTATUS between", value1, value2, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andContentstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTENTSTATUS not between", value1, value2, "contentstatus");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberIsNull() {
            addCriterion("OVERWRITINGNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberIsNotNull() {
            addCriterion("OVERWRITINGNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberEqualTo(Integer value) {
            addCriterion("OVERWRITINGNUMBER =", value, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberNotEqualTo(Integer value) {
            addCriterion("OVERWRITINGNUMBER <>", value, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberGreaterThan(Integer value) {
            addCriterion("OVERWRITINGNUMBER >", value, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERWRITINGNUMBER >=", value, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberLessThan(Integer value) {
            addCriterion("OVERWRITINGNUMBER <", value, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberLessThanOrEqualTo(Integer value) {
            addCriterion("OVERWRITINGNUMBER <=", value, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberIn(List<Integer> values) {
            addCriterion("OVERWRITINGNUMBER in", values, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberNotIn(List<Integer> values) {
            addCriterion("OVERWRITINGNUMBER not in", values, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberBetween(Integer value1, Integer value2) {
            addCriterion("OVERWRITINGNUMBER between", value1, value2, "overwritingnumber");
            return (Criteria) this;
        }

        public Criteria andOverwritingnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERWRITINGNUMBER not between", value1, value2, "overwritingnumber");
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

        public Criteria andTaperetentionperiodIsNull() {
            addCriterion("TAPERETENTIONPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodIsNotNull() {
            addCriterion("TAPERETENTIONPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodEqualTo(Date value) {
            addCriterion("TAPERETENTIONPERIOD =", value, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodNotEqualTo(Date value) {
            addCriterion("TAPERETENTIONPERIOD <>", value, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodGreaterThan(Date value) {
            addCriterion("TAPERETENTIONPERIOD >", value, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodGreaterThanOrEqualTo(Date value) {
            addCriterion("TAPERETENTIONPERIOD >=", value, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodLessThan(Date value) {
            addCriterion("TAPERETENTIONPERIOD <", value, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodLessThanOrEqualTo(Date value) {
            addCriterion("TAPERETENTIONPERIOD <=", value, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodIn(List<Date> values) {
            addCriterion("TAPERETENTIONPERIOD in", values, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodNotIn(List<Date> values) {
            addCriterion("TAPERETENTIONPERIOD not in", values, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodBetween(Date value1, Date value2) {
            addCriterion("TAPERETENTIONPERIOD between", value1, value2, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTaperetentionperiodNotBetween(Date value1, Date value2) {
            addCriterion("TAPERETENTIONPERIOD not between", value1, value2, "taperetentionperiod");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineIsNull() {
            addCriterion("TAPEDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineIsNotNull() {
            addCriterion("TAPEDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineEqualTo(Date value) {
            addCriterion("TAPEDEADLINE =", value, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineNotEqualTo(Date value) {
            addCriterion("TAPEDEADLINE <>", value, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineGreaterThan(Date value) {
            addCriterion("TAPEDEADLINE >", value, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("TAPEDEADLINE >=", value, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineLessThan(Date value) {
            addCriterion("TAPEDEADLINE <", value, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineLessThanOrEqualTo(Date value) {
            addCriterion("TAPEDEADLINE <=", value, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineIn(List<Date> values) {
            addCriterion("TAPEDEADLINE in", values, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineNotIn(List<Date> values) {
            addCriterion("TAPEDEADLINE not in", values, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineBetween(Date value1, Date value2) {
            addCriterion("TAPEDEADLINE between", value1, value2, "tapedeadline");
            return (Criteria) this;
        }

        public Criteria andTapedeadlineNotBetween(Date value1, Date value2) {
            addCriterion("TAPEDEADLINE not between", value1, value2, "tapedeadline");
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

        public Criteria andTapenameIsNull() {
            addCriterion("TAPENAME is null");
            return (Criteria) this;
        }

        public Criteria andTapenameIsNotNull() {
            addCriterion("TAPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTapenameEqualTo(String value) {
            addCriterion("TAPENAME =", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameNotEqualTo(String value) {
            addCriterion("TAPENAME <>", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameGreaterThan(String value) {
            addCriterion("TAPENAME >", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameGreaterThanOrEqualTo(String value) {
            addCriterion("TAPENAME >=", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameLessThan(String value) {
            addCriterion("TAPENAME <", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameLessThanOrEqualTo(String value) {
            addCriterion("TAPENAME <=", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameLike(String value) {
            addCriterion("TAPENAME like", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameNotLike(String value) {
            addCriterion("TAPENAME not like", value, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameIn(List<String> values) {
            addCriterion("TAPENAME in", values, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameNotIn(List<String> values) {
            addCriterion("TAPENAME not in", values, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameBetween(String value1, String value2) {
            addCriterion("TAPENAME between", value1, value2, "tapename");
            return (Criteria) this;
        }

        public Criteria andTapenameNotBetween(String value1, String value2) {
            addCriterion("TAPENAME not between", value1, value2, "tapename");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andFathertapenameIsNull() {
            addCriterion("FATHERTAPENAME is null");
            return (Criteria) this;
        }

        public Criteria andFathertapenameIsNotNull() {
            addCriterion("FATHERTAPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFathertapenameEqualTo(String value) {
            addCriterion("FATHERTAPENAME =", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameNotEqualTo(String value) {
            addCriterion("FATHERTAPENAME <>", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameGreaterThan(String value) {
            addCriterion("FATHERTAPENAME >", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameGreaterThanOrEqualTo(String value) {
            addCriterion("FATHERTAPENAME >=", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameLessThan(String value) {
            addCriterion("FATHERTAPENAME <", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameLessThanOrEqualTo(String value) {
            addCriterion("FATHERTAPENAME <=", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameLike(String value) {
            addCriterion("FATHERTAPENAME like", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameNotLike(String value) {
            addCriterion("FATHERTAPENAME not like", value, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameIn(List<String> values) {
            addCriterion("FATHERTAPENAME in", values, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameNotIn(List<String> values) {
            addCriterion("FATHERTAPENAME not in", values, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameBetween(String value1, String value2) {
            addCriterion("FATHERTAPENAME between", value1, value2, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andFathertapenameNotBetween(String value1, String value2) {
            addCriterion("FATHERTAPENAME not between", value1, value2, "fathertapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameIsNull() {
            addCriterion("CHILDTAPENAME is null");
            return (Criteria) this;
        }

        public Criteria andChildtapenameIsNotNull() {
            addCriterion("CHILDTAPENAME is not null");
            return (Criteria) this;
        }

        public Criteria andChildtapenameEqualTo(String value) {
            addCriterion("CHILDTAPENAME =", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameNotEqualTo(String value) {
            addCriterion("CHILDTAPENAME <>", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameGreaterThan(String value) {
            addCriterion("CHILDTAPENAME >", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameGreaterThanOrEqualTo(String value) {
            addCriterion("CHILDTAPENAME >=", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameLessThan(String value) {
            addCriterion("CHILDTAPENAME <", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameLessThanOrEqualTo(String value) {
            addCriterion("CHILDTAPENAME <=", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameLike(String value) {
            addCriterion("CHILDTAPENAME like", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameNotLike(String value) {
            addCriterion("CHILDTAPENAME not like", value, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameIn(List<String> values) {
            addCriterion("CHILDTAPENAME in", values, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameNotIn(List<String> values) {
            addCriterion("CHILDTAPENAME not in", values, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameBetween(String value1, String value2) {
            addCriterion("CHILDTAPENAME between", value1, value2, "childtapename");
            return (Criteria) this;
        }

        public Criteria andChildtapenameNotBetween(String value1, String value2) {
            addCriterion("CHILDTAPENAME not between", value1, value2, "childtapename");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TCHM_NFMTAPEDEFINITION
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 18 10:32:53 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TCHM_NFMTAPEDEFINITION
     *
     * @mbggenerated Thu Aug 18 10:32:53 CST 2016
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