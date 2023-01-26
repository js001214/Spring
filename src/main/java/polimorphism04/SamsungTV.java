package polimorphism04;

public class SamsungTV implements TV { //TV인터페이스에 선언된 내용을 구현

	@Override
	public void powerOn() {
		System.out.println("SamsungTV - 전원을 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV - 전원을 끕니다.");

	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV - 소리를 높입니다.");

	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV - 소리를 낮춥니다.");

	}

}
