/*
 * Program to calculate the volume and surface area of a pyramid.
 * File name : Pyramid.java
 */

package pyramid;

/**
 * @author Abhijeet
 */

// package for Scanner class object
import java.util.Scanner;

public class Pyramid {
	public static void main(String args[]) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variables
		double height = 0, width = 0, length = 0, volume = 0, area = 0;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the pyramid program!");

		// prompt user for their name
		System.out.println("Please enter your name");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// input: assign values to the variables
		System.out.print("Please enter the length for the pyramid: ");
		length = sc.nextDouble();
		System.out.print("Please enter the width for the pyramid: ");
		width = sc.nextDouble();
		System.out.print("Please enter the height for the pyramid: ");
		height = sc.nextDouble();

		// process: compute the required quantity
		volume = length * width * height / 3;
		area = length * width + length * Math.sqrt(Math.pow((width / 2), 2) + (height * height))
				+ width * Math.sqrt(Math.pow((length / 2), 2) + (height * height));

		// output: display the output to the user
		System.out.print("\n" + "The volume of the pyramid is: ");
		System.out.print(volume);
		System.out.println(" cubic length units");

		System.out.print("The surface area of the pyramid is: ");
		System.out.print(area);
		System.out.println(" sq length units");

		// dismiss the Scanner class object
		sc.close();

	}
}