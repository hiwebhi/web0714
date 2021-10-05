package ex03;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		int i=0; //카운팅하는 변수
		while(i<3) { //3번
			System.out.println("안녕하세요"+ i);
			//i=i+1;
			//i+=1; //복합대입연산자
			i++;
		}
		
		//i++ 과  ++i의 차이점
		i=1;
		System.out.println("i: "+ ++i); // 2 i=i+1
		System.out.println("i: "+ i++); // 2 x
		System.out.println("i: "+ i); //3 i=i+1;
		
		//0~4 : 5번 -0,1,2,3,4
		i=0;
		while(i<5) {
			System.out.println("Hello world "+ i);
			i++; //증감 안시키면 무한루프 돔
		}
		
		//5~0: 6번 -5,4,3,2,1,0
		i=5;
		while (i>=0) {
			System.out.println("Hello world "+i);
			i--;
		}
		
		//합계 1~10 까지의 수를 합계 구하기
		int sum=0; //초기화
		i=1;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		
	}

}
