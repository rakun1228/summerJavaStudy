package kr.yjc.jclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in); //바이트 스트림이 문자스트림으로
		BufferedReader bis = new BufferedReader(isr); //모아서 세트로 저장
		
		BookRecordSet brs = new BookRecordSet(30);
		Iterator itr = null;
		BookRecord br = null;
		String strTitle = null;
		String strAuthor = null;
		int iCount = 0;
		
	}

}
