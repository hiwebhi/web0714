package Day03;

import java.util.Scanner;

public class Day03_���� {
	public static void main(String[] args) {
		//����3 �ϳ��� ������ �Է¹޾� 7�� ������� ����ϱ�[true,false]
		Scanner �Է°�ü=new Scanner(System.in);
		System.out.print("���� �Է�:"); int ����1=�Է°�ü.nextInt();
		//���ã�� : ��%��==0 [�������� 0 �̸� ���� �׼��� ��� ]
		System.out.println("������ 7�� �������:"+(����1%7==0));
		
		//����4  �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
		System.out.print("���� �Է�:"); int ����2=�Է°�ü.nextInt();
		// Ȧ��/¦��ã�� : ��%2 == 0  [ ��%2 ������ �������� 0�̸� ���� ¦�� �������� 1 �̸� ���� Ȧ�� ]
		System.out.println("������ Ȧ�� ����:"+(����2%2==1));
		
		//����5 �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		System.out.print("���� �Է�:"); int ����3=�Է°�ü.nextInt();
		System.out.println("������ 7�ǹ���̸鼭 ¦������:"+(����3%7==0 && ����3%2==0));
		
		//����6 �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
		System.out.print("����1 �Է�:"); int ����4=�Է°�ü.nextInt();
		System.out.print("����2 �Է�:"); int ����5=�Է°�ü.nextInt();
		System.out.println("�� ������ ����1 �� ũ�� :"+(����4>����5)); 
		
		//����7 �������� �Է¹޾� �� ���� ����ϱ� 
		// �� ���� ���� => ������ * ������ * ������[3.14]
		System.out.print("������ �Է�:"); int ������=�Է°�ü.nextInt();
		System.out.println("�� ����:"+(double)(������*������*3.14)); 
		
		//����8 �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
		// ��) 54.5   84.3 �̸�    64.285714%
		System.out.print("�ϳ��� �Ǽ� �Է�:"); double �Ǽ�1=�Է°�ü.nextDouble();
		System.out.print("�ϳ��� �Ǽ� �Է�:"); double �Ǽ�2=�Է°�ü.nextDouble();
		System.out.println("�սǼ��� ���� ���� ���� ��% :"+((�Ǽ�1/�Ǽ�2)*100)+"%"); 
		double ����=(�Ǽ�1/�Ǽ�2)*100;
		System.out.printf("�Ǽ�1�� �Ǽ�2�� �����: %.1f%% \n",����); 
		                               // ���Ĺ��� : %f [ �Ǽ� ] 
		                                   // %.����f [���� : �Ҽ��� �ڸ��� ] 
		 		                              // %.2f [ �Ҽ��� 2�ڸ��� ]  
		 
		 
		// ������ , ���� 
		 			//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�] 
		 				//��ٸ��� ���� = > (���� * �غ�) * ���� / 2 
		
		System.out.print("���� �Է�:"); double ����=�Է°�ü.nextDouble();
		System.out.print("�غ� �Է�:"); double �غ�=�Է°�ü.nextDouble();
		System.out.print("���� �Է�:"); double ����=�Է°�ü.nextDouble();
		double ��ٸ���=(����*�غ�)*���� /2;
		System.out.println("��ٸ��� ����:"+��ٸ���);
		
		 			//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ� 
		 				//ǥ��ü�� ���� = > (Ű - 100) * 0.9 
		System.out.print("Ű �Է�:"); double Ű=�Է°�ü.nextDouble();
		double ǥ��ü��=(Ű-100)*0.9;
		System.out.println("ǥ��ü��: "+ǥ��ü��);
		
		 			//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ� 
		 				//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100)) 
		System.out.print("Ű�Է�:"); double Ű2=�Է°�ü.nextDouble();
		System.out.print("������ �Է�:"); double ������=�Է°�ü.nextDouble();
		double BMI=������/((Ű2/100)*(Ű2/100));
		System.out.println("BMI ��: "+BMI);
		
		 			//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� 
		System.out.print("inch: "); double inch=�Է°�ü.nextDouble();
		double cm=inch*2.54;
		System.out.println("inch�� cm�� ���:"+cm+"cm");
		
		 			//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ� 
		 				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ� 
		 				//�߰���� �ݿ����� => 30 % 
		 				//�⸻��� �ݿ����� => 30 % 
		 				//������ �ݿ����� => 40 % 
		System.out.print("�߰���� �Է�: "); double �߰����=�Է°�ü.nextDouble();
		System.out.print("�⸻��� �Է�: "); double �⸻���= �Է°�ü.nextDouble();
		System.out.print("������ �Է�: "); double ������=�Է°�ü.nextDouble();
		double ��������=�߰����*0.3+�⸻���*0.3+������*0.4;
		System.out.printf("��������: %.2f \n",��������);
		
		
		 			//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ� 
		 			 	//int x = 10; 
		 				//int y = x-- + 5 + --x; 
		 				//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y) 
		System.out.print("x ��: "); int x=�Է°�ü.nextInt();
		int y=x-- + 5 + --x;
		System.out.printf("x�� ��: %d, y�� ��: %d \n",x,y);
		 				 
		
		 		// if  
		 			// ����15 4���� ������ �Է¹ް� ������������ ����ϱ�  
		System.out.println("����1:"); int a=�Է°�ü.nextInt();
		System.out.println("����2:"); int b=�Է°�ü.nextInt();
		System.out.println("����3:"); int c=�Է°�ü.nextInt();
		System.out.println("����4:"); int d=�Է°�ü.nextInt();
		if (a>b && b>c && c>d) System.out.println("��������:" +d +c +b +a);
		else if(a>b && b>d && d>c) System.out.println("��������:"+c +d +b +a );
		else if(a>c && c>b && b>d) System.out.println("��������:"+d +b +c +a );
		else if(a>c && c>d && d>b) System.out.println("��������:"+b +d +c +a );
		else if(a>d && d>b && b>c) System.out.println("��������:"+c +b +d +a );
		else if(a>d && d>c && c>b) System.out.println("��������:"+b +c +d +a );
		else if(b>a && a>c && c>d) System.out.println("��������:"+d +c +a +b );
		else if(b>a && a>d && d>c) System.out.println("��������:"+c +d +a +b );
		else if(b>c && c>a && a>d) System.out.println("��������:"+d +a +c +b );
		else if(b>c && c>d && d>a) System.out.println("��������:"+a +d +c +b );
		else if(b>d && d>a && a>c) System.out.println("��������:"+c +a +d +b );
		else if(b>d && d>c && c>a) System.out.println("��������:"+a +c +d +b );
		else if(c>a && a>b && b>d) System.out.println("��������:"+d +b +a +c );
		else if(c>a && a>d && d>b) System.out.println("��������:"+b +d +a +c );
		else if(c>b && b>a && a>d) System.out.println("��������:"+d +a +b +c );
		else if(c>b && b>d && d>a) System.out.println("��������:"+a +d +b +c );
		else if(c>d && d>a && a>b) System.out.println("��������:"+b +a +d +c );
		else if(c>d && d>b && b>a) System.out.println("��������:"+a +b +d +c );
		else if(d>a && a>b && b>c) System.out.println("��������:"+c +b +a +d );
		else if(d>a && a>c && c>b) System.out.println("��������:"+b +c +a +d );
		else if(d>b && b>a && a>c) System.out.println("��������:"+c +a +b +d );
		else if(d>b && b>c && c>a) System.out.println("��������:"+a +c +b +d );
		else if(d>c && c>a && a>b) System.out.println("��������:"+b +a +c +d );
		else if(d>c && c>b && b>a) System.out.println("��������:"+a +b +c +d );
		else System.out.println("4������ ����");
		
		 			// ����16 4���� ������ �Է¹ް� ������������ ����ϱ�  
		System.out.println("����1:"); int aa=�Է°�ü.nextInt();
		System.out.println("����2:"); int bb=�Է°�ü.nextInt();
		System.out.println("����3:"); int cc=�Է°�ü.nextInt();
		System.out.println("����4:"); int dd=�Է°�ü.nextInt();
		if (aa>bb && bb>cc && cc>dd) System.out.println("��������:" +aa +bb +cc +dd);
		else if(aa>bb && bb>dd && dd>cc) System.out.println("��������:"+aa +bb +dd +cc );
		else if(aa>cc && cc>bb && bb>dd) System.out.println("��������:"+aa +cc +bb +dd );
		else if(aa>cc && cc>dd && dd>bb) System.out.println("��������:" +aa +cc +dd +bb);
		else if(aa>dd && dd>bb && bb>cc) System.out.println("��������:" +aa +dd +bb +cc);
		else if(aa>dd && dd>cc && cc>bb) System.out.println("��������:" +aa +dd +cc +bb);
		else if(bb>aa && aa>cc && cc>dd) System.out.println("��������:" +bb +aa +cc +dd);
		else if(bb>aa && aa>dd && dd>cc) System.out.println("��������:" +bb +aa +dd +cc);
		else if(bb>cc && cc>aa && aa>dd) System.out.println("��������:" +bb +cc +aa +dd);
		else if(bb>cc && cc>dd && dd>aa) System.out.println("��������:" +bb +cc +dd +aa);
		else if(bb>dd && dd>aa && aa>cc) System.out.println("��������:" +bb +dd +aa +cc);
		else if(bb>dd && dd>cc && cc>aa) System.out.println("��������:" +bb +dd +cc +aa);
		else if(cc>aa && aa>bb && bb>dd) System.out.println("��������:" +cc +aa +bb +dd);
		else if(cc>aa && aa>dd && dd>bb) System.out.println("��������:" +cc +aa +dd +bb );
		else if(cc>bb && bb>aa && aa>dd) System.out.println("��������:" +cc +bb +aa +dd );
		else if(cc>bb && bb>dd && dd>aa) System.out.println("��������:" +cc +bb +dd +aa );
		else if(cc>dd && dd>aa && aa>bb) System.out.println("��������:" +cc +dd +aa +bb );
		else if(cc>dd && dd>bb && bb>aa) System.out.println("��������:" +cc +dd +bb +aa );
		else if(dd>aa && aa>bb && bb>cc) System.out.println("��������:" +dd +aa +bb +cc );
		else if(dd>aa && aa>cc && cc>bb) System.out.println("��������:" +dd +aa +cc +bb );
		else if(dd>bb && bb>aa && aa>cc) System.out.println("��������:" +dd +bb +aa +cc );
		else if(dd>bb && bb>cc && cc>aa) System.out.println("��������:" +dd +bb +cc +aa );
		else if(dd>cc && cc>aa && aa>bb) System.out.println("��������:" +dd +cc +aa +bb );
		else if(dd>cc && cc>bb && bb>aa) System.out.println("��������:" +dd +cc +bb +aa );
		else System.out.println("4������ ����");
		
		
		
	}
	
}
