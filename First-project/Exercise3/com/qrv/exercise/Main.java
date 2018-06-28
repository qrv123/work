package com.qrv.exercise;
enum vowel {

}

public class Main {

	/*public static boolean isVowel (char ch) {
		
		
		return false;
	}*/
	
	public static boolean isVowel(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}
	
	public static boolean sameVowelPatternOfLongWord(String s1, String s2) {
		String vowels = new String ("AaEeIiOoUu");
		
		String s1_temp = "a";
		String s2_temp = "a";
		
		for(int i = 0; i < s1.length(); i++) {
			if (isVowel(s1.charAt(i))) {
				s1_temp += s1.charAt(i);
			}
		}
		
		for(int i = 0; i < s2.length(); i++) {
			if (isVowel(s2.charAt(i))) {
				s2_temp += s2.charAt(i);
			}
		}
		
		if (s1_temp.equals(s2_temp)) {
			return true;
		} else {
			return false;
		}
	}
	
	static public int test (int a) {
		if (a == 2) return 2;
		
		return 1;
	}
	
	public static void main(String[] args) {
		String str = new String("AaEeIiOoUu");
		String test_string = new String ("JAMAICA");
		String temp = "a";
		char z = 'o';
		//if("AaEeIiOoUu".indexOf(z) < 0)
		System.out.println(str.indexOf(z));
		
		str = str.substring(str.indexOf(z)+1);
		System.out.println(str);
		
		if(isVowel(z) == true) {
			System.out.println("Huray");
		}
		for (int i = 0; i < test_string.length(); i++) {
			if (isVowel(test_string.charAt(i))) {
				//temp.concat(test_string.charAt(i));
				temp += test_string.charAt(i);
			
			}
		}
		System.out.println(temp);
		if (temp.equals("aAAIA")) {
			System.out.println("Huray");
		}
		
		
		String ex1 = "HORIDE";
		String ex2 = "TOBRITE";
		if (sameVowelPatternOfLongWord(ex1, ex2))System.out.println("true");
	}
}
