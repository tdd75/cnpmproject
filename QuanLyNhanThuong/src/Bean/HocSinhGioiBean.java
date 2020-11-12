package Bean;

import java.util.ArrayList;
import java.util.List;
import models.HocSinhGioiModel;

/**
 *
 * @author Minh
 */
public class HocSinhGioiBean {
    private HocSinhGioiModel hocSinhGioiModel;
    
    
    public HocSinhGioiBean(HocSinhGioiModel hocSinhGioiModel) {
        this.hocSinhGioiModel = hocSinhGioiModel;
    }

    public HocSinhGioiBean() {
        
    }

    public HocSinhGioiModel getHocSinhGioiModel() {
        return hocSinhGioiModel;
    }

    public void setHocSinhGioiModel(HocSinhGioiModel hocSinhGioiModel) {
        this.hocSinhGioiModel = hocSinhGioiModel;
    }
    
    
    // hàm lấy thông tin học sinh giỏi theo mã html
    // thông tin gồm ID, tên, tuổi, trường lớp, thành tích, chứng nhận, ID hộ gia đình, phần thưởng, giá trị, ngày tháng
    @Override
    public String toString() {
        String res =  "<html><style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản:"
                + "<p>ID: <b>" + hocSinhGioiModel.getID() + "</p>"
                + "<p>Họ tên: <b>" + hocSinhGioiModel.getHoTen() + "</p>"
                + "<p>Tuổi: <b>" + hocSinhGioiModel.getTuoi() + "</p>"
                + "<p>Trường lớp: <b>" + hocSinhGioiModel.getTruongLop() + "</p>"
                + "<p>Thành tích: <b>" + hocSinhGioiModel.getThanhTich()+ "</p>"
                + "<p>Chứng nhận: <b>" + hocSinhGioiModel.isChungNhan()+ "</p>"
                + "<p>ID gia đình: <b>" + hocSinhGioiModel.getID_HoGiaDinh()+ "</p>";
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
