package Day12;

import java.util.Scanner;

public class Day12_2 {
	/*
	 * ����1 : ����ó��
			1.���ѷ����� int�� ���� ��� �Է¹ޱ� 
			2. �����Է½� ����ó���߻�
			3. ����ó�� �ؼ� �ٽ� �Է¹ޱ� 
	 * 
	 */
	public static void main(String[] args) {
		
		/*while(true) {
			try {
				//���ܰ� ����Ǵ� ���� try
			Scanner scanner=new Scanner(System.in);
			System.out.println("�����Է�:"); int ����=scanner.nextInt();
		}
		
		catch(Exception exception) {
			System.out.println("[[�����Է� �Ұ�]]");
			
			}
		}*/
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü 
		
		while(true) {
			try {
				// ���ܰ� ����Ǵ°��� try { } ����
				System.out.println(" ���� �Է� : "); 
				int ���� = scanner.nextInt();
			}
			catch( Exception e) {
				System.out.println("[[���� �ԷºҰ�]]");
				scanner = new Scanner(System.in); // �Է°�ü 
			}
		} 
		
	}
}
