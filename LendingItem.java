/**
	A class representing the middle ground for signing out/returning books, all the info of each item 
	@author Noah Clements 3585596
*/
public class LendingItem {
	/** the description of item */
	private String description;
	/** the price of item */
	private double price;
	/** whether or not its recommended by book club */
	private boolean recommended;

	/**
	The constructor method for LendingItem
	@param descIn the description of the item
	@param priceIn the price of the item
	@param recommendedIn whether or not its recommended by the book club
	*/
	public LendingItem(String descIn, double priceIn, boolean recommendedIn) {
		description = descIn;
		price = priceIn;
		recommended = recommendedIn;
	}
	/**
	gets the description of the item
	@return the description of the item
	*/
	public String getDescription() {
		return description;
	}
	/**
	gets the price of the item
	@return the price of the item
	*/
	public double getPrice() {
		return price;
	}
	/**
	says whether or not its recommended by the book club
	@return boolean value saying whether or not its recommended by the book club
	*/
	public boolean isBookClubRecommended() {
		return recommended;
	}
}