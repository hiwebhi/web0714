package Day10;

public class vip extends ȸ�� {
	private String ȸ�����;
	
	public vip() {
		super();
	}

	public vip(String id, String password, String ȸ�����) {
		super(id,password);
		this.ȸ����� = ȸ�����;
	}

	
	@Override
	public void ����() {
		super.����();
		System.out.println("ȸ�����: "+ȸ�����);
	}
	
	

	public String getȸ�����() {
		return ȸ�����;
	}

	public void setȸ�����(String ȸ�����) {
		this.ȸ����� = ȸ�����;
	}
	
	

}
