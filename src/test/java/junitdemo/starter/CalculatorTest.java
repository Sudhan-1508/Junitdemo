package junitdemo.starter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void passtestAddition() {
		assertEquals(5,calculator.addition(3, 2));
	}
	
	@Test
	public void failtestadd() {
		assertNotEquals(7, calculator.addition(3, 2));
	}
	
	@Test
	public void passtestsub() {
		assertEquals(2,calculator.subtraction(5, 3));
	}
	
	@Test
	public void failtestsub() {
		assertNotEquals(10, calculator.subtraction(5, 8));
	}
	
	@Test
	public void passtestmultiple() {
		assertEquals(8,calculator.multiplication(4, 2));
	}
	
	@Test
	public void failtestmutiple() {
		assertNotEquals(10, calculator.multiplication(6, 2));
	}
	@Test
	public void passtestdivision() {
		assertEquals(4,calculator.division(8, 2));
	}
	@Test
	public void failtestdivision() {
		assertThrows(ArithmeticException.class, ()->{
			calculator.division(5, 0);
		});
	}
	
	@Test
	public void passtestremainder() {
		assertEquals(1,calculator.remainder(7, 3));
	}
	
	@Test
	public void failtestremainder() {
		assertThrows(ArithmeticException.class, ()->{
			calculator.remainder(7, 0);
		});
	}

}
