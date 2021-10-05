package proj3;

public class CustomerContact extends Contact{
	private String customername;
	private String product;
	private String  position;
	
	
	
	public CustomerContact() {
		super();
	}



	public CustomerContact(String name, String phonenum, String email, String address, String birth, String group,String customername,String product,String  position) {
		super(name, phonenum, email, address, birth, group);
		this.customername=customername;
		this.product=product;
		this.position=position;
	}



	@Override
	public void info() {
		super.info();
		System.out.println("거래처:"+this.customername);
		System.out.println("품목:"+this.product);
		System.out.println("직급:"+this.position);
	}


///get,set
	public String getCustomername() {
		return customername;
	}



	public void setCustomername(String customername) {
		this.customername = customername;
	}



	public String getProduct() {
		return product;
	}



	public void setProduct(String product) {
		this.product = product;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
