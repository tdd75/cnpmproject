/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqltest;

import java.sql.*;

/**
 *
 * @author admin
 */
public class MySQLtest {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            String dbURL = "jdbc:mysql://localhost/classicmodels";
            String username = "root";
            String password = "";
            
            conn = DriverManager.getConnection(dbURL, username, password);
            if(conn != null)
                System.out.println("Ket noi thanh cong");
            
            String sql = "select * from customers";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            if(rs.isBeforeFirst() == false) {
                System.out.println("Khong co du lieu");
                return;
            }
            while(rs.next()) {
                System.out.println(rs.getString("customerName"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
