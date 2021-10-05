package ex03;

public class Ex03 {
	public static void main(String[] args) {
		//break : break가 써진 곳의 가까운 반복문에서 빠져나온다.
		
		
		//무한루프에서 Hello world 5번 찍기
		int i=0; //카운팅 변수
		while(true) { //무한루프
			if(i==5) {
				break;
			}
			System.out.println("Hello world "+i);
			i++;
		}
		
		
		//continue: 아래 코드들을 수행하지 않고 가까운 반복문에서 '조건을 다시 보러 간다'
		//1~10까지 수 중에서 4의 배수일 때는 숫자를 출력하지 않기
		for(int j=1;j<=10;j++) {
			if(j%4==0) {
				//4의 배수
				continue; //skip
			}
				System.out.print(j+" ");
		}
		
		
		
		
	}

}
