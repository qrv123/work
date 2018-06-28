package com.qrv.thuchanh;
import java.util.Scanner;

import com.qrv.doituong.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NhanVien[] list_nhanvien = new NhanVien[3];
		
		
		/*for (NhanVien nv : list_nhanvien) {
			//System.out.println("Nhan vien thu " + i);
			//System.out.println("Ten : ");
			String ten = scan.nextLine();
			nv.setTen(ten);
			
			System.out.println("Dia chi : ");
			String diachi = scan.nextLine();
			nv.setDiachi(diachi);
			
			int tuoi;
			System.out.println("Tuoi");
			tuoi = scan.nextInt();
			nv.setTuoi(tuoi);
			
			i++;
			scan.nextLine();
		}*/
		for (int j = 0; j<list_nhanvien.length; j++) {
			String ten = scan.nextLine();
			String diachi = scan.nextLine();
			//int tuoi = Integer.parseInt(scan.nextLine());
			int tuoi;
			try{
				   tuoi = Integer.parseInt(scan.nextLine());
			}catch(NumberFormatException ex){ // handle your exception
				   tuoi = 5;
			}
			list_nhanvien[j] = new NhanVien(ten,diachi,tuoi);
			
			//Xoa bo nho dem cua ban phim
			scan.nextLine();
		}
		
		for (NhanVien nv : list_nhanvien) {
			System.out.println("Ten : " + nv.getTen() + " Dia chi : " + nv.getDiachi() + " Tuoi : " + nv.getTuoi());
		}
	
	}
}
