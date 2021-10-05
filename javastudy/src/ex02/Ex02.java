package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:"); int num=scanner.nextInt();
		
		//number가 10 이상이고 40 이하이다(그리고 AND)
		//10<= number <=40
		if(num >=10 && num<=40){ //모두만족
		System.out.println("number 는 10이상이고 40이하이다.");
		}
		
		//number 가 10보다 작거나 40보다 크다.
		if(num<10 || num>40) {//둘 중에 하나만 만족해도 만족
			System.out.println("number는 10미만이거나 40 초과이다.");
			
		}
		
		}

}
