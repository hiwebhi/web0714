package Day10;

public class ������ extends ȸ��{
	private String ����������;
	
	public ������() {
		super();
	}

	
	
	public ������(String id, String password,String ����������) {
		super(id, password);
		this.����������=����������;
	}

	@Override
	public void ����() {
		
		super.����();
		System.out.println("����������: "+����������);
	}


	public String get����������() {
		return ����������;
	}

	public void set����������(String ����������) {
		this.���������� = ����������;
	}
	
	
}
