package polimorphism03;

public class TVUser {

	public static void main(String[] args) {
		
		//Ŭ���̾�Ʈ �ڵ� ��� : �ܺο��� ��ü�� �����ؼ� ���� ������ �������� �ʾƵ� ��.
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}

}
