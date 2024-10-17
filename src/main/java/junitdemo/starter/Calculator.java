package junitdemo.starter;

public class Calculator {

	public int addition(int a , int b) {
		return a + b;
	}
	
	public int subtraction(int a , int b) {
		return a-b;
	}
	
	public int multiplication(int a , int b) {
		return a*b;
	}
	
	public int division(int a , int b) {
		if(b==0) {
			throw new ArithmeticException("cannot / by zero");
		}
		return a/b;
	}
	
	public int remainder(int a, int b) {
		if (b==0) {
			throw new ArithmeticException("cannot / by zero");
		}
		return a%b;
	}
	 
}
