package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import services.MysqlConnection;

/**
 *
 * @author Minh
 */
public class HomeCotroller {
    private JLabel tongSoTien;
    private JLabel soTienDaChi;
    private JLabel soTienDaNhan;

    public HomeCotroller(JLabel tongSoTien, JLabel soTienDaChi, JLabel soTienDaNhan) {
        this.tongSoTien = tongSoTien;
        this.soTienDaChi = soTienDaChi;
        this.soTienDaNhan = soTienDaNhan;
        
    }
    
    //truy vấn lấy tổng số tiền, số tiền đã chi, số tiền đã nhận
    public void setData() {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            /*String query = "SELECT COUNT(*) AS tong FROM nhan_khau";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                this.tongSoTien.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            query = "SELECT COUNT(*) AS tong FROM ho_khau";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                this.soTienDaChi.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            query = "SELECT COUNT(*) AS tong FROM tam_tru WHERE denNgay < NOW()";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                this.soTienDaNhan.setText(String.valueOf(rs.getInt("tong")));
            }
            preparedStatement.close();
            
            connection.close();*/
        } catch (Exception e) {
        }
    }

    public JLabel getTongSoTien() {
        return tongSoTien;
    }

    public JLabel getSoTienDaChi() {
        return soTienDaChi;
    }

    public JLabel getSoTienDaNhan() {
        return soTienDaNhan;
    }

    public void setTongSoTien(JLabel tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    public void setSoTienDaChi(JLabel soTienDaChi) {
        this.soTienDaChi = soTienDaChi;
    }

    public void setSoTienDaNhan(JLabel soTienDaNhan) {
        this.soTienDaNhan = soTienDaNhan;
    }

    

    
    
}
