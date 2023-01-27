package polimorphism05;

import org.springframework.stereotype.Component;

@Component("speaker2") //speaker2는 SonySpeaker, Speaker을 둘다 내포한다.
public class SonySpeaker implements Speaker {

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker - 볼륨업");

	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker - 볼륨다운");

	}

}
