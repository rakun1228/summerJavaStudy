package kr.yjc.jclass;

public class BookRecordIterator implements Iterator {
	private BookRecordSet brs;
	private int index;
	
	public BookRecordIterator(BookRecordSet brs) {
		this.brs=brs;
		this.index=0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<brs.getSize())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		BookRecord br = brs.getBookRecord(index);
		index++;
		return br;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		BookRecord br = brs.getBookRecord(brs.getSize()-1);
		brs.deleteBookRecord();
		return br;
	}

}
