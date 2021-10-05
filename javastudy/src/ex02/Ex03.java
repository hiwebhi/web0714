package ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//switch 문: "같다" 조건을 if 문을 대체해서 사용 가능
		Scanner scanner=new Scanner(System.in);
		System.out.println("숫자를 입력하세요: "); int num=scanner.nextInt();
		switch(num) {
		case 1:
			System.out.println("1이다.");
			break; //중간에 빠져나온다.
		case 2:
			System.out.println("2이다.");
			break;
		default: //else문과 같다.
			System.out.println("1이나 2가 아니다");
			break; //생략 가능
		}
		
	}
}
