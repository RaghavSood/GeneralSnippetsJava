package com.appaholics.threading;

/**
 * @author Raghav Sood
 * @version 1
 * 
 *          Create New Thread Using Runnable Example This Java example shows how
 *          to create a new thread by implementing Java Runnable interface.
 */

public class CreateThreadRunnableExample implements Runnable {

	/**
	 * A class must implement run method to implement Runnable interface.
	 * Signature of the run method is,
	 * 
	 * public void run()
	 * 
	 * Code written inside run method will constite a new thread. New thread
	 * will end when run method returns.
	 */
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread : " + i);

			try {
				Thread.sleep(50);
			} catch (InterruptedException ie) {
				System.out.println("Child thread interrupted! " + ie);
			}
		}

		System.out.println("Child thread finished!");
	}

	public static void main(String[] args) {

		/*
		 * To create new thread, use Thread(Runnable thread, String threadName)
		 * constructor.
		 */

		Thread t = new Thread(new CreateThreadRunnableExample(), "My Thread");

		/*
		 * To start a particular thread, use void start() method of Thread
		 * class.
		 * 
		 * Please note that, after creation of a thread it will not start
		 * running until we call start method.
		 */

		t.start();

		for (int i = 0; i < 5; i++) {

			System.out.println("Main thread : " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				System.out.println("Child thread interrupted! " + ie);
			}
		}
		System.out.println("Main thread finished!");
	}
}