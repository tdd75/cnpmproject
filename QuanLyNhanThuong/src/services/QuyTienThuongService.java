/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.QuyTienThuongModel;

/**
 *
 * @author Khương
 */
public class QuyTienThuongService {
    
    // hàm lấy nhận chi theo mã ID
    public QuyTienThuongModel getQuyTienThuong(int ID) {
        QuyTienThuongModel quyTienThuong = new QuyTienThuongModel();
        //code here;
        
        return quyTienThuong;
    }
    
    // hàm lấy danh sách nhận chi có trong bảng
    public List<QuyTienThuongModel> getListQuyTienThuong() {
        List<QuyTienThuongModel> list = new ArrayList<>();
        //code here
        return list;
    }
    
    // tìm kiếm quỹ tiền thưởng theo họ tên
    public List<QuyTienThuongModel> search(String keyword) {
        List<QuyTienThuongModel> list = new ArrayList<>();
        //code here
        return list;
    }
    
    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }
}
