package com.pretend.calculator;

import java.util.Scanner;

public abstract class Calculator {
	
	protected double firstOperand = 0;
	
	protected String operator;
	
	protected double secondOperand = 0;
	
	protected double result = 0;
	
	public Calculator() {

	}

	public Calculator(double firstOperand, String operator, double secondOperand) {
		this.firstOperand = firstOperand;
		this.operator = operator;
		this.secondOperand = secondOperand;

	}
	
	public abstract void readInputValues(Scanner scanner);
	
	public abstract void computeResult();
	
	public void displayResult() {
		System.out.println("The result is: " + result);
	}
	
	public double getResult() {
		return result;
	}

}
