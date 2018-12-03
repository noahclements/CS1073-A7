public class ResidentMember {
	private String fullName;
	private int roomNum;
	private String phoneNum;
	private int membershipNum = 10000;

	public ResidentMember(String nameIn, int roomNumIn, String phoneIn) {
		fullName = nameIn;
		roomNum = roomNumIn;
		phoneNum = phoneIn;
		membershipNum += 1; // goes up one every time?
	}

	public String getName() {
		return fullName;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public int getMembershipNum() {
		return membershipNum;
	}

	public String getItemList() {

	}

	public void signOutItem() {

	}

	public void returnItem() {

	}

	
 
 }