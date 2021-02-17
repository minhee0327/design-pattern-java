package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.checkboxs.Checkbox;

/* [Abstract factory]
 * Abstract Factory는 모든 Abstract Product 타입을 알고 있다.(Button, Checkbox)
 */
public interface GUIFactory {
	public Button createButton();
	public Checkbox createCheckbox();
}
