package com.clinichub.connectivity;
import java.sql.*;

public class DatabaseConnection {
    
    Connection connection = null;
    PreparedStatement statement = null;
    
    protected String databaseName = "clinichub";
    protected String username = "root";
    protected String password = "superman";
    
    String url = "jdbc:mysql://localhost:3306/";
    
    public void addNewPatient (String name , String age , String sex, String phone, String allergies, String additional_info) {     
        try{
            url = url.concat(databaseName);
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url , username, password);
            statement = connection.prepareStatement("INSERT INTO patients (p_name , p_age , p_sex, p_phone, p_allergies, p_additional_info) VALUES (?,?,?,?,?,?);");
            statement.setString(1 , name);
            statement.setString(2 , age);
            statement.setString(3 , sex);
            statement.setString(4 , phone);
            statement.setString(5 , allergies);
            statement.setString(6 , additional_info);
            statement.execute();
        }catch (Exception e){
            System.out.println(e);
        }  
    }
}
