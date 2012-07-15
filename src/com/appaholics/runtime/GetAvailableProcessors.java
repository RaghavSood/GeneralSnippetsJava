package com.appaholics.runtime;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Get Available Processors using Java Runtime Example This Java
 *          example shows how to get number of processors available to current
 *          Java Virtual Machine (JVM).
 */
public class GetAvailableProcessors {

	public static void main(String args[]) {
		/*
		 * Get current Java Runtime using getRuntime() method of Runtime class.
		 */
		Runtime runtime = Runtime.getRuntime();

		/*
		 * Use availableProcessors method to determine how many processors are
		 * available to the Java Virtual Machine (JVM).
		 */

		int numberOfProcessors = runtime.availableProcessors();

		System.out.println(numberOfProcessors + " processor(s) available to the VM");
	}
}