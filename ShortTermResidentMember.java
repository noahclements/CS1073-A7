public class ShortTermResidentMember extends ResidentMember{
	private String fullName;
	private int roomNum;
	private String phoneNum;
	private String departureDate;

	public ShortTermResidentMember(String nameIn, int roomNumIn, String phoneNumIn, String departureIn) {
		super(nameIn, roomNumIn, phoneNumIn);
		departureDate = departureIn;
	}


	public String getDepartureDate() {
		return departureDate;
	}

	public boolean signOut(LendingItem book) {
		boolean success = false;
		if(book.isBookClubRecommended() == false) {
			success = super.signOut(book);
		} 
		return success;
	}
}