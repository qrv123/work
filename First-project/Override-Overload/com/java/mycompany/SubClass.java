package com.java.mycompany;

public class SubClass extends SuperClass{

	@Override
	public int tong2so(int a, int b) {
		// TODO Auto-generated method stub
		return a + 1;
	}
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		SuperClass parent = new SuperClass();
		System.out.println(sub.tong2so(10, 12));
		System.out.println(parent.tong2so(10, 12));
	}
}
