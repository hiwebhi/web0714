package Project1;

import java.util.Scanner;

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
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String phonenum, String email, String address, String birth, String group) {
		
		this.name = name;
		this.phonenum = phonenum;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}

	
	//메소드
	public void info() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름: "); String i_name=scanner.next();
		System.out.print("전화번호: "); String i_phonenum=scanner.next();
		System.out.print("이메일: "); String i_email=scanner.next();
		System.out.print("주소: "); String i_address=scanner.next();
		System.out.print("생일: "); String i_birth=scanner.next();
		System.out.print("그룹: "); String i_group=scanner.next();
	
		Contact contact=new Contact(i_name,i_phonenum,i_email,i_address,i_birth,i_group);
		
		for(int i=0;i<ContactMain.save.length;i++) {
			if(ContactMain.save[i]==null) {
				ContactMain.save[i]=contact;
				return;
			}
		}
	
	}
	
	public void change() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("이름: "+ContactMain.save[0].name);
		System.out.println("전화번호: "+ContactMain.save[0].phonenum);
		System.out.println("이메일: "+ContactMain.save[0].email);
		System.out.println("주소: "+ContactMain.save[0].address); 
		System.out.println("생일: "+ContactMain.save[0].birth); 
		System.out.print("그룹: "); String c_group=scanner.next();
	
		
	
	}
	
	//get,set
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
