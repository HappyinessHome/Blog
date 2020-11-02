package com.myblog.show.myblogshow;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.*;

@SpringBootTest
class MyblogshowApplicationTests {
    @Autowired
    private DataSource dataSource;
    @Test
    void contextLoads() {

    }
    @Test
    public void test() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from article where 1=0");
        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        StringBuilder sb=new StringBuilder();
        String pristring="private";
        for(int i=1;i<=columnCount;i++){
            sb.append(pristring).append("\t");
            String columnName = metaData.getColumnName(i);
            String columnType = metaData.getColumnTypeName(i).toLowerCase();

            switch (columnType){
                case "int":
                    sb.append("Integer").append("\t");
                    break;
                case "varchar":
                    sb.append("String").append("\t");
                    break;
                case "text":
                    sb.append("String").append("\t");
                    break;
                case "decimal":
                    sb.append("BigDecimal").append("\t");
                    break;
                case "datetime":
                    sb.append("LocalDateTime").append("\t");
                    break;
                default:
                    System.out.println("无此类型:"+columnType);
                    break;

            }

            sb.append(columnName).append(";").append("\n");
        }
        System.out.println(sb.toString());
    }
}
