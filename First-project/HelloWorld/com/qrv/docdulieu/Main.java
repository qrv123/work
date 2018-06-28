package com.qrv.docdulieu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		
		System.out.print("Nhap gia tri x = ");
		
		int x = scan.nextInt();
		
		System.out.println("M vua nhap x = " + x);*/
		/*float[] arr = {1.0f , 2.0f, 3.0f, 5.6f};
		
		for (float f : arr) {
			System.out.println(f);
		}*/
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		while (true) {
			if(scan.nextInt()==5)break;
			list.add(scan.nextInt());
		}
		for (Object x : list) {
			System.out.println(list);
		}
		int i = 0;
		while (list.get(i)!=null) {
			System.out.print(list.get(i));
			i++;
		}
		
	}

}
