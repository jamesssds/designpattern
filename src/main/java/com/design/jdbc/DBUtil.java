package com.design.jdbc;
import java.sql.*;
public class DBUtil {
    public static final String URL = "jdbc:mysql://localhost:3306/user_center?serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";
    private static Connection conn = null;
    static{
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. 获得数据库连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }
}
