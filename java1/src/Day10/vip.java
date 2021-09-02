package Day10;

public class vip extends 회원 {
	private String 회원등급;
	
	public vip() {
		super();
	}

	public vip(String id, String password, String 회원등급) {
		super(id,password);
		this.회원등급 = 회원등급;
	}

	
	@Override
	public void 정보() {
		super.정보();
		System.out.println("회원등급: "+회원등급);
	}
	
	

	public String get회원등급() {
		return 회원등급;
	}

	public void set회원등급(String 회원등급) {
		this.회원등급 = 회원등급;
	}
	
	

}
