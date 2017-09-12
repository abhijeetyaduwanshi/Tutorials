/*
 * Program to calculate the maximum and minimum in the given n numbers.
 * File name :  MaxMinOfNNumbers.java
 */

package maxMinOfNNumbers;

/**
 * @author Abhijeet
 */

// package for Scanner class object
import java.util.Scanner;

public class MaxMinOfNNumbers {
	public static void main(String args[]) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variables
		int n, m, max, min, i, num1, num2;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the maximum and minimum program!");

		// prompt user for their name
		System.out.print("Please enter your name ");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// prompt user to enter the length of the numbers
		System.out.print("Provide the length of the numbers: ");
		n = sc.nextInt();
		System.out.print("Enter " + n + " numbers: ");
		max = min = sc.nextInt();
		m = n - 1;

		// input: checking and deciding whether the length of numbers are odd or even
		if (n % 2 == 0) {
			min = sc.nextInt();
			if (max < min) {
				// swapping
				int temp;
				temp = max;
				max = min;
				min = temp;
				m = m - 1;
			}
		}

		// process: comparing and splitting the numbers in small and large groups
		for (i = 1; i <= m / 2; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			// process: compute the required quantity
			if (num1 >= num2) {
				if (num1 > max) {
					max = num1;
				}
				if (num2 < min) {
					min = num2;
				}
			} else {
				if (num2 > max) {
					max = num2;
				}
				if (num1 < min) {
					min = num1;
				}
			}
		}

		// output: display the output to the user
		System.out.printf("Maximum = %d and Minimum = %d", max, min);

		// dismiss the Scanner class object
		sc.close();

	}
}