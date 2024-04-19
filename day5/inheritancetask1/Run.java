package com.wipro.day5.inheritancetask1;

public class Run {
	    public static void main(String... pra) {
	        Circle circle = new Circle(5.0);
	        Rectangle rectangle = new Rectangle(4.0, 6.0);
	        System.out.printf("Area of the circle: %.2f square units%n", circle.area());
	        System.out.printf("Area of the rectangle: %.2f square units%n", rectangle.area());
	    }
	
}
