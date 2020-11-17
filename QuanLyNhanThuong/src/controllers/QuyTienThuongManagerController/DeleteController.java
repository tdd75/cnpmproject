/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.QuyTienThuongManagerController;

/**
 *
 * @author Khương
 */
public class DeleteController {
    
    // kiểm tra xem ID có tồn tại trong bảng quỹ tiền thưởng không
    public int checkID(int ID) {
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
    
    // xóa khỏi bảng quỹ tiền thưởng với ID trên
    public boolean deleteQuyTienThuong(int ID) {
        //thực hiện xóa khỏi bảng Hoc Sinh Gioi
        return true;
    }
    
}
