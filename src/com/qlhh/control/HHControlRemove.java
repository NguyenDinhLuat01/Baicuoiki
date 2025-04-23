package com.qlhh.control;

import com.qlhh.database.HHRemoveDAO;
import com.qlhh.ui.HHRemoveOut;


	public class HHControlRemove {
	    private HHRemoveDAO hhRemoveDAO;
	    private HHRemoveOut hhRemoveOut;
	    
	public HHControlRemove() {
			
	     }
		

	    public HHControlRemove(HHRemoveDAO hhRemoveDAO, HHRemoveOut hhRemoveOut) {
	        this.hhRemoveDAO = hhRemoveDAO;
	        this.hhRemoveOut = hhRemoveOut;
	    }
	    public void remove() {
	    	
	    	
	    	    // 1. Gửi thông điệp đến đối tượng HHRemoveDAO
	    	    hhRemoveDAO.deleteSomething();

	    	    // 2. Gửi thông điệp đến đối tượng HHRemoveOut
	    	    hhRemoveOut.showMessage(); // nếu showMessage không cần tham số
	    	}

	    
	}

