package com.calculator;

class Calculator implements java.io.Serializable {
	private double n1;
	private double n2;
	private char operator;
	private double result;
	
	
	//Constructor
	public Calculator() {
	}
	
	//Getters
	public double getResult() {
		return result;
	}
	
	//Setters
	public void setNum1(double num1) {
		this.n1 = num1;
	}
	public void setNum2(double num2) {
		this.n2 = num2;
	}	
		
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	//Methods
	public void performOperation() {
		if( this.operator == '+') {
			result = n1 + n2;
		}
		if( this.operator == '-') {
			result = n1 - n2;
		}
	}
	
	

}
