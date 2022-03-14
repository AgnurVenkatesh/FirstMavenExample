package com.lti.demos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.calculator;

class TestCasesEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@Disabled
	@Test
	public void testCase()
	{
		Assertions.assertEquals("Hello","Hello");
		Assertions.assertEquals(500,200+300);
	}
	@Disabled
	@Test
	public void testAdd()
	{
		calculator c=new calculator();
		int r=c.add(300,200);
		
		Assertions.assertEquals(500,r);
	}
	@Test
	void testAssertFalse() {

	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	// assertFalse(al.isEmpty());
	}
}
