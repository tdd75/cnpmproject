/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import models.HoGiaDinhModel;

/**
 *
 * @author admin
 */
public class HoGiaDinhBean {
    private HoGiaDinhModel hoGiaDinhModel;
    
    public HoGiaDinhBean() {
        
    }

    public HoGiaDinhModel getHoGiaDinhModel() {
        return hoGiaDinhModel;
    }

    public void setHoGiaDinhModel(HoGiaDinhModel hoGiaDinhModel) {
        this.hoGiaDinhModel = hoGiaDinhModel;
    }
    
    // hàm lấy toàn bộ thông tin của hộ gia đình viết theo html
    // thông tin gồm ID, chủ hộ, địa chỉ, số tiền đã nhận, danh sách học sinh, trẻ em đã nhận cụ thể gồm tên, tuổi, phần thưởng, giá trị, thời gian
    @Override
    public String toString() {
        String res =  "<html><style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản:"
                + "<p>ID: <b>" + "</p>"
                + "<p>Họ tên: <b>"  + "</p>"
                + "<p>Tuổi: <b>"  + "</p>"
                + "<p>Trường lớp: <b>"  + "</p>"
                + "<p>Thành tích: <b>" + "</p>"
                + "<p>Chứng nhận: <b>" + "</p>"
                + "<p>ID gia đình: <b>" + "</p>";
        /*      + "<h4>Tiểu sử<table>"
                + "<tr>"
                + "<th>Từ ngày</th>"
                + "<th>Đến ngày</th>"
                + "<th>Địa chỉ</th>"
                + "<th>Nơi làm việc</th>"
                + "</tr>";
        for (TieuSuModel tieuSuModel: listTieuSuModels) {
            res += "<tr>"
                    + "<td>"
                    + tieuSuModel.getTuNgay().toString()
                    + "</td>"
                    + "<td>"
                    + tieuSuModel.getDenNgay().toString()
                    + "</td>"
                    + "<td>"
                    + tieuSuModel.getDiaChi()
                    + "</td>"
                    + "<td>"
                    + tieuSuModel.getNoiLamViec()
                    + "</td>"
                    + "</tr>";
        }
        res += "</table><h4>Gia đình<table>"
                + "<tr>"
                + "<th>Họ tên</th>"
                + "<th>Ngày sinh</th>"
                + "<th>Giới tính</th>"
                + "<th>Quan hệ với nhân khẩu</th>"
                + "<th>Nghề nghiệp</th>"
                + "<th>Địa chỉ hiện tại</th>"
                +"</tr>";
        for (GiaDinhModel giaDinhModel: listGiaDinhModels) {
            res += "<tr>"
                    + "<td>"
                    + giaDinhModel.getHoTen()
                    + "</td>"
                    + "<td>"
                    + giaDinhModel.getNamSinh().toString()
                    + "</td>"
                    + "<td>"
                    + giaDinhModel.getGioiTinh()
                    + "</td>"
                    + "<td>"
                    + giaDinhModel.getQuanHeVoiNhanKhau()
                    + "</td>"
                    + "<td>"
                    + giaDinhModel.getNgheNghiep()
                    + "</td>"
                    + "<td>"
                    + giaDinhModel.getDiaChiHienTai()
                    + "</td>"
                    +"</tr>";
        }*/
        res +=  "</table>"
                + "</div></html>";
        return res;
    }
    
}
