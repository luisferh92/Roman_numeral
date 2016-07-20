package calculadora.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalc {

	@Test
	public void test1() {
		assertEquals(Romannumeral.convertToRomanNumber(3), "III");
	}
	
	@Test
	public void test2() {
		assertEquals(Romannumeral.convertToRomanNumber(10), "X");
	}
	
	@Test
	public void test3() {
		assertEquals(Romannumeral.convertToRomanNumber(44), "XLIV");
	}
	
	@Test
	public void test4() {
		assertEquals(Romannumeral.convertToRomanNumber(399), "CCCXCIX");
	}
	
	@Test
	public void test5() {
		assertEquals(Romannumeral.convertToRomanNumber(1500), "MD");
	}
	
	@Test
	public void test6() {
		assertEquals(Romannumeral.convertToRomanNumber(749), "DCCXLIX");
	}

}
