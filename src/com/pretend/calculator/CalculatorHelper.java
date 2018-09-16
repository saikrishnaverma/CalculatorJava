package com.pretend.calculator;

import java.util.Scanner;

public class CalculatorHelper {
	
	public static double scanDouble(Scanner scan){
	    while (!scan.hasNextDouble()){

	        System.out.println("Please enter either an integer or a decimal value.");
	        scan.nextLine();
	    }
	    
	    return scan.nextDouble();
	}
	
	public static String scanOperator(Scanner scan){
	    String operator = scan.next();

	    while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^") || operator.equals("sqrt"))) {

	        System.out.println("Invalid operator! Please try again.");
	        operator = scan.next();
	    }

	    return operator;
	}

	public static double performCalculation(double firstOperand,
			String operator, double secondOperand) {
		
		double resultValue = 0;
		
		switch(operator) {
		case "+":
			resultValue = firstOperand + secondOperand;
			break;
		case "-":
			resultValue = firstOperand - secondOperand;
			break;
		case "*":
			resultValue = firstOperand * secondOperand;
			break;
		case "/":
			resultValue = firstOperand / secondOperand;
			break;
		case "^":
			resultValue = Math.pow(firstOperand,secondOperand);
			break;
		case "sqrt":
			resultValue = Math.sqrt(firstOperand);
			break;
		default:
			break;
	}
		return resultValue;
	}

}
