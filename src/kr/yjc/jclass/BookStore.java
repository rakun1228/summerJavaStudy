package kr.yjc.jclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in); //����Ʈ ��Ʈ���� ���ڽ�Ʈ������
		BufferedReader bis = new BufferedReader(isr); //��Ƽ� ��Ʈ�� ����
		
		BookRecordSet brs = new BookRecordSet(30);
		Iterator itr = null;
		BookRecord br = null;
		String strTitle = null;
		String strAuthor = null;
		int iCount = 0;
		
	}

}
