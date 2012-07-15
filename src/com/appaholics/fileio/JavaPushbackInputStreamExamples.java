package com.appaholics.fileio;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Java PushbackInputStream Example This example shows how to use Java
 *          PushbackInputStream class provided in java.io package.
 */
public class JavaPushbackInputStreamExamples {

	public static void main(String[] args) {

		// example expression you want to evaluate in your program
		String strExpression = "a = a++ + b;";

		/*
		 * Here, while, evaluating the expression, You need to know whether it
		 * is ++ operator or + plus operator. Basically, you need to read ahead
		 * or peek whether another + follows immediately after one + sign.
		 */

		// get bytes from the expression string
		byte bytes[] = strExpression.getBytes();

		// create stream from expression bytes
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

		/*
		 * PushbackInputStream provides below given two constructors.
		 * 
		 * 1) PushbackInputStream(InputStream is) creates PushbackInputStream
		 * from provided InputStream object
		 * 
		 * 2)PushbackInputStream(InputStream is, int size) Creates
		 * PushbackInputStream from specified InputStream object with pushback
		 * buffer of specified size.
		 */
		// create PushbackInputStream from ByteArrayInputStream
		PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream);

		int ch;

		try {

			while ((ch = pushbackInputStream.read()) != -1) {
				// we encountered first + operator
				if (ch == '+') {
					// peek to see if another + follows
					if ((ch = pushbackInputStream.read()) == '+') {
						System.out.print("Plus Plus");
					} else {
						// push back one position as we did not get another +
						pushbackInputStream.unread(ch);

						System.out.print("+");
					}
				} else {
					// print the character
					System.out.print((char) ch);
				}
			}
		} catch (IOException e) {
			System.out.println("Exception while reading" + e);
		}
	}
}