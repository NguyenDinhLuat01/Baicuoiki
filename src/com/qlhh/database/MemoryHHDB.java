
package com.qlhh.database;

import java.util.ArrayList;

import com.qlhh.entity.HangDienMay;
import com.qlhh.entity.HangHoa;
import com.qlhh.entity.HangSanhSu;
import com.qlhh.entity.HangThucPham;

public class MemoryHHDB {
	private static ArrayList<HangHoa> dbHH;
	
	static {
 		dbHH = new ArrayList<HangHoa>();
 		//tạo dữ liệu sẵn có cho DB
 		HangDienMay hDM = new HangDienMay(0, "tủ lạnh", 0, 0, 0, 0);
 				
 		HangSanhSu hSS = new  HangSanhSu(0, "ly", 0, 0, null, 0);
 				
 		HangThucPham hTP = new HangThucPham(0, "sữa", 0, 0, 0, 0, null);
 				
 		
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
	
	
 	
 	
 
}
