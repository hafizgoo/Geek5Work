package com.hafizgoo.springstart.jdbc;

import javax.jws.soap.SOAPBinding;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hafizgoo
 * @Date: DATE−2022/6/2 - MONTH−06 - DAY−02 - TIME−15:58
 * @Description: com.hafizgoo.springstart.jdbc
 * @version: 1.0
 */


public class JdbcUserDao {


    /**
     * 查询学生列表
     * @return
     * @throws Exception
     */
    private List<User> selectUserList() throws Exception {
        Statement statement = JdbcConnection.getConnection().createStatement();
        String sql = "select * from user";
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next()) {
            id = resultSet.getInt("id");
            name = resultSet.getString("name");
            address =  resultSet.getString("address");
            age=resultSet.getInt("age");
            user=new User(id,name,address,age);
            userList.add(user);
        }
        resultSet.close();
        statement.close();
        JdbcConnection.closeConnection();
        return userList;
    }

    /**
     * 增加用户信息
     * @param user
     * @return
     * @throws Exception
     */
    private  int insertUser(User user) throws Exception {
        Statement statement = JdbcConnection.getConnection().createStatement();
        name=user.getName();
        address=user.getAddress();
        age=user.getAge();
        String sql="INSERT INTO user (name, age,address) VALUES ( '"+name+"', "+age+",'"+address+"')";
        int insert =statement.executeUpdate(sql);
        statement.close();
        JdbcConnection.closeConnection();
        return insert;
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    private  int deleteUser(int id) throws Exception {
        Statement statement = JdbcConnection.getConnection().createStatement();
        String sql="DELETE  FROM user WHERE id ="+id;
        int delete =statement.executeUpdate(sql);
        statement.close();
        JdbcConnection.closeConnection();
        return delete;
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    private  int  updateUser(User user) throws Exception {
        Statement statement = JdbcConnection.getConnection().createStatement();
        id=user.getId();
        name=user.getName();
        address=user.getAddress();
        age=user.getAge();
        String sql="UPDATE user SET NAME ='"+name+"',age = "+age+",address='"+address+" ' WHERE  id="+id;
        int update =statement.executeUpdate(sql);
        statement.close();
        JdbcConnection.closeConnection();
        return update;
    }





    List<User> list;
    String name=null;
    String address=null;
    int id=0;
    int age=0;
    List<User> userList=new ArrayList<User>();
    User user= null;

    }

