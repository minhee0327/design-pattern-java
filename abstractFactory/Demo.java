package abstractFactory;

import abstractFactory.app.Application;
import abstractFactory.factories.GUIFactory;
import abstractFactory.factories.MacOSFactory;
import abstractFactory.factories.WindowsFactory;

public class Demo {
	/* Application�� Factory type�� �����ϰ� ȯ�溯���� ������ ���� ��Ÿ�ӿ� (�Ϲ������� �ʱ�ȭ �ܰ迡��) ���� */
	public static Application configureApplication() {
		Application app;
		GUIFactory factory;
		
		String osName = System.getProperty("os.name").toLowerCase();
		
		if(osName.contains("Mac")) {
			factory = new MacOSFactory();
			app = new Application(factory);
		}else {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		
		return app;
	}
	
	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}

}
