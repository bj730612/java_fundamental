package player;

public class CDPlayer implements Player{
	
	
	@Override
	public void play() {
		System.out.println("CD�� ����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("CD�� �����մϴ�.");
	}
	
	public void cleaning() {
		System.out.println("CD�� û���մϴ�.");
	}

}
