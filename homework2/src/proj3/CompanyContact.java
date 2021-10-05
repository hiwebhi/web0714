package proj3;

public class CompanyContact extends Contact{
	private String company;
	private String department;
	private String position;
	
	
	
	public CompanyContact() {
		super();
	}



	public CompanyContact(String name, String phonenum, String email, String address, String birth, String group, String company,String department, String position) {
		super(name, phonenum, email, address, birth, group);
		this.company=company;
		this.department=department;
		this.position=position;
	}



	@Override
	public void info() {
		super.info();
		System.out.println("회사:"+this.company);
		System.out.println("부서:"+this.department);
		System.out.println("직급:"+this.position);
	}


	//get,set
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}




	
	
	
}
