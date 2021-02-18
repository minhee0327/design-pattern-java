package singleton.lazyLoading;

public class Singleton {
	// volatile ����: Java�� ������ �׻� ���θ޸𸮿� �����ϰڴ�.
		// read�Ҷ����� CPU cache�� ����� ���� �ƴ�, Main memory���� �д´�.
		// multi thread�� �������� ������ �� thread���� ����� CPU cache���� �аԵǸ� ����� ���� ����ġ(������ ����ġ)�� �� ����
		// �̸� ������ �� ����ϴ� Ű���� (=> volatile)
	
	private static volatile Singleton instance;
	public String value;
	
	private Singleton(String value) {
		this.value = value;
	}
	
	public static Singleton getInstance(String value) {
		/*
		 * ���⼭ ����ϴ� ���� ����� ���� �˻� ��� (Double Checked Locking, DCL)�̶�� �Ѵ�. 
		 * ���ÿ� �̱��� �ν��Ͻ��� �������� �õ��� �� �ִ� ���� �����尣�� race condition(���� ����)�� �����Ͽ�
		 * ��������� ������ �ν��Ͻ��� ������ �� �ִ�.
		 * 
		 * ���⼭ result ������ ���°� ���ǹ� �� ���ϼ� ������, Java���� DCL ������ �� ���������� ���������ν�
		 * �ذ�Ǵ� �߿��� ���ǻ����� �ִ�.(�̹� �ѹ� �ʱ�ȭ�� ���, �ֹ߼��� �ʵ尡 �ѹ��� access�ȴ�. (���� ����)
		 */
		
		Singleton result = instance;
		if(result != null) {
			return instance;
		}
		synchronized (Singleton.class) {
			if(instance == null) {
				instance = new Singleton(value);
			}
			return instance;
		}
	}
}
