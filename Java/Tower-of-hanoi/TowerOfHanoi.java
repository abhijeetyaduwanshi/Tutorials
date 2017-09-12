/*
 * Tower of hanoi problem for a given n numbers of disks.
 * File name : TowerOfHanoi.java
 */

package towerOfHanoi;

/**
 * @author Abhijeet
 */

// package for Scanner class object
import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {

		// introduce a Scanner class object
		Scanner sc = new Scanner(System.in);

		// declare and initialize the variable
		int n;
		String strName = "";

		// greet the program user
		System.out.println("Welcome to the tower of hanoi program");

		// prompt user for their name
		System.out.print("Please enter your name ");

		// read the user name
		strName = sc.nextLine();

		// display the name back to the user
		System.out.println("Hello " + strName + "\n");

		// prompt user to enter any positive number n
		System.out.print("Please enter the number of disks: ");
		n = sc.nextInt();

		// process: calling the towers function to determine the number of moves
		// needed to complete the problem
		towers(n, 'A', 'B', 'C');

		// dismiss the Scanner class object
		sc.close();
	}

	public static void towers(int m, char from, char to, char via) {

		if (m == 1) {
			// output: display the number of moves in case of 1 disk
			System.out.printf("Move from %c to %c \n", from, to);
		} else {
			// process: calling the towers function recursively to move a disk
			// peg "from" to peg "via" using peg "to"
			towers(m - 1, from, via, to);
			// output: display the number of moves in case of n disk
			System.out.printf("Move from %c to %c \n", from, to);
			// process: calling the towers function recursively to move a disk
			// peg "via" to peg "to" using peg "from"
			towers(m - 1, via, to, from);
		}
	}
}