package com.appaholics.threading;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Set Thread Name Example This Java example shows how to set name of
 *          thread using setName method of Thread class.
 */

public class SetThreadNameExample {

	public static void main(String[] args) {

		// Get currently running thread object
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);

		/*
		 * To set name of thread, use void setName(String threadName) method of
		 * Thread class.
		 */

		currentThread.setName("Set Thread Name Example");

		/*
		 * To get the name of thread use, String getName() method of Thread
		 * class.
		 */
		System.out.println("Thread Name : " + currentThread.getName());
	}
}