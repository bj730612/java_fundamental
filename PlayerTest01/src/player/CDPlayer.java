package player;

public class CDPlayer implements Player{
	
	
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("CD를 정지합니다.");
	}
	
	public void cleaning() {
		System.out.println("CD를 청소합니다.");
	}

}
