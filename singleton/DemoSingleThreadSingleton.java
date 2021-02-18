package singleton;

import singleton.singleThread.Singleton;

public class DemoSingleThreadSingleton {

	public static void main(String[] args) {
		System.out.println(
				"������ ��µǸ�, singleton�� ����Ȱ�! \n "
				+ "�ٸ� ���� ��µǸ�, 2���� �̱����� ������� ��! \n"
				+ "���: ");
		
		Singleton s1 = Singleton.getInstance("FOO");
		Singleton s2 = Singleton.getInstance("Bar");
	
		System.out.println(s1.value);
		System.out.println(s2.value);
	}

}
