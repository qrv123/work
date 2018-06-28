package com.qrv.domain;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private int a = 2;
	public int b = 5;
	
	static public class StaticClass {
		
		Test def = new Test();
		Test.StaticClass abc = new Test.StaticClass();
		public int b = def.a;
	}
	
	public class InnerClass {
		int b = a;
		public int c = 10;
	}
	
	public static boolean sameVowelPatternOfLongWord(String s1, String s2) {
		
		
		return false;
	}
	
	public static void main(String[] args) {
	
		String abc = "";
		abc = abc.concat("a");
		
		
		System.out.println(abc);
	}
	
}
