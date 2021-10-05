package Day04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc=new Television();
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();
		rc=new Audio();
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();
		
	}

}
