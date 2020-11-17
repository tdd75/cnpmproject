
package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.UserModel;
import services.MysqlConnection;

/**
 *
 * @author Minh
 */
public class LoginController {
    
    public static UserModel currentUser = new UserModel();
    
    //không cần sửa
    public boolean login(String userName, String passwod) throws SQLException, ClassNotFoundException{
        /*Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users WHERE userName = '" + userName +"'");
        if (rs == null) {
            return false;
        }
        while (rs.next()) {                
            if (rs.getString("passwd") == null ? passwod == null : rs.getString("passwd").equals(passwod)) {
                LoginController.currentUser.setID(rs.getInt("ID"));
                LoginController.currentUser.setUserName(rs.getString("userName"));
                return true;
            }
        }
        connection.close();*/
        return true;
    }
}
