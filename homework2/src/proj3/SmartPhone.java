package proj3;

import java.util.Scanner;


public class SmartPhone {
	
	proj3.Contact[] contacts;
	int countOfContact=0;
	Scanner in;
	
	public SmartPhone() {
		this.contacts=new proj3.Contact[10]; 
		in=new Scanner(System.in); 
	}
	
	public CompanyContact inputContactData1() {
		System.out.print("이름:");
		String name=in.nextLine();
		System.out.print("전화번호:");
		String phoneNumber=in.nextLine();
		System.out.print("이메일:");
		String email=in.nextLine();
		System.out.print("주소:");
		String address=in.nextLine();
		System.out.print("생일:");
		String birthday=in.nextLine();
		System.out.print("그룹:");
		String group=in.nextLine();
		System.out.print("회사:");
		String company=in.nextLine();
		System.out.print("부서:");
		String department=in.nextLine();
		System.out.print("직급:");
		String position=in.nextLine();
		
		return new CompanyContact(name, phoneNumber, email, address, birthday, group,company,department,position);
	}
	
	public CustomerContact inputContactData2() {
		System.out.print("이름:");
		String name=in.nextLine();
		System.out.print("전화번호:");
		String phoneNumber=in.nextLine();
		System.out.print("이메일:");
		String email=in.nextLine();
		System.out.print("주소:");
		String address=in.nextLine();
		System.out.print("생일:");
		String birthday=in.nextLine();
		System.out.print("그룹:");
		String group=in.nextLine();
		System.out.print("거래처:");
		String customername=in.nextLine();
		System.out.print("품목:");
		String product=in.nextLine();
		System.out.print("직급:");
		String position=in.nextLine();
		
		return new CustomerContact(name, phoneNumber, email, address, birthday, group,customername,product,position);
	}
	
	//배열에 연락처 객체 저장
	public void addContact(proj3.Contact contact) {
		contacts[countOfContact]=contact;
		countOfContact++;
		System.out.println(">>> 데이터가 저장 되었습니다.("+countOfContact+")");
	}
	
	public void printContact(proj3.Contact contact) { 
		System.out.println("------------------------------");
		contact.info();
		System.out.println("-------------------------------");
	}
	
	//모든 연락처 출력
	public void printAllContact() {
		for(int i=0;i<countOfContact;i++) {
			printContact(contacts[i]);
		}
	}
	
	//연락처 검색
	public void searchContact(String name) {
		for(int i=0;i<countOfContact;i++) {
			proj3.Contact contact=contacts[i];
			if(contact.getName().contentEquals(name)) {
				printContact(contact);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	//연락처 삭제
	public void deleteContact(String name) {
		for(int i=0;i<countOfContact;i++) {
			proj3.Contact contact=contacts[i];
			if(contact.getName().contentEquals(name)) {
				for(int j=i;j<countOfContact;j++) {
					contacts[j]=contacts[j+1];
				}
				countOfContact--;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	//연락처 수정
	public void editContact(String name, proj3.Contact newContact) {
		for(int i=0;i<countOfContact;i++) {
			if(contacts[i].getName().contentEquals(name)) {
				contacts[i]=newContact;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다");
	}

}
