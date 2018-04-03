interface RemoteControl {
	void turnOn();
	void turnOff();
}

class Television implements RemoteControl {
	public void turnOn() {
		System.out.println("Television Power On...");
	}
	public void turnOff() {
		System.out.println("Television Power Off...");
	}
}

public class RemoteControlTest01 {
	public static void main(String[] args) {
		Television t = new Television();
		t.turnOn();
	}

}
