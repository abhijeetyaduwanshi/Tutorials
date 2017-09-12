/*
 * Program to calculate the square root of a number using Newton's method.
 * File name : SquareRootNewtonsMethod.java
 */

package squareRootNewtonsMethod;

/**
 * @author Abhijeet
 */

// package for Scanner class object
import java.util.Scanner;

public class SquareRootNewtonsMethod {
	public static void main(String args[]) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variables
		double root = 0, xold = 0, xnew = 0, temp = 0;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the sqrt program!");

		// prompt user for their name
		System.out.println("Please enter your name");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// input: assign values to the variables
		System.out.print("Please enter a number: ");
		root = sc.nextDouble();

		// process: compute the required quantity
		xold = root / 2;

		do {
			temp = xold;
			xnew = xold - (xold * xold - root) / (2 * xold);
			xold = xnew;
		} while (Math.abs(xnew - temp) > 0.0001);

		// output: display the output to the user
		System.out.println("The sqrt of " + root + " is: " + xnew);

		// dismiss the Scanner class object
		sc.close();
	}
}