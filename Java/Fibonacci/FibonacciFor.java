/*
 * Program to calculate the first 10 numbers of fibonacci sequence using a for loop.
 * File name : FibonacciFor.java
 */

package fibonacci;

/**
 * @author Abhijeet
 */

public class FibonacciFor {
	public static void main(String args[]) {

		// declare and initialize the variables
		int first = 0, second = 1, sum;

		// table headings
		System.out.println("The first 10 fibonacci sequence numbers are : ");
		System.out.println("Index" + "\t" + "Fib No.");

		// process: compute the required quantity
		for (int counter = 1; counter <= 10; counter++) {
			System.out.println(counter + "\t" + first);
			sum = second + first;
			first = second;
			second = sum;
		}
	}
}