package org.sushant;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection(){
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUser("root");
        ds.setPassword("@Sushant1205");
        ds.setURL("jdbc:mysql://localhost:3306/company_db");
        Connection connection = null;
        try{
            connection = ds.getConnection();
            System.out.println("Database connected");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
