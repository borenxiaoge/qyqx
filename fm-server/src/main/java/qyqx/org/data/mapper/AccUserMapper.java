package qyqx.org.data.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import qyqx.org.data.po.AccUser;
import qyqx.org.data.po.AccUserExample;
import qyqx.org.data.po.AccUserKey;

import java.util.List;

public interface AccUserMapper {
    @SelectProvider(type=AccUserSqlProvider.class, method="countByExample")
    int countByExample(AccUserExample example);

    @DeleteProvider(type=AccUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccUserExample example);

    @Delete({
        "delete from acc_user",
        "where user_id = #{userId,jdbcType=VARCHAR}",
          "and open_id = #{openId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(AccUserKey key);

    @Insert({
        "insert into acc_user (user_id, open_id, ",
        "user_name, register_date, ",
        "register_time, avatarUrl, ",
        "gender, language, country, ",
        "province, city, ",
        "last_up_time)",
        "values (#{userId,jdbcType=VARCHAR}, #{openId,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{registerDate,jdbcType=DATE}, ",
        "#{registerTime,jdbcType=TIME}, #{avatarurl,jdbcType=VARCHAR}, ",
        "#{gender,jdbcType=CHAR}, #{language,jdbcType=VARCHAR}, #{country,jdbcType=VARCHAR}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{lastUpTime,jdbcType=TIMESTAMP})"
    })
    int insert(AccUser record);

    @InsertProvider(type=AccUserSqlProvider.class, method="insertSelective")
    int insertSelective(AccUser record);

    @SelectProvider(type=AccUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="open_id", property="openId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_date", property="registerDate", jdbcType=JdbcType.DATE),
        @Result(column="register_time", property="registerTime", jdbcType=JdbcType.TIME),
        @Result(column="avatarUrl", property="avatarurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.CHAR),
        @Result(column="language", property="language", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_up_time", property="lastUpTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AccUser> selectByExample(AccUserExample example);

    @Select({
        "select",
        "user_id, open_id, user_name, register_date, register_time, avatarUrl, gender, ",
        "language, country, province, city, last_up_time",
        "from acc_user",
        "where user_id = #{userId,jdbcType=VARCHAR}",
          "and open_id = #{openId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="open_id", property="openId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_date", property="registerDate", jdbcType=JdbcType.DATE),
        @Result(column="register_time", property="registerTime", jdbcType=JdbcType.TIME),
        @Result(column="avatarUrl", property="avatarurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.CHAR),
        @Result(column="language", property="language", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_up_time", property="lastUpTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AccUser selectByPrimaryKey(AccUserKey key);

    @UpdateProvider(type=AccUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccUser record, @Param("example") AccUserExample example);

    @UpdateProvider(type=AccUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccUser record, @Param("example") AccUserExample example);

    @UpdateProvider(type=AccUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccUser record);

    @Update({
        "update acc_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "register_date = #{registerDate,jdbcType=DATE},",
          "register_time = #{registerTime,jdbcType=TIME},",
          "avatarUrl = #{avatarurl,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=CHAR},",
          "language = #{language,jdbcType=VARCHAR},",
          "country = #{country,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "last_up_time = #{lastUpTime,jdbcType=TIMESTAMP}",
        "where user_id = #{userId,jdbcType=VARCHAR}",
          "and open_id = #{openId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(AccUser record);
}