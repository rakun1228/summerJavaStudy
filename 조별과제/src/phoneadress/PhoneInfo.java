package phoneadress;
import java.io.Serializable;

public class PhoneInfo {
	final private static long serialVersionID;
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	PhoneInfo(){}
	
	public void showPhoneInfo() {
		System.out.println("name : " +name);
		System.out.println("phone : " +phoneNumber);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		PhoneInfo com = (PhoneInfo)o;
		if(name.compareTo(com.name)==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "name: "+name+"\n phone: "+phoneNumber+"\n";
	}

}
