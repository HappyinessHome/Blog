package com.myblog.utils;

import org.apache.ibatis.type.LocalDateTimeTypeHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MyLocalDateTimeTypeHandler extends LocalDateTimeTypeHandler {
    @Override
    public LocalDateTime getResult(ResultSet rs, String columnName) throws SQLException {
        Object object = rs.getObject(columnName);
        if(object instanceof Timestamp) {

            LocalDateTime dateTime = LocalDateTime.ofInstant(((Timestamp)object).toInstant(), ZoneId.systemDefault());
            return dateTime;
        }
        return super.getResult(rs,columnName);
    }
}
