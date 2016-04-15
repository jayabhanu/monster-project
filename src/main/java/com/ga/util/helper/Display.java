/**
 *   File Name: DisplayArray.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.ga.util.helper;

/**
 * DisplayArray //ADDD (description of class)
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
public class Display {

	// public static int[] array;

	// Method should display array nicely formatted on screen
	public static void displayOneDimensionalArray(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("|\t");
		for (int i = 0; i < array.length; i++) {
			stringBuilder.append(array[i]);
			if (i < array.length - 1) {
				stringBuilder.append("\t");
			}
		}
		System.out.println("\t|\n");
		System.out.println(stringBuilder);
	}

	// Method should display 2 dimensional array nicely formatted on screen
	public static void displayTwoDimensionalArray(int[][] matrix) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < matrix.length; i++) {
			stringBuilder.append("-------");
		}
		System.out.println(stringBuilder);
		for (int i = 0; i < matrix.length; i++) {
			displayOneDimensionalArray(matrix[i]);
		}
		System.out.println(stringBuilder);

		// // 2For Loops Methods
		// System.out.println("2 For Loops\n");
		// for (int i=0; i< matrix.length; i++){
		// for(int j=0;j<matrix[i].length; j++){
		// System.out.println(matrix[i][j]);
		// }
		//
		// }
	}
}
