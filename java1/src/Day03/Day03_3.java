package Day03;

import java.util.Scanner;

public class Day03_3 {
	public static void main(String[] args) {
		//��ǻ��[0,1] : ����
		//���:if [������]   , switch[������ ����]
		   //���� : ����� ���� ���� �ڵ� ó��
		   // if: true,false �� �����
		         //����1: if(��) ���๮;
		         //����2: if (��) ���๮[true]; else ���๮[false]
		         //����3: ���๮[ ; ]�� 2�� �̻��̸� {} ����ó��
		               // if (��1) {
		               //                ���๮1;
		               //                ���๮2;
		                 //           }   
		         //����4 : ����� ���� �ټ��ϰ�쿡�� 
		            //      if(��1) ~
		            //      else if(��2)~
		            //      else if(��3)~
		            //      else
		
		//��1) true �̸� ���๮ ����
		if (3>1) System.out.println("3�� ũ��.1");
		
		//��2) false �̸� ���� X
		if (3>5) System.out.println("3�� ũ��.2");
		
		//��3)
		if (3>5) System.out.println("3��ũ��.3");
		else System.out.println("5�� ũ��.3");
		
		//��4)
		if (3>2) {
			System.out.println("true�̸� ����Ǵ� �ڸ�");
			System.out.println("3�� ũ��.4");
		}
		else {
			System.out.println("false�̸� ����Ǵ� �ڸ�");
			System.out.println("2�� ũ��.4");
		}
		
		//��5) ���� ����
		if(3>5) System.out.println("3�� ũ��.5");
		else if (3>4) System.out.println("3��ũ��.6");
		else if (3>3) System.out.println("3�� ũ��.7");
		else if (3>2) System.out.println("3�� ũ��.8");
		else System.out.println("true�� ����");
		
		//��6) �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ���� �ƴϸ� Ż��
		Scanner �Է°�ü = new Scanner(System.in);
		
		System.out.println("�����Է�:"); int ����=�Է°�ü.nextInt();
		if (����>=80) System.out.println("�հ�");
		else System.out.println("Ż��");
		
		//��7) �ϳ��� ������ �Է¹޾�  
		 				// 90���̻��̸� "A���"  
		 				// 80���̻��̸� "B���"  
		 				// 70���̻��̸� "C���"  
		 				// �׿� Ż�� 

		System.out.println("�����Է�:"); int ����2=�Է°�ü.nextInt();
		if (����2>=90) System.out.println("A���");
		else if (����2 >= 80) System.out.println("B���");
		else if (����2>=70) System.out.println("C���");
		else System.out.println("Ż��");
		
		//����1) 2���� ������ �Է¹޾� �� ū�� ���
		System.out.println("����1:"); int ����3=�Է°�ü.nextInt();
		System.out.println("����2:"); int ����4=�Է°�ü.nextInt();
		if (����3>����4) System.out.println("�� ū����"+����3);
		else if(����4<����3) System.out.println("�� ū���� "+����4);
		else System.out.println("�� ������ ����.");
		
		//����2) 3���� ������ �Է¹޾� �� ū�� ���
		System.out.println("����1:"); int ����5=�Է°�ü.nextInt();
		System.out.println("����2:"); int ����6=�Է°�ü.nextInt();
		System.out.println("����3:"); int ����7=�Է°�ü.nextInt();
		if (����5>����6&& ����5>����7) System.out.println("���� ū����"+����5);
		else if (����6>����5&& ����6>����7) System.out.println("���� ū����"+����6);
		else if (����7>����5&& ����7>����6) System.out.println("���� ū����"+����7);
		else System.out.println("�� ������ ����");
		
		//����3) 4���� ������ �Է¹޾� �� ū�� ���
		System.out.println("����1:"); int ����8=�Է°�ü.nextInt();
		System.out.println("����2:"); int ����9=�Է°�ü.nextInt();
		System.out.println("����3:"); int ����10=�Է°�ü.nextInt();
		System.out.println("����4:"); int ����11=�Է°�ü.nextInt();
		if (����8>����9&& ����8>����10 &&����8>����11) System.out.println("���� ū����"+����8);
		else if (����9>����8&& ����9>����10 &&����9>����11) System.out.println("���� ū����"+����9);
		else if (����10>����8&& ����10>����9 &&����10>����11) System.out.println("���� ū����"+����10);
		else if (����11>����8&& ����11>����9 &&����11>����10) System.out.println("���� ū����"+����11);
		else System.out.println("�� ������ ����");
		
		int �ִ�=����8; //ù��° ���� �ִ񰪺����� ����
		if (�ִ�<����9) �ִ�=����9;
		if (�ִ�<����10) �ִ�=����10;
		if (�ִ�<����11) �ִ�=����11;
		System.out.println("���� ū����"+�ִ�);
		
		
		
	}

}
