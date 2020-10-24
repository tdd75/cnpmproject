package sql_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MySQLConnUtils {

//    public static Connection getConnection(String dbURL, String userName, 
//            String password) {
//    Connection conn = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection(dbURL, userName, password);
//            System.out.println("connect successfully!");
//        } catch (Exception ex) {
//            System.out.println("connect failure!");
//            ex.printStackTrace();
//        }
//        return conn;
//    }
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            String DB_URL = "jdbc:mysql://localhost/mysql_db";
            String USER_NAME = "root";
            String PASSWORD = "";
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            if (conn != null) {
                System.out.println("Ket noi thanh cong");
            }
            String sql = "select * from student";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
//    if(rs.isBeforeFirst() == false) {
//        JOptionPane.showMessageDialog(this, "Bang khong co du lieu!");
//        return;
//    }
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//    public static void main(String args[]) {
//        try {
//            // connnect to database 'testdb'
//            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
//            // crate statement
//            Statement stmt = conn.createStatement();
//            // get data from table 'student'
//            ResultSet rs = stmt.executeQuery("select id,name from student");
//            // show data
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
//                        );
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }   

    }
}
