package singleton.lazyLoading;

public class Singleton {
	// volatile 변수: Java의 변수를 항상 메인메모리에 저장하겠다.
		// read할때마다 CPU cache에 저장된 값이 아닌, Main memory에서 읽는다.
		// multi thread가 변수값을 읽을때 각 thread별로 저장된 CPU cache에서 읽게되면 저장된 값이 불일치(변수값 불일치)할 수 있음
		// 이를 방지할 때 사용하는 키워드 (=> volatile)
	
	private static volatile Singleton instance;
	public String value;
	
	private Singleton(String value) {
		this.value = value;
	}
	
	public static Singleton getInstance(String value) {
		/*
		 * 여기서 취급하는 접근 방식을 이중 검사 잠금 (Double Checked Locking, DCL)이라고 한다. 
		 * 동시에 싱글톤 인스턴스를 얻으려고 시도할 수 있는 여러 스레드간의 race condition(경쟁 상태)를 방지하여
		 * 결과적으로 별도의 인스턴스를 생성할 수 있다.
		 * 
		 * 여기서 result 변수를 갖는게 무의미 해 보일수 있으나, Java에서 DCL 구현시 이 지역변수를 도입함으로써
		 * 해결되는 중요한 주의사항이 있다.(이미 한번 초기화된 경우, 휘발성인 필드가 한번만 access된다. (성능 높임)
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
