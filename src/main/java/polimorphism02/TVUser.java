package polimorphism02;

public class TVUser {

	public static void main(String[] args) {
		// ó������ SamsungTV ��� ==> LgTV�� ����� ���� ������ ��� ������ Ȯ��
		
		//SamsungTV tv = new SamsungTV();
		//LgTV tv = new LgTV();
		
		
		LgTV tv = new LgTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
