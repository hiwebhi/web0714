package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_4 {
	//�޸�[����,�迭]=>���α׷� ����Ǹ� �� �޸� �ʱ�ȭ 
		//�ֱ����ġ:���� �������� ���α׷�[��ɾ�] ���
			//����X����X=>�ֹ߼�
			//����, ��ü ,�迭 ���
		//���������ġ[����,DB ��]
			//����X ����O=>���ֹ߼�
			//���� , DB ��
		//����ó��
			// Ű����[����] -------��Ʈ��(�������帧)---------> ���
				// �������帧 : ����Ʈ���� [ ��Ʈ : 1bit => 0 Ȥ�� 1 ] [ ����Ʈ : 8bit => 1byte ]

	
	public static void main(String[] args) throws Exception {
		
		
			FileOutputStream fileOutputStream =new FileOutputStream("c:/CookJava/test.txt"); //������ ����ó�� �߻�: ���࿡ ������ �������
			//������ ������ִ� Ŭ���� / ��ü�� /new / ���ϸ�?
			//new: ���� �޸� �Ҵ�
				//FileOutputStream(���ϰ�� Ȯ����);
			String ���ڿ�="��Ŭ������ �ۼ��߽��ϴ�";
			System.out.println(���ڿ�.getBytes()[0]);
			fileOutputStream.write(���ڿ�.getBytes());
		
		/////////////////////////////////////////////////
		
			FileInputStream fileInputStream =new FileInputStream("c:/CookJava/test.txt");
		//1. ��Ʈ������ ����Ʈ�� �����´�
			byte[] ����Ʈ�迭=new byte[1024]; //1024byte=>1kbyte=>1024kb=>1mb
			fileInputStream.read(����Ʈ�迭);
				//��Ʈ����.read(����Ʈ�迭��) : ����Ʈ �о����=>�迭�� ����
			
			
		//2.������ ����Ʈ�� ���ڿ� ��ȯ
			String ���ڿ�2=new String(����Ʈ�迭); //�����ڿ� ����Ʈ�迭 �ֱ�=>���ڿ� ��ȯ
			System.out.println("���� ������ ����: "+���ڿ�2);
		/////////////////////////////
			
		//Ű���忡 �Էµ� ������ �޸��忡 �¼� �������� ����
			
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.print("�޸��忡 �Է��� �ؽ�Ʈ �Է�:");
			String ���ڿ�3=scanner.next();
			String ��¹��ڿ�=���ڿ�3+"\n";
			fileOutputStream.write(��¹��ڿ�.getBytes());
			
		}
			
			
	}
}
