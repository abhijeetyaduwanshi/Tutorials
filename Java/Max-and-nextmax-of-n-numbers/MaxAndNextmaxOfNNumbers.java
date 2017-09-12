/*
 * Program to calculate the maximum and next-maximum in the given n numbers.
 * File name : MaxAndNextmaxOfNNumbers.java
 */

package maxAndNextmaxOfNNumbers;

/**
 * @author Abhijeet
 */

//package for Scanner class object
import java.util.Scanner;

public class MaxAndNextmaxOfNNumbers {
	public static void main(String args[]) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variables
		int[] tour = new int[100];
		int i, n;
		String strName = "";
		
		// greet the program user
		System.out.println("Welcome to the maximum and next-maximum program!");

		// prompt user for their name
		System.out.print("Please enter your name ");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// prompt user to enter the length of the numbers
		System.out.print("Enter the length of the numbers: ");
		n = sc.nextInt();
		System.out.println("Enter " + n + " numbers: ");

		// input: storing the numbers in end section of the array
		for (i = n; i <= 2 * n - 1; i++) {
			tour[i] = sc.nextInt();
		}

		// process: calling the buildTournament function to build the array named tour
		buildTournament(tour, n);

		// output: display the output to the user, also building the code block to compare the numbers which have been already compared to the max and came to be smaller
		System.out.printf("Max = %d and Next Max = %d", tour[1], nextMax(tour, n));

		// dismiss the Scanner class object
		sc.close();
	}

	public static void buildTournament(int[] tour, int n) {
		int i;
		// process: comparing the two numbers in the array and storing the maximum of those in the i/2 space of the array
		for (i = 2 * n - 2; i > 1; i = i - 2) {
			tour[i / 2] = maxi(tour[i], tour[i + 1]);
		}
	}

	public static int nextMax(int[] tour, int n) {
		int i = 2, nextMax;
		// process: comparing the two numbers that have been already compared to max and came to be smaller while building the tour array
		nextMax = mini(tour[2], tour[3]);
		while (i <= 2 * n - 1) {
			if (tour[i] > tour[i + 1]) {
				nextMax = maxi(tour[i + 1], nextMax);
				i = 2 * i;
			} else {
				nextMax = maxi(tour[i], nextMax);
				i = 2 * (i + 1);
			}
		}
		return nextMax;
	}

	public static int maxi(int i, int j) {
		// process: comparing the two numbers and returning the maximum
		if (i < j) {
			return j;
		} else {
			return i;
		}
	}

	public static int mini(int i, int j) {
		// process: comparing the two numbers and returning the minimum
		if (i > j) {
			return j;
		} else {
			return i;
		}
	}
}