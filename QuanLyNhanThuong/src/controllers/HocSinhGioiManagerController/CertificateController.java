/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.HocSinhGioiManagerController;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import services.MysqlConnection;
/**
 *
 * @author Minh
 */
public class CertificateController {
    
    // hàm check ID mã nhận thưởng của học sinh có hợp lệ không (có tồn tại trong bảng không và có đúng là học sinh chưa được chứng nhận không)
    public int checkID(int ID_NhanThuong) {
        /*try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM nhan_khau LEFT JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau WHERE soCMT = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ID);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getInt("ID");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra! vui lòng kiểm tra lại.", "Warning!!", JOptionPane.WARNING_MESSAGE);
        }*/
        return -1;
    }
    
    // hàm thêm chứng nhận cho học sinh với ID hợp lệ (update cho học sinh với những thông tin mới nhận được)
    // lưu ý thêm vào bảng có liên quan (bảng Quy Tien Thuong, cập nhật bảng Ho Gia Dinh)
    public boolean certificateHocSinhGioi(int ID_NhanThuong, String phanThuong, int giaTri, Date thoiGian) {
        
        return true;
    }
}
