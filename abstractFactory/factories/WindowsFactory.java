package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.WindowsButton;
import abstractFactory.checkboxs.Checkbox;
import abstractFactory.checkboxs.WindowsCheckbox;

/* [Concreate Factory]
 * �� ���� Factory��(MacOSFactory, WindowsFactory) �⺻ Factory(GUIFactory)�� Ȯ���ϰ�, 
 * ���� ������ ��ǰ���� �����ϴ� å���� �ִ�. (Button, Checkbox)
 */
public class WindowsFactory implements GUIFactory{
	public Button createButton() {
		return new WindowsButton();
	}

	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
