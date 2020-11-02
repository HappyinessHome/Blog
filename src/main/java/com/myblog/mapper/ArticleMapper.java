package com.myblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myblog.model.Article;
import com.myblog.utils.MyLocalDateTimeTypeHandler;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
@Repository
public interface ArticleMapper extends BaseMapper<Article> {

    @Select("select * from article where classification=#{classid} and code=2 order by ord desc limit #{limi}")
    @Results(
            @Result(column = "time",property = "time",javaType = LocalDateTime.class,jdbcType = JdbcType.DATE,typeHandler = MyLocalDateTimeTypeHandler.class)
    )
    List<Article> getByClassLimit(@Param("classid")Integer id,@Param("limi") Integer limit);
    @Select("select * from article where code=#{code}")
    @Results(
            @Result(column = "time",property = "time",javaType = LocalDateTime.class,jdbcType = JdbcType.DATE,typeHandler = MyLocalDateTimeTypeHandler.class)
    )
    List<Article> getByCode(@Param("code")Integer code);
    @Select("select * from article where code=2 order by time desc limit 7")
    @Results(
            @Result(column = "time",property = "time",javaType = LocalDateTime.class,jdbcType = JdbcType.DATE,typeHandler = MyLocalDateTimeTypeHandler.class)
    )
    List<Article> getByOrderTime();
    @Select("select * from article where code=2 and classification=#{classid} order by time desc limit #{start},#{size}")
    @Results(
            @Result(column = "time",property = "time",javaType = LocalDateTime.class,jdbcType = JdbcType.DATE,typeHandler = MyLocalDateTimeTypeHandler.class)
    )
    List<Article> getPage(@Param("classid")Integer classid,@Param("start")Integer start,@Param("size")Integer size);
    @Select("select * from article where id=#{id}")
    @Results(
            @Result(column = "time",property = "time",javaType = LocalDateTime.class,jdbcType = JdbcType.DATE,typeHandler = MyLocalDateTimeTypeHandler.class)
    )
    Article getByArticleId(@Param("id") Integer id);
    @Select("select count(1) from article where classification=#{classid} and code=2")
    Long getCountWithClassid(@Param("classid")Integer classid);
}
