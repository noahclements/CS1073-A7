public class LendingItem {
	private String description;
	private double price;
	private boolean recommended;

	public LendingItem(String descIn, double priceIn, boolean recommendedIn) {
		description = descIn;
		price = priceIn;
		recommended = recommendedIn;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean getRecommendation() {
		return recommended;
	}
}