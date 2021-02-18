package singleton.multiThread;

/* singleThread에서 구현했던 Singleton class는 멀티스레드 환경에서는 오동작한다.
 * 여러 스레드가 생성 메서드를 동시에 호출하고, Singleton class의 여러 인스턴스를 가져온다. 
 */
public class Singleton {
	private static Singleton instance;
	public String value;
	
	private Singleton(String value) {
		// 지연된 초기화를 모방한 코드;
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.value = value;
	}
	
	public static Singleton getInstance(String value) {
		if(instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
}
