package Project2;

import java.util.Scanner;

import Project1.Contact;


public class SmartPhone {
	public static Contact[] contactlist=new Contact[5];
	int count=0;
	
	//메소드
	//0.등록 및 저장
	public void info() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름: "); String i_name=scanner.next();
		System.out.print("전화번호: "); String i_phonenum=scanner.next();
		System.out.print("이메일: "); String i_email=scanner.next();
		System.out.print("주소: "); String i_address=scanner.next();
		System.out.print("생일: "); String i_birth=scanner.next();
		System.out.print("그룹: "); String i_group=scanner.next();
	
		Contact contact=new Contact(i_name,i_phonenum,i_email,i_address,i_birth,i_group);
		
		
		contactlist[count]=contact;
		count++;
			
		
	
	}

	
	//1.수정
	public void modify() {
		if(count==0) {System.out.println("등록된 연락처가 없습니다. 연락처를 등록해주세요.");}
		else {
		Scanner scanner=new Scanner(System.in);
		System.out.println("수정할 연락처 인덱스 번호(0~4) : "); int index=scanner.nextInt();
		contactlist[index].setName(scanner.next());
		contactlist[index].setPhonenum(scanner.next());
		contactlist[index].setEmail(scanner.next());
		contactlist[index].setAddress(scanner.next());
		contactlist[index].setBirth(scanner.next());
		contactlist[index].setGroup(scanner.next());
		}
	}
	//2.삭제
	public void delete() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("삭제할 연락처 인덱스 번호(0~4) : "); int index=scanner.nextInt();
		contactlist[index]=null;
		for(int i=index;i<contactlist.length;i++) {
			if(contactlist[index+1]!=null) {
				contactlist[index]=contactlist[index+1];
			}else {
				contactlist[index]=null;
			}
		}
	}
	//3.리스트 출력
	public void list() {
		for(int i=0;i<contactlist.length;i++) {
			System.out.println("이름: "+contactlist[i].getName());
			System.out.println("전화번호: "+contactlist[i].getPhonenum());
			System.out.println("이메일: "+contactlist[i].getEmail());
			System.out.println("주소: "+contactlist[i].getAddress());
			System.out.println("생일: "+contactlist[i].getBirth());
			System.out.println("그룹: "+contactlist[i].getGroup());
		}
		
	}
}
