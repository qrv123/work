package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo.PhanSo;

import static org.fest.assertions.api.Assertions.*;

class PhanSoTest {

	@Test
	//Kiem thu ham khoi tao
	void testPhanSo() {
		//fail("Not yet implemented");
		PhanSo ps = new PhanSo();
		assertEquals(1, ps.getiTuSo());
		assertEquals(0, ps.getiMauSo());
	}

	@Test
	void testCong() {
		fail("Not yet implemented");
	}

}
