package player;

public class VideoPlayer implements Player {
	
	private int id;
	private static int count = 0;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("Video를 재생합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("Video를 정지합니다.");
	}
	
	public void printInfo() {
		System.out.println("제조번호는 : [" + id + "] 입니다.");
	}

}
