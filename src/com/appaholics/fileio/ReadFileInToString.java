package com.appaholics.fileio;

import java.io.*;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Read File in String Using Java BufferedInputStream Example. This
 *          example shows how to read a file content into a Sting object using
 *          available and read methods of Java BufferedInputStream.
 */

public class ReadFileInToString {

	public static void main(String[] args) {

		// create file object
		File file = new File("/Users/raghavsood/GeneralSnippets/README.md");
		BufferedInputStream bufferedInputStream = null;

		try {
			// create FileInputStream object
			FileInputStream fileInputStream = new FileInputStream(file);

			// create object of BufferedInputStream
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			// create a byte array
			byte[] contents = new byte[1024];

			int bytesRead = 0;
			String strFileContents;

			while ((bytesRead = bufferedInputStream.read(contents)) != -1) {

				strFileContents = new String(contents, 0, bytesRead);
				System.out.print(strFileContents);
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
				System.out.println("Error while closing the stream :" + ioe);
			}

		}
	}

}