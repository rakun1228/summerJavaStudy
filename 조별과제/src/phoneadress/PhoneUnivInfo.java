package phoneadress;

public class PhoneUnivInfo extends PhoneInfo {
	final private static long serialVersionID;
	String major;
	int year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year){
		super(name,phoneNumber);
		this.major=major;
		this.year=year;
	}
	PhoneUnivInfo(){}
	
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major : "+major);
		System.out.println("year : "+year);
	}
	
	@Override
	public String toString() {
		return super.toString()+"major : "+major+"year : "+year;
	}

}
