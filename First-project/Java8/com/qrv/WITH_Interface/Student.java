package com.qrv.WITH_Interface;

public class Student {

	int mssv;
	String ten;
	String tinh;
	
	public Student(int mssv, String ten, String tinh) {
		this.mssv = mssv;
		this.ten = ten;
		this.tinh = tinh;
	}
	
	/*public String toString() {
		return mssv + " " + ten + " " + tinh;
	}*/
	
	public static void main(String[] args) {
		Student s1 = new Student(151, "quang", "tphcm");
		
		System.out.println(s1);
		
		String str = new String("ABCASDASD");
		System.out.println(str);
	}
	
	
}
