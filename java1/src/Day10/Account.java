package Day10;

import java.util.Scanner;

public class Account {
	//�ʵ�
	private String account_number; //-����O String  -����x int ����
	private String account_password;
	private int account_money;
	
	//������
	public Account() {	
	}

	public Account(String account_number, String account_password, int account_money) {
		this.account_number = account_number;
		this.account_password = account_password;
		this.account_money = account_money;
	}
	
	//�޼ҵ�
	//1.���»���
	public void create(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("[[���¹�ȣ:"); String number=scanner.next();
		System.out.print("[[��й�ȣ:"); String password=scanner.next();
		System.out.print("[[�ʱ⿹�ݾ�:"); int money=scanner.nextInt();
		
		//��üȭ
		Account account=new Account(number,password,money);
		
		//�迭
		for(int i=0;i<Day10_3.accounts.length;i++) {
			if(Day10_3.accounts[i]==null) {
				Day10_3.accounts[i]=account;
				System.out.println("[[���»����Ϸ�]]");
				return; //�޼ҵ�����
			}
		}
		System.out.println("[[[ ���� ���� �Ұ� : �����ڿ��� ���� �ٶ��ϴ� ]]]");
		
	}
	//2.�Ա�[���¹�ȣ�� �Աݾ� �޾� �Ա�ó��]
	public void deposit() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("[[���¹�ȣ: "); String number=scanner.next();
		System.out.println("[[�Աݾ�: "); int money=scanner.nextInt();
		
		int result=findaccount(number);
		if(result==-1) return;
		
		Day10_3.accounts[result].account_money+=money;
		System.out.println("[[[���� �Ϸ�: ������ �ݾ�:"+Day10_3.accounts[result].account_money+"]]]");
		
	}
	
	//3.���[���¹�ȣ�� ��й�ȣ �Է¹޾� �����ϸ� ���ó��]
	public void withdraw() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[[���¹�ȣ: "); String number=scanner.next();
		System.out.print("[[��й�ȣ:"); String password=scanner.next();
		
		
		int result=findaccount(number);
		if(result==-1) return;
		
		//����
		if(Day10_3.accounts[result].account_password.equals(password)) {
			System.out.println("[[��ݾ�: "); int money=scanner.nextInt();
			if(Day10_3.accounts[result].account_money<money) {
				System.out.println("[[���ݾ��� �����մϴ�]]");
				return;
			}
			Day10_3.accounts[result].account_money-=money;
			System.out.println("[[[��� �Ϸ�: ����� �ݾ�:"+Day10_3.accounts[result].account_money+"]]]");}
		else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			return;
		}
		
	}
	
	
	//4.��ü[���¹�ȣ�� ��й�ȣ �Է¹޾� �����ϸ� ��ü���� �޾� �޴»���� ���¹�ȣ�� ��ü]
	public void transfer() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("[[������ ��� ���¹�ȣ:"); String number=scanner.next();
		System.out.print("[[��й�ȣ:"); String password=scanner.next();
		
		int result=findaccount(number);
		if(result==-1) return;
		
		
		
		//����
		if(Day10_3.accounts[result].account_password.equals(password)) {
			System.out.println("[[��ü��: "); int money=scanner.nextInt();
			if(Day10_3.accounts[result].account_money<money) {
				System.out.println("[[�ܾ��� �����մϴ�]]");
				return;
			}
			System.out.print("[[�޴� ��� ���¹�ȣ:"); String number2=scanner.next();
			int result2=findaccount(number2);
			if(result2==-1) return;
			Day10_3.accounts[result].account_money-=money;
			Day10_3.accounts[result2].account_money+=money;
			System.out.println("[[[��ü �Ϸ�: ��ü�� �ݾ�:"+Day10_3.accounts[result].account_money+"]]]");
		}else {
			System.out.println("[[��й�ȣ�� ��ġ���� �ʽ��ϴ�]]");
			return;
		}
		
	}
	
	//5.����ã��
	public int findaccount(String number) {
		// �޼ҵ� 
				// 1. ��ȯŸ�� : int => �޼ҵ� ����Ǹ鼭 int�� ������ return 
				// 2. �μ� : String => �޼ҵ� ���۵Ǹ鼭 �޼ҵ�� ������ ������ [ ���¸� ã������ �˻��� ]
		
		for(int i=0;i<Day10_3.accounts.length;i++) {
			if(Day10_3.accounts[i]!=null && Day10_3.accounts[i].account_number.equals(number)) {
				// ������ ���¹�ȣ�� ������ �ε�����ġ ����
				return i;
			}
		}
		System.out.println("[[[ ������ ���¹�ȣ�� �������� �ʽ��ϴ� ]]]");
		return -1;
		
	}

	
	
	//get set
	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_password() {
		return account_password;
	}

	public void setAccount_password(String account_password) {
		this.account_password = account_password;
	}

	public int getAccount_money() {
		return account_money;
	}

	public void setAccount_money(int account_money) {
		this.account_money = account_money;
	}
	
	
}
