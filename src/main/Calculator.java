package main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Caculo da Soma");
		Number sumResult = Calculator.sum(scan);
		System.out.println("O resultado da soma é:" + sumResult);

		System.out.println();
		System.out.println();

		System.out.println("Caculo da Subtração");
		Number subtractResult = Calculator.subtract(scan);
		System.out.println("O resultado da subtração é:" + subtractResult);
		
		scan.close();
	}
	
	public static Number sum(Scanner scan) {
		System.out.println("Digite um número:");
		Float firstValue = scan.nextFloat();
		
		System.out.println("Digite um número:");
		Float secondValue = scan.nextFloat();
		
		return firstValue + secondValue;
	}
	
	public static Number subtract(Scanner scan) {
		System.out.println("Digite um número");
		Float firstValue = scan.nextFloat();
		
		System.out.println("Digite outro número");
		Float secondValue = scan.nextFloat();
		
		return firstValue - secondValue;
	}
}
