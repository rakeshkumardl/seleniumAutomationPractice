package com.hackerRank.solution;

public class LearningStringManupulation {

	public static void main(String[] args) {
		String name = "This is Rakesh Kumar.";
		
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf("Rakesh"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String msg = "Your transaction id is 1457895";
		String tid = msg.substring(msg.indexOf("is")+2).trim();
		int id = Integer.parseInt(tid);
		String id1 =String.valueOf(id);
		int id2 =Integer.parseInt(id1);
		System.out.println(id1);
		System.out.println(tid);
		System.out.println(id+" " +id2);

	}

}
