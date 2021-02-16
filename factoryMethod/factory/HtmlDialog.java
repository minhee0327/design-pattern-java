package factoryMethod.factory;

import factoryMethod.buttons.Button;
import factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

	public Button createButton() {
		
		return new HtmlButton();
	}


}
