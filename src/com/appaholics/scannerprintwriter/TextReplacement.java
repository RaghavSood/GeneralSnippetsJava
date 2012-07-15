package com.appaholics.scannerprintwriter;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Takes text as an input and replaces all occurrences of "key" with
 *          "replacement"
 * 
 */
public class TextReplacement {

	/**
	 * java.util.Scanner object
	 */
	private static Scanner scanner;
	/**
	 * java.io.PrintWriter object
	 */
	private static PrintWriter printWriter;
	/**
	 * String to store the regex to be replaced
	 */
	private static String key = "key";
	/**
	 * String to store the replacement of key
	 */
	private static String replacement = "KEY";

	/**
	 * Main method
	 * 
	 * @param args
	 *            Not used
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		printWriter = new PrintWriter(System.out, true);

		printWriter.println("Enter a String.");

		String text = scanner.nextLine();
		scanner.close();
		text = text.replaceAll(key, replacement);
		printWriter.println(text);
		printWriter.close();
	}
}