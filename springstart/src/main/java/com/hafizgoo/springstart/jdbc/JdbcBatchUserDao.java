package com.hafizgoo.springstart.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/5 - MONTH−06 - DAY−05 - TIME−13:58
 * @Description: com.hafizgoo.springstart.jdbc
 * @version: 1.0
 */


public class JdbcBatchUserDao {

    /**
     * 批量新增用户信息
     * @param batchList
     * @throws Exception
     */
    private  void batchInsert(List<User> batchList) throws Exception  {
        Connection connection =JdbcConnection.getConnection();
        connection.setAutoCommit(false);
        String sql="INSERT INTO user(name,age,address) VALUES(?,?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        for (User user1 : batchList) {
            preparedStatement.setString(1, user1.getName());
            preparedStatement.setInt(2, user1.getAge());
            preparedStatement.setString(3, user1.getAddress());
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        preparedStatement.clearParameters();
        connection.commit();
        preparedStatement.close();
        connection.close();
    }

    /**
     * 批量删除用户信息
     * @param ids
     */
    private  void batchDelete(int [] ids) throws Exception {
        Connection connection =JdbcConnection.getConnection();
        connection.setAutoCommit(false);
        String sql="DELETE FROM user WHERE  id =?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        for(int id:ids){
            preparedStatement.setInt(1,id);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        preparedStatement.clearParameters();
        connection.commit();
        preparedStatement.close();
        connection.close();
    }

    public static void main(String[] args) throws Exception {
        int []ids={66,67,68};
        JdbcBatchUserDao jdbcBatchUserDao=new JdbcBatchUserDao();
        jdbcBatchUserDao.batchDelete(ids);
    }
}
