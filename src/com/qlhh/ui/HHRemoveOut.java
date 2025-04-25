package com.qlhh.ui;

import java.io.PrintWriter;


public class HHRemoveOut {
	private PrintWriter out;
	
	
	public HHRemoveOut(PrintWriter out) {
		this.out = out;
	}
	
	public PrintWriter getOut() {
		return out;
	}
	public void thongBao(boolean completion, String maHang) {
		 if (completion) {
	         out.println("đã xóa thành công mã hàng: " + maHang);
	     } else {
	         out.println("không tìm thấy mã hàng: " + maHang);
	     }
	     out.flush();
		
	}
	

	public void showMessage() {
		out.println("Chức năng xóa mã hàng đang được sử dụng");
		out.flush();
		
	}
	
		
	}
	
	
		
	
