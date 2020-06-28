package com.zhou;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestJDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/houses_tenancy";
        String username = "root";
        String password = "1997217zou";
        Connection connection = DriverManager.getConnection(url, username, password);
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet rs = databaseMetaData.getColumns(null, null, "student", null);
        while(rs.next()){
            String columnName = rs.getString("COLUMN_NAME");
            String typeName = rs.getString("TYPE_NAME");
            String remarks = rs.getString("REMARKS");
            System.out.print(columnName);
            System.out.print(typeName);
            System.out.print(remarks);
            System.out.println();
        }

    }
}
