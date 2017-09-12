/*
 * Program to understand the array structuring in java.
 * File name : ArrayStructures.java
 */

package arrayStructures;

/**
 * @author Abhijeet
 */

public class ArrayStructures {

	// declare and initialize global variables
	public int[] theArray = new int[50];
	public int arraySize = 10;

	// method to generate random array for 10 numbers from 10 to 19
	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	// method to print the array with their appropriate index numbers
	public void printArray() {
		System.out.println("|--------|");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("|--------|");
		}
	}

	// method to get the value at index number 5
	public int getValueAtIndex(int index) {
		if (index < arraySize) {
			return theArray[index];
		}
		return 0;
	}

	// checking whether the array have the value 15 in it?
	public boolean doesArrayContainsValue(int value) {
		boolean valueInArray = false;
		for (int i = 0; i < arraySize; i++) {
			if (value == theArray[i]) {
				valueInArray = true;
			}
		}
		return valueInArray;
	}

	// method to delete the value at index 6 and shifting rest of the following
	// values up an index
	public void deleteIndex(int index) {
		if (index < arraySize) {
			for (int i = index; i < (arraySize - 1); i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize--;
		}
	}

	// method to insert the value 55 in the end of the array
	public void insertValue(int value) {
		if (arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
	}

	// method for linear search the value 12 in the array
	public String linearSearch(int value) {
		boolean valueInArray = false;
		String indexsWithValue = "";
		System.out.print("The value 12 is found in the index: ");
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				System.out.print(i + " ");
				indexsWithValue += i + " ";
			}
		}

		if (!valueInArray) {
			indexsWithValue = "None";
			System.out.println(indexsWithValue);
		}

		return indexsWithValue;
	}

	// main method
	public static void main(String[] args) {

		// creating an object arrays
		ArrayStructures arrays = new ArrayStructures();

		// calling class method to generate random array
		arrays.generateRandomArray();

		// printing the heading of initial array
		System.out.println("Initial random array from numbers 10 to 19 with their appropriate index numbers");

		// calling class method to print array
		arrays.printArray();

		// calling the class method to get the value at index 5 and printing it
		System.out.println("The value at index 5 is: " + arrays.getValueAtIndex(5));

		// calling the class method to find whether the array contains the value
		// 15 in it and printing it
		System.out.println("Does the array coniatins value 15: " + arrays.doesArrayContainsValue(15));

		// printing the heading to delete the value at index 6
		System.out.println(
				"Value at index 6 is deleted and rest of the values are shifted up an index \nAnd then the array looks like");

		// calling the class method to delete the value at index 6
		arrays.deleteIndex(6);

		// calling class method to print array
		arrays.printArray();

		// printing the heading to add the value in the end of the array
		System.out.println("Value 55 is added to the end of the array \nAnd then the array looks like");

		// calling class method to add the value in the end of the array
		arrays.insertValue(55);

		// calling class method to print array
		arrays.printArray();

		// calling class method to find the index having value 12 in it
		arrays.linearSearch(12);
	}
}