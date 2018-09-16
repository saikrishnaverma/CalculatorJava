package com.pretend.calculator;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		System.out.println("Calculator App Using Java");
		
		Scanner scanner = new Scanner(System.in);
		
		Scanner scan = new Scanner(System.in);
		
		String anotherCalculation = "Yes";
		
		while("Yes".equalsIgnoreCase(anotherCalculation)) {
			
			ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
		
			arithmeticCalculator.readInputValues(scanner);
			
			arithmeticCalculator.computeResult();
		
			arithmeticCalculator.displayResult();
			
			System.out.println("Do you want to perform another calculation (Yes/No)?");
			anotherCalculation = scan.nextLine();
			
		}
		scanner.close();
		scan.close();
		System.out.println("GoodBye");
		
	}

}
