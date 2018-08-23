package phoneadress;
import java.util.Scanner;

public class MenuViewer implements INIT_MENU {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		boolean bFlag = true;
		while(bFlag) {
			System.out.println("\n 선택하세요...");
			System.out.println( "1. 데이터 입력");
			System.out.println( "2. 데이터 검색");
			System.out.println( "3. 데이터 삭제");
			System.out.println( "4. 프로그램 종료");
			System.out.print( "선택 : \t");
			
			int choice;
			choice = keyboard.nextInt();
			if(choice!=1||choice!=2||choice!=3||choice!=4)
				throw new MenuChoiceException(choice);
			
			switch(choice) {
			case INPUT : 
				System.out.println("데이터 입력을 시작합니다..");
				PhoneBookManager inst = PhoneBookManager.createManagerInst();
				inst.inputData();
				System.out.println("\n데이터 입력이 완료되었습니다.");
				break;
				
			case SEARCH : 
				System.out.println("데이터 검색을 시작합니다..");
				System.out.print("이름 : ");
				String name = keyboard.nextLine();
\				inst.searchData(name);
				break;
				
			case DELETE : 
				System.out.println("데이터 삭제를 시작합니다..");
				System.out.print("이름 : ");
				String name = keyboard.nextLine();
				inst.deleteData(name);
	
				break;
				
			case EXIT : 
				System.out.println("프로그램을 종료합니다.");
				bFlag=false;
				break;
	
			}//외부 switch 닫음
		}
	}//showMenu
}//class
	

