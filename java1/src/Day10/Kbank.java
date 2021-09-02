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
		System.out.println("[[국민은행 계좌 생성 페이지]]");
		super.create();
	}
	@Override
	public void deposit() {
		System.out.println("[[국민은행 계좌 입금 페이지]]");
		super.deposit();
	}
	@Override
	public void withdraw() {
		System.out.println("[[국민은행 계좌 출금 페이지]]");
		super.withdraw();
	}
	@Override
	public void transfer() {
		System.out.println("[[국민은행 걔좌 이체 페이지]]");
		super.transfer();
	}
	

}
