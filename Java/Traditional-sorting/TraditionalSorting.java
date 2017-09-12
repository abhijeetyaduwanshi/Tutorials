/*
 * Traditional sorting program of given n numbers.
 * File name : TraditionalSorting.java
 */

package traditionalSorting;

/**
 * @author Abhijeet
 */

//package for Scanner class object
import java.util.Scanner;

public class TraditionalSorting {
	public static void main(String[] args) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the input array and other variables
		int[] array = new int[100];
		int n, i;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the traditional sorting program!");

		// prompt user for their name
		System.out.print("Please enter your name ");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// prompt user to enter the length of the numbers
		System.out.print("Enter the length of the numbers: ");
		n = sc.nextInt();
		
		if (n == 1 || n == 0 || n < 0) {

			// output: display the error message
			System.out.println("Please enter a valid number greater than 1");
		} else if (n > 100) {

			// output: display the error message
			System.out.println("The length of the array is not more than 100 please enter a valid number lesser than 100");
		} else {

			// prompt user to enter the numbers
			System.out.print("Enter " + n + " numbers: ");

			// input: storing the numbers in the array
			for (i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			// process: calling the sort function to sort the above array in
			// ascending order
			sort(array, n);
		}

		// dismiss the Scanner class object
		sc.close();
	}

	public static void sort(int[] array, int n) {

		// declare the variables
		int i, j, temp;

		// output: display the initial array
		System.out.print("Before: ");
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

		// process: swapping elements depending upon their weight
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - 1; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		// output: display the sorted array
		System.out.print("\n" + "After: ");
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
