package com.exception;

public class Java_ex_2 {

	public static void main(String[] args) {

		try {
			int value =10/0;
			System.out.println(value);
			String s=null;//empty
			if(s!=null) {
			s.length();
			System.out.println(s.length());
			}
			System.out.println("completed");
		}
		catch(ArithmeticException e) {//child class exception
			System.out.println(e);
		}
		catch(NullPointerException e){//child class exception
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);//parent class exception always write at end otherwise you will get compilation error
		}
		finally {
			System.out.println("not divisible by zero");
		}

	}

}
