package phoneadress;

public class MenuChoiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Exception�� Serializable�������̽��� ������ Ŭ������
	final private static long serialVersionID;
	int wrongChoice;
	
	public MenuChoiceException(int a){ //������
		super("�߸��� ������ �߽��ϴ�.");
		wrongChoice=choice;
	}
	
	public void showWrongChoice(){
		System.out.println(wrongChoice+"�� �ش��ϴ� ������ �����ϴ�."+"1~4�̳��� �Է��Ͻÿ�.");
		
	}

}
