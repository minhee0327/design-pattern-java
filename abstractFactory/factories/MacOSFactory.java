package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.MacOSButton;
import abstractFactory.checkboxs.Checkbox;
import abstractFactory.checkboxs.MacOSCheckbox;

/* [Concreate Factory]
 * 각 구현 Factory는(MacOSFactory, WindowsFactory) 기본 Factory(GUIFactory)를 확장하고, 
 * 단일 종류의 제품들을 생성하는 책임이 있다. (Button, Checkbox)
 */
public class MacOSFactory implements GUIFactory{

	public Button createButton() {
		return new MacOSButton();
	}

	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
	
}
