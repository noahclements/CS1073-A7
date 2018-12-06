public class ResidentMember {
	private String fullName;
	private int roomNum;
	private String phoneNum;
	static int membershipNum = 10000;
	private int userMemNumber;
	private LendingItem[] items;
	private int companion;
	public ResidentMember(String nameIn, int roomNumIn, String phoneIn) {
		fullName = nameIn;
		roomNum = roomNumIn;
		phoneNum = phoneIn;
		userMemNumber = membershipNum;
		membershipNum++;
		items = new LendingItem[8];
		companion = 0;
	}

	public String getName() {
		return fullName;
	}

	public int getRoomNumber() {
		return roomNum;
	}

	public String getPhoneNumber() {
		return phoneNum;
	}

	public void setPhoneNumber(String phoneInput) {
		phoneNum = phoneInput;
	}

	public int getMembershipNumber() {
		return userMemNumber;
	}

	public LendingItem[] getSignedOutItems() {
		LendingItem[] temp = new LendingItem[companion];
		for(int i=0; i < companion; i++) {
			temp[i] = items[i];
		}
		return temp;
	}

	public boolean signOut(LendingItem book) {
		boolean success = false;
		if(companion < 8) {
			items[companion] = book;
			companion++;
			success = true;
		} 
		return success;
	}

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