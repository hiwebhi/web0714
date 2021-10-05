package ex04;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * 문자열(String)
		 */
		System.out.println("Hello world");
		
		//String 변수에 값 저장
		// int ,char,boolean : 기본 자료형
		String a="안녕하세요"; //값
		System.out.println(a); 
		String b=new String("안녕하세요");
		System.out.println(b); // 객체 1
		String c=new String("안녕하세요");
		System.out.println(c); // 객체 2
		String d="안녕하세요"; //값
		System.out.println(d);
		
		//String 끼리 값 비교하기
		System.out.println(a==d); //true : 값이 같은지
		System.out.println(b==c); //false :두 객체가 같은 객체 인지
		System.out.println(b.equals(c)); //true:두 값이 같은지
		System.out.println(a.equals(d));
		
		
	}

}
