package com.qlsv.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlhh.control.HHControlAdd;
import com.qlhh.control.HHControlPrint;
import com.qlhh.ui.HHInAdd;
import com.qlhh.ui.HHMenu;
import com.qlhh.ui.HHOutAdd;
import com.qlhh.ui.HHOutPrint;
public class AppQLHH {

	public static void main(String[] args) {
		//Bước 1
		PrintWriter out;
		HHMenu menu;
		Scanner in;
		String prompt = "->";
		HHControlAdd hhControlAdd;
		HHInAdd hhInAdd;
		
	
		HHOutAdd hhOutAdd;
		HHControlPrint hhControlPrint;
		
		HHOutPrint hhOutPrint;
		
		
		//Bước 3   //Bước 2
		out =     new PrintWriter(System.out);
		in =      new Scanner(System.in);
		//menu =   new SVMenu();
		hhInAdd = new HHInAdd(out, in);
		//svAddDAO = new MemorySVAddDAO();
		
		hhOutAdd = new HHOutAdd(out);
		//svPrintDAO = new MemorySVPrintDAO();
		
		hhOutPrint = new HHOutPrint(out);
		hhControlPrint =  new HHControlPrint( null, hhOutPrint);
		hhControlAdd = new HHControlAdd( hhOutAdd, hhInAdd);
				
		//menu =    new SVMenu(out, in, prompt);
		menu = new HHMenu();
		//svConrolPrint = null
		menu.setHHControlAdd(hhControlAdd);
		//svConrolPrint = 0001010101010101
		//gửi thông điệp
		out.println("~~~~ Chương trình QLSV ~~~~");
		out.flush();
		
		menu.controlLoop();
	}

}
