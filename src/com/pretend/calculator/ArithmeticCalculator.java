package com.pretend.calculator;

import java.util.Scanner;

public class ArithmeticCalculator extends Calculator{
	
	public ArithmeticCalculator() {
		super();
	}

	public ArithmeticCalculator(double firstOperand, String operator,
			double secondOperand) {
		super(firstOperand, operator, secondOperand);
	}
	
	@Override
	public void readInputValues(Scanner scanner) {
		
		System.out.println("Please enter the first operand: ");
		this.firstOperand = CalculatorHelper.scanDouble(scanner);
		
		System.out.println("Please enter + for Addition, - for Subtraction, * for Multiplication, / for Division, ^ for Square by N, sqrt for Square Root.");
		this.operator = CalculatorHelper.scanOperator(scanner);
		
		
		if(!"sqrt".equals(this.operator)){
			System.out.println("Please enter the second operand: ");
			this.secondOperand = CalculatorHelper.scanDouble(scanner);
			while("/".equals(this.operator) && this.secondOperand == 0) {
				System.out.println("Please enter a non zero value.");
				this.secondOperand = CalculatorHelper.scanDouble(scanner);
			}
		}
		
	}

	@Override
	public void computeResult() {
		this.result = CalculatorHelper.performCalculation(this.firstOperand, this.operator, this.secondOperand);
	}
	
}
