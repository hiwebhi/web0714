package Day10;

public class Day10_2 {
	//회원 클래스로 상속받아 vip클래스,관리자클래스, 일반클래스
		//슈퍼클래스:회원
				//필드: 아이디,비밀번호
				//생성자
				//메소드: 회원정보 출력 메소드
		//서브클래스:vip,관리자
			//vip
				//필드: 회원등급
				//메소드: 회원정보 메소드 오버라이딩
			//관리자
				//필드: 관리자직급
				//메소드: 회원정보 메소드 오버라이딩
	
	public static void main(String[] args) {
		//1.슈퍼클래스 객체
		회원 회원1=new 회원("qwe","qwe");
		
		//2.서브클래스 객체
		vip vip1=new vip("asd","asd","gold");
		관리자 관리자1=new 관리자("zxc","zxc","CEO");
		
		//슈퍼클래스로 배열
		회원[] 회원2=new 회원[3];
		회원2[0]=회원1;
		회원2[1]=vip1;
		회원2[2]=관리자1;
		//슈퍼클래스로 선언된 배열에는 서브크래스도 저장 가능
		
		//서브클래스로 배열
		vip[] vip2= new vip[3];
		//vip2[0]=회원1; //불가
		vip2[1]=vip1;
		//vip2[2]=관리자1; //불가
		//서브클래스로 선언된 배열에는 슈퍼클래스는 저장 불가능
	
		관리자[] 관리자2=new 관리자[3];
		//관리자2[0]=회원1; //불가
		//관리자2[1]=vip1; //불가
		관리자2[2]=관리자1;
		
	}
	
}
