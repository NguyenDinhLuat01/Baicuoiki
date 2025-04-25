
package com.qlhh.database;

import java.util.ArrayList;

import com.qlhh.entity.HangDienMay;
import com.qlhh.entity.HangHoa;
import com.qlhh.entity.HangSanhSu;
import com.qlhh.entity.HangThucPham;

public class MemoryHHDB {
	private static ArrayList<HangHoa> dbHH;
	
	
	static ArrayList<HangThucPham> databaseThucPham
 	= new ArrayList<HangThucPham>();
 	
 	static ArrayList<HangDienMay> databaseDienMay
 	= new ArrayList<HangDienMay>();
 	
 	static ArrayList<HangSanhSu> databaseSanhSu
 	= new ArrayList<HangSanhSu>();
 	
 	
 	
	static ArrayList<HangThucPham> getThucPham(){
 		ArrayList<HangThucPham> dsthucPham;
 		dsthucPham = databaseThucPham;
 		return dsthucPham;
 	}
 	
 	static ArrayList<HangDienMay> getDienMay(){
 		ArrayList<HangDienMay> dsdienMay;
 		dsdienMay = databaseDienMay;
 		return dsdienMay;
 	}
 	
 	static ArrayList<HangSanhSu> getSanhSu(){
 		ArrayList<HangSanhSu> dsSanhSu;
 		dsSanhSu = databaseSanhSu;
 		return dsSanhSu;
 	}
 	
 	
 	
	static {
 		dbHH = new ArrayList<HangHoa>();
 		//tạo dữ liệu sẵn có cho DB
 		HangDienMay hDM = new HangDienMay(111, null, 5, 10, 220, 1000);
 				
 		HangSanhSu hSS = new  HangSanhSu(0, null, 0, 0, null, 0);
 				
 		HangThucPham hTP = new HangThucPham(0, null, 0, 0, 0, 0, null);
 				
 		
 		dbHH.add(hDM);
 		dbHH.add(hSS);
 		dbHH.add(hTP);
 		
 
 
 	}
	
	public static void insert(HangHoa hh) {
		dbHH.add(hh);
	}
	
	public static ArrayList<HangHoa> getDSHH(){
		return dbHH;
	}

	public static boolean delete(int maHang) {
		 for (HangThucPham hh : databaseThucPham) {
             if (hh.getmaHang() == maHang) {
            	 databaseThucPham.remove(hh);
                 return true;
             }
         }
         for (HangDienMay hh : databaseDienMay) {
             if (hh.getmaHang() == maHang) {
            	 databaseDienMay.remove(hh);
                 return true;
             }
         }
         for (HangSanhSu hh : databaseSanhSu) {
             if (hh.getmaHang() == maHang) {
            	 databaseSanhSu.remove(hh);
                 return true;
		
	}
	
	
 	
 	
 
}
		return false;
	}
}
