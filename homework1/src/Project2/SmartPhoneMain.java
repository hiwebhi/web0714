package Project2;

import java.util.Scanner;

import Project1.Contact;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone smartPhone=new SmartPhone();
		System.out.println("#데이터 2개를 입력합니다.");
		smartPhone.info();
		System.out.println(">>데이터가 저장되었습니다 (1)");
		smartPhone.info();
		System.out.println(">>데이터가 저장되었습니다 (2)");
		int end=0;
		while(true) {
			System.out.println("contact---------------");
			System.out.println(">>1.연락처 등록");
			System.out.println(">>2.모든 연락처 출력");
			System.out.println(">>3.연락처 검색");
			System.out.println(">>4.연락처 삭제");
			System.out.println(">>5.연락처 수정");
			System.out.println(">>6.프로그램 종료");
			System.out.println("---------------");
			Scanner scanner=new Scanner(System.in); int ch=scanner.nextInt();
			switch(ch) {
					case 1: 
							smartPhone.info();
							break;
					case 2: 
						try {
							smartPhone.list();} 
						catch(Exception e) {}
							break;
					case 3:
							for(int i=0;i<smartPhone.contactlist.length;i++) {
								if(smartPhone.contactlist[i].getName().contentEquals(scanner.next())) {
								System.out.println(smartPhone.contactlist[i].getPhonenum()); }
								}
							break;
							
					case 4: 
						try {
							smartPhone.delete();}
						catch(Exception e) {}
							break;
					case 5: 
							smartPhone.modify();
							break;
					case 6: 
							System.out.println("종료"); end=1;
							break;
					default:
							System.out.println("알수없는 번호입니다.");
			}
			if(end==1) break;
		}
	}

}
