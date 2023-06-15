package main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Sum calculation");
		System.out.println();
		Number sumResult = Calculator.sum(scan);
		System.out.println("The result of the sum calculation is: " + sumResult);

		System.out.println();

		System.out.println("Subtraction calculation");
		System.out.println();
		Number subtractResult = Calculator.subtract(scan);
		System.out.println("The result of the subtraction calculation is: " + subtractResult);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Multiplication calculation");
		Number multiplyResult = Calculator.multiply(scan);
		System.out.println("The result of the multiplication calculation is: " + multiplyResult);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Division calculation");
		Number divideResult = Calculator.divide(scan);
		System.out.println("The result of the division calculation is: " + divideResult);
		
		scan.close();
	}
	
	public static Number sum(Scanner scan) {
		System.out.println("Type a number:");
		Float firstValue = scan.nextFloat();
		
		System.out.println("Type another number:");
		Float secondValue = scan.nextFloat();
		
		return firstValue + secondValue;
	}
	
	public static Number subtract(Scanner scan) {
		System.out.println("Type a number:");
		Float firstValue = scan.nextFloat();
		
		System.out.println("Type another number:");
		Float secondValue = scan.nextFloat();
	    	
		return firstValue - secondValue;
	}
	
	public static Number multiply(Scanner scan) {
		System.out.println("Type a number:");
		Float firstValue = scan.nextFloat();
		
		System.out.println("Type another number:");
		Float secondValue = scan.nextFloat();
	    	
		return firstValue * secondValue;
	}
	
	public static Number divide(Scanner scan) {
		System.out.println("Type a number:");
		Float firstValue = scan.nextFloat();
		
		System.out.println("Type another number:");
		Float secondValue = scan.nextFloat();
	    	
		return firstValue / secondValue;
	}
}
