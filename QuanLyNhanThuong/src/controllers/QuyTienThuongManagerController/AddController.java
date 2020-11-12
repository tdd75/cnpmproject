/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.QuyTienThuongManagerController;

import Bean.QuyTienThuongBean;
import models.QuyTienThuongModel;

/**
 *
 * @author Minh
 */
public class AddController {
    
    // hàm thêm người chi tiền vào bảng quỹ tiền thưởng với thông tin nhận được
    public boolean addQuyTienThuong(QuyTienThuongBean quyTienThuongBean) {
        QuyTienThuongModel quyTienThuong = quyTienThuongBean.getQuyTienThuongModel();
        //code here
        return true;
    }
    
}
