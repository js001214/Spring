package polimorphism03;

public class LgTV implements TV { //TV라는 인터페이스를 구현하는 LgTV

	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원을 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV - 소리를 높입니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV - 소리를 낮춥니다.");
	}

}
