package Day03;

import java.util.Scanner;

public class Day03_3 {
	public static void main(String[] args) {
		//컴퓨터[0,1] : 기계어
		//제어문:if [논리제어]   , switch[데이터 제어]
		   //목적 : 경우의 수에 따른 코드 처리
		   // if: true,false 만 제어가능
		         //형태1: if(논리) 실행문;
		         //형태2: if (논리) 실행문[true]; else 실행문[false]
		         //형태3: 실행문[ ; ]이 2줄 이상이면 {} 묶음처리
		               // if (논리1) {
		               //                실행문1;
		               //                실행문2;
		                 //           }   
		         //형태4 : 경우의 수가 다수일경우에는 
		            //      if(논리1) ~
		            //      else if(논리2)~
		            //      else if(논리3)~
		            //      else
		
		//예1) true 이면 실행문 실행
		if (3>1) System.out.println("3이 크다.1");
		
		//예2) false 이면 실행 X
		if (3>5) System.out.println("3이 크다.2");
		
		//예3)
		if (3>5) System.out.println("3이크다.3");
		else System.out.println("5가 크다.3");
		
		//예4)
		if (3>2) {
			System.out.println("true이면 실행되는 자리");
			System.out.println("3이 크다.4");
		}
		else {
			System.out.println("false이면 실행되는 자리");
			System.out.println("2가 크다.4");
		}
		
		//예5) 다중 조건
		if(3>5) System.out.println("3이 크다.5");
		else if (3>4) System.out.println("3이크다.6");
		else if (3>3) System.out.println("3이 크다.7");
		else if (3>2) System.out.println("3이 크다.8");
		else System.out.println("true가 없다");
		
		//예6) 하나의 정수를 입력받아 80점 이상이면 합격출력 아니면 탈락
		Scanner 입력객체 = new Scanner(System.in);
		
		System.out.println("점수입력:"); int 점수=입력객체.nextInt();
		if (점수>=80) System.out.println("합격");
		else System.out.println("탈락");
		
		//예7) 하나의 점수를 입력받아  
		 				// 90점이상이면 "A등급"  
		 				// 80점이상이면 "B등급"  
		 				// 70점이상이면 "C등급"  
		 				// 그외 탈락 

		System.out.println("점수입력:"); int 점수2=입력객체.nextInt();
		if (점수2>=90) System.out.println("A등급");
		else if (점수2 >= 80) System.out.println("B등급");
		else if (점수2>=70) System.out.println("C등급");
		else System.out.println("탈락");
		
		//문제1) 2개의 정수를 입력받아 더 큰수 출력
		System.out.println("정수1:"); int 점수3=입력객체.nextInt();
		System.out.println("정수2:"); int 점수4=입력객체.nextInt();
		if (점수3>점수4) System.out.println("더 큰값은"+점수3);
		else if(점수4<점수3) System.out.println("더 큰값은 "+점수4);
		else System.out.println("두 정수는 같다.");
		
		//문제2) 3개의 정수를 입력받아 더 큰수 출력
		System.out.println("정수1:"); int 점수5=입력객체.nextInt();
		System.out.println("정수2:"); int 점수6=입력객체.nextInt();
		System.out.println("정수3:"); int 점수7=입력객체.nextInt();
		if (점수5>점수6&& 점수5>점수7) System.out.println("가장 큰수는"+점수5);
		else if (점수6>점수5&& 점수6>점수7) System.out.println("가장 큰수는"+점수6);
		else if (점수7>점수5&& 점수7>점수6) System.out.println("가장 큰수는"+점수7);
		else System.out.println("세 정수는 같다");
		
		//문제3) 4개의 정수를 입력받아 더 큰수 출력
		System.out.println("점수1:"); int 점수8=입력객체.nextInt();
		System.out.println("점수2:"); int 점수9=입력객체.nextInt();
		System.out.println("점수3:"); int 점수10=입력객체.nextInt();
		System.out.println("점수4:"); int 점수11=입력객체.nextInt();
		if (점수8>점수9&& 점수8>점수10 &&점수8>점수11) System.out.println("가장 큰수는"+점수8);
		else if (점수9>점수8&& 점수9>점수10 &&점수9>점수11) System.out.println("가장 큰수는"+점수9);
		else if (점수10>점수8&& 점수10>점수9 &&점수10>점수11) System.out.println("가장 큰수는"+점수10);
		else if (점수11>점수8&& 점수11>점수9 &&점수11>점수10) System.out.println("가장 큰수는"+점수11);
		else System.out.println("네 점수는 같다");
		
		int 최댓값=점수8; //첫번째 값을 최댓값변수에 저장
		if (최댓값<점수9) 최댓값=점수9;
		if (최댓값<점수10) 최댓값=점수10;
		if (최댓값<점수11) 최댓값=점수11;
		System.out.println("가장 큰수는"+최댓값);
		
		
		
	}

}
