package com.qrv.doituong;


public class NhanVien {
	private String ten;
	private String diachi;
	private int tuoi;
	
	//constructer
	public NhanVien() {
		// TODO Auto-generated constructor stub
		
	}
	
	public NhanVien(String ten, String diachi, int tuoi) {
		// TODO Auto-generated method stub
		this.ten = ten;
		this.diachi = diachi;
		this.tuoi = tuoi;
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public String getDiachi() {
		return diachi;
	}
	
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public int getTuoi() {
		return tuoi;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
}
