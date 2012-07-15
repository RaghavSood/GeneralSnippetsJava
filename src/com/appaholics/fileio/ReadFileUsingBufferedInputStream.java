package com.appaholics.fileio;

import java.io.*;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Read File Using Java BufferedInputStream Example. This example shows
 *          how to read a file using available and read methods of Java
 *          BufferedInputStream.
 */

public class ReadFileUsingBufferedInputStream {

	public static void main(String[] args) {

		// create file object
		File file = new File("/Users/raghavsood/GeneralSnippets/README.md"); //Change to file location 
		BufferedInputStream bufferedInputStream = null;

		try {
			// create FileInputStream object
			FileInputStream fileInputStream = new FileInputStream(file);

			// create object of BufferedInputStream
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			/*
			 * BufferedInputStream has ability to buffer input into internal
			 * buffer array.
			 * 
			 * available() method returns number of bytes that can be read from
			 * underlying stream without blocking.
			 */

			// read file using BufferedInputStream
			while (bufferedInputStream.available() > 0) {

				System.out.print((char) bufferedInputStream.read());
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found" + e);
		} catch (IOException ioe) {
			System.out.println("Exception while reading the file " + ioe);
		} finally {
			// close the BufferedInputStream using close method
			try {
				if (bufferedInputStream != null)
					bufferedInputStream.close();

			} catch (IOException ioe) {
				System.out.println("Error while closing the stream : " + ioe);
			}

		}
	}

}