package Project1;

import java.util.Scanner;

public class ContactMain {
	public static Contact[] save=new Contact[100];
	//public static Contact contact=new Contact();
	public static void main(String[] args) {
		
		Contact contact=new Contact();
		contact.info();
		System.out.println("---------------");
		System.out.println("그룹 정보 변경");
		System.out.println("---------------");
		contact.change();
	}

}
