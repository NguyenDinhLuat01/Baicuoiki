package com.qlhh.database;

import com.qlhh.entity.HangHoa;

public class MemoryHHRemoveDAO extends HHRemoveDAO {
    @Override
    public boolean xoaMaHang(int maHang) {
        for (HangHoa hh : MemoryHHDB.getDSHH()) {
            if (hh.getmaHang() == maHang) {
                MemoryHHDB.getDSHH().remove(hh);
                return true;
            }
        }
        return false;
    }
}