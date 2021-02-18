package singleton.multiThread;

/* singleThread���� �����ߴ� Singleton class�� ��Ƽ������ ȯ�濡���� �������Ѵ�.
 * ���� �����尡 ���� �޼��带 ���ÿ� ȣ���ϰ�, Singleton class�� ���� �ν��Ͻ��� �����´�. 
 */
public class Singleton {
	private static Singleton instance;
	public String value;
	
	private Singleton(String value) {
		// ������ �ʱ�ȭ�� ����� �ڵ�;
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
