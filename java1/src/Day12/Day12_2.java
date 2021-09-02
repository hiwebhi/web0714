package Day12;

import java.util.Scanner;

public class Day12_2 {
	/*
	 * 문제1 : 예외처리
			1.무한루프로 int형 숫자 계속 입력받기 
			2. 문자입력시 예외처리발생
			3. 예외처리 해서 다시 입력받기 
	 * 
	 */
	public static void main(String[] args) {
		
		/*while(true) {
			try {
				//예외가 예상되는 곳에 try
			Scanner scanner=new Scanner(System.in);
			System.out.println("숫자입력:"); int 숫자=scanner.nextInt();
		}
		
		catch(Exception exception) {
			System.out.println("[[문자입력 불가]]");
			
			}
		}*/
		
		Scanner scanner = new Scanner(System.in); // 입력객체 
		
		while(true) {
			try {
				// 예외가 예상되는곳에 try { } 묶음
				System.out.println(" 정수 입력 : "); 
				int 정수 = scanner.nextInt();
			}
			catch( Exception e) {
				System.out.println("[[문자 입력불가]]");
				scanner = new Scanner(System.in); // 입력객체 
			}
		} 
		
	}
}
