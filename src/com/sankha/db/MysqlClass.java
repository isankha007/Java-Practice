package com.sankha.db;
import java.sql.*;

public class MysqlClass {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/demo","root","admin");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customers");
            while (rs.next()){
                System.out.println(" name "+rs.getString("customerName")+
                        rs.getString("city"));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
