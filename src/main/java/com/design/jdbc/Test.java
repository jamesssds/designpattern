package com.design.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        List<User> users = generateTest(10000000);
        //获取连接
        Connection conn = DBUtil.getConnection();
        //sql
        String sql = "INSERT INTO test(user_name, sex)values(?,?)";
        //预编译
        PreparedStatement ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行

        //传参
        for(User user :users){
            ptmt.setString(1, user.getName());
            ptmt.setString(2, user.getSex());
            ptmt.addBatch();
        }
        //执行
        long begin = System.currentTimeMillis();
        ptmt.executeBatch();
        long end = System.currentTimeMillis();
        System.out.println("插入时间："+(end - begin));
        conn.close();

    }
    private static List<User> generateTest(int count){
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < count; i++){
            User user = new User();
            user.setName("猪头"+ i);
            user.setSex("男");
            list.add(user);
            System.out.println("插入时间");
        }
        return list;
    }
}
