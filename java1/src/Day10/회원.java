package Day10;

public class ȸ�� {
//�ʵ�	
  private String id;
  private String password;
 
 //������ 
  public ȸ��() {
	
}

public ȸ��(String id, String password) {
	this.id = id;
	this.password = password;
}

//�޼ҵ�
public void ����(){
	System.out.println("���̵�: "+id);
	System.out.println("��й�ȣ: "+password);
}
public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
  
}
