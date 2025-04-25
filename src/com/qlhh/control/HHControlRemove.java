package com.qlhh.control;

import java.util.Scanner;
import com.qlhh.database.HHRemoveDAO;
import com.qlhh.ui.HHRemoveOut;

public class HHControlRemove {
    private  HHRemoveDAO hhRemoveDAO;
    private  HHRemoveOut hhRemoveOut;
    //private  HHRemoveInput hhRemoveInput;
    private Scanner in;

    public HHControlRemove(HHRemoveDAO hhRemoveDAO, HHRemoveOut hhRemoveOut, Scanner in) {
        this.hhRemoveDAO = hhRemoveDAO;
        this.hhRemoveOut = hhRemoveOut;
        this.in = in;
       // this.hhRemoveInput = hhRemoveInput;
    }

    public void remove() {
       hhRemoveOut.showMessage();
       hhRemoveOut.getOut().print("Nhập mã hàng");//sử dụng hhRemoveOut để hiện thị
       hhRemoveOut.getOut().flush();	//Đảm bảo thông điệp được hiển thị ngay
       try {
    	   
       int maHang = Integer.parseInt(in.nextLine());
       boolean success = hhRemoveDAO.xoaMaHang(maHang);
       hhRemoveOut.thongBao(success, String.valueOf(maHang));
       
       }catch (NumberFormatException e) {
    	   hhRemoveOut.thongBao(false, "Mã không hợp lệ");
	}
 
    }
}
