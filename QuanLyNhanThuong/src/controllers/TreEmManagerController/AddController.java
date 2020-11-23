package controllers.TreEmManagerController;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.EventObject;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.HocSinhGioiModel;
import models.TreEmModel;
import services.MysqlConnection;
import services.TreEmService;

/**
 *
 * @author Duy
 */
public class AddController {

    // hàm thêm mới trẻ em được nhận thưởng với đầu vào là đối tượng TreEmBean
    // cập nhật các bảng liên quan
    public boolean addTreEm(TreEmModel treEmModel) throws SQLException, ClassNotFoundException {
        TreEmModel treEm = treEmModel;
//        ChungMinhThuModel chungMinhThu = nhanKhauBean.getChungMinhThuModel();
        Connection connection = MysqlConnection.getMysqlConnection();
        // 1 - 19
        String query = "INSERT INTO tre_em (id, hoTen, tuoi, id_hoGiaDinh, phanThuong, giaTri, id_nhanThuong, ngayThuong)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, treEm.getID());
        preparedStatement.setString(2, treEm.getHoTen());
        preparedStatement.setInt(3, treEm.getTuoi());
        preparedStatement.setInt(4, treEm.getID_HoGiaDinh());
        preparedStatement.setString(5, treEm.getPhanThuong());
        preparedStatement.setInt(6, treEm.getGiaTri());
        preparedStatement.setInt(7, treEm.getID_NhanThuong());
        java.sql.Date ngayThuong = new java.sql.Date(treEm.getNgayThuong().getTime());
        preparedStatement.setDate(8, ngayThuong);
        preparedStatement.executeUpdate();
        
        ResultSet rs = preparedStatement.getGeneratedKeys();
        if (rs.next()) {
            int id_hoGiaDinh = rs.getInt(4);
            int giaTri = rs.getInt(6);
            String sql_ho_gia_dinh = "UPDATE ho_gia_dinh"
                    + " SET soTien = soTien + "
                    + giaTri
                    + " WHERE id = "
                    + id_hoGiaDinh;
            PreparedStatement prst = connection.prepareStatement(sql_ho_gia_dinh);
            prst.execute();

            int id_nhanThuong = rs.getInt(7);
            String sql_quy_tien_thuong = "INSERT INTO quy_tien_thuong(id, hoTen, soTien, ngayThang)"
                    + " values (?, ?, ?, ?)";
            PreparedStatement preStatement = connection.prepareStatement(sql_quy_tien_thuong);
            preStatement.setInt(1, id_nhanThuong);
            preStatement.setString(2, treEm.getHoTen());
            preStatement.setInt(3, -giaTri);
            preStatement.setDate(4, ngayThuong);
            preStatement.execute();
            preStatement.close();            
        }
        connection.close();
        return true;
    }
}
