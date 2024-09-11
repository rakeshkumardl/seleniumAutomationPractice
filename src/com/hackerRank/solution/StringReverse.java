package com.hackerRank.solution;

public class StringReverse {
	public static String reverseString(String str) {
			if(str == null) {
				System.out.println("provide correct String");
				throw new MyException("Null Values");
			}	
		
		if(str.length() ==1) {
			return str;
		}
		
		else if (str.length()==0) {
			System.out.println("blank values can't be reveresed");
		}
		String rev ="" ;
		for(int i =str.length()-1;i>=0;i--) {
			
			rev =  rev + str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println(reverseString(""));
	}

}
