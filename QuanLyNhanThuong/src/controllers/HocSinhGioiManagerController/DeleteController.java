package controllers.HocSinhGioiManagerController;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import services.MysqlConnection;

/**
 *
 * @author Thoại
 */
public class DeleteController {
    
    // check ID mã nhận thưởng của học sinh I (có tồn tại trong bảng không)
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
    
    /*public boolean addNew(KhaiTuModel khaiTuModel) {
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "INSERT INTO khai_tu(idNhanKhau, , lyDo)" + " value (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, tamTruModel.getIdNhanKhau());
//            preparedStatement.setString(2, tamTruModel.getMaGiayTamTru());
//            preparedStatement.setString(3, tamTruModel.getSoDienThoaiNguoiDangKy());
//            Date tuNgay = new Date(tamTruModel.getTuNgay().getTime());
//            preparedStatement.setDate(4, tuNgay);
//            Date denNgay = new Date(tamTruModel.getDenNgay().getTime());
//            preparedStatement.setDate(5, denNgay);
//            preparedStatement.setString(6, tamTruModel.getLyDo());
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra! vui lòng kiểm tra lại.", "Warning!!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }*/
    
    // truy vấn vào cơ sở dữ liệu và xóa học sinh với ID nhận thưởng như trên
    // cập nhật và xóa ở các bảng có liên quan
    public boolean deleteHocSinhGioi(int ID_NhanThuong) {
        //thực hiện xóa khỏi bảng Hoc Sinh Gioi
        return true;
    }
}
