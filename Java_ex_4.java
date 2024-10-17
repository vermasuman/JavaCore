package com.exception;

public class Java_ex_4 {

	public static void main(String[] args) {
		try {
			try {
				int value=20/0;
				System.out.println("inside try "+value);
			}
			catch(Exception e) {
				System.out.println("inside try "+e);
			}
		}catch(Exception e) {
			System.out.println("Exception " +e);
		}

	}

}
