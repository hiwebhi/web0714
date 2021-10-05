package Day03;

public class DmbCellPhone extends CellPhone{
	
	//필드 
	int channel;
	
	//생성자
	DmbCellPhone(String model,String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메소드 
	void turnOnDmb() {System.out.println("채널"+this.channel+"번 방송 수신을 시작합니다");	}
	void changeChannelDmb(int channel) {System.out.println("채널을"+channel+"로 변경합니다");}
	void turnOffDmb() {System.out.println("방송 수신을 종료합니다");}
}
