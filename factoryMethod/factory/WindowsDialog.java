package factoryMethod.factory;

import factoryMethod.buttons.Button;
import factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

	public Button createButton() {
		return new WindowsButton();
	}
	
}
