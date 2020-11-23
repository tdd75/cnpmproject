package services;

import controllers.LoginController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.TreEmModel;

/**
 *
 * @author Duy
 */
public class TreEmService {

    // lấy trẻ em theo ID
    public TreEmModel getTreEm(int ID) {
        TreEmModel treEm = new TreEmModel();
        // truy cap db
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM tre_em WHERE id = " + ID;
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
//            int idNhanKhau = -1;
            while (rs.next()) {
                treEm.setID(rs.getInt("id"));
                treEm.setHoTen(rs.getString("hoTen"));
                treEm.setTuoi(rs.getInt("tuoi"));
                treEm.setID_HoGiaDinh(rs.getInt("id_hoGiaDinh"));
                treEm.setPhanThuong(rs.getString("phanThuong"));
                treEm.setGiaTri(rs.getInt("giaTri"));
                treEm.setID_NhanThuong(rs.getInt("id_nhanThuong"));
                treEm.setNgayThuong(rs.getDate("ngayThuong"));
            }
            preparedStatement.close();
//            if (idNhanKhau > 0) {
//                query = "SELECT * FROM tieu_su WHERE idNhanKhau = " + idNhanKhau;
//                preparedStatement = (PreparedStatement)connection.prepareStatement(query);
//                rs = preparedStatement.executeQuery();
//                List<TreEmModel> listTieuSuModels = new ArrayList<>();
//                while (rs.next()) {                    
//                    TieuSuModel tieuSuModel = new TieuSuModel();
//                    tieuSuModel.setID(rs.getInt("ID"));
//                    tieuSuModel.setIdNhanKhau(rs.getInt("idNhanKhau"));
//                    tieuSuModel.setTuNgay(rs.getDate("tuNgay"));
//                    tieuSuModel.setDenNgay(rs.getDate("denNgay"));
//                    tieuSuModel.setDiaChi(rs.getString("diaChi"));
//                    tieuSuModel.setNgheNghiep(rs.getString("ngheNghiep"));
//                    tieuSuModel.setNoiLamViec(rs.getString("noiLamViec"));
//                    listTieuSuModels.add(tieuSuModel);
//                }
//                nhanKhauBean.setListTieuSuModels(listTieuSuModels);
//                preparedStatement.close();
//                
//                query = "SELECT * FROM gia_dinh WHERE idNhanKhau = " + idNhanKhau;
//                preparedStatement = (PreparedStatement)connection.prepareStatement(query);
//                rs = preparedStatement.executeQuery();
//                List<GiaDinhModel> listGiaDinhModels = new ArrayList<>();
//                while (rs.next()) {
//                    GiaDinhModel giaDinhModel = new GiaDinhModel();
//                    giaDinhModel.setID(rs.getInt("ID"));
//                    giaDinhModel.setHoTen(rs.getString("hoTen"));
//                    giaDinhModel.setNamSinh(rs.getDate("namSinh"));
//                    giaDinhModel.setGioiTinh(rs.getString("gioiTinh"));
//                    giaDinhModel.setIdNhanKhau(rs.getInt("idNhanKhau"));
//                    giaDinhModel.setDiaChiHienTai(rs.getString("diaChiHienTai"));
//                    giaDinhModel.setNgheNghiep(rs.getString("ngheNghiep"));
//                    giaDinhModel.setQuanHeVoiNhanKhau(rs.getString("quanHeVoiNhanKhau"));
//                    listGiaDinhModels.add(giaDinhModel);
//                }                    
//                nhanKhauBean.setListGiaDinhModels(listGiaDinhModels);
//                preparedStatement.close();
//            }
            connection.close();
        } catch (Exception e) {
            this.exceptionHandle(e.getMessage());
        }
        return treEm;
    }

    // láy danh sách toàn bộ trẻ em
    public List<TreEmModel> getListTreEm() throws SQLException {
        List<TreEmModel> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT * FROM tre_em ORDER BY id";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
//            int idNhanKhau = -1;
            while (rs.next()) {
                TreEmModel treEm = new TreEmModel();
                treEm.setID(rs.getInt("id"));
                treEm.setHoTen(rs.getString("hoTen"));
                treEm.setTuoi(rs.getInt("tuoi"));
                treEm.setID_HoGiaDinh(rs.getInt("id_hoGiaDinh"));
                treEm.setPhanThuong(rs.getString("phanThuong"));
                treEm.setGiaTri(rs.getInt("giaTri"));
                treEm.setID_NhanThuong(rs.getInt("id_nhanThuong"));
                treEm.setNgayThuong(rs.getDate("ngayThuong"));
                list.add(treEm);

            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

//    String query = "SELECT * FROM nhan_khau "
//            + " INNER JOIN chung_minh_thu ON nhan_khau.ID = chung_minh_thu.idNhanKhau"
//            + " LEFT JOIN tam_tru ON nhan_khau.ID = tam_tru.idNhanKhau "
//            + " LEFT JOIN tam_vang ON nhan_khau.ID = tam_vang.idNhanKhau "
//            + " WHERE ROUND(DATEDIFF(CURDATE(),namSinh)/365 , 0) >= "
//            + TuTuoi
//            + " AND ROUND(DATEDIFF(CURDATE(),namSinh)/365 , 0) <= "
//            + denTuoi;
//
//    if (!gender.equalsIgnoreCase (
//             
//        "Toan Bo")) {
//            query += " AND nhan_khau.gioiTinh = '" + gender + "'";
//    }
//
//    if (Status.equalsIgnoreCase (
//             
//        "Toan bo")) {
//            query += " AND (tam_tru.denNgay >= CURDATE() OR tam_tru.denNgay IS NULL)"
//                + " AND (tam_vang.denNgay <= CURDATE() OR tam_vang.denNgay IS NULL)";
//    }
//
//    else if (Status.equalsIgnoreCase (
//             
//        "Thuong tru")) {
//            query += " AND tam_tru.denNgay IS NULL";
//
//    }
//
//    else if (Status.equalsIgnoreCase (
//             
//        "Tam tru")) {
//            query += " AND (YEAR(tam_tru.tuNgay) BETWEEN "
//                + tuNam
//                + " AND "
//                + denNam
//                + ")";
//    }
//
//    else if (Status.equalsIgnoreCase (
//             
//        "Tam vang")) {
//            query += " AND (YEAR(tam_vang.tuNgay) BETWEEN "
//                + tuNam
//                + " AND "
//                + denNam
//                + ")";
//    }
//    query += " ORDER BY ngayTao DESC" ;
//
//    
//        try {
//            Connection connection = MysqlConnection.getMysqlConnection();
//        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
//        ResultSet rs = preparedStatement.executeQuery();
//        int idNhanKhau = -1;
//        while (rs.next()) {
//            HocSinhGioiBean nhanKhauBean = new HocSinhGioiBean();
//            HocSinhGioiModel nhanKhau = nhanKhauBean.getNhanKhauModel();
//            ChungMinhThuModel chungMinhThuModel = nhanKhauBean.getChungMinhThuModel();
//            idNhanKhau = rs.getInt("idNhanKhau");
//            nhanKhau.setID(idNhanKhau);
//            nhanKhau.setBietDanh(rs.getString("bietDanh"));
//            nhanKhau.setHoTen(rs.getString("hoTen"));
//            nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
//            nhanKhau.setNamSinh(rs.getDate("namSinh"));
//            nhanKhau.setNguyenQuan(rs.getString("nguyenQuan"));
//            nhanKhau.setTonGiao(rs.getString("tonGiao"));
//            nhanKhau.setDanToc(rs.getString("danToc"));
//            nhanKhau.setQuocTich(rs.getString("quocTich"));
//            nhanKhau.setSoHoChieu(rs.getString("soHoChieu"));
//            nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
//            nhanKhau.setDiaChiHienNay(rs.getString("diaChiHienNay"));
//            // con nhieu nua
//            chungMinhThuModel.setIdNhanKhau(rs.getInt("idNhanKhau"));
//            chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
//            chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
//            chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
//
//            if (idNhanKhau > 0) {
//                String sql = "SELECT * FROM tieu_su WHERE idNhanKhau = " + idNhanKhau;
//                PreparedStatement prst = (PreparedStatement) connection.prepareStatement(sql);
//                ResultSet rs_temp = prst.executeQuery();
//                List<TieuSuModel> listTieuSuModels = new ArrayList<>();
//                while (rs_temp.next()) {
//                    TieuSuModel tieuSuModel = new TieuSuModel();
//                    tieuSuModel.setID(rs_temp.getInt("ID"));
//                    tieuSuModel.setIdNhanKhau(rs_temp.getInt("idNhanKhau"));
//                    tieuSuModel.setTuNgay(rs_temp.getDate("tuNgay"));
//                    tieuSuModel.setDenNgay(rs_temp.getDate("denNgay"));
//                    tieuSuModel.setDiaChi(rs_temp.getString("diaChi"));
//                    tieuSuModel.setNgheNghiep(rs_temp.getString("ngheNghiep"));
//                    tieuSuModel.setNoiLamViec(rs_temp.getString("noiLamViec"));
//                    listTieuSuModels.add(tieuSuModel);
//                }
//                //nhanKhauBean.setListTieuSuModels(listTieuSuModels);
//                prst.close();
//
//                sql = "SELECT * FROM gia_dinh WHERE idNhanKhau = " + idNhanKhau;
//                prst = (PreparedStatement) connection.prepareStatement(sql);
//                rs_temp = prst.executeQuery();
//                List<GiaDinhModel> listGiaDinhModels = new ArrayList<>();
//                while (rs_temp.next()) {
//                    GiaDinhModel giaDinhModel = new GiaDinhModel();
//                    giaDinhModel.setID(rs_temp.getInt("ID"));
//                    giaDinhModel.setHoTen(rs_temp.getString("hoTen"));
//                    giaDinhModel.setNamSinh(rs_temp.getDate("namSinh"));
//                    giaDinhModel.setGioiTinh(rs_temp.getString("gioiTinh"));
//                    giaDinhModel.setIdNhanKhau(rs_temp.getInt("idNhanKhau"));
//                    giaDinhModel.setDiaChiHienTai(rs_temp.getString("diaChiHienTai"));
//                    giaDinhModel.setNgheNghiep(rs_temp.getString("ngheNghiep"));
//                    giaDinhModel.setQuanHeVoiNhanKhau(rs_temp.getString("quanHeVoiNhanKhau"));
//                    listGiaDinhModels.add(giaDinhModel);
//                }
//                nhanKhauBean.setListGiaDinhModels(listGiaDinhModels);
//                prst.close();
//            }
//            list.add(nhanKhauBean);
//        }
//        preparedStatement.close();
//    }
//    catch (Exception e
//
//    
//        ) {
//             System.out.println(e.getMessage());
//    }
    // tìm kiếm trẻ em theo tên
    public List<TreEmModel> search(String keyword) throws SQLException {
        List<TreEmModel> list = new ArrayList<>();
        String query;
        if (keyword.trim().isEmpty()) {
            return this.getListTreEm();
        }
        // truy cap db
        // create query
        long a = Long.parseLong(keyword);
        query = "SELECT * "
                + "FROM tre_em "
                + "WHERE hoTen LIKE '%\n"
                + keyword
                + "%'";

        // execute query
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TreEmModel treEm = new TreEmModel();
                treEm.setID(rs.getInt("id"));
                treEm.setHoTen(rs.getString("hoTen"));
                treEm.setTuoi(rs.getInt("tuoi"));
                treEm.setID_HoGiaDinh(rs.getInt("id_hoGiaDinh"));
                treEm.setPhanThuong(rs.getString("phanThuong"));
                treEm.setGiaTri(rs.getInt("giaTri"));
                treEm.setID_NhanThuong(rs.getInt("id_nhanThuong"));
                treEm.setNgayThuong(rs.getDate("ngayThuong"));
                list.add(treEm);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception mysqlException) {
            this.exceptionHandle(mysqlException.getMessage());
        }
        return list;
    }

    /*
     * Ham sử lý ngoại lệ : thông báo ra lỗi nhận được
     */
    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }
}
