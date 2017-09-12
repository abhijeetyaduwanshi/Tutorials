/*
 * Program to calculate the maximum in the given n numbers by saving the values in the array tree.
 * File name : ArrayTournament.java
 */

package arrayTournament;

/**
 * @author Abhijeet
 */

//package for Scanner class object
import java.util.Scanner;

public class ArrayTournament {
	public static void main(String args[]) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variables
		int[] tour = new int[100];
		int i, n;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the array tournament program!");

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

		// process: comparing the two numbers in the array and storing the
		// maximum of those in the i/2 space of the array
		for (i = 2 * n - 2; i > 1; i = i - 2) {
			tour[i / 2] = maxi(tour[i], tour[i + 1]);
		}

		// output: display the output format
		System.out.println("Format = Position-Value");

		// output: display the output to the user
		for (i = 1; i <= 2 * n - 1; i++) {
			System.out.print(i + "-" + tour[i] + "\t");
		}

		// dismiss the Scanner class object
		sc.close();
	}

	public static int maxi(int i, int j) {
		// process: comparing the two numbers and returning the maximum
		if (i > j) {
			return i;
		} else {
			return j;
		}
	}
}