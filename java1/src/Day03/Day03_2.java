package Day03;

import java.util.Scanner;

public class Day03_2 {
	public static void main(String[] args) {
		
		//0. 입력객체 선언
		Scanner 입력객체 = new Scanner(System.in);
		
		
		//문제1
		/* 
		 		  	  *급여 명세서  
		 		  [ 조건 ] 입력받기 : 기본급 , 수당  
		 		  [ 출력 ] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ] 
				 */ 

	   //1.변수에 입력값 저장
		System.out.println("기본급 입력: ");  int 기본급= 입력객체.nextInt();
		System.out.println("수당 입력:");   int 수당=입력객체.nextInt();
		
		//2.변수계산
		int 실수령액 = 기본급 + 수당-(int)(기본급 * 0.1); //퍼센트[%]기호 계산 안됨
		//강제 형변환 [자료형 변환]
		//작은 자료형에서 큰 자료형으로 이동 가능 [자동형변환]
		//큰 자료형에서 작은 자료형 이동 불가[강제변환=>데이터 손실]
		//(새로운 자료형)변수
		   //double 실수=10.5;
		   //int 정수= (int)실수;
		
		System.out.println("실 수령액 :"+ 실수령액);
				
		//문제2
		/* 
		 	   	* 지폐 갯수 세기 
			     * 	[조건] 입력받기 : 금액  
		 		 * 	[출력] 금액에 해당하는 지폐수 세기 
		 		 * 	[출력 예] : 356789 => 
		 		 * 			십만원 : 3장 
		 		 * 			만원 : 5장 
		 		 * 			천원 : 6장 
		 		 * 			백원 : 7개  
		 		 */ 

		System.out.println("금액 입력:"); int 금액 =입력객체.nextInt();
		
		//1.십만원권 세기
		System.out.println("십만원권 :"+금액/100000+"장");
		
		//1.금액에서 십만원권 빼기
		금액-=(금액/100000)*100000;
		//2.만원권 세기
		System.out.println("만원권 :"+금액/10000+"장");
		금액-=(금액/10000)*10000;
		//3.천원세기
		System.out.println("천원권 :"+금액/1000+"장");
		금액-=(금액/1000)*1000;
		//4.백원 세기
		System.out.println("백원권 :"+금액/100+"개");
	}

}
