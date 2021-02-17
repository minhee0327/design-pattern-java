package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.WindowsButton;
import abstractFactory.checkboxs.Checkbox;
import abstractFactory.checkboxs.WindowsCheckbox;

/* [Concreate Factory]
 * 각 구현 Factory는(MacOSFactory, WindowsFactory) 기본 Factory(GUIFactory)를 확장하고, 
 * 단일 종류의 제품들을 생성하는 책임이 있다. (Button, Checkbox)
 */
public class WindowsFactory implements GUIFactory{
	public Button createButton() {
		return new WindowsButton();
	}

	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
