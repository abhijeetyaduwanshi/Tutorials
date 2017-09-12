/*
 * Program to create stock transactions for XYZ stock with various clients and display a profit or loss on shares based on a given transacted stock price versus an updated stock price.
 * Class inheritance.
 * File name : StockPurchase.java
 */

package stockTransaction;

/**
 * @author Abhijeet
 */

public class StockPurchase extends Stock {

	// the stock that was purchased
	private Stock stock;
	// number of shares owned
	private int shares;

	/**
	 * constructor
	 * 
	 * @param stockObject
	 *            The stock to purchase.
	 * @param numShares
	 *            The number of shares.
	 */
	public StockPurchase(Stock stockObject, int numShares) {
		// create a copy of the object referenced by stockObject.
		// call base class constructor
		super();
		// call copy constructor
		stock = new Stock(stockObject);
		shares = numShares;
	}

	// getStock method
	public Stock getStock() {
		return new Stock(stock);
	}

	// getShares method
	public int getShares() {
		return shares;
	}

	// getCost method
	public double getCost() {
		return shares * stock.getSharePrice();
	}

	// calculateProfitLoss Calculate the Profit or Loss
	public double calculateProfitLoss() {
		return (stock.getupdatedSharePrice() - stock.getSharePrice()) * shares;
	}
}