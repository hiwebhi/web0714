package Project2;

import java.util.Scanner;

import Project1.Contact;

public class SmartPhoneMain {
	public static void main(String[] args) {
		
		SmartPhone smartphone=new SmartPhone();
		System.out.println("#������ 2���� �Է��մϴ�.");
		smartphone.info();
		System.out.println(">>�����Ͱ� ����Ǿ����ϴ� (1)");
		smartphone.info();
		System.out.println(">>�����Ͱ� ����Ǿ����ϴ� (2)");
		
		while(true) {
		System.out.println("contact---------------");
		System.out.println(">>1.����ó ���");
		System.out.println(">>2.��� ����ó ���");
		System.out.println(">>3.����ó �˻�");
		System.out.println(">>4.����ó ����");
		System.out.println(">>5.����ó ����");
		System.out.println(">>6.���α׷� ����");
		System.out.println("---------------");
		Scanner scanner=new Scanner(System.in);
		int ch=scanner.nextInt();
		if(ch==1) {smartphone.info();}
		if(ch==2) {}
		if(ch==3) {}
		if(ch==4) {smartphone.����(scanner.nextInt());}
		if(ch==5) {smartphone.����(scanner.nextInt());}
		if(ch==6) {return;}
		}
	}
}
