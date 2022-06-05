package com.hafizgoo.springstart.jdbc;

import java.sql.*;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/2 - MONTH−06 - DAY−02 - TIME−14:56
 * @Description: com.hafizgoo.springstart.jdbc
 * @version: 1.0
 */


public class JdbcConnection {


    private static Connection connection = null;

    static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://120.48.9.33:3306/test", "root", "meimima888");
        return connection;
    }

    static void closeConnection() throws SQLException {
        connection.close();
    }



}



