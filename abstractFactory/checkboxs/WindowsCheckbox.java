package abstractFactory.checkboxs;

/*
 * ��� ��ǰ������ ������ ����(MacOs, Windows) �� �ִ�.
 * Checkbox�� ������ WindowsCheckbox class
 */ 
public class WindowsCheckbox implements Checkbox{

	public void paint() {
		System.out.println("You have created Windows Checkbox.");
	}
	
}
