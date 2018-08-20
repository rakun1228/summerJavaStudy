package kr.yjc.jclass;

public class BookRecord {
	private String strTitle;
	private String strAuthor;
	private int iCount;
	//������� ����, private->��������
	//str, i�� ������ �տ� ǥ�� : �ڷ����� ��Ÿ��  (�������) :�밡���ȹ��
	//��ҹ��ڷ� ������ �߰��� �빮�ڷ� ǥ�� : ��Ÿǥ�� (Camel ���)
	//str_title : �߰���_ǥ�� : ��ǥ�� (Snake ���)
	
	public BookRecord() {  //������ �����ε�
		//strTitle="";
		//strAuthor="";
		//iCount=0;
		
		this("","",0);
	}
	public BookRecord(String title, String author, int cnt) {
		this.strTitle=title;
		this.strAuthor=author;
		this.iCount=cnt;
	}
	public String getTitle() {
		//if(�ϰ� Ÿ��Ʋ�� ���� ������ �մٸ�)
		return this.strTitle;
	}
	public String getAuthor(){
		return this.strAuthor;
	}
	public int getCount(){
		return this.iCount;
	}
	
	
}
