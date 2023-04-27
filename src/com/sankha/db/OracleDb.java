package com.sankha.db;

import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

import java.sql.*;
import java.util.concurrent.Callable;

public class OracleDb {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection
                    ("jdbc:oracle:thin:@localhost:1521:xe","nemo","oracle");
//            Statement stmt=con.createStatement();
//           ResultSet rs=stmt.executeQuery("select * from emp");
          /*  PreparedStatement pst=con.prepareStatement("Select * from emp where emp_id = ?");
            pst.setInt(1,104);
            ResultSet rs=pst.executeQuery();
            while (rs.next()){
                System.out.println(" name "+rs.getString("emp_name")+" "+
                        rs.getString("salary"));
            }*/
//            CallableStatement cs= con.prepareCall("{ call getSalary(?,?)}");
           // cs.registerOutParameter(2,Types.INTEGER);
//            int result=cs.getInt(2);
//            System.out.println(" Result "+result);

/*
            CallableStatement cs= con.prepareCall("{ call getAllEmpInfo(?,?)}");
            cs.setInt(1,50000);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
          ResultSet rs=(ResultSet) cs.getObject(2);

            while (rs.next()){
                System.out.println(" name "+rs.getString("emp_name")+" "+
                        rs.getString("salary"));
            }*/

 ///function
            CallableStatement cs= con.prepareCall("{?= call getAvg(?,?)}");
            cs.setInt(2,104);
            cs.setInt(3,105);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            int res=cs.getInt(1);
            System.out.println("Funtion return = "+res);
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=============");
    }
}
