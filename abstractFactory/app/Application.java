package abstractFactory.app;

import abstractFactory.buttons.Button;
import abstractFactory.checkboxs.Checkbox;
import abstractFactory.factories.GUIFactory;

/*client code*/
/*
 * Factory를 사용하는 사용자는 추상 인터페이스를 통한 products,factories와 작업하기 때문에, 
 * 어떤 구현 Factory(MacOSFactory,WindowsFactory)인지 신경쓰지 않아도 됨.
 */
public class Application {
	private Button button;
	private Checkbox checkbox;
	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox= factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
