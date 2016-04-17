package com.ga.helpers.math;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ga.util.helper.exceptions.MyMath;

public class PrimeStaticTest {

	@DataProvider(name = "Prime Numbers data")
	public Object[][] getdata() {
		return new Object[][] { { 2, false }, { 3, false }, { 6, false } };

	}

	/*
	 * public Object getObject(){ return Object; }
	 */

	@DataProvider(name = "Prime Numbers Array data")
	public Object[][] getdata2() {
		return new Object[][] { { new int[] { 2, 4 }, true }, { new int[] { 3, 6 }, true },
				{ new int[] { 6, 8 }, true } };
	}

	@DataProvider(name = "Prime Number in Array")
	public Object[][] getdata3() {
		return new Object[][] { { new int[] { 2, 4 }, new boolean[] { true, false } },
				{ new int[] { 3, 6 }, new boolean[] { true, false } },
				{ new int[] { 6, 8 }, new boolean[] { false, false } } };

	}

	@Test(dataProvider = "Prime Number in Array")
	public void testevalPrimes(int[] numbers, boolean[] expectedResult) {
		boolean[] actualResult;

		MyMath mymath = new MyMath();
		actualResult = mymath.evalPrimes(numbers);
		for (int i = 0; i < expectedResult.length; i++) {
			String message = String.format("The number %d" + " is prime? (%b)" + "Expected Result is %b", numbers[i],
					actualResult[i], expectedResult[i]);
			assertEquals(actualResult[i], expectedResult[i]);
			System.out.println(message);
		}
	}

	// @Test(dataProvider = "Prime Numbers data")
	@Test(enabled = false, dataProvider = "Prime Numbers data")
	public void testInstancePrime(int number, boolean expectedResult) {
		boolean actualResult;
		MyMath mymath = new MyMath(number);
		double additionResult = mymath.add(number);
		actualResult = mymath.evalPrime();
		String message = String.format("The number %d" + "is added and result is" + " is prime? (%b)", number,
				additionResult, actualResult);
		System.out.println("Is Prime:" + mymath.getTotal() + "?" + mymath.evalPrime());
		assertEquals(actualResult, expectedResult, message);
		System.out.println(message);
	}

	@Test(enabled = false, dataProvider = "Prime Numbers Array data")
	public void testStaticPrime(int[] numbers, boolean expectedResult) {
		System.out.println("Number " + numbers[1]);
		boolean actualResult = MyMath.evalPrime(numbers[0]);
		String message = String.format("The number %d" + " is prime? (%b)", numbers[0], actualResult);

		assertEquals(actualResult, expectedResult, message);
		System.out.println(message);
	}

}
