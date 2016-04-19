/**
 *   File Name: RequestInputTests.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.ga.util.helpers;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ga.util.helper.RequestInput;

/**
 * RequestInputTests //ADDD (description of class)
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
public class RequestInputTests {
	static private String question;
	static private Scanner scanner;
	static private String userName;
	static private Object userValue;

	/**
	 *
	 */
	@AfterClass
	public static void fareWellUser() {
		System.out.println("Thank you " + userName + " for executing my Request Input tests.\nHave a great day!");
		scanner.close();

	}

	/**
	 *
	 */
	@BeforeClass
	public static void welcomeUser() {
		System.out.println("Welcome to my Request Input Tests");
		System.out.println("Could you please provide me your name:");
		scanner = new Scanner(System.in);
		userName = scanner.nextLine();

	}

	/**
	 * Test method for
	 * {@link com.ga.util.helper.RequestInput#getChar(java.lang.String)}.
	 */

	@BeforeMethod
	public void clearVariables() {
		question = "";
		userValue = "";
		// System.out.println("For the question \"" + question + "\", you have
		// given the value of (" + userValue + ")");

	}

	/**
	 * @param question
	 * @param userValue
	 */
	@AfterMethod
	public void displayOutput() {
		System.out.println("For the question \"" + question + "\", you have given the value of (" + userValue + ")");

	}

	@Test
	public void testGetCharString() {

	}

	/**
	 * Test method for
	 * {@link com.ga.util.helper.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test
	public void testGetCharStringCharArray() {
		question = "Please enter any word to find owvals";
		userValue = RequestInput.getChar(question, 'e', 'r', 't', 'g', 'b', 'v', 'm', 'r', 'p', 'i', 'a', 'e', 'u', 'b',
				'o', 'i', 'e', 'a');
	}

	/**
	 * Test method for
	 * {@link com.ga.util.helper.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test
	public void testGetDouble() {

	}

	/**
	 * Test method for
	 * {@link com.ga.util.helper.RequestInput#getInt(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetInt() {
		question = "PLease give me your lucky number:";
		userValue = RequestInput.getInt(question, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

	/**
	 * Test method for
	 * {@link com.ga.util.helper.RequestInput#getInt(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetIntTake2() {
		question = "How many children do you have?";
		userValue = RequestInput.getInt(question, 1, 2, 3);
	}

	/**
	 * Test method for
	 * {@link com.ga.util.helper.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test

	public void testGetString() {
		question = "PLease give me your favorite color:";
		userValue = RequestInput.getString(question, "red", "white", "blue");

	}

}
