package com.qrv.domain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui long nhap vao thong tin cua 3 nhan vien");
		
		for(int i = 0; i <emps.length; i++) {
			String ten = scan.nextLine();
			String tenduong = scan.nextLine();
			double luong = scan.nextDouble();
			
			Address add = new Address(tenduong);
			Employee emp = new Employee(ten, luong);
			emp.setAddress(add);
			
			emps[i] = emp;
			
			//xoa bo nho dem
			scan.nextLine();
		}
		
		System.out.println("Thong tin 3 nhan vien vua nhap vao la :");
		
		for (Employee emp : emps) {
			System.out.println(emp.getTen() + " " + emp.getAddress().getTenDuong() + " " + emp.getLuong());
		}
		
		//close scan
		scan.close();
	}
}
