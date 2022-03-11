package com.lq.testcases;

import org.junit.*;

public class MyFirstTestCase {

	@Test
	public void test() {
		System.out.println("test");
		ClassToTest ctt = new ClassToTest();
		assertEquals(true, ctt.methodToTest());
	}

}
