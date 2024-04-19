package com.wipro.day5.exceptiontask3;

public class DividebyZeroExcTask {
	    public static void main(String... pra) {
	        try {
	            int numerator=58;
	            int denominator=0;
	            int result = numerator / denominator; 
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.err.println("Error: Cannot divide by zero!");
	        }
	    }
}
