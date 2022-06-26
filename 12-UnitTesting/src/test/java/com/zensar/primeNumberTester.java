package com.zensar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zensar.bean.PrimeNumberDecider;

public class primeNumberTester {
	
	PrimeNumberDecider decider;
	
	@BeforeEach
	public void f2() {
		decider = new PrimeNumberDecider();
	}
	
	@AfterEach
	public void f3() {
		decider = null;
	}
	
	@Test
	public void f1() {
		decider.setNumber(15);
		boolean actual = decider.isPrime();
		boolean expected = false;
		assertEquals(actual, expected);
	}
	
	@Test
	public void f4() {
		decider.setNumber(17);
		boolean actual = decider.isPrime();
		boolean expected = true;
		assertEquals(actual, expected);
	}

}
