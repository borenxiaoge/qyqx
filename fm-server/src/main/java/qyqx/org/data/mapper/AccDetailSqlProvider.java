package qyqx.org.data.mapper;

import qyqx.org.data.po.AccDetail;
import qyqx.org.data.po.AccDetailExample;
import qyqx.org.data.po.AccDetailExample.Criteria;
import qyqx.org.data.po.AccDetailExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class AccDetailSqlProvider {

    public String countByExample(AccDetailExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("acc_detail");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(AccDetailExample example) {
        BEGIN();
        DELETE_FROM("acc_detail");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(AccDetail record) {
        BEGIN();
        INSERT_INTO("acc_detail");
        
        if (record.getAccDetailId() != null) {
            VALUES("acc_detail_id", "#{accDetailId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccTypeId() != null) {
            VALUES("acc_type_id", "#{accTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccBookId() != null) {
            VALUES("acc_book_id", "#{accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getTrdAmount() != null) {
            VALUES("trd_amount", "#{trdAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTrdDate() != null) {
            VALUES("trd_date", "#{trdDate,jdbcType=DATE}");
        }
        
        if (record.getTrdType() != null) {
            VALUES("trd_type", "#{trdType,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            VALUES("last_up_time", "#{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(AccDetailExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("acc_detail_id");
        } else {
            SELECT("acc_detail_id");
        }
        SELECT("acc_type_id");
        SELECT("acc_book_id");
        SELECT("user_id");
        SELECT("trd_amount");
        SELECT("trd_date");
        SELECT("trd_type");
        SELECT("remark");
        SELECT("last_up_time");
        FROM("acc_detail");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccDetail record = (AccDetail) parameter.get("record");
        AccDetailExample example = (AccDetailExample) parameter.get("example");
        
        BEGIN();
        UPDATE("acc_detail");
        
        if (record.getAccDetailId() != null) {
            SET("acc_detail_id = #{record.accDetailId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccTypeId() != null) {
            SET("acc_type_id = #{record.accTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccBookId() != null) {
            SET("acc_book_id = #{record.accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getTrdAmount() != null) {
            SET("trd_amount = #{record.trdAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTrdDate() != null) {
            SET("trd_date = #{record.trdDate,jdbcType=DATE}");
        }
        
        if (record.getTrdType() != null) {
            SET("trd_type = #{record.trdType,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("acc_detail");
        
        SET("acc_detail_id = #{record.accDetailId,jdbcType=VARCHAR}");
        SET("acc_type_id = #{record.accTypeId,jdbcType=VARCHAR}");
        SET("acc_book_id = #{record.accBookId,jdbcType=VARCHAR}");
        SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        SET("trd_amount = #{record.trdAmount,jdbcType=DECIMAL}");
        SET("trd_date = #{record.trdDate,jdbcType=DATE}");
        SET("trd_type = #{record.trdType,jdbcType=INTEGER}");
        SET("remark = #{record.remark,jdbcType=VARCHAR}");
        SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        
        AccDetailExample example = (AccDetailExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(AccDetail record) {
        BEGIN();
        UPDATE("acc_detail");
        
        if (record.getAccTypeId() != null) {
            SET("acc_type_id = #{accTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccBookId() != null) {
            SET("acc_book_id = #{accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getTrdAmount() != null) {
            SET("trd_amount = #{trdAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTrdDate() != null) {
            SET("trd_date = #{trdDate,jdbcType=DATE}");
        }
        
        if (record.getTrdType() != null) {
            SET("trd_type = #{trdType,jdbcType=INTEGER}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("acc_detail_id = #{accDetailId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(AccDetailExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}