package Day10;

public class 회원 {
//필드	
  private String id;
  private String password;
 
 //생성자 
  public 회원() {
	
}

public 회원(String id, String password) {
	this.id = id;
	this.password = password;
}

//메소드
public void 정보(){
	System.out.println("아이디: "+id);
	System.out.println("비밀번호: "+password);
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
