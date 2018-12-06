/**
	A class representing a short term resident member
	@author Noah Clements 3585596
*/
public class ShortTermResidentMember extends ResidentMember{
	/** the name of the member */
	private String fullName;
	/** the room number of the member */
	private int roomNum;
	/** the phone number of the member */
	private String phoneNum;
	/** the departure date of the member */
	private String departureDate;
	/**
	The constructor method for ShortTermResidentMember
	@param nameIn the name of the member
	@param roomNumIn the room number of the member
	@param phoneIn the phone number of the member
	@param departureIn the date of the short term member's departure
	*/
	public ShortTermResidentMember(String nameIn, int roomNumIn, String phoneNumIn, String departureIn) {
		super(nameIn, roomNumIn, phoneNumIn);
		departureDate = departureIn;
	}

	/**
	gets the departure date of the member
	@return the departure date of the member
	*/
	public String getDepartureDate() {
		return departureDate;
	}
	/**
	override method for signOut, if it's not a recommended book it will go to the signOut method in ResidentMember
	@return a boolean value saying whether or not it was a success signing out the book
	*/
	public boolean signOut(LendingItem book) {
		boolean success = false;
		if(book.isBookClubRecommended() == false) {
			success = super.signOut(book);
		} 
		return success;
	}
}