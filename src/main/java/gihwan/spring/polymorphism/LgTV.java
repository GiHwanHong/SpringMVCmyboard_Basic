package gihwan.spring.polymorphism;

public class LgTV implements TV{
	
	public LgTV() {

		System.out.println("LG TV 객체를 생성한다.");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV 전원을 켠다.");
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV 전원을 끈다.");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV 볼륨을 올린다.");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV 볼륨을 내린다.");
	}
}
