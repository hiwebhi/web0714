package ex04;

public class Ex05 {
	public static void main(String[] args) {
		//method :기능 
		String a="eclipse";
		
		//charAt(): index(위치)에 무슨 문자가 있는지 확인
		char char1=a.charAt(0);
		System.out.println(char1);
		
		//contains():특정 문자열이 문자열에 포함되어 있는지 확인
		System.out.println(a.contains("e"));
		System.out.println(a.contains("lip"));
		System.out.println(a.contains("a"));
		
		//startsWith(): 특정 문자열로 시작하는지
		System.out.println(a.startsWith("ec"));
		System.out.println(a.startsWith("e"));
		
		//endsWith(): 특정 문자열로 끝나는지
		System.out.println(a.endsWith("se"));
		
		//length(): 문자열의 길이를 확인(알파벳이 몇 개 인지)
		System.out.println(a.length());
		
		//replace(): 포함된 문자열 부분을 교체
		String str1="I stay hungry.";
		str1=str1.replace("I", "You");
		System.out.println(str1);
		
		//split(): 특정 스트링을 기준으로 잘라서 배열에 넣는다
		String str2="apple,melon,grape";
		String[] fruit=str2.split(",");
		System.out.println(fruit[2]);
	}
	
}
