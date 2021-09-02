package Day04;

import java.util.Scanner;

public class Day04_과제 {
	public static void main(String[] args) {
		//문제1: 가위바위보 게임
		//*조건1: 두명의 플레이어가 가위바위보중 하나를 입력받아
		//*조건2: 이긴사람 출력
		Scanner scanner =new Scanner(System.in);
		System.out.print("플레이어1:"); String 플레이어1=scanner.next();
		System.out.print("플레이어2:"); String 플레이어2=scanner.next();
	
		if (플레이어1.equals("주먹")) {
			if(플레이어2.equals("가위")) System.out.println("플레이어1이 이겼습니다.");
			else if (플레이어2.equals("보")) System.out.println("플레이어2가 이겼습니다.");
			else System.out.println("비겼습니다.");
		}
		else if (플레이어1.equals("가위")) {
			if(플레이어2.equals("보")) System.out.println("플레이어1이 이겼습니다.");
			else if (플레이어2.equals("주먹")) System.out.println("플레이어2가 이겼습니다.");
			else System.out.println("비겼습니다.");
		}
		else if (플레이어1.equals("보")) {
			if(플레이어2.equals("주먹")) System.out.println("플레이어1이 이겼습니다.");
			else if (플레이어2.equals("가위")) System.out.println("플레이어2가 이겼습니다.");
			else System.out.println("비겼습니다.");
		}		
	}
}
