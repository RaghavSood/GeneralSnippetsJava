package com.appaholics.scannerprintwriter;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Calculates the sum of all positive and negative doubles. Does not
 *          handle any exceptions. Displays results when user enters 0 or a non
 *          number.
 */
public class NegativePositiveSum {

	/**
	 * java.util.Scanner object
	 */
	private static Scanner scanner;
	/**
	 * java.io.PrintWriter object
	 */
	private static PrintWriter printWriter;
	/**
	 * Stores the sum of all negative numbers
	 */
	private static double negativeSum = 0;
	/**
	 * Stores the sum of all positive numbers
	 */
	private static double positiveSum = 0;

	/**
	 * Main method for the program
	 * 
	 * @param args
	 *            Not used
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		printWriter = new PrintWriter(System.out, true);
		System.out.println("Enter the list of numbers. Terminates on 0 and non numbers.");

		double number;

		while (scanner.hasNextDouble() && (number = scanner.nextDouble()) != 0) {
			if (number > 0) {
				positiveSum += number;
			} else {
				negativeSum += number;
			}
		}

		scanner.close();

		printWriter.println("Sum of all negative numbers: " + negativeSum);
		printWriter.println("Sum of all positive numbers: " + positiveSum);
		printWriter.close();
	}

}