package com.tn;

import java.sql.*;

public class Show {
    public static void main(String[] args) {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tb_36_37", "root", "");
            System.out.println("Connect successfully!");

            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery("SELECT * FROM school");
            while (rs.next()){
                System.out.println("Id: "+ rs.getInt("id"));
                System.out.println("School name: "+ rs.getString("shool_name"));
                System.out.println("Address: "+ rs.getString("address"));

            }
        } catch (Exception ex) {
            System.out.println("Connect fail!");
            System.out.println(ex);
        }
    }
}
