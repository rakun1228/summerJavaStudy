package phoneadress;

import java.util.HashSet;
import java.util.Iterator;
import java.io.*;

public class PhoneBookManager{
	private final File dataFile = new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage=new HashSet<PhoneInfo>();
	//generic
	static PhoneBookManager inst = null;
	
	private PhoneBookManager() { //������
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
			//����ȭ
			while (true) {
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info==null)break;
				infoStorage.add(info);
			}
			in.close(); //�߿�, ���� �б� ����Ǹ� �ݵ�� ��������.
			
		}catch(Exception e) {
			return;
		}
	}
	
	