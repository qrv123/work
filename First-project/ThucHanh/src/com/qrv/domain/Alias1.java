package com.qrv.domain;

public class Alias1 {
	int i;
    Alias1(int ii) { 
    	i = ii; 
    }
    public static void main(String[] args) {
    	Alias1 x = new Alias1(7);
    	Alias1 y = x; // Assign the reference
        System.out.println("x: " + x.i); //7
  		System.out.println("y: " + y.i);  //7
        System.out.println("Incrementing y");
        x.i++;
        System.out.println("x: " + x.i); //8
        System.out.println("y: " + y.i);  //8       
    }
	
}
