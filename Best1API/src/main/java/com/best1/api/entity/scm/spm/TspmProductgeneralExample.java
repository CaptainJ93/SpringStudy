package com.best1.api.entity.scm.spm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TspmProductgeneralExample {
  
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public TspmProductgeneralExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andProductmiscinfoidIsNull() {
			addCriterion("PRODUCTMISCINFOID is null");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidIsNotNull() {
			addCriterion("PRODUCTMISCINFOID is not null");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidEqualTo(Long value) {
			addCriterion("PRODUCTMISCINFOID =", value, "productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidNotEqualTo(Long value) {
			addCriterion("PRODUCTMISCINFOID <>", value, "productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidGreaterThan(Long value) {
			addCriterion("PRODUCTMISCINFOID >", value, "productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidGreaterThanOrEqualTo(Long value) {
			addCriterion("PRODUCTMISCINFOID >=", value, "productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidLessThan(Long value) {
			addCriterion("PRODUCTMISCINFOID <", value, "productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidLessThanOrEqualTo(Long value) {
			addCriterion("PRODUCTMISCINFOID <=", value, "productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidIn(List<Long> values) {
			addCriterion("PRODUCTMISCINFOID in", values, "productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidNotIn(List<Long> values) {
			addCriterion("PRODUCTMISCINFOID not in", values,
					"productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidBetween(Long value1, Long value2) {
			addCriterion("PRODUCTMISCINFOID between", value1, value2,
					"productmiscinfoid");
			return (Criteria) this;
		}

		public Criteria andProductmiscinfoidNotBetween(Long value1, Long value2) {
			addCriterion("PRODUCTMISCINFOID not between", value1, value2,
					"productmiscinfoid");
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

		public Criteria andGeneralinfocodeIsNull() {
			addCriterion("GENERALINFOCODE is null");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeIsNotNull() {
			addCriterion("GENERALINFOCODE is not null");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeEqualTo(Integer value) {
			addCriterion("GENERALINFOCODE =", value, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeNotEqualTo(Integer value) {
			addCriterion("GENERALINFOCODE <>", value, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeGreaterThan(Integer value) {
			addCriterion("GENERALINFOCODE >", value, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeGreaterThanOrEqualTo(Integer value) {
			addCriterion("GENERALINFOCODE >=", value, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeLessThan(Integer value) {
			addCriterion("GENERALINFOCODE <", value, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeLessThanOrEqualTo(Integer value) {
			addCriterion("GENERALINFOCODE <=", value, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeIn(List<Integer> values) {
			addCriterion("GENERALINFOCODE in", values, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeNotIn(List<Integer> values) {
			addCriterion("GENERALINFOCODE not in", values, "generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeBetween(Integer value1, Integer value2) {
			addCriterion("GENERALINFOCODE between", value1, value2,
					"generalinfocode");
			return (Criteria) this;
		}

		public Criteria andGeneralinfocodeNotBetween(Integer value1, Integer value2) {
			addCriterion("GENERALINFOCODE not between", value1, value2,
					"generalinfocode");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceIsNull() {
			addCriterion("COMMENTSEQUENCE is null");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceIsNotNull() {
			addCriterion("COMMENTSEQUENCE is not null");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceEqualTo(Integer value) {
			addCriterion("COMMENTSEQUENCE =", value, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceNotEqualTo(Integer value) {
			addCriterion("COMMENTSEQUENCE <>", value, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceGreaterThan(Integer value) {
			addCriterion("COMMENTSEQUENCE >", value, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceGreaterThanOrEqualTo(Integer value) {
			addCriterion("COMMENTSEQUENCE >=", value, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceLessThan(Integer value) {
			addCriterion("COMMENTSEQUENCE <", value, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceLessThanOrEqualTo(Integer value) {
			addCriterion("COMMENTSEQUENCE <=", value, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceIn(List<Integer> values) {
			addCriterion("COMMENTSEQUENCE in", values, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceNotIn(List<Integer> values) {
			addCriterion("COMMENTSEQUENCE not in", values, "commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceBetween(Integer value1, Integer value2) {
			addCriterion("COMMENTSEQUENCE between", value1, value2,
					"commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsequenceNotBetween(Integer value1, Integer value2) {
			addCriterion("COMMENTSEQUENCE not between", value1, value2,
					"commentsequence");
			return (Criteria) this;
		}

		public Criteria andCommentsIsNull() {
			addCriterion("COMMENTS is null");
			return (Criteria) this;
		}

		public Criteria andCommentsIsNotNull() {
			addCriterion("COMMENTS is not null");
			return (Criteria) this;
		}

		public Criteria andCommentsEqualTo(String value) {
			addCriterion("COMMENTS =", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotEqualTo(String value) {
			addCriterion("COMMENTS <>", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsGreaterThan(String value) {
			addCriterion("COMMENTS >", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsGreaterThanOrEqualTo(String value) {
			addCriterion("COMMENTS >=", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsLessThan(String value) {
			addCriterion("COMMENTS <", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsLessThanOrEqualTo(String value) {
			addCriterion("COMMENTS <=", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsLike(String value) {
			addCriterion("COMMENTS like", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotLike(String value) {
			addCriterion("COMMENTS not like", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsIn(List<String> values) {
			addCriterion("COMMENTS in", values, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotIn(List<String> values) {
			addCriterion("COMMENTS not in", values, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsBetween(String value1, String value2) {
			addCriterion("COMMENTS between", value1, value2, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotBetween(String value1, String value2) {
			addCriterion("COMMENTS not between", value1, value2, "comments");
			return (Criteria) this;
		}

		public Criteria andCommenttypeIsNull() {
			addCriterion("COMMENTTYPE is null");
			return (Criteria) this;
		}

		public Criteria andCommenttypeIsNotNull() {
			addCriterion("COMMENTTYPE is not null");
			return (Criteria) this;
		}

		public Criteria andCommenttypeEqualTo(String value) {
			addCriterion("COMMENTTYPE =", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeNotEqualTo(String value) {
			addCriterion("COMMENTTYPE <>", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeGreaterThan(String value) {
			addCriterion("COMMENTTYPE >", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeGreaterThanOrEqualTo(String value) {
			addCriterion("COMMENTTYPE >=", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeLessThan(String value) {
			addCriterion("COMMENTTYPE <", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeLessThanOrEqualTo(String value) {
			addCriterion("COMMENTTYPE <=", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeLike(String value) {
			addCriterion("COMMENTTYPE like", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeNotLike(String value) {
			addCriterion("COMMENTTYPE not like", value, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeIn(List<String> values) {
			addCriterion("COMMENTTYPE in", values, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeNotIn(List<String> values) {
			addCriterion("COMMENTTYPE not in", values, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeBetween(String value1, String value2) {
			addCriterion("COMMENTTYPE between", value1, value2, "commenttype");
			return (Criteria) this;
		}

		public Criteria andCommenttypeNotBetween(String value1, String value2) {
			addCriterion("COMMENTTYPE not between", value1, value2,
					"commenttype");
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
			addCriterion("CREATEDTIMESTAMP between", value1, value2,
					"createdtimestamp");
			return (Criteria) this;
		}

		public Criteria andCreatedtimestampNotBetween(Date value1, Date value2) {
			addCriterion("CREATEDTIMESTAMP not between", value1, value2,
					"createdtimestamp");
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
			addCriterion("LASTMODIFIEDBY between", value1, value2,
					"lastmodifiedby");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedbyNotBetween(Long value1, Long value2) {
			addCriterion("LASTMODIFIEDBY not between", value1, value2,
					"lastmodifiedby");
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
			addCriterion("LASTMODIFIEDTIMESTAMP =", value,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampNotEqualTo(Date value) {
			addCriterion("LASTMODIFIEDTIMESTAMP <>", value,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampGreaterThan(Date value) {
			addCriterion("LASTMODIFIEDTIMESTAMP >", value,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampGreaterThanOrEqualTo(Date value) {
			addCriterion("LASTMODIFIEDTIMESTAMP >=", value,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampLessThan(Date value) {
			addCriterion("LASTMODIFIEDTIMESTAMP <", value,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampLessThanOrEqualTo(Date value) {
			addCriterion("LASTMODIFIEDTIMESTAMP <=", value,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampIn(List<Date> values) {
			addCriterion("LASTMODIFIEDTIMESTAMP in", values,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampNotIn(List<Date> values) {
			addCriterion("LASTMODIFIEDTIMESTAMP not in", values,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampBetween(Date value1, Date value2) {
			addCriterion("LASTMODIFIEDTIMESTAMP between", value1, value2,
					"lastmodifiedtimestamp");
			return (Criteria) this;
		}

		public Criteria andLastmodifiedtimestampNotBetween(Date value1,
				Date value2) {
			addCriterion("LASTMODIFIEDTIMESTAMP not between", value1, value2,
					"lastmodifiedtimestamp");
			return (Criteria) this;
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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


    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}