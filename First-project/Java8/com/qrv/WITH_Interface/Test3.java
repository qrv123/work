package com.qrv.WITH_Interface;

import javax.naming.OperationNotSupportedException;

import com.qrv.WITH_Interface.Test2.MathOperation;

public class Test3 implements MathOperator {

	 static MathOperation addition = (int a, int b) -> a + b;
	 static MathOperator subtract = (int a, int b) -> a - b;
	 static MathOperator supply = (int a, int b) -> a * b;
	 static MathOperator devide = (int a, int b) -> a / b;
	 
	public int operate (int a, int b, MathOperation opt) {
		if (opt == addition)
		return opt.addition(a, b);
	}

	@Override
	public int operator(int a, int b) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Test3 tester = new Test3();
		int a = tester.operate(5, 5, addition);
		System.out.println(a);
	}
	
}
