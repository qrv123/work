package com.qrv.domain;

public class Employee extends Person {
	private double luong;
	
	public Employee() {
		super();
	}
	
	public Employee(String ten) {
		super(ten); //super.setTen(ten); nhu nhau
	}
	
	public Employee(String ten, double luong) {
		super(ten);
		this.luong = luong;
	}
	
	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	
}
