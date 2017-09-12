/*
 * Program to calculate the first 10 numbers of fibonacci sequence using a while loop.
 * File name : FibonacciWhile.java
 */

package fibonacci;

/**
 * @author Abhijeet
 */

public class FibonacciWhile {
	public static void main(String args[]) {

		// declare and initialize the variables
		int first = 0, second = 1, counter = 1, sum;

		// table headings
		System.out.println("The first 10 fibonacci sequence numbers are : ");
		System.out.println("Index" + "\t" + "Fib No.");

		// process: compute the required quantity
		while (counter <= 10) {
			System.out.println(counter + "\t" + first);
			sum = second + first;
			first = second;
			second = sum;
			counter++;
		}
	}
}