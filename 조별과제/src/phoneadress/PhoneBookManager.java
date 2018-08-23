package phoneadress;

import java.util.HashSet;
import java.util.Iterator;
import java.io.*;

public class PhoneBookManager{
	private final File dataFile = new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage=new HashSet<PhoneInfo>();
	//generic
	static PhoneBookManager inst = null;
	
	private PhoneBookManager() { //생성자
		readFromFile();
	}

	public static PhoneBookManager createManagerInst() {
		if(inst==null) 
			inst = new PhoneBookManager();
		return inst;
			
	}
	
	public void readFromFile() {
		if(dataFile.exists()==false) return;
		
		try {
			
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			//직렬화
			while (true) {
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info==null)break;
				infoStorage.add(info);
			}
			in.close(); //중요, 파일 읽기 종료되면 반드시 실행하자.
			
		}catch(Exception e) {
			return;
		}
	}
	
	