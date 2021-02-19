package templatePattern.networks;

/* 소셜 네트워크의 기본 클래스 */
public abstract class Network {
	String userName;
	String password;
	
	Network(){}
	
	/*모든 네트워크에 데이터를 게시*/
	public boolean post(String msg) {
		// posting 이전에 인증.
		// 모든 네트워크는 서로 다른 인증 방법을 사용함.
		if(logIn(this.userName, this.password)) {
			// 게시물 정보를 전송
			boolean result = sendData(msg.getBytes());
			logOut();
			return result;
		}
		return false;
	}
	
	abstract boolean logIn(String userName, String password);
	abstract boolean sendData(byte[] data);
	abstract void logOut();
}
