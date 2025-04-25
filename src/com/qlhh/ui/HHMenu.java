
package com.qlhh.ui;

import java.io.PrintWriter;

import java.util.Scanner;

import com.qlhh.control.HHControlAdd;
import com.qlhh.control.HHControlPrint;
import com.qlhh.control.HHControlRemove;
import com.qlhh.database.MemoryHHDB;



public class HHMenu {
	private Scanner in;
	private PrintWriter out;
	private String prompt;
	private HHInAdd hhInAdd;// buoc 1
	private HHControlPrint hhControlPrint;
	private HHControlAdd hhControlAdd;
	//private HHRemoveInput hhRemoveInput;
	private HHControlRemove hhControlRemove;

	public void setHHControlPrint(HHControlPrint hhControlPrint) {
 		this.hhControlPrint = hhControlPrint;
 	}
	
	
	public HHMenu() {
		
	}

	public HHMenu(PrintWriter out, Scanner in, String prompt) {
 		this.out /* field */ = out /* tham số */;
 		this.in = in;
 		this.prompt = prompt;
 	}
	
	public HHMenu(PrintWriter out, Scanner in, String prompt, 
 			HHControlAdd hhControlAdd) {
 		this(out, in, prompt);
 		this.hhControlAdd = hhControlAdd;
 		
 	}
	public void setHHControlRemove(HHControlRemove hhControlRemove) {
		this.hhControlRemove = hhControlRemove;
 		//this.hhRemoveInput = hhRemoveInput;
	}
	public void controlLoop() {
		out.println("go lenh \"help\" de duoc ho tro!!!");
		out.flush();
		while (true) {
			String command;
			out.print(prompt);
			out.flush();
			command = in.nextLine();

			// cat khoang trang 2 dau
			command = command.trim();

			if ("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}

			if ("quit".equalsIgnoreCase(command)) {
				break;
			}

			if ("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			if ("pALL".equalsIgnoreCase(command)) {
				printALLHH();
				continue;
			}
			if ("remove".equalsIgnoreCase(command)) {
				remove();
				continue;
		}
		}
	}

	private void remove() {
		hhControlRemove.remove();
		
	}


	private void printALLHH() {
		hhControlPrint.printHH();

	}

	private void add() {
		hhControlAdd.add();
		;
	}

	private void help() {
		out.println("~~~~~~~~Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] hướng dẫn sử dụng phần mềm");
		out.flush();
		out.println("[ADD] them mới một hàng hóa");
		out.flush();
		out.println("[REMOVE] xóa một hàng hóa");
		out.flush();
		out.println("[PRINT] in tất cả hàng hóa");
		out.flush();
		out.println("[QUIT] thoát khỏi phần mềm");
		out.flush();
		out.println("[SEARCH] để tìm kiếm thực phẩm 1 tuần nữa hết hạn");
		out.flush();
		out.println("[QUANTITY] tổng số lượng hàng hóa");
		out.flush();
		out.println("[UPDATE] để cập nhâtS hàng hóa");
		out.flush();
		out.println("~~~~~~~~Help Menu~~~~~~~~");
		out.flush();
	}
}
