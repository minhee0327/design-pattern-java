package abstractFactory.app;

import abstractFactory.buttons.Button;
import abstractFactory.checkboxs.Checkbox;
import abstractFactory.factories.GUIFactory;

/*client code*/
/*
 * Factory�� ����ϴ� ����ڴ� �߻� �������̽��� ���� products,factories�� �۾��ϱ� ������, 
 * � ���� Factory(MacOSFactory,WindowsFactory)���� �Ű澲�� �ʾƵ� ��.
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
