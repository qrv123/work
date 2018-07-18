package demo;

import org.junit.jupiter.api.Test;

public class PhanSo {
	
	private int iTuSo;
	private int iMauSo;
	
	public PhanSo() {
		setiTuSo(0);
		setiMauSo(1);
	}
	
	public int getiTuSo() {
		return iTuSo;
	}

	public void setiTuSo(int iTuSo) {
		this.iTuSo = iTuSo;
	}

	public int getiMauSo() {
		return iMauSo;
	}

	public void setiMauSo(int iMauSo) {
		this.iMauSo = iMauSo;
	}

	public PhanSo Cong (PhanSo ps) {
		PhanSo kq = new PhanSo();
		kq.setiTuSo(getiTuSo() * ps.getiMauSo() + ps.getiTuSo());
		kq.setiMauSo(getiMauSo() * ps.getiMauSo()); 
		return kq;
	}
}
