/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.HoGiaDinhModel;

/**
 *
 * @author Minh
 */
public class HoGiaDinhService {
    
    // hàm truy vấn lấy về hộ gia đình bean với ID cho trước
    public HoGiaDinhModel getHoGiaDinh(int ID) {
        HoGiaDinhModel hoGiaDinh = new HoGiaDinhModel();
        //code here
        return hoGiaDinh;
    }
    
    // hàm truy vấn lấy về toàn bộ hộ gia đình trong bảng
    public List<HoGiaDinhModel> getListHoGiaDinh() {
        List<HoGiaDinhModel> list = new ArrayList<>();
        //code here
        return list;
    }
    
    // hàm tìm kiếm hộ gia đình theo tên chủ hộ
    public List<HoGiaDinhModel> search(String keyword) {
        List<HoGiaDinhModel> list = new ArrayList<>();
        //code here
        return list;
    }
    
    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }
    
}
