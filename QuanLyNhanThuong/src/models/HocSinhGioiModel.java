package models;

import java.util.Date;
/**
 *
 * @author Minh
 */
public class HocSinhGioiModel {

    private int ID;
    private String hoTen;
    private int tuoi;
    private String truongLop;
    private String thanhTich;
    private boolean chungNhan;
    private int ID_HoGiaDinh;
    private int giaTri;
    private String phanThuong;
    private int ID_NhanThuong;
    private Date ngayThuong;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTruongLop() {
        return truongLop;
    }

    public void setTruongLop(String truongLop) {
        this.truongLop = truongLop;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }

    public boolean isChungNhan() {
        return chungNhan;
    }

    public void setChungNhan(boolean chungNhan) {
        this.chungNhan = chungNhan;
    }

    public int getID_HoGiaDinh() {
        return ID_HoGiaDinh;
    }

    public void setID_HoGiaDinh(int ID_HoGiaDinh) {
        this.ID_HoGiaDinh = ID_HoGiaDinh;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public String getPhanThuong() {
        return phanThuong;
    }

    public void setPhanThuong(String phanThuong) {
        this.phanThuong = phanThuong;
    }

    public int getID_NhanThuong() {
        return ID_NhanThuong;
    }

    public void setID_NhanThuong(int ID_NhanThuong) {
        this.ID_NhanThuong = ID_NhanThuong;
    }

    public Date getNgayThuong() {
        return ngayThuong;
    }

    public void setNgayThuong(Date ngayThuong) {
        this.ngayThuong = ngayThuong;
    }
    
    // hàm lấy thông tin học sinh giỏi theo mã html
    // thông tin gồm ID, tên, tuổi, trường lớp, thành tích, chứng nhận, ID hộ gia đình, phần thưởng, giá trị, ngày tháng
    @Override
    public String toString() {
        String res =  "<html><style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản:"
                + "<p>ID: <b>" + this.getID() + "</p>"
                + "<p>Họ tên: <b>" + this.getHoTen() + "</p>"
                + "<p>Tuổi: <b>" + this.getTuoi() + "</p>"
                + "<p>Trường lớp: <b>" + this.getTruongLop() + "</p>"
                + "<p>Thành tích: <b>" + this.getThanhTich()+ "</p>"
                + "<p>Chứng nhận: <b>" + this.isChungNhan()+ "</p>"
                + "<p>ID gia đình: <b>" + this.getID_HoGiaDinh()+ "</p>";
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
