package Day13;

import java.util.Scanner;

public class Day13_2 {
	public static void main(String[] args) {
		String 문자열1="자바 프로그래밍";
		int index=문자열1.indexOf("프로그래밍");
		System.out.println("검색한 문자의 위치"+index);
		
		
		//검색활용
		String 교재="재미있는 파이썬 입문기초";
		Scanner scanner=new Scanner(System.in);
		String 검색어=scanner.next();
		

		if(교재.indexOf(검색어)!=-1) {
			System.out.println("");
		}
		
	}
}
