package phoneadress;

public class PhoneCompanyInfo extends PhoneInfo {
	final private static long serialVersionID;
	String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company){
		super(name, phoneNumber);
		this.company=company;
	}
	PhoneCompanyInfo(){}
	
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company : "+company);
	}
	
	@Override
	public String toString() {
		return super.toString()+"company : \"+company;
		
	}

}
