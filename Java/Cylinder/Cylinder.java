/*
 * Program to calculate the volume and surface area of a right circular cylinder.
 * File name : Cylinder.java
 */

package cylinder;

/**
 * @author Abhijeet
 */

// package for Scanner class object
import java.util.Scanner;

public class Cylinder {
	public static void main(String args[]) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variables
		double height = 0, radius = 0, volume = 0, area = 0;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the cylinder program!");

		// prompt user for their name
		System.out.println("Please enter your name");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// input: assign values to the variables
		System.out.print("Please enter the radius for the cylinder. ");
		radius = sc.nextDouble();
		System.out.print("Please enter the height for the cylinder. ");
		height = sc.nextDouble();

		// process: compute the required quantity
		volume = 3.1416 * radius * radius * height;
		area = (2 * 3.1416 * radius * height) + (2 * 3.1416 * radius * radius);

		// output: display the output to the user
		System.out.print("\n" + "The volume of the cylinder is: ");
		System.out.print(volume);
		System.out.println(" cubic length units");

		System.out.print("The surface area of the cylinder is: ");
		System.out.print(area);
		System.out.println(" sq length units");

		// dismiss the Scanner class object
		sc.close();

	}
}