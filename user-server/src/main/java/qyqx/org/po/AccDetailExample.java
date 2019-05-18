package qyqx.org.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccDetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAccDetailIdIsNull() {
            addCriterion("acc_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdIsNotNull() {
            addCriterion("acc_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdEqualTo(String value) {
            addCriterion("acc_detail_id =", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdNotEqualTo(String value) {
            addCriterion("acc_detail_id <>", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdGreaterThan(String value) {
            addCriterion("acc_detail_id >", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("acc_detail_id >=", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdLessThan(String value) {
            addCriterion("acc_detail_id <", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdLessThanOrEqualTo(String value) {
            addCriterion("acc_detail_id <=", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdLike(String value) {
            addCriterion("acc_detail_id like", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdNotLike(String value) {
            addCriterion("acc_detail_id not like", value, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdIn(List<String> values) {
            addCriterion("acc_detail_id in", values, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdNotIn(List<String> values) {
            addCriterion("acc_detail_id not in", values, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdBetween(String value1, String value2) {
            addCriterion("acc_detail_id between", value1, value2, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccDetailIdNotBetween(String value1, String value2) {
            addCriterion("acc_detail_id not between", value1, value2, "accDetailId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdIsNull() {
            addCriterion("acc_type_id is null");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdIsNotNull() {
            addCriterion("acc_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdEqualTo(String value) {
            addCriterion("acc_type_id =", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdNotEqualTo(String value) {
            addCriterion("acc_type_id <>", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdGreaterThan(String value) {
            addCriterion("acc_type_id >", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("acc_type_id >=", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdLessThan(String value) {
            addCriterion("acc_type_id <", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdLessThanOrEqualTo(String value) {
            addCriterion("acc_type_id <=", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdLike(String value) {
            addCriterion("acc_type_id like", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdNotLike(String value) {
            addCriterion("acc_type_id not like", value, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdIn(List<String> values) {
            addCriterion("acc_type_id in", values, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdNotIn(List<String> values) {
            addCriterion("acc_type_id not in", values, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdBetween(String value1, String value2) {
            addCriterion("acc_type_id between", value1, value2, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccTypeIdNotBetween(String value1, String value2) {
            addCriterion("acc_type_id not between", value1, value2, "accTypeId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdIsNull() {
            addCriterion("acc_book_id is null");
            return (Criteria) this;
        }

        public Criteria andAccBookIdIsNotNull() {
            addCriterion("acc_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccBookIdEqualTo(String value) {
            addCriterion("acc_book_id =", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotEqualTo(String value) {
            addCriterion("acc_book_id <>", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdGreaterThan(String value) {
            addCriterion("acc_book_id >", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("acc_book_id >=", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdLessThan(String value) {
            addCriterion("acc_book_id <", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdLessThanOrEqualTo(String value) {
            addCriterion("acc_book_id <=", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdLike(String value) {
            addCriterion("acc_book_id like", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotLike(String value) {
            addCriterion("acc_book_id not like", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdIn(List<String> values) {
            addCriterion("acc_book_id in", values, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotIn(List<String> values) {
            addCriterion("acc_book_id not in", values, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdBetween(String value1, String value2) {
            addCriterion("acc_book_id between", value1, value2, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotBetween(String value1, String value2) {
            addCriterion("acc_book_id not between", value1, value2, "accBookId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTrdAmountIsNull() {
            addCriterion("trd_amount is null");
            return (Criteria) this;
        }

        public Criteria andTrdAmountIsNotNull() {
            addCriterion("trd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTrdAmountEqualTo(BigDecimal value) {
            addCriterion("trd_amount =", value, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountNotEqualTo(BigDecimal value) {
            addCriterion("trd_amount <>", value, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountGreaterThan(BigDecimal value) {
            addCriterion("trd_amount >", value, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trd_amount >=", value, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountLessThan(BigDecimal value) {
            addCriterion("trd_amount <", value, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trd_amount <=", value, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountIn(List<BigDecimal> values) {
            addCriterion("trd_amount in", values, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountNotIn(List<BigDecimal> values) {
            addCriterion("trd_amount not in", values, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trd_amount between", value1, value2, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trd_amount not between", value1, value2, "trdAmount");
            return (Criteria) this;
        }

        public Criteria andTrdDateIsNull() {
            addCriterion("trd_date is null");
            return (Criteria) this;
        }

        public Criteria andTrdDateIsNotNull() {
            addCriterion("trd_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrdDateEqualTo(Date value) {
            addCriterionForJDBCDate("trd_date =", value, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trd_date <>", value, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trd_date >", value, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trd_date >=", value, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateLessThan(Date value) {
            addCriterionForJDBCDate("trd_date <", value, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trd_date <=", value, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateIn(List<Date> values) {
            addCriterionForJDBCDate("trd_date in", values, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trd_date not in", values, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trd_date between", value1, value2, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trd_date not between", value1, value2, "trdDate");
            return (Criteria) this;
        }

        public Criteria andTrdTypeIsNull() {
            addCriterion("trd_type is null");
            return (Criteria) this;
        }

        public Criteria andTrdTypeIsNotNull() {
            addCriterion("trd_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrdTypeEqualTo(Integer value) {
            addCriterion("trd_type =", value, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeNotEqualTo(Integer value) {
            addCriterion("trd_type <>", value, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeGreaterThan(Integer value) {
            addCriterion("trd_type >", value, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trd_type >=", value, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeLessThan(Integer value) {
            addCriterion("trd_type <", value, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trd_type <=", value, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeIn(List<Integer> values) {
            addCriterion("trd_type in", values, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeNotIn(List<Integer> values) {
            addCriterion("trd_type not in", values, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeBetween(Integer value1, Integer value2) {
            addCriterion("trd_type between", value1, value2, "trdType");
            return (Criteria) this;
        }

        public Criteria andTrdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trd_type not between", value1, value2, "trdType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeIsNull() {
            addCriterion("last_up_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeIsNotNull() {
            addCriterion("last_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeEqualTo(Date value) {
            addCriterion("last_up_time =", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeNotEqualTo(Date value) {
            addCriterion("last_up_time <>", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeGreaterThan(Date value) {
            addCriterion("last_up_time >", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_up_time >=", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeLessThan(Date value) {
            addCriterion("last_up_time <", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_up_time <=", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeIn(List<Date> values) {
            addCriterion("last_up_time in", values, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeNotIn(List<Date> values) {
            addCriterion("last_up_time not in", values, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeBetween(Date value1, Date value2) {
            addCriterion("last_up_time between", value1, value2, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_up_time not between", value1, value2, "lastUpTime");
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