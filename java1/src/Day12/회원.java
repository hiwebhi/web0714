package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ȸ�� {//c.s
	
	//1.�ʵ� :����[�޸�]
		String id;
		String password;
		String name;
		
	//2.������
	public ȸ��() {
		
	}

	public ȸ��(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}



	//�޼ҵ�
	//1.�α���
	public void login() {
		System.out.println(id+"�� �α��� �Ǿ����ϴ�");
	}
	
	//2.ȸ������
	public void join() {
		Scanner scanner =new Scanner(System.in);
		
		//0.����ó��
		try {
			FileInputStream fileInputStream=new FileInputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/ȸ�������α׷�.txt");
			// 1.�Է½�Ʈ�� �о�ͼ� �迭�� ���� 
			byte[] ����Ʈ�迭=new byte[1000];
			fileInputStream.read(����Ʈ�迭);
			
			// 2. ����Ʈ => ���ڿ� 
			String ��ü���ڿ�=new String(����Ʈ�迭);
			
			// 3. ȸ����������
			String[] ȸ������Ʈ=��ü���ڿ�.split("\n"); 
			
			// 4. ��ü�� �ʵ� ���� �ؼ� �迭�� ���� 
			for(int i=0;i<ȸ������Ʈ.length;i++)
			{
				String[] �ʵ�=ȸ������Ʈ[i].split(",");
				ȸ�� member=new ȸ��(�ʵ�[0],�ʵ�[1],�ʵ�[2]);
				
				for(int j=0;j<����.members.length;j++) {
					if(����.members[j]==null) {
						����.members[j]=member;
						break;
					}
				}
			}
		} 
		catch (Exception e) {
			
			
		}
		
		//1.��ü ����
		System.out.println("���̵�:"); String id=scanner.next();
		System.out.println("��й�ȣ:"); String password=scanner.next();
		System.out.println("�̸�:"); String name=scanner.next();
		ȸ�� member=new ȸ��(id,password,name);
		
		//2.�迭����
		for(int i=0;i<����.members.length;i++) {
			if(����.members[i]==null) {
				����.members[i]=member;
				break;
			}
		}
		
		//3.��������	
		try {
		FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/ȸ�������α׷�.txt");
		//1.�迭���� �ϳ��� ��ü �����ͼ� ����Ʈ ��ȯ
		//���Ͽ� ����� ȸ���� �ʵ� ����:, [��ǥ]
		//���Ͽ� ����� ȸ���� ����:\n [�������]
		
		for(int i=0;i<����.members.length;i++) {
			if(����.members[i]!=null) { 
				String ��¹��ڿ�=����.members[i].id+","+����.members[i].password+","+����.members[i].name+"\n";
				fileOutputStream.write(��¹��ڿ�.getBytes());
			}else {
				break;
			}
		}
		}
		catch(Exception exception) { }
		
		}
	
	
	
	

	
}//c.e
