package gihwan.spring.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
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
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}
}
