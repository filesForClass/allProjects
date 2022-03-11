package com.lq.testcases;

import com.lq.first.Calculator;

import static org.Junit.

public class MyFirstTest {
	
	@Test
	public void testA() {
		
		Caclulator c = new Calculator;
		
		int r = c.sumA(2, 5);
		
		assertEquals(r, 42);
	}
	
	@Test
	public void testB() {
		Calculator c = new Calculator();
		
		int r = c.sumB(2,5);
		
		assertEquals(r, 3);
	}
}
