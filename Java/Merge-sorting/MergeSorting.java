/*
 * Program to sort the given n numbers based on the merge sort routine.
 * File name : MergeSorting.java
 */

package mergeSorting;

/**
 * @author Abhijeet
 */

// package for Scanner class object
import java.util.Scanner;

public class MergeSorting {
	public static void main(String[] args) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variable
		int[] initialArray = new int[100];
		int lengthOfNumbers, zeroIndex = 0, lastIndex;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the merge sorting program");

		// prompt user for their name
		System.out.print("Please enter your name ");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// prompt user to enter the length of the numbers
		System.out.print("Enter the length of the numbers: ");
		lengthOfNumbers = sc.nextInt();

		lastIndex = lengthOfNumbers - 1;

		// prompt user to enter the required numbers
		System.out.print("Enter " + lengthOfNumbers + " numbers: ");

		// input: storing the numbers in the array
		for (int i = 0; i < lengthOfNumbers; i++) {
			initialArray[i] = sc.nextInt();
		}

		// process: calling the mergesort function to sort the above array in
		// descending order
		mergesort(initialArray, zeroIndex, lastIndex);

		// output: display the sorted array
		System.out.print("Sorted numbers are: ");
		for (int i = 0; i < lengthOfNumbers; i++) {
			System.out.print(initialArray[i] + " ");
		}

		// dismiss the Scanner class object
		sc.close();
	}

	public static void mergesort(int[] array, int zeroIndex, int lastIndex) {

		// declare the variables
		int mid; // middle index of array

		if (zeroIndex >= lastIndex) {
			return;
		} else {
			// calculating and initialize mid
			mid = (zeroIndex + lastIndex) / 2;
			// first half of array
			mergesort(array, zeroIndex, mid);
			// last half of array
			mergesort(array, mid + 1, lastIndex);
			// merge (adding) both the above first half and last half sub-arrays
			merge(array, zeroIndex, lastIndex);
		}
	}

	public static void merge(int[] array, int zeroIndex, int lastIndex) {

		// declare the variables
		int zeroIndexOfLastHalf, mid, zeroIndexOfTempArray, start;
		int[] tempArray = new int[100];

		// initialing the variables
		start = zeroIndexOfTempArray = zeroIndex;
		mid = (zeroIndex + lastIndex) / 2;
		zeroIndexOfLastHalf = mid + 1;

		// sorting and forming the temporary array
		while (zeroIndex <= mid && zeroIndexOfLastHalf <= lastIndex) {
			if (array[zeroIndex] >= array[zeroIndexOfLastHalf]) {
				tempArray[zeroIndexOfTempArray++] = array[zeroIndex++];
			} else {
				tempArray[zeroIndexOfTempArray++] = array[zeroIndexOfLastHalf++];
			}

			if (zeroIndex > mid) {
				for (; zeroIndexOfLastHalf <= lastIndex;) {
					tempArray[zeroIndexOfTempArray++] = array[zeroIndexOfLastHalf++];
				}
			} else {
				if (zeroIndexOfLastHalf > lastIndex) {
					for (; zeroIndex <= mid;) {
						tempArray[zeroIndexOfTempArray++] = array[zeroIndex++];
					}
				}
			}
		}

		// putting the values of sorted numbers back in initial array
		for (zeroIndexOfTempArray = start; zeroIndexOfTempArray <= lastIndex; zeroIndexOfTempArray++) {
			array[zeroIndexOfTempArray] = tempArray[zeroIndexOfTempArray];
		}
	}
}