package com.exception;

public class Java_ex_5 {

	public static void main(String[] args) {
		try {
			int value =10/0;
			System.out.println(value);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Closed the program");
			//connection will close from data base;
		}
		System.out.println("value check_1");
	}

}
