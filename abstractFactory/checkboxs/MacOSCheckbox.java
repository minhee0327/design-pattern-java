package abstractFactory.checkboxs;

/*
 * 모든 제품군에는 동일한 종류(MacOs, Windows) 가 있다.
 * Checkbox의 변형인 MacOSCheckbox class
 */ 
public class MacOSCheckbox implements Checkbox{

	public void paint() {
		System.out.println("You have created MacOS Checkbox.");
	}
	
}
