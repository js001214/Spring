package polimorphism05;

import org.springframework.stereotype.Component;

@Component("speaker2") //speaker2�� SonySpeaker, Speaker�� �Ѵ� �����Ѵ�.
public class SonySpeaker implements Speaker {

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker - ������");

	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker - �����ٿ�");

	}

}
