package templatePattern.networks;

/* �Ҽ� ��Ʈ��ũ�� �⺻ Ŭ���� */
public abstract class Network {
	String userName;
	String password;
	
	Network(){}
	
	/*��� ��Ʈ��ũ�� �����͸� �Խ�*/
	public boolean post(String msg) {
		// posting ������ ����.
		// ��� ��Ʈ��ũ�� ���� �ٸ� ���� ����� �����.
		if(logIn(this.userName, this.password)) {
			// �Խù� ������ ����
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
