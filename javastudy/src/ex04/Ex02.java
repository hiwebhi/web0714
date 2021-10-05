package ex04;

public class Ex02 {
	public static void main(String[] args) {
		//2차원 배열
		int[][] scores= {{89,93,91},{100,82,72},{65,63,71}};
		
		System.out.println("3번째 학생의 두번째 점수는 "+scores[2][1]);
		System.out.println("2번째 학생의 첫번째 점수는"+scores[1][0]);
		
		//반복문 2차원
		for(int i=0;i<scores.length;i++) {//앞 index
			for(int j=0;j<scores[i].length;j++) {//뒤 index
				System.out.println((i+1)+" 번째 학생의  "+(j+1)+" 번째 점수는 "+scores[i][j]);
			}
		}
		
		
		
	
	}

}
