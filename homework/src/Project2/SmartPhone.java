package Project2;

import java.util.Scanner;


import Project1.Contact;
import Project1.ContactMain;

public class SmartPhone extends Contact{
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static Contact[] save=new Contact[5];
		//메소드
		public void 저장() {
			
			Scanner scanner=new Scanner(System.in);
			System.out.print("이름: "); String i_name=scanner.next();
			System.out.print("전화번호: "); String i_phonenum=scanner.next();
			System.out.print("이메일: "); String i_email=scanner.next();
			System.out.print("주소: "); String i_address=scanner.next();
			System.out.print("생일: "); String i_birth=scanner.next();
			System.out.print("그룹: "); String i_group=scanner.next();
		
			Contact contact=new Contact(i_name,i_phonenum,i_email,i_address,i_birth,i_group);
			
			for(int i=0;i<save.length;i++) {
				if(save[i]==null) {
					save[i]=contact;
					return;
				}
			}
		
		}
		
		
		
		public void 수정(int cno) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("이름: "); save[cno].setName(scanner.next());
			System.out.println("전화번호: "); save[cno].setPhonenum(scanner.next());
			System.out.println("이메일: "); save[cno].setEmail(scanner.next());
			System.out.println("주소: "); save[cno].setAddress(scanner.next());
			System.out.println("생일: "); save[cno].setBirth(scanner.next());
			System.out.print("그룹: "); save[cno].setGroup(scanner.next());
		
		}
		
		public void 삭제(int num) {
			save[num]=null;
			for(int j=num;j<save.length;j++) {
				if(save[j+1]!=null) {
					save[j]=save[j+1];
				} else {
					save[j]=null;
					break;
				}
			}
		}
		
		public void list() {
			
		}

}
