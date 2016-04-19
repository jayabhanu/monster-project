/**
 *   File Name: TestDisplayArray.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.ga.util.helpers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ga.util.helper.AppBasics;
import com.ga.util.helper.Display;

/**
 * TestDisplayArray //ADDD (description of class)
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
public class TestDisplay {
	// public static int[][] matrix1 = { { 11, 22, 33 }, { 44, 55, 66 } };

	public static String testName = "Gajula Display Tests ";
	public static String userName;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userName = AppBasics.welcomeUserAndGetUserName(testName);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		AppBasics.farwellUser(userName, testName);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeMethod
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterMethod
	public void tearDown() throws Exception {
	}

	@Test
	public void testdisplay1DArray() {
		int[] array1 = { 1, 2, 3, 4, 5 };

		Display.displayOneDimensionalArray(array1);
	}

	@Test
	public void testdisplay2DArray() {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		// Display.display2DArray(matrix);

		Display.displayTwoDimensionalArray(matrix);
	}

}
