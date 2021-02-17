package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.MacOSButton;
import abstractFactory.checkboxs.Checkbox;
import abstractFactory.checkboxs.MacOSCheckbox;

/* [Concreate Factory]
 * �� ���� Factory��(MacOSFactory, WindowsFactory) �⺻ Factory(GUIFactory)�� Ȯ���ϰ�, 
 * ���� ������ ��ǰ���� �����ϴ� å���� �ִ�. (Button, Checkbox)
 */
public class MacOSFactory implements GUIFactory{

	public Button createButton() {
		return new MacOSButton();
	}

	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
	
}
