package Day10;

public class Kbank extends Account {
	public Kbank() {
		super();
	}

	public Kbank(String account_number, String account_password, int account_money) {
		super(account_number, account_password, account_money);
	}
	
	@Override
	public void create() {
		System.out.println("[[�������� ���� ���� ������]]");
		super.create();
	}
	@Override
	public void deposit() {
		System.out.println("[[�������� ���� �Ա� ������]]");
		super.deposit();
	}
	@Override
	public void withdraw() {
		System.out.println("[[�������� ���� ��� ������]]");
		super.withdraw();
	}
	@Override
	public void transfer() {
		System.out.println("[[�������� ���� ��ü ������]]");
		super.transfer();
	}
	

}
