/**
	A class representing the Resident Member 
	@author Noah Clements 3585596
*/
public class ResidentMember {
	/** the name of member */
	private String fullName;
	/** the room number of member */
	private int roomNum;
	/** the phone number of the member */
	private String phoneNum;
	/** the starting value for membership numbers */
	static int membershipNum = 10000;
	/** the membership number for each member */
	private int userMemNumber;
	/** the array for LendingItem[] stuff */
	private LendingItem[] items;
	/** a counter */
	private int companion;
	/**
	The constructor method for ResidentMember
	@param nameIn the name of the member
	@param roomNumIn the room number of the member
	@param phoneIn the phone number of the member
	*/
	public ResidentMember(String nameIn, int roomNumIn, String phoneIn) {
		fullName = nameIn;
		roomNum = roomNumIn;
		phoneNum = phoneIn;
		userMemNumber = membershipNum;
		membershipNum++;
		items = new LendingItem[8];
		companion = 0;
	}
	/**
	gets the name of the member
	@return the name of the member
	*/
	public String getName() {
		return fullName;
	}
	/**
	gets the room number of the member
	@return the room number of the member
	*/
	public int getRoomNumber() {
		return roomNum;
	}
	/**
	gets the phone number of the member
	@return the phone number of the member
	*/
	public String getPhoneNumber() {
		return phoneNum;
	}
	/**
	changes the phone number of the member
	@param phoneInput the new phone number for the member
	*/
	public void setPhoneNumber(String phoneInput) {
		phoneNum = phoneInput;
	}
	/**
	gets the membership number of the member
	@return the membership number of the member
	*/
	public int getMembershipNumber() {
		return userMemNumber;
	}
	/**
	gets a list of the items the member has signed out
	@return the items that the member has signed out already
	*/
	public LendingItem[] getSignedOutItems() {
		LendingItem[] temp = new LendingItem[companion];
		for(int i=0; i < companion; i++) {
			temp[i] = items[i];
		}
		return temp;
	}
	/**
	signs out a book
	@return  a boolean value saying whether or not the member can sign out a book or not
	*/
	public boolean signOut(LendingItem book) {
		boolean success = false;
		if(companion < 8) {
			items[companion] = book;
			companion++;
			success = true;
		} 
		return success;
	}
	/**
	returns a book
	@return a boolean value saying whether the return was a success
	*/
	public boolean returnItem(LendingItem book2) {
		boolean success = false;
		for(int j = 0; j < companion && !success ; j++) {
			if(book2.getDescription() == items[j].getDescription() && book2.getPrice() == items[j].getPrice() && book2.isBookClubRecommended() == items[j].isBookClubRecommended()) { 
				items[j] = items[companion -1];
				companion--;
				success = true;
			}
		}
		return success;
	}

	
 
 }