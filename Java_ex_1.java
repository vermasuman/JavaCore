package com.exception;

public class Java_ex_1 {

	public static void main(String[] args) {
		try {
		int i=10/0;
		System.out.println("Checked" +i);
		}
		catch(Exception e) {
		System.out.println("Processed.."+e.getLocalizedMessage());
		} 

	}

}
