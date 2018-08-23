package phoneadress;

public class MenuChoiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Exception은 Serializable인터페이스를 구현한 클래스임
	final private static long serialVersionID;
	int wrongChoice;
	
	public MenuChoiceException(int a){ //생성자
		super("잘못된 선탹을 했습니다.");
		wrongChoice=choice;
	}
	
	public void showWrongChoice(){
		System.out.println(wrongChoice+"에 해당하는 선택은 없습니다."+"1~4이내로 입력하시오.");
		
	}

}
