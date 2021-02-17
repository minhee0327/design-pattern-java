package abstractFactory.buttons;

/* Abstract Factory의 여러 제품군이 있다고 가정하고
 * 별도의 클래스 계층 구조(button/checkbox)로 구성된다.  
 * 동일한 모든 제품군은 공통의 인터페이스를 가지고 있다. 
 */

/* Button interface: Button family(군)의 공통 인터페이스 - 첫번째 계층*/
public interface Button {
	void paint();
}
