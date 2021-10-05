package proj3;



public class Contact {
	//1.필드
	private String name;
	private String phonenum;
	private String email;
	private String address;
	private String birth;
	private String group;
	

	//2.생성자
	public Contact() {
		
	}
	
	public Contact(String name, String phonenum, String email, String address, String birth, String group) {
		this.name = name;
		this.phonenum = phonenum;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}

	//3.메소드
	public void info() {
		System.out.println("이름 : "+ this.name);
		System.out.println("전화번호: "+this.phonenum); 
		System.out.println("이메일: "+this.email); 
		System.out.println("주소: "+this.address);
		System.out.println("생일: "+this.birth); 
		System.out.println("그룹: "+this.group); 
	
	}
	
	
	//get,set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	

}
