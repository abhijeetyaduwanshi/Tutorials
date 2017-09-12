/*
 * Sorting program of given n numbers based on the tournament knock out basis.
 * File name : TournamentSorting.java
 */

package tournamentSorting;

/**
 * @author Abhijeet
 */

//package for Scanner class object
import java.util.Scanner;

public class TournamentSorting {
	public static void main(String args[]) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variables
		int[] tour = new int[100];
		int i, n, min;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the sorting tournament program!");

		// prompt user for their name
		System.out.print("Please enter your name ");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// prompt user to enter the length of the numbers
		System.out.print("Enter the length of the numbers: ");
		n = sc.nextInt();
		System.out.print("Enter " + n + " numbers: ");

		// input: storing the numbers in end section of the array
		for (i = n; i <= 2 * n - 1; i++) {
			tour[i] = sc.nextInt();
		}

		// process: calling the buildTour function to build the array named tour
		buildTour(tour, n);

		// process: calling minValue function to determine the smallest value in
		// n and subtracting 1 from it to make min the smallest of the smaller
		// value
		min = minValue(tour, n) - 1;

		// process: sorting block
		System.out.print("The sorted items are: ");
		for (i = 1; i <= n; i++) {
			// output: display the output to the user, printing the biggest
			// number
			System.out.print(tour[1] + " - ");
			// calling getNext function to get the next greater number
			getNext(tour, n, min);
		}

		// dismiss the Scanner class object
		sc.close();
	}

	public static void buildTour(int[] tour, int n) {
		int i;
		// process: comparing the two numbers in the array and storing the
		// maximum of those in corresponding i/2 space of the array
		for (i = 2 * n - 2; i > 1; i = i - 2) {
			tour[i / 2] = maxi(tour[i], tour[i + 1]);
		}
	}

	public static int maxi(int i, int j) {
		// process: comparing the two numbers and returning the maximum
		if (i > j) {
			return i;
		} else {
			return j;
		}
	}

	public static int minValue(int[] tour, int n) {
		int i, low = tour[n];
		// process: comparing the two numbers in tour array and returning the
		// lowest number in
		// n
		for (i = n; i <= 2 * n - 1; i++) {
			if (low > tour[i]) {
				low = tour[i];
			}
		}
		return low;
	}

	public static void getNext(int[] tour, int n, int min) {
		int i = 2;
		// process: getting the next greater number in n after the biggest
		// number
		// downward traversal
		while (i < 2 * n - 1) {
			if (tour[i] > tour[i + 1]) {
				tour[i] = min;
				i = 2 * i;
			} else {
				tour[i + 1] = min;
				i = 2 * (i + 1);
			}
		}

		// upward traversal
		for (i = i / 2; i > 1; i = i / 2) {
			if (i % 2 == 0) {
				tour[i / 2] = maxi(tour[i], tour[i + 1]);
			} else {
				tour[i / 2] = maxi(tour[i], tour[i - 1]);
			}
		}
	}
}