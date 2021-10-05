package ex04;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 배열(Array): 같은 자료형 변수들의 묶음
		 */
		//배열의 초기화(1)
		int[] scores= {89,93,91,100,92};
		System.out.println("첫번쩨 값:"+scores[0]); //index:0
		System.out.println("두번쩨 값:"+scores[1]); //index:1
		System.out.println("세번쩨 값:"+scores[2]); //index:2
		System.out.println("네번쩨 값:"+scores[3]); //index:3
		System.out.println("다섯번쩨 값:"+scores[4]); //index:4
		
		//배열의 초기화(2)
		int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		numbers[2]=1000;//배열 값 변경
		System.out.println(numbers[2]);
		
		//반복문을 이용해서 출력
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
			System.out.println(numbers[i]);
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/numbers.length);
		
		
		
	}

}
