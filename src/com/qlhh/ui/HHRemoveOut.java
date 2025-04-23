package com.qlhh.ui;

import java.io.PrintWriter;

public class HHRemoveOut {
	private PrintWriter out;
	
	public HHRemoveOut(PrintWriter out) {
		this.out = out;
	}
	public void thongBao(boolean Completion, String maHang) {
	     if (Completion) {
	    	 out.println("Đã xóa thành công mã hàng");
	     } else {
	         out.println("Không tìm thấy mã hàng: " + maHang);
	     }
	     out.flush();
	 }
	public void showMessage() {
		out.println("Chức năng xóa mã hàng đang được sử dụng.");
	    out.flush();
	}
	
		
	}

