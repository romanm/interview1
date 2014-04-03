package edu.junit;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FooTest {
	@Test
	public void thisAlwaysPasses() {

	}
	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		org.junit.Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
	}
	@Test
	public void testMultiply() {
		Summe tester = new Summe();
		assertEquals("2 + 3 must be 5", 5, tester.sum(2, 3));
	}
	@Test
	@Ignore
	public void thisIsIgnored() {
	}
}
