package ex04;

public class Ex04 {
	public static void main(String[] args) {
		//자료형 변환
		
		//숫자->문자
		int number=3;
		// 별로 안좋은 방법(메모리 효율적 사용x)
		String str1=number + ""; // =>number +str =string
		System.out.println(str1);
		
		//좋은 방법
		String str2=String.valueOf(number);
		System.out.println(str2);
		
		
		//문자->숫자
		String str3="5"; //문자
		int number3=Integer.parseInt(str3);
		System.out.println(number3);
		
	}

}
