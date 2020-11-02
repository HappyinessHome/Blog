package com.myblog.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.myblog.utils.MyLocalDateTimeTypeHandler;
import lombok.Data;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.type.JdbcType;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Article {
    @TableId(type = IdType.AUTO)
    private	Integer	id;
    private	String	articler;
    private	String	title;
    private	LocalDateTime	time;
    private	Integer	watchnum;
    private	String	descr;
    private	String	keyword;
    private	String	titleimage;
    private	Integer	zan;
    private	Integer	isencry;
    private	Integer	classification;
    private	String	article;
    private	String	images;
    private	Integer	ispay;
    private	Integer	ord;
    private BigDecimal money;
}
