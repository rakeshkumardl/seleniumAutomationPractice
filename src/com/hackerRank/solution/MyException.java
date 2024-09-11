package com.hackerRank.solution;

public class MyException extends RuntimeException{
	public MyException(String msg) {
		super(msg);
		printStackTrace();
	}
}
