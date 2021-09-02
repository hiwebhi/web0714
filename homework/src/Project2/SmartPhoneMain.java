package Project2;

import java.util.Scanner;

import Project1.Contact;

public class SmartPhoneMain {
	public static void main(String[] args) {
		
		SmartPhone smartphone=new SmartPhone();
		System.out.println("#데이터 2개를 입력합니다.");
		smartphone.info();
		System.out.println(">>데이터가 저장되었습니다 (1)");
		smartphone.info();
		System.out.println(">>데이터가 저장되었습니다 (2)");
		
		while(true) {
		System.out.println("contact---------------");
		System.out.println(">>1.연락처 등록");
		System.out.println(">>2.모든 연락처 출력");
		System.out.println(">>3.연락처 검색");
		System.out.println(">>4.연락처 삭제");
		System.out.println(">>5.연락처 수정");
		System.out.println(">>6.프로그램 종료");
		System.out.println("---------------");
		Scanner scanner=new Scanner(System.in);
		int ch=scanner.nextInt();
		if(ch==1) {smartphone.info();}
		if(ch==2) {}
		if(ch==3) {}
		if(ch==4) {smartphone.삭제(scanner.nextInt());}
		if(ch==5) {smartphone.수정(scanner.nextInt());}
		if(ch==6) {return;}
		}
	}
}
