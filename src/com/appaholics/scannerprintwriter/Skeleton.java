package com.appaholics.scannerprintwriter;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Basic skeleton code for a program that uses the java.util.Scanner
 *          and java.io.PrintWriter classes.
 * 
 */
public class Skeleton {

	/**
	 * java.util.Scanner object
	 */
	private static Scanner scanner;
	/**
	 * java.io.PrintWriter object
	 */
	private static PrintWriter printWriter;

	/**
	 * Main method
	 * 
	 * @param args
	 *            Not used
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		printWriter = new PrintWriter(System.out, true);

		// Do stuff

		scanner.close();
		printWriter.close();
	}

}
