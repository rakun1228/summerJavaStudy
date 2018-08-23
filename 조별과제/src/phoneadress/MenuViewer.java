package phoneadress;
import java.util.Scanner;

public class MenuViewer implements INIT_MENU {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		boolean bFlag = true;
		while(bFlag) {
			System.out.println("\n �����ϼ���...");
			System.out.println( "1. ������ �Է�");
			System.out.println( "2. ������ �˻�");
			System.out.println( "3. ������ ����");
			System.out.println( "4. ���α׷� ����");
			System.out.print( "���� : \t");
			
			int choice;
			choice = keyboard.nextInt();
			if(choice!=1||choice!=2||choice!=3||choice!=4)
				throw new MenuChoiceException(choice);
			
			switch(choice) {
			case INPUT : 
				System.out.println("������ �Է��� �����մϴ�..");
				PhoneBookManager inst = PhoneBookManager.createManagerInst();
				inst.inputData();
				System.out.println("\n������ �Է��� �Ϸ�Ǿ����ϴ�.");
				break;
				
			case SEARCH : 
				System.out.println("������ �˻��� �����մϴ�..");
				System.out.print("�̸� : ");
				String name = keyboard.nextLine();
\				inst.searchData(name);
				break;
				
			case DELETE : 
				System.out.println("������ ������ �����մϴ�..");
				System.out.print("�̸� : ");
				String name = keyboard.nextLine();
				inst.deleteData(name);
	
				break;
				
			case EXIT : 
				System.out.println("���α׷��� �����մϴ�.");
				bFlag=false;
				break;
	
			}//�ܺ� switch ����
		}
	}//showMenu
}//class
	

