package ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
	System.out.println("hello world"); //출력
	
	//입력받기
	//import 단축키: ctrl+1 , ctrl+shift+o
	Scanner scanner=new Scanner(System.in);
	
	//전체주석: 블록잡고, ctrl+shift+/, ctrl+/
//	System.out.print("몸무게를 입력하세요:"); int weight=scanner.nextInt();
//	System.out.println(weight);
//	
//	//만약에 몸무게가 55키로 미만이면 "치킨"
//	if(weight<55) {
//		System.out.println("치킨 먹자!!");
//	}
//	//만약에 몸무게가 100 키로 이상이면 "다이어트 시작"
//	if(weight >=100) {
//		System.out.println("다이어트 시작!");
//	}
	
	//두개의 수 입력받고 비교하기
	System.out.print("두개의 수를 입력하세요:"); 
	int num1=scanner.nextInt();
	int num2=scanner.nextInt();
	System.out.println(num1);
	System.out.println(num2);
	
	//number1>number2 : number1이 number2보다 크다
	if(num1>num2) {
		System.out.println("number1이  number2보다 크다");
		
	}
	//number1>number2 : number1이 number2보다 작다
	if(num1<num2) {
		System.out.println("number1이 number2 보다 작다");
	}
	
	//number1=number2 : number1과 number2 같다
	if(num1==num2) {
		System.out.println("number1과 number2는 같다");
	}
	
	//number1 != number2 : 같지 않다
	if(num1 != num2) {
		System.out.println("number1 과 number2는 같지 않다");
	}
	
 }
}
