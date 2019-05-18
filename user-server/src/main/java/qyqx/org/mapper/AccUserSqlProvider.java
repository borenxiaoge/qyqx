package qyqx.org.mapper;


import java.util.List;
import java.util.Map;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import qyqx.org.po.AccUser;
import qyqx.org.po.AccUserExample;
import qyqx.org.po.AccUserExample.Criteria;
import qyqx.org.po.AccUserExample.Criterion;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class AccUserSqlProvider {

    public String countByExample(AccUserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("acc_user");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(AccUserExample example) {
        BEGIN();
        DELETE_FROM("acc_user");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(AccUser record) {
        BEGIN();
        INSERT_INTO("acc_user");
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            VALUES("open_id", "#{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterDate() != null) {
            VALUES("register_date", "#{registerDate,jdbcType=DATE}");
        }
        
        if (record.getRegisterTime() != null) {
            VALUES("register_time", "#{registerTime,jdbcType=TIME}");
        }
        
        if (record.getAvatarurl() != null) {
            VALUES("avatarUrl", "#{avatarurl,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            VALUES("gender", "#{gender,jdbcType=CHAR}");
        }
        
        if (record.getLanguage() != null) {
            VALUES("language", "#{language,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            VALUES("country", "#{country,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            VALUES("last_up_time", "#{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(AccUserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("user_id");
        } else {
            SELECT("user_id");
        }
        SELECT("open_id");
        SELECT("user_name");
        SELECT("register_date");
        SELECT("register_time");
        SELECT("avatarUrl");
        SELECT("gender");
        SELECT("language");
        SELECT("country");
        SELECT("province");
        SELECT("city");
        SELECT("last_up_time");
        FROM("acc_user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccUser record = (AccUser) parameter.get("record");
        AccUserExample example = (AccUserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("acc_user");
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterDate() != null) {
            SET("register_date = #{record.registerDate,jdbcType=DATE}");
        }
        
        if (record.getRegisterTime() != null) {
            SET("register_time = #{record.registerTime,jdbcType=TIME}");
        }
        
        if (record.getAvatarurl() != null) {
            SET("avatarUrl = #{record.avatarurl,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            SET("gender = #{record.gender,jdbcType=CHAR}");
        }
        
        if (record.getLanguage() != null) {
            SET("language = #{record.language,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            SET("country = #{record.country,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{record.province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{record.city,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("acc_user");
        
        SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        SET("register_date = #{record.registerDate,jdbcType=DATE}");
        SET("register_time = #{record.registerTime,jdbcType=TIME}");
        SET("avatarUrl = #{record.avatarurl,jdbcType=VARCHAR}");
        SET("gender = #{record.gender,jdbcType=CHAR}");
        SET("language = #{record.language,jdbcType=VARCHAR}");
        SET("country = #{record.country,jdbcType=VARCHAR}");
        SET("province = #{record.province,jdbcType=VARCHAR}");
        SET("city = #{record.city,jdbcType=VARCHAR}");
        SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        
        AccUserExample example = (AccUserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(AccUser record) {
        BEGIN();
        UPDATE("acc_user");
        
        if (record.getUserName() != null) {
            SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterDate() != null) {
            SET("register_date = #{registerDate,jdbcType=DATE}");
        }
        
        if (record.getRegisterTime() != null) {
            SET("register_time = #{registerTime,jdbcType=TIME}");
        }
        
        if (record.getAvatarurl() != null) {
            SET("avatarUrl = #{avatarurl,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            SET("gender = #{gender,jdbcType=CHAR}");
        }
        
        if (record.getLanguage() != null) {
            SET("language = #{language,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            SET("country = #{country,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("user_id = #{userId,jdbcType=VARCHAR}");
        WHERE("open_id = #{openId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(AccUserExample example, boolean includeExamplePhrase) {
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