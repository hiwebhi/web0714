package Day12;


import java.util.Scanner;


public class ���� {//c.s
	/*
	 ���� : itdanja@kakao.com
����1 :
	ȸ���� �Խ��� [ ����ó���ؼ� ���������ϱ� ] 
	[����1] Ŭ����2��( ȸ��, �Խ��� ) ��� ����
	[����2] �� ��ü�� �����ϴ� ���� 2�� 
	[��������] 
		1.�޴�
			1. �α���
			2. ȸ������
		2. �α��ν� �޴� 
			�Խù����
			1.���ۼ� 2.�ۺ���
		3. �ۺ��⸦ �������� 
			�� ���� ��� 
			1.���� 2.���� 
	[����3] ������ �ۼ��� �Խù��� ����/���� ���� 
	 */
	
	public static Scanner scanner=new Scanner(System.in);
	public static ȸ��[] members=new ȸ��[100];
	public static �Խ���[] boardlist=new �Խ���[100];
	public static ���[] commentlist=new ���[100];
	
	public static void main(String[] args) {
		ȸ�� ȸ��=new ȸ��();
		�Խ��� �Խ���=new �Խ���();
		��� ���=new ���();
		
	while(true) {
				System.out.println("1.ȸ������ 2.�α���");
				int ch=scanner.nextInt();
				if(ch==1) {
					ȸ��.join();
				}
				if(ch==2) {
					ȸ��.login();
					�Խ���.blist();
					System.out.println("[[�޴� 1.���ۼ�  2.�ۺ���]]");
					int ch2=scanner.nextInt();
					if(ch2==1) {
						�Խ���.bwrite();
					}
					if(ch==2) {
						System.out.println("[[�Խù���ȣ �Է�:]]");
						int ch3=scanner.nextInt();
						�Խ���.bview(ch3);
					}
				}
				
	}//w.e
		
	}//m.e
		
}//c.e
