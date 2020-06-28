package com.zhou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/blog";
        String username = "root";
        String password = "1997217zou";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connection.prepareStatement("select count(1) FROM blog");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int count = rs.getInt(1);
            System.out.println(count);
        }
    }
}
