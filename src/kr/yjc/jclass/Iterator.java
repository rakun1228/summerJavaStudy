package kr.yjc.jclass;

public interface Iterator {
	public boolean hasNext(); //���� ��ȸ�� ��Ұ� �ִ°�?
	public Object next(); //���� ��� ��������(������ �� ��� ���¸� �𸣹Ƿ� �������� �̿��� ������Ʈ�� ����.)
	public Object remove(); //�����ϸ鼭 ������ ��� ��������
}
