/*
 * Working with recursion principle by determining the factorial of any given number n.
 * File name : RecursionPrincipleFactorialOfN.java
 */

package recursionPrincipleFactorialOfN;

/**
 * @author Abhijeet
 */

// package for Scanner class object
import java.util.Scanner;

public class RecursionPrincipleFactorialOfN {
	public static void main(String[] args) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variable
		int n;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the factorial program, implementation of the recursive principle!");

		// prompt user for their name
		System.out.print("Please enter your name ");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// prompt user to enter any positive number n
		System.out.print("Please enter the number: ");
		n = sc.nextInt();

		// output: calling the fact function to determine the factorial of given
		// number n
		System.out.println("!" + n + " = " + fact(n));

		// dismiss the Scanner class object
		sc.close();
	}

	public static java.lang.Integer fact(int n) {

		// declare the variables
		int x, sum = 1;

		// error checking
		if (n <= 0) {
			// output: display the error message
			System.out.println("Please enter a valid positive number greater than 1");
			return null;
		} else if (n == 1) {
			// output: display result in case n = 1
			sum = 1;
		} else {
			// recursion of fact function
			x = fact(n - 1);
			sum = n * x;
		}

		// returning the desired solution
		return sum;
	}
}
