/*
 * Program to create stock transactions for XYZ stock with various clients and display a profit or loss on shares based on a given transacted stock price versus an updated stock price.
 * Class inheritance.
 * File name : Stock.java
 */

package stockTransaction;

/**
 * @author Abhijeet
 */

// package for DecimalFormat class object
import java.text.DecimalFormat;
// package for Scanner class object
import java.util.Scanner;

public class Stock {

	// declare and initialize the global variables
	// trading symbol of stock
	private String symbol;
	// current and updated price per share
	private double sharePrice, updatedSharePrice;
	// client count and client
	private static int count = 0, clientNumber = 0;

	// create a Scanner object for keyboard input
	static Scanner Keyboard = new Scanner(System.in);

	// create a DecimalFormat object to format numbers as dollar amounts.
	static DecimalFormat dollar = new DecimalFormat("#,###.00");

	/**
	 * constructor
	 * 
	 * @param sym
	 *            The stock's trading symbol.
	 * @param price
	 *            The stock's share price.
	 * @param price
	 *            The stock's updated share price.
	 *
	 */
	public Stock(String sym, double price, double updatedShrPrice) {
		symbol = sym;
		sharePrice = price;
		updatedSharePrice = updatedShrPrice;
	}

	// details of the clients (3)
	public Stock() {
		// initially 0, start with 1
		count++;
		clientNumber = count;
		System.out.println("New client request count #: " + count);
	}

	/**
	 * copy constructor
	 * 
	 * @param object2
	 *            The stock object to copy.
	 * 
	 */
	public Stock(Stock object2) {
		this.symbol = object2.symbol;
		this.sharePrice = object2.sharePrice;
		this.updatedSharePrice = object2.updatedSharePrice;
	}

	// getSymbol method
	public String getSymbol() {
		return symbol;
	}

	// getSharePrice method
	public double getSharePrice() {
		return sharePrice;
	}

	// getupdatedSharePrice method
	public double getupdatedSharePrice() {
		return updatedSharePrice;
	}

	// toString method
	public String toString() {
		// create a string describing the stock.
		String str = "Trading symbol: " + symbol + "\n" + "Share price: " + sharePrice;
		return str;
	}

	// copy method makes a copy of a Stock object.
	public Stock copy() {
		// create a new Stock object and initialize it with the same data held
		// by the calling object.
		Stock copyObject = new Stock(symbol, sharePrice, updatedSharePrice);
		return copyObject;
	}

	// main method
	public static void main(String args[]) {

		// number of shares to buy.
		int sharesToBuy;

		// create a Stock object for the company stock.
		// the trading symbol is XYZ and the stock is
		// currently $9.62 per share.
		Stock xyzCompany = new Stock("XYZ", 9.62, 20);
		System.out.println(xyzCompany);

		// stockPurchase array of buyers
		StockPurchase[] theBuyers = new StockPurchase[3];

		for (int x = 0; x < 3; x++) {
			// client count
			System.out.println("\n" + "Client number: " + (x + 1));

			// display the current share prices.
			System.out.println(
					"XYZ Company's stock is currently $" + dollar.format(xyzCompany.getSharePrice()) + " per share.");

			// get the number of shares to purchase.
			System.out.print("How many shares do you want to buy? ");
			sharesToBuy = Keyboard.nextInt();

			theBuyers[x] = new StockPurchase(xyzCompany, sharesToBuy);
			// display the cost of the transaction.
			System.out.println("Cost of the stock: $" + dollar.format(theBuyers[x].getCost()) + "\n");
		}

		// for loop to print the client details with Gain and loss
		System.out.println("Client #" + "\t" + "Orignal Stock Cost" + "\t" + "Gain/Loss");
		System.out.println("--------" + "\t" + "------------------" + "\t" + "---------");
		for (int y = 0; y < clientNumber; y++) {
			System.out.println((y + 1) + "\t\t" + "$" + dollar.format(theBuyers[y].getCost()) + "\t\t\t" + "$"
					+ dollar.format(theBuyers[y].calculateProfitLoss()));
		}
	}
}