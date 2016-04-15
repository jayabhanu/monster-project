/**
 *   File Name: AppBasics.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.ga.util.helper;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
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
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	public static void farwellUser(String userName, String appName) {
		System.out.println("Thank You " + userName + " for using the " + appName + "Application");
		System.out.println("Have a great day!");
	}

	public static String welcomeUserAndGetUserName(String appName) {
		String userName;
		System.out.println("Hey you Welcome to the " + appName + " Application.");
		userName = RequestInput.getString("Could I get your name please?");
		return userName;
	}
}
