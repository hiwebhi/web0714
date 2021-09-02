package Day03;

import java.util.Scanner;

public class Day03_과제 {
	public static void main(String[] args) {
		//문제3 하나의 정수를 입력받아 7의 배수인지 출력하기[true,false]
		Scanner 입력객체=new Scanner(System.in);
		System.out.print("정수 입력:"); int 정수1=입력객체.nextInt();
		//배수찾기 : 값%수==0 [나머지가 0 이면 값은 그수의 배수 ]
		System.out.println("정수가 7의 배수인지:"+(정수1%7==0));
		
		//문제4  하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		System.out.print("정수 입력:"); int 정수2=입력객체.nextInt();
		// 홀수/짝수찾기 : 값%2 == 0  [ 값%2 했을때 나머지가 0이면 값은 짝수 나머지가 1 이면 값은 홀수 ]
		System.out.println("정수가 홀수 인지:"+(정수2%2==1));
		
		//문제5 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		System.out.print("정수 입력:"); int 정수3=입력객체.nextInt();
		System.out.println("정수가 7의배수이면서 짝수인지:"+(정수3%7==0 && 정수3%2==0));
		
		//문제6 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		System.out.print("정수1 입력:"); int 정수4=입력객체.nextInt();
		System.out.print("정수2 입력:"); int 정수5=입력객체.nextInt();
		System.out.println("두 정수중 정수1 더 크다 :"+(정수4>정수5)); 
		
		//문제7 반지름을 입력받아 원 넓이 출력하기 
		// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		System.out.print("반지름 입력:"); int 반지름=입력객체.nextInt();
		System.out.println("원 넓이:"+(double)(반지름*반지름*3.14)); 
		
		//문제8 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5   84.3 이면    64.285714%
		System.out.print("하나의 실수 입력:"); double 실수1=입력객체.nextDouble();
		System.out.print("하나의 실수 입력:"); double 실수2=입력객체.nextDouble();
		System.out.println("앞실수의 값이 뒤의 값의 몇% :"+((실수1/실수2)*100)+"%"); 
		double 비율=(실수1/실수2)*100;
		System.out.printf("실수1의 실수2의 백분율: %.1f%% \n",비율); 
		                               // 형식문자 : %f [ 실수 ] 
		                                   // %.숫자f [숫자 : 소수점 자리수 ] 
		 		                              // %.2f [ 소수점 2자리수 ]  
		 
		 
		// 연산자 , 변수 
		 			//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기] 
		 				//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2 
		
		System.out.print("윗변 입력:"); double 윗변=입력객체.nextDouble();
		System.out.print("밑변 입력:"); double 밑변=입력객체.nextDouble();
		System.out.print("높이 입력:"); double 높이=입력객체.nextDouble();
		double 사다리꼴=(윗변*밑변)*높이 /2;
		System.out.println("사다리꼴 넓이:"+사다리꼴);
		
		 			//문제10: 키를 정수를 입력받아 표준체중 출력하기 
		 				//표준체중 계산식 = > (키 - 100) * 0.9 
		System.out.print("키 입력:"); double 키=입력객체.nextDouble();
		double 표준체중=(키-100)*0.9;
		System.out.println("표준체중: "+표준체중);
		
		 			//문제11: 키와 몸무게를 입력받아 BMI 출력하기 
		 				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100)) 
		System.out.print("키입력:"); double 키2=입력객체.nextDouble();
		System.out.print("몸무게 입력:"); double 몸무게=입력객체.nextDouble();
		double BMI=몸무게/((키2/100)*(키2/100));
		System.out.println("BMI 값: "+BMI);
		
		 			//문제12: inch 를 입력받아 cm 로 변환하기 
		System.out.print("inch: "); double inch=입력객체.nextDouble();
		double cm=inch*2.54;
		System.out.println("inch를 cm로 출력:"+cm+"cm");
		
		 			//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기 
		 				//소수 둘째 자리 까지 점수 출력하기 
		 				//중간고사 반영비율 => 30 % 
		 				//기말고사 반영비율 => 30 % 
		 				//수행평가 반영비율 => 40 % 
		System.out.print("중간고사 입력: "); double 중간고사=입력객체.nextDouble();
		System.out.print("기말고사 입력: "); double 기말고사= 입력객체.nextDouble();
		System.out.print("수행평가 입력: "); double 수행평가=입력객체.nextDouble();
		double 최종점수=중간고사*0.3+기말고사*0.3+수행평가*0.4;
		System.out.printf("최종점수: %.2f \n",최종점수);
		
		
		 			//문제14 :  연산 순서 나열 하고 x와 y값 예측하기 
		 			 	//int x = 10; 
		 				//int y = x-- + 5 + --x; 
		 				//printf(" x의 값 : %d , y의값 :  %d ", x, y) 
		System.out.print("x 값: "); int x=입력객체.nextInt();
		int y=x-- + 5 + --x;
		System.out.printf("x의 값: %d, y의 값: %d \n",x,y);
		 				 
		
		 		// if  
		 			// 문제15 4개의 정수를 입력받고 오름차순으로 출력하기  
		System.out.println("정수1:"); int a=입력객체.nextInt();
		System.out.println("정수2:"); int b=입력객체.nextInt();
		System.out.println("정수3:"); int c=입력객체.nextInt();
		System.out.println("정수4:"); int d=입력객체.nextInt();
		if (a>b && b>c && c>d) System.out.println("오름차순:" +d +c +b +a);
		else if(a>b && b>d && d>c) System.out.println("오름차순:"+c +d +b +a );
		else if(a>c && c>b && b>d) System.out.println("오름차순:"+d +b +c +a );
		else if(a>c && c>d && d>b) System.out.println("오름차순:"+b +d +c +a );
		else if(a>d && d>b && b>c) System.out.println("오름차순:"+c +b +d +a );
		else if(a>d && d>c && c>b) System.out.println("오름차순:"+b +c +d +a );
		else if(b>a && a>c && c>d) System.out.println("오름차순:"+d +c +a +b );
		else if(b>a && a>d && d>c) System.out.println("오름차순:"+c +d +a +b );
		else if(b>c && c>a && a>d) System.out.println("오름차순:"+d +a +c +b );
		else if(b>c && c>d && d>a) System.out.println("오름차순:"+a +d +c +b );
		else if(b>d && d>a && a>c) System.out.println("오름차순:"+c +a +d +b );
		else if(b>d && d>c && c>a) System.out.println("오름차순:"+a +c +d +b );
		else if(c>a && a>b && b>d) System.out.println("오름차순:"+d +b +a +c );
		else if(c>a && a>d && d>b) System.out.println("오름차순:"+b +d +a +c );
		else if(c>b && b>a && a>d) System.out.println("오름차순:"+d +a +b +c );
		else if(c>b && b>d && d>a) System.out.println("오름차순:"+a +d +b +c );
		else if(c>d && d>a && a>b) System.out.println("오름차순:"+b +a +d +c );
		else if(c>d && d>b && b>a) System.out.println("오름차순:"+a +b +d +c );
		else if(d>a && a>b && b>c) System.out.println("오름차순:"+c +b +a +d );
		else if(d>a && a>c && c>b) System.out.println("오름차순:"+b +c +a +d );
		else if(d>b && b>a && a>c) System.out.println("오름차순:"+c +a +b +d );
		else if(d>b && b>c && c>a) System.out.println("오름차순:"+a +c +b +d );
		else if(d>c && c>a && a>b) System.out.println("오름차순:"+b +a +c +d );
		else if(d>c && c>b && b>a) System.out.println("오름차순:"+a +b +c +d );
		else System.out.println("4정수는 같다");
		
		 			// 문제16 4개의 정수를 입력받고 내림차순으로 출력하기  
		System.out.println("정수1:"); int aa=입력객체.nextInt();
		System.out.println("정수2:"); int bb=입력객체.nextInt();
		System.out.println("정수3:"); int cc=입력객체.nextInt();
		System.out.println("정수4:"); int dd=입력객체.nextInt();
		if (aa>bb && bb>cc && cc>dd) System.out.println("내림차순:" +aa +bb +cc +dd);
		else if(aa>bb && bb>dd && dd>cc) System.out.println("내림차순:"+aa +bb +dd +cc );
		else if(aa>cc && cc>bb && bb>dd) System.out.println("내림차순:"+aa +cc +bb +dd );
		else if(aa>cc && cc>dd && dd>bb) System.out.println("내림차순:" +aa +cc +dd +bb);
		else if(aa>dd && dd>bb && bb>cc) System.out.println("내림차순:" +aa +dd +bb +cc);
		else if(aa>dd && dd>cc && cc>bb) System.out.println("내림차순:" +aa +dd +cc +bb);
		else if(bb>aa && aa>cc && cc>dd) System.out.println("내림차순:" +bb +aa +cc +dd);
		else if(bb>aa && aa>dd && dd>cc) System.out.println("내림차순:" +bb +aa +dd +cc);
		else if(bb>cc && cc>aa && aa>dd) System.out.println("내림차순:" +bb +cc +aa +dd);
		else if(bb>cc && cc>dd && dd>aa) System.out.println("내림차순:" +bb +cc +dd +aa);
		else if(bb>dd && dd>aa && aa>cc) System.out.println("내림차순:" +bb +dd +aa +cc);
		else if(bb>dd && dd>cc && cc>aa) System.out.println("내림차순:" +bb +dd +cc +aa);
		else if(cc>aa && aa>bb && bb>dd) System.out.println("내림차순:" +cc +aa +bb +dd);
		else if(cc>aa && aa>dd && dd>bb) System.out.println("내림차순:" +cc +aa +dd +bb );
		else if(cc>bb && bb>aa && aa>dd) System.out.println("내림차순:" +cc +bb +aa +dd );
		else if(cc>bb && bb>dd && dd>aa) System.out.println("내림차순:" +cc +bb +dd +aa );
		else if(cc>dd && dd>aa && aa>bb) System.out.println("내림차순:" +cc +dd +aa +bb );
		else if(cc>dd && dd>bb && bb>aa) System.out.println("내림차순:" +cc +dd +bb +aa );
		else if(dd>aa && aa>bb && bb>cc) System.out.println("내림차순:" +dd +aa +bb +cc );
		else if(dd>aa && aa>cc && cc>bb) System.out.println("내림차순:" +dd +aa +cc +bb );
		else if(dd>bb && bb>aa && aa>cc) System.out.println("내림차순:" +dd +bb +aa +cc );
		else if(dd>bb && bb>cc && cc>aa) System.out.println("내림차순:" +dd +bb +cc +aa );
		else if(dd>cc && cc>aa && aa>bb) System.out.println("내림차순:" +dd +cc +aa +bb );
		else if(dd>cc && cc>bb && bb>aa) System.out.println("내림차순:" +dd +cc +bb +aa );
		else System.out.println("4정수는 같다");
		
		
		
	}
	
}
