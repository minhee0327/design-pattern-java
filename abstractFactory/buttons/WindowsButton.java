package abstractFactory.buttons;

/*
 * ��� ��ǰ������ ������ ����(MacOs, Windows) �� �ִ�.
 * Button�� ������ WindowsButton class
 */
public class WindowsButton implements Button{

	public void paint() {
		System.out.println("You have created Windows Button.");
	}
	
}
