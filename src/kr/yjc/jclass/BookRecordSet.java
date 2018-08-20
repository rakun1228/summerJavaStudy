package kr.yjc.jclass;

public class BookRecordSet implements Aggregate  {
	private BookRecord[] brSet;
	private int iLast;
	
	public BookRecordSet() {
		this(50);
	}
	public BookRecordSet(int size) {
		brSet=new BookRecord[size];
	}
	public BookRecord getBookRecord(int idx) {
		return brSet[idx];
	}
	public void addBookRecord(BookRecord br) {
		brSet[iLast] = br;
		iLast++;
	};
	public void deleteBookRecord() {
		brSet[iLast-1]=null;
		iLast--;
	};
	public int getSize() {
		return iLast;
	};
	@Override //directive(���û���)
	public Iterator getIterator() {
		return new BookRecordIterator(this); //���� ��ü�� ������� �ǹ�
	};
}

