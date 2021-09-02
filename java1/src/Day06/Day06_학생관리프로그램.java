package Day06;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day06_학생관리프로그램 {
public static void main(String[] args) {
	
	//1.출력 //2.입력//3.변수//4.연산자//5.제어문//6.반복문
	
	//변수: 자료형 기반으로 선언된 메모리
	//객체: 클래스 기반으로 선언된 메모리
	
	//배열 :기준[인덱스]에 따른 나열
		//목적: 동일한 자료형/클래스의 여러개 메모리 관리
		//인덱스: 메모리가 저장된 순서 번호[0번 시작~~]
		//선언: 인덱스로
		//메소드: 배열명.length
	 	//컴파일후 크기변경불가[정해져있는 메모리 사용시 용이]
	
	//변수: 메모리[자원] 할당받아 데이터 저장하는 공간 1개
	
	//배열선언
	int[] 정수배열1= new int[3]; //int형 변수 3개를 저장할수 있는 메모리 할당받은 배열
	//1. 자료형/클래스[ ]
		//2.배열명(임의)
			//3.new:메모리할당 연산자
				//4.int[배열의 길이]
	//배열 요소 호출: [0]~~~[2] 		//3개 인덱스인경우
	
	정수배열1[0]=3;
	정수배열1[1]=4;
	정수배열1[2]=5;
	
	//배열선언2 :선언과 동시에 초기값(메모리 생성시 기본값)
	String[] 문자열배열2= {"유재석","강호동","신동엽"};
	  					//String 클래스 객체 3개를 저장하는 메모리 할당받은 배열
	
	//배열요소 호출
	System.out.println("배열 값:"+문자열배열2); //메모리 주소값  출력됨= 첫번째 인덱스 주소값=배열의 주소값
	System.out.println("배열0번째 값은:"+문자열배열2[0]);
	System.out.println("배열 1번째 값은:"+문자열배열2[1]);
	System.out.println("배열 2번째 값은:"+문자열배열2[2]);
	System.out.println("배열의 길이"+문자열배열2.length); //배열내  요소 개수
			//. :접근연산자
	
	//문제1: 학생관리 프로그램[ 배열 ]
		//1.학생수를 입력받아 학생수만큼 배열의 길이 할당
		//2.메뉴 [1.학생수 2.점수입력 3.분석[등수,평균] 4.종료]
	Scanner scanner=new Scanner(System.in);
	int end=0;
	Integer[] 학생점수목록=null;
	while (true) {
		System.out.println("[[메뉴  1.학생수  2.점수입력  3.분석[등수,평균] 4.종료 ]]");
		System.out.println("선택:"); int ch=scanner.nextInt();
		switch (ch) {
		case 1:
			System.out.print("학생수:"); int count=scanner.nextInt();
			학생점수목록 =new Integer[count];
			System.out.println(count+"만큼 목록 생성");
			break;
		case 2:
			for(int i=1;i<=학생점수목록.length;i++) {
			System.out.print(i+"번째 학생 점수:"); 
			학생점수목록[i-1]=scanner.nextInt();}
			break;
			
		case 3:
			System.out.println("분석[등수,평균]");
			Arrays.sort(학생점수목록,Collections.reverseOrder());
			System.out.print("궁금한 등수를 입력: ");int i=scanner.nextInt(); 
			System.out.println(i+"등 학생 점수: "+학생점수목록[i-1]);
			int 합계=0;
			for(int j=0;j<학생점수목록.length;j++) {합계 +=학생점수목록[j];}
			System.out.println("평균:"+합계/학생점수목록.length);
			break;
			
		case 4:
			System.out.println("[[종료]]"); 
			end=1;
			break;
			
		default :
			System.out.println("[[알수없는 번호입니다.]]");
				
		}
		if (end==1) break;
	}	
  }
}
