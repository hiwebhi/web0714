package ex03;

public class Ex02 {
	public static void main(String[] args) {
		//for 반복문
		//for(초기식;조건;증감식) {수행문}
		
		//0~4 :5개 -0,1,2,3,4
		for(int i=0;i<5;i++) {
			System.out.println("Hello world "+i);
		}
		
		//1~5: 5개-1,2,3,4,5
		for(int i=1;i<=5;i++) {
			System.out.println("안녕하세요 "+i);
		}
		
		//1~10까지 합계 구하기
		int sum=0;
		for(int i=1;i<=10;i++) {
			//sum=sum+i;
			sum+=i; //복합 대입 연산자
		}
		System.out.println(sum);
	}

}
