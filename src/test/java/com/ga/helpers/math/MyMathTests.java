package com.ga.helpers.math;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import org.junit.Ignore;
//import org.junit.Test;

import com.ga.util.helper.exceptions.MyMath;

/**
 *   File Name: MyMathTests.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

/**
 * MyMathTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

// @RunWith(Parameterized.class)
public class MyMathTests {
	@DataProvider(name = "Power Data")
	public static Object[][] getData() {
		Object[][] data = { { 2.0, 2.0, 4.0 }, { 5.0, 2.0, 25.0 }, { 4.0, 3.0, 64.0 }, { 9.0, 0.0, 1.0 },
				{ 3.0, 1.0, 3.0 }, { 2.0, 1.5, 2.8 } };
		return data;
	}

	@Test(enabled = true)
	public void testDivideNumbers() {
		double result;
		double number1 = 8;
		double number2 = 0;
		result = MyMath.divideNumbers(number1, number2);
		System.out.println(String.format("The result of dividing %.0f with %.0f is %.0f", number1, number2, result));

	}

	// MyMath mymathconstructor;

	// @Test
	// @Ignore
	// public void testMyMathArgConstructor() {
	// MyMath mymathconstructor = new MyMath(1);
	// }

	@Test(enabled = false)
	public void testMyMathClass() {
		double result;
		double addNumber = 10;
		double subNumber = 3;
		double divNumber = 2;
		double multNumber = 2;
		MyMath mymath = new MyMath();

		mymath.add(addNumber);
		result = mymath.getTotal();
		System.out.println(
				String.format("The result of" + "%.0f and adding" + "%.0f is %.0f", result, result, addNumber));

		mymath.sub(subNumber);
		result = mymath.getTotal();
		System.out.println(
				String.format("The result of" + "%.0f and subtracting" + "%.0f is %.0f", result, result, subNumber));

		mymath.div(divNumber);
		result = mymath.getTotal();
		System.out.println(
				String.format("The result of" + "%.0f and dividing" + "%.0f is %.0f", result, result, divNumber));

		mymath.mult(multNumber);
		result = mymath.getTotal();
		System.out.println(
				String.format("The result of" + "%.0f and multlpying" + "%.0f is %.0f", result, result, multNumber));

		mymath.reset();
		System.out.println(
				String.format("The result of 0 and adding " + "%.0f and than" + " subtracting" + " %.0f is %.0f",
						addNumber, subNumber, result));
		// System.out.println(String.format("The result of" + "%.0f and
		// dividing" + "%.0f is %.0f", result, divNumber));
		// System.out.println(String.format("The result of" + "%.0f and
		// multipyiing" + "%.0f is %.0f"));

	}

	@Test(dataProvider = "Power Data")
	public void testPowerNumbers(double num, double power, double expectedResult) {
		double actualResult;
		actualResult = MyMath.powerNumber(num, power);
		String message = String.format("The result of %.0f with power %.0f is%.0f", num, power, actualResult);
		System.out.println(message);
		// TestNG PArams: Actual, Expected, Delta,
		assertEquals(actualResult, expectedResult, 0.1, message);
	}

	@Test(enabled = false)
	public void testPowerNumbers2() {
		double result;
		double num = 3;
		double power = 2;
		result = MyMath.powerNumber(num, power);
		System.out.println(String.format("The result of %.0f with power %.0f is%.0f", num, power, result));
	}

}
