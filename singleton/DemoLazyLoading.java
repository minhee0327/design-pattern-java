package singleton;

import singleton.lazyLoading.Singleton;

public class DemoLazyLoading {

	public static void main(String[] args) {
		System.out.println(
				"같은값 출력되면, singleton이 재사용된것! \n "
				+ "다른 값이 출력되면, 2개의 싱글톤이 만들어진 것! \n"
				+ "결과: ");
		
		Thread t1 = new Thread(new ThreadFoo());
		Thread t2 = new Thread(new ThreadBar());

		t1.start();
		t2.start();
		
	}

	
	static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton s1 = Singleton.getInstance("FOO");
            System.out.println(s1.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton s2 = Singleton.getInstance("BAR");
            System.out.println(s2.value);
        }
    }
}
