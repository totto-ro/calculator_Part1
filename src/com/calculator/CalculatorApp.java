package com.calculator;

public class CalculatorApp {
	
	 public static void main( String[] args ) {
		 
	        Calculator sum = new Calculator();
	        
	        sum.setNum1( 10.5 );
	        sum.setNum2( 5.2 );
	        sum.setOperator( '+' );
	        sum.performOperation();
	        sum.getResult();
	        System.out.println( sum.getResult() );
	        
	        Calculator substract = new Calculator();
	        
	        substract.setNum1( 10.5 );
	        substract.setNum2( 5.2 );
	        substract.setOperator( '-' );
	        substract.performOperation();
	        substract.getResult();
	        System.out.println( substract.getResult() );
	        
	        
	        
	    }

}
