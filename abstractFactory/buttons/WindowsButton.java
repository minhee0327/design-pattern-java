package abstractFactory.buttons;

/*
 * 모든 제품군에는 동일한 종류(MacOs, Windows) 가 있다.
 * Button의 변형인 WindowsButton class
 */
public class WindowsButton implements Button{

	public void paint() {
		System.out.println("You have created Windows Button.");
	}
	
}
