package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_5 {

	
	//ȸ���� ���α׷� [����ó��]
	public static Member[] members=new Member[100];
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
			FileInputStream fileInputStream=new FileInputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/members.txt");
			// 1.�Է½�Ʈ�� �о�ͼ� �迭�� ���� 
			byte[] ����Ʈ�迭=new byte[1000];
			fileInputStream.read(����Ʈ�迭);
			
			// 2. ����Ʈ => ���ڿ� 
			String ��ü���ڿ�=new String(����Ʈ�迭);
			
			// 3. ȸ����������
			String[] ȸ������Ʈ=��ü���ڿ�.split("\n"); //���ڿ�.split("�ڸ������");
			
			// 4. ��ü�� �ʵ� ���� �ؼ� �迭�� ���� 
			for(int i=0;i<ȸ������Ʈ.length;i++)
			{
				String[] �ʵ�=ȸ������Ʈ[i].split(",");
				Member member=new Member(�ʵ�[0],�ʵ�[1],�ʵ�[2]);
				
				for(int j=0;j<members.length;j++) {
					if(members[j]==null) {
						members[j]=member;
						break;
					}
				}
			}
		} 
		catch (Exception e) {
			
			
		}
		
		while(true) {
			try {
			
			System.out.println("1.ȸ������ 2.�α���");
			int ch=scanner.nextInt();
			if(ch==1) {
				System.out.println("���̵�:"); String id=scanner.next();
				System.out.println("��й�ȣ:"); String password=scanner.next();
				System.out.println("�̸�:"); String name=scanner.next();
			//1.��ü ����[����:������ ������ ���� ��ƴ�=>�ϳ��� ����]Dto
				Member member=new Member(id,password,name);
				
				
			//2.�迭����
				for(int i=0;i<members.length;i++) {
					if(members[i]==null) {
						members[i]=member;
						break;
					}
				}
				
			//3.��������	
				FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/members.txt");
				//1.�迭���� �ϳ��� ��ü �����ͼ� ����Ʈ ��ȯ
				//���Ͽ� ����� ȸ���� �ʵ� ����:, [��ǥ]
				//���Ͽ� ����� ȸ���� ����:\n [�������]
				
				for(int i=0;i<members.length;i++) {
					if(members[i]!=null) { // �迭�� ���� �ƴϸ� [ ȸ���� �����ϸ� ]
						// 1. �� �ʵ� ���̿� , �������� [ �޸��忡�� ���ö� �ʵ尣 ���� ]  / 2.��ü��[ȸ����] \n ��������
						String ��¹��ڿ�=members[i].id+","+members[i].password+","+members[i].name+"\n";
						fileOutputStream.write(��¹��ڿ�.getBytes());
					}else {
						break;
					}
				}
			
			}
			if(ch==2) {}
			}
			catch(Exception e) {
				System.out.println("[[1Ȥ�� 2�� �Է°����մϴ�]]");
				scanner=new Scanner(System.in);
			}
		}
	}
}
