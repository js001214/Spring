package polimorphism05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//Component에 객체를 넣지 않으면 class SonyTV가 소문자로 sonyTV 객체로 된다.
@Component
public class SonyTV implements TV {

	@Autowired				//Speaker 타입의 객체를 Spring Framework에서 검색해서 주입 (DI)
	@Qualifier("speaker2")	//BossSpeaker는 객체 이름을 (speaker), SonySpeaker는 객체 이름을 (speaker2) <== 두개의 객체 모두 Speaker 타입을 내포함.
	private Speaker speaker;
	
	
	@Override
	public void powerOn() {
		System.out.println("SonyTV - 전원을 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("SonyTV - 전원을 끕니다.");

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
