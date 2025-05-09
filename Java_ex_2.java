package com.exception;

public class Java_ex_2 {

    public static void main(String[] args) {
        try {
            // Arithmetic operation that causes an exception
            int value = 10 / 0;
            System.out.println(value);

            // NullPointerException scenario
            String s = null;
            System.out.println(s.length()); // This will throw NullPointerException

            System.out.println("Completed");
        } catch (ArithmeticException | NullPointerException e) {
            // Handle specific exceptions in a single block
            System.out.println("Exception occurred: " + e);
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("General exception: " + e);
        } finally {
            // Code that always executes
            System.out.println("Execution completed. Note: Division by zero is not allowed.");
        }
    }
}
