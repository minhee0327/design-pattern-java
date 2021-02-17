package abstractFactory;

import abstractFactory.app.Application;
import abstractFactory.factories.GUIFactory;
import abstractFactory.factories.MacOSFactory;
import abstractFactory.factories.WindowsFactory;

public class Demo {
	/* Application은 Factory type을 결정하고 환경변수나 구성에 따라서 런타임에 (일반적으로 초기화 단계에서) 생성 */
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
