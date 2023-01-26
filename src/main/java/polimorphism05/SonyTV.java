package polimorphism05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//Component�� ��ü�� ���� ������ class SonyTV�� �ҹ��ڷ� sonyTV ��ü�� �ȴ�.
@Component
public class SonyTV implements TV {

	@Autowired				//Speaker Ÿ���� ��ü�� Spring Framework���� �˻��ؼ� ���� (DI)
	@Qualifier("speaker2")	//BossSpeaker�� ��ü �̸��� (speaker), SonySpeaker�� ��ü �̸��� (speaker2) <== �ΰ��� ��ü ��� Speaker Ÿ���� ������.
	private Speaker speaker;
	
	
	@Override
	public void powerOn() {
		System.out.println("SonyTV - ������ �մϴ�.");

	}

	@Override
	public void powerOff() {
		System.out.println("SonyTV - ������ ���ϴ�.");

	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();

	}

}
