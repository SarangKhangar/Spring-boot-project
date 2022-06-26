package com.zensar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zensar.bean.SimpleCalculator;


public class SimpleCalculatorTester {
	
	SimpleCalculator calc;
	
	@BeforeEach
	public void f1() {
		calc = new SimpleCalculator ();
	}
	
	@AfterEach
	public void f2() {
		calc=null;
	}
	
	@BeforeEach
	public void x() {
		System.out.println("x execute");
}
	
	@AfterEach
	public void y() {
		System.out.println("y execute");
	}
	
	
	@Test
	public void addTesting() {
		int expected = 10;
		int actual = calc.add(5, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void addTestingForNegtive() {
		int expected = -10;
		int actual = calc.add(-5, -5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void forNegativePositive() {
		int expected = -5;
		int actual = calc.add(-10, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void forNextNegativePositive() {
		SimpleCalculator calc = new SimpleCalculator();
		int expected = 5;
		int actual = calc.add(10, -5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubstraction() {
		SimpleCalculator calc = new SimpleCalculator();
		int expected = 5;
		int actual = calc.substract(10, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void substractForPosNeg() {
		SimpleCalculator calc = new SimpleCalculator();
		int expected = 15;
		int actual = calc.substract(10, -5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMulti() {
		SimpleCalculator calc = new SimpleCalculator();
		int expected = -50;
		int actual = calc.multiply(10, -5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiNegNeg() {
		SimpleCalculator calc = new SimpleCalculator();
		int expected = 50;
		int actual = calc.multiply(-10, -5);
		assertEquals(expected, actual);
	}
	
	
	
	
	

}
