package com.qlhh.database;

import java.util.ArrayList;

import com.qlhh.entity.HangHoa;

public class MemoryHHRemoveDAO extends HHRemoveDAO {

	public ArrayList<HangHoa> getDSHH(){
		return MemoryHHDB.getDSHH();
	}
}
