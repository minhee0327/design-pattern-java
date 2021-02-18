package singleton.singleThread;

/*single thread에서 singleton은 생성자 private, static creation method만으로 구현 가능*/

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
