package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.checkboxs.Checkbox;

/* [Abstract factory]
 * Abstract Factory�� ��� Abstract Product Ÿ���� �˰� �ִ�.(Button, Checkbox)
 */
public interface GUIFactory {
	public Button createButton();
	public Checkbox createCheckbox();
}
