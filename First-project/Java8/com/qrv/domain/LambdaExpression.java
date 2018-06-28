package com.qrv.domain;

public class LambdaExpression {

	public static void main(String[] args) {
		Processor stringProcessor = (String str) -> str.length();
		String name = "Java Lambda";
		int length = stringProcessor.getStringLength(name);
		System.out.println(length);
		
		stringProcessor = (String str) -> str.length() + 4 ;
		length = stringProcessor.getStringLength(name);
		System.out.println(length);
	}
}

@FunctionalInterface
interface Processor {
	int getStringLength(String str);
}