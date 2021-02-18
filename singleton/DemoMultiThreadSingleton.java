package singleton;

import singleton.multiThread.Singleton;

public class DemoMultiThreadSingleton {

	public static void main(String[] args) {
		System.out.println(
				"������ ��µǸ�, singleton�� ����Ȱ�! \n "
				+ "�ٸ� ���� ��µǸ�, 2���� �̱����� ������� ��! \n"
				+ "���: ");
		
		Thread t1 = new Thread(new ThreadFoo());
		Thread t2 = new Thread(new ThreadBar());

		t1.start();
		t2.start();
	}

	static class ThreadFoo implements Runnable {
		public void run() {
			Singleton s1 = Singleton.getInstance("Foo");
			System.out.println(s1.value);
		}
		
	}
	
	static class ThreadBar implements Runnable{
		public void run() {
			Singleton s2 = Singleton.getInstance("Bar");
			System.out.println(s2.value);
		}
	}
}
