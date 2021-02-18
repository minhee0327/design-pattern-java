package singleton;

import singleton.singleThread.Singleton;

public class DemoSingleThreadSingleton {

	public static void main(String[] args) {
		System.out.println(
				"같은값 출력되면, singleton이 재사용된것! \n "
				+ "다른 값이 출력되면, 2개의 싱글톤이 만들어진 것! \n"
				+ "결과: ");
		
		Singleton s1 = Singleton.getInstance("FOO");
		Singleton s2 = Singleton.getInstance("Bar");
	
		System.out.println(s1.value);
		System.out.println(s2.value);
	}

}
