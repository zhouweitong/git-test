package com.zhou;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassGenerator {
    public DatabaseMetaData init(){
        DatabaseMetaData databaseMetaData = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/houses_tenancy", "root", "1997217zou");
            databaseMetaData = connection.getMetaData();
        }catch (Exception e){
            e.printStackTrace();
        }
        return databaseMetaData;
    }

    public MyClass tableToClass(String tableName){
        MyClass myClass = new MyClass();
        DatabaseMetaData databaseMetaData = init();
        ResultSet resultSet = null;
        List<Field> list = new ArrayList<>();
        try {
            resultSet = databaseMetaData.getColumns(null, null, tableName, null);
            while(resultSet.next()){
                String fieldName = resultSet.getString("COLUMN_NAME");
                String typeName = resultSet.getString("TYPE_NAME");
                String remark = resultSet.getString("REMARKS");
                Field field = new Field();
                field.setFieldName(fieldName);
                field.setFieldRemarks(remark);
                field.setFieldType(columnTypeToFieldType(typeName));
                field.setFieldNameUpperLetter(firstUpper(fieldName));
                list.add(field);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        myClass.setList(list);
        myClass.setClassName(tableNameToClassName(tableName));
        return myClass;
    }

    public String firstUpper(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
    public String lower(String str){
        return str.toLowerCase();
    }

    private String columnTypeToFieldType(String columnType){
        String fieldType = null;
        switch (columnType){
            case "INT":
                fieldType = "Integer";
                break;
            case "CHAR":
                fieldType = "String";
                break;
            case "VARCHAR":
                fieldType = "String";
                break;
            case "DOUBLE":
                fieldType = "Double";
                break;
            case "BOOLEAN":
                fieldType = "Boolean";
                break;
            case "DATETIME":
                fieldType = "Date";
                break;
            case "DATE":
                fieldType = "Date";
                break;
            case "TIMESTAMP":
                fieldType = "Date";
                break;
            default:
                fieldType = "String";
                break;
        }
        return fieldType;

    }

    public String tableNameToClassName(String tableName){
        StringBuilder className = new StringBuilder();
        String[] items = tableName.split("_");
        for (String item : items){
            className.append(firstUpper(item));
        }
        return className.toString();
    }
}
