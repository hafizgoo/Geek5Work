package com.hafizgoo.springstart.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−14:13
 * @Description: com.hafizgoo.springstart.jdbc
 * @version: 1.0
 */


public class HikariConnection {



    public static void main(String[] args) {

        //配置文件
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:mysql://120.48.9.33:3306/test");//mysql
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("meimima888");
        hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
        hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
        hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource(hikariConfig);
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {

            //创建connection
            conn = ds.getConnection();
            statement = conn.createStatement();

            //执行sql
            rs = statement.executeQuery("select * from user");

            //取数据
            if (rs.next()) {
                System.out.println(rs.getInt("id") + " 姓名：" + rs.getString("name"));
            }

            //关闭connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
