package Day01;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1=new Korean("홍길동","010-3333-3333");
		System.out.println("국가:"+k1.nation);
		System.out.println("이름:"+k1.name);
		System.out.println("번호:"+k1.ssn);
		
		Korean k2=new Korean("강호동","010-3233-3333");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
