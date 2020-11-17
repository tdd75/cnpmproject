package controllers.TreEmManagerController;

import Bean.TreEmBean;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import services.TreEmService;

/**
 *
 * @author Hai
 */
public class DeleteController {
    
    // check ID nhận thưởng của trẻ em (kiểm tra xem có trong bảng không)
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
    
    // xóa trẻ em với thông tin ID_NhanThuong
    // cập nhật bảng liên quan
    public boolean deleteTreEm(int ID_NhanThuong) {
        //thực hiện xóa khỏi bảng Tre Em
        return true;
    }
    
}
