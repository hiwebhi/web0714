package Day04;

import java.util.Scanner;

public class Day04_���� {
	public static void main(String[] args) {
		//����1: ���������� ����
		//*����1: �θ��� �÷��̾ ������������ �ϳ��� �Է¹޾�
		//*����2: �̱��� ���
		Scanner scanner =new Scanner(System.in);
		System.out.print("�÷��̾�1:"); String �÷��̾�1=scanner.next();
		System.out.print("�÷��̾�2:"); String �÷��̾�2=scanner.next();
	
		if (�÷��̾�1.equals("�ָ�")) {
			if(�÷��̾�2.equals("����")) System.out.println("�÷��̾�1�� �̰���ϴ�.");
			else if (�÷��̾�2.equals("��")) System.out.println("�÷��̾�2�� �̰���ϴ�.");
			else System.out.println("�����ϴ�.");
		}
		else if (�÷��̾�1.equals("����")) {
			if(�÷��̾�2.equals("��")) System.out.println("�÷��̾�1�� �̰���ϴ�.");
			else if (�÷��̾�2.equals("�ָ�")) System.out.println("�÷��̾�2�� �̰���ϴ�.");
			else System.out.println("�����ϴ�.");
		}
		else if (�÷��̾�1.equals("��")) {
			if(�÷��̾�2.equals("�ָ�")) System.out.println("�÷��̾�1�� �̰���ϴ�.");
			else if (�÷��̾�2.equals("����")) System.out.println("�÷��̾�2�� �̰���ϴ�.");
			else System.out.println("�����ϴ�.");
		}		
	}
}
