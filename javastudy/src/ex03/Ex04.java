package ex03;

public class Ex04 {
	public static void main(String[] args) {
		//중첩 반복문: 반복문 안에 반복문이 있는 것.(nested loop)
		//바깥 반복문: 천천히 돈다
		//안쪽 반복문: 빨리 돈다
		
		//스쿼트 10회 3세트
		for(int j=1;j<=3;j++) {//세트
			for(int i=1;i<=10;i++) {//횟수
				System.out.println("스쿼트 "+j+"세트 "+i+"회");
				
			}
		}
		
		//한 줄짜리 별 5개 찍기
		for(int i=1;i<=3;i++){//행
			for(int j=1;j<=5;j++) {//열
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
