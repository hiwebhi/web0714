package Project2;

import java.util.Scanner;


import Project1.Contact;
import Project1.ContactMain;

public class SmartPhone extends Contact{
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static Contact[] save=new Contact[5];
		//�޼ҵ�
		public void ����() {
			
			Scanner scanner=new Scanner(System.in);
			System.out.print("�̸�: "); String i_name=scanner.next();
			System.out.print("��ȭ��ȣ: "); String i_phonenum=scanner.next();
			System.out.print("�̸���: "); String i_email=scanner.next();
			System.out.print("�ּ�: "); String i_address=scanner.next();
			System.out.print("����: "); String i_birth=scanner.next();
			System.out.print("�׷�: "); String i_group=scanner.next();
		
			Contact contact=new Contact(i_name,i_phonenum,i_email,i_address,i_birth,i_group);
			
			for(int i=0;i<save.length;i++) {
				if(save[i]==null) {
					save[i]=contact;
					return;
				}
			}
		
		}
		
		
		
		public void ����(int cno) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("�̸�: "); save[cno].setName(scanner.next());
			System.out.println("��ȭ��ȣ: "); save[cno].setPhonenum(scanner.next());
			System.out.println("�̸���: "); save[cno].setEmail(scanner.next());
			System.out.println("�ּ�: "); save[cno].setAddress(scanner.next());
			System.out.println("����: "); save[cno].setBirth(scanner.next());
			System.out.print("�׷�: "); save[cno].setGroup(scanner.next());
		
		}
		
		public void ����(int num) {
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
