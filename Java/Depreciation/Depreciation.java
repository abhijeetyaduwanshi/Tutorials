/*
 * Program to determine depreciation, reduction in the value of an asset with the passage of time, due in particular to wear and tear.
 * File name : Depreciation.java
 */

package depreciation;

/**
 * @author Abhijeet
 */

// package for DecimalFormat class object
import java.text.DecimalFormat;
// package for Scanner class object
import java.util.Scanner;

public class Depreciation {

	// declare and initialize the global variables
	public static double assetCost = 0, salvageValue = 0, depreciableAmount = 0, factor, depreciableAmount_new;
	public static int assetLife = 0, sumOfYears = 0;

	// declare a DecimalFormat class object
	static DecimalFormat two = new DecimalFormat("0.00");

	// declare a Scanner class object
	static Scanner sc = new Scanner(System.in);

	// method to receive asset information
	public static void AssetInfo() {

		// declare and initialize local variable
		String assetType = "";

		// print block information
		System.out.println("[[ Asset Information ]]");

		// request, receive and print the asset type
		System.out.print("Please enter the type of asset [String]: ");
		assetType = sc.nextLine();
		System.out.println("Asset Type: " + assetType + "\n");

		// request, receive and print the asset cost
		System.out.print("Please enter the cost of asset [Double]: ");
		assetCost = sc.nextDouble();
		System.out.println("Asset Cost: " + two.format(assetCost) + "\n");

		// request, receive and print the salvage value
		System.out.print("Please enter the salvage value of asset [Double]:");
		salvageValue = sc.nextDouble();
		System.out.println("Salvage Value: " + two.format(salvageValue) + "\n");

		// request, receive and print the asset life
		System.out.print("Please enter the life of asset [Integer]: ");
		assetLife = sc.nextInt();
		System.out.println("Asset Life: " + assetLife + "\n");

		// compute, print depreciable amount as (cost - salvage)
		depreciableAmount = assetCost - salvageValue;
		System.out.println("Depreciable Amount: " + two.format(depreciableAmount) + "\n");

	}

	// method to sum the year
	public static int GaussSum(int num) {

		// use Gauss Formula to sum the years
		sumOfYears = num * (num + 1) / 2;

		// print the sum of years
		System.out.println("Sum of years: " + sumOfYears + "\n");

		// return the sum
		return sumOfYears;

	}

	// method to print the depreciation table
	public static void Show_depreciation_schedule() {

		// this will print the depreciation schedule table
		System.out.println("Depreciation Schedule");

		// this will print the schedule list with year, factor, depreciable
		// amount and asset cost with a spacing of tab (\t)
		System.out.print("YEAR" + "\t" + "FACTOR" + "\t" + "DEPRECIABLE AMOUNT" + "\t" + "ASSETCOST" + "\n");
		System.out.print("----" + "\t" + "------" + "\t" + "------------------" + "\t" + "---------" + "\n");
		int i = 1;
		do {
			factor = 0;

			// formula for calculating factor
			factor = (double) assetLife / (double) sumOfYears;

			// for new depreciation amount, which is the resultant of
			// multiplication of old depreciation amount and the factor
			depreciableAmount_new = depreciableAmount * factor;

			// asset cost is the resultant of difference between old asset cost
			// and new depreciation amount
			assetCost = assetCost - depreciableAmount_new;

			// this will print list of values in year, factor, depreciable
			// amount and asset cost with a spacing of tab (\t)
			System.out.print(i + "\t" + assetLife + "/" + sumOfYears + "\t" + two.format(depreciableAmount_new)
					+ "\t\t\t" + two.format(assetCost) + "\n");

			// this will decrease the asset life each time by 1 every year until
			// it reaches the minimum value
			assetLife--;
			i++;

		} while (assetLife > 0);
	}

	// method to check and stop if the asset value does not reach below its
	// salvage value
	public static void CheckDepreciation() {

		if (assetCost >= depreciableAmount_new) {
			System.out.println("--------------------------------------------------");
			System.out.println("The asset has not been depreciated below its salvage value");
		}
	}

	// main method
	public static void main(String args[]) {

		// declare and initialize the local variable
		String userName = "";

		// greet the program user
		System.out.println("<< Sum of Years Depreciation Program >>");

		// prompt user for their name
		System.out.print("Please enter your name: ");

		// read the user name
		userName = sc.nextLine();

		// display the name back to the user
		System.out.println("Welcome: " + userName + "\n");

		// call the AssetInfo() method
		AssetInfo();

		// call the GaussSum() method
		GaussSum(assetLife);

		// call the ShowDepreciationSchedule() method
		Show_depreciation_schedule();

		// call the CheckDepreciation() method
		CheckDepreciation();

	}
}
