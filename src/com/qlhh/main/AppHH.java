
package com.qlhh.main;

import java.io.PrintWriter;

import java.util.Scanner;

import com.qlhh.control.HHControlAdd;
import com.qlhh.control.HHControlPrint;
import com.qlhh.control.HHControlRemove;
import com.qlhh.database.MemoryHHAddDAO;
import com.qlhh.database.MemoryHHPrintDAO;
import com.qlhh.database.MemoryHHRemoveDAO;
import com.qlhh.ui.HHInAdd;
import com.qlhh.ui.HHMenu;
import com.qlhh.ui.HHOutAdd;
import com.qlhh.ui.HHOutPrint;

import com.qlhh.ui.HHRemoveOut;



public class AppHH {

	public static void main(String[] args) {
		PrintWriter out;
 		HHMenu hhmenu;
 		Scanner in;
 		String prompt = "->";
 		HHControlAdd hhControlAdd;
 		HHInAdd hhInAdd;
 		MemoryHHAddDAO hhAddDAO;
 		HHOutAdd hhOutAdd;
 		HHControlPrint hhControlPrint;
 		MemoryHHPrintDAO hhPrintDAO;
 		HHOutPrint hhOutPrint;
 		HHControlRemove hhControlRemove;
 		//HHRemoveInput hhRemoveInput;
 		HHRemoveOut hhRemoveOut;
 		MemoryHHRemoveDAO hhRemoveDAO;
 		
 		out =     new PrintWriter(System.out);
 		in =      new Scanner(System.in);
 		hhInAdd = new HHInAdd(out, in);
 		hhAddDAO = new MemoryHHAddDAO();
 		hhOutAdd = new HHOutAdd(out);
 		hhPrintDAO = new MemoryHHPrintDAO();
 		hhOutPrint = new HHOutPrint(out);
 		//hhRemoveInput = new HHRemoveInput(out, in);
 		hhRemoveDAO = new MemoryHHRemoveDAO();
 		hhRemoveOut = new HHRemoveOut(out);
 		
 		
 		hhControlPrint = new HHControlPrint(hhPrintDAO, hhOutPrint);
 		hhControlAdd = new HHControlAdd(hhAddDAO, hhOutAdd, hhInAdd);
 		hhControlRemove = new HHControlRemove(hhRemoveDAO, hhRemoveOut, in);
 		hhmenu = new HHMenu(out, in, prompt, hhControlAdd);
 		hhmenu.setHHControlPrint(hhControlPrint);
 		hhmenu.setHHControlRemove(hhControlRemove);
 		out.println("~~~~~~~~~~~~~ Chương trình QLHH ~~~~~~~~~~~~~");
 		out.flush();
 
 		hhmenu.controlLoop();
 		
	}

}
