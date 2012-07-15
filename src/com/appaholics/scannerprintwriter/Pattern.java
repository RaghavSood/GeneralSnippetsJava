package com.appaholics.scannerprintwriter;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Displays a pattern based on user input
 * 
 */
public class Pattern {

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
		
		printWriter.println("Enter 1 for the first pattern, 2 for the second one");
		
		int choice;
		
		if(scanner.hasNextInt() && ((choice = scanner.nextInt()) == 1 || choice == 2)) {
			if(choice == 1)
			{
				printFirstPattern();
			}
			else
			{
				printSecondPattern();
			}
		}
		scanner.close();
		printWriter.close();
	}

	/**
	 * Prints the second pattern
	 */
	private static void printSecondPattern() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j > 0; j--) {
				printWriter.print(" " + j);
			}
			
			printWriter.println(" ");
		}
	}

	/**
	 * Prints the first pattern
	 */
	private static void printFirstPattern() {
		String text = "INDIAN";
		String[] pyramid = new String[text.length()];
		for (int i = 0; i < text.length(); i++) {
		    if (i == 0) {
		        pyramid[i] = text.substring(i, i + 1) + " ";
		    } else {
		        pyramid[i] = pyramid[i - 1] + text.substring(i, i + 1) + " ";
		    }
		}
		for (String s : pyramid) {
			s = s.trim();
			int totalLength = text.length() + (text.length() - 1);
			int space = (totalLength - s.length())/2;
			for(int ctr = 0; ctr<space;ctr++)
			{
				printWriter.print(" ");
			}
		    printWriter.println(s);
		}	
	}
	
}
