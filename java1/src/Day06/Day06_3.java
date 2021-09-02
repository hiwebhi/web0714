package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_3 {
public static void main(String[] args) {
	
	//삼목게임 [console 틱택토 게임]
	//0.설정
	Scanner scanner=new Scanner(System.in);
	Random random=new Random(); //랜덤클래스를 이용한 랜덤객체
	
	//1.게임판 정의
	String[] 게임판= {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"}; //9개
	
//////////////////게임판 출력/////////////////////////////
	while(true) { //무한루프[종료조건:승리자 나왔을경우, 9개알이 존재했을때 무승부]
				//2.게임판 출력
				for( int i=0 ; i<게임판.length ; i++) {
						System.out.print(게임판[i]);
						if(i%3==2)System.out.println();	
				}
			
			//플레이어에게 위치 선택받아 알 두기
		
			while(true) { //무한루프[종료조건:정상적인 알두었을때 break; ]
				System.out.print("위치 선택 : "); int index=scanner.nextInt();
				//1.이미 알이 존재하는 경우 다시 입력받기
				if(게임판[index].equals("[ ]")) { // String 클래스는 == 같다 연산자 사용불가 [ .equals ]
					게임판[index]="[O]";
					
					break; // 가장 가까운 반복문 탈출 
				}
				else {
					System.out.println("[[경고]] 이미 둔 자리입니다. [다시입력]");
					
					}
				}
			//4.컴퓨터가 난수생성 알두기
			while(true) {//무한루프[종료조건: 정상적인 알두었을때 break;]
			int rindex=random.nextInt(9);//0~8
				//랜덤객체.nextInt(); int 범위내 난수 생성 +-20억
				//랜덤객체.nextInt(수); 0부터 수전까지 난수생성
				//랜덤객체.nextInt(수)+시작; 시작부터 (시작+수)전까지 난수 생성
			if(게임판[rindex]=="[ ]") {
				게임판[rindex]="[X]";
				break;
			}
		}
			//5.승리조건
			//1.가로로 이기는 수[0 1 2] [3 4 5] [6 7 8]
		/*	if(게임판[0]=="[O]"&&게임판[0]==게임판[1]&& 게임판[0]==게임판[2]) {System.out.println("플레이어가 이겼습니다"); break;}
		    if(게임판[0]=="[X]"&&게임판[0]==게임판[1]&& 게임판[0]==게임판[2]) {System.out.println("컴퓨터가 이겼습니다"); break;}
			if(게임판[3]=="[O]"&&게임판[3]==게임판[4]&& 게임판[3]==게임판[5]) {System.out.println("플레이어가 이겼습니다"); break;}
			if(게임판[3]=="[X]"&&게임판[3]==게임판[4]&& 게임판[3]==게임판[5]) {System.out.println("컴퓨터가 이겼습니다"); break;}
			if(게임판[6]=="[O]"&&게임판[6]==게임판[7]&& 게임판[6]==게임판[8]) {System.out.println("플레이어가 이겼습니다"); break;}
			if(게임판[6]=="[X]"&&게임판[6]==게임판[7]&& 게임판[6]==게임판[8]) {System.out.println("컴퓨터가 이겼습니다"); break;}
			*/
			
			int end=0;
			for(int i=0;i<게임판.length;i+=3) {	
			if(게임판[i]=="[O]"&& 게임판[i]==게임판[i+1] && 게임판[i]==게임판[i+2]) {System.out.println("플레이어1가 이겼습니다."); end=1;} 
			else if(게임판[i]=="[X]"&& 게임판[i]==게임판[i+1] && 게임판[i]==게임판[i+2]){System.out.println("컴퓨터1가 이겼습니다.");end=1;}					
				} 
			if(end==1) break;
			
			//2.세로로 이기는 수[0 3 6] [1 4 7] [2 5 8]
		/*	
			if(게임판[0]=="[O]"&&게임판[0]==게임판[3]&& 게임판[0]==게임판[6]) {System.out.println("플레이어가 이겼습니다"); break;}
			if(게임판[0]=="[X]"&&게임판[0]==게임판[3]&& 게임판[0]==게임판[6]) {System.out.println("컴퓨터가 이겼습니다"); break;}
			if(게임판[1]=="[O]"&&게임판[1]==게임판[4]&& 게임판[1]==게임판[7]) {System.out.println("플레이어가 이겼습니다"); break;}
			if(게임판[1]=="[X]"&&게임판[1]==게임판[4]&& 게임판[1]==게임판[7]) {System.out.println("컴퓨터가 이겼습니다"); break;}
			if(게임판[2]=="[O]"&&게임판[2]==게임판[5]&& 게임판[2]==게임판[8]) {System.out.println("플레이어가 이겼습니다"); break;}
			if(게임판[2]=="[X]"&&게임판[2]==게임판[5]&& 게임판[2]==게임판[8]) {System.out.println("컴퓨터가 이겼습니다"); break;} */
			
			for(int i=0;i<=2;i++) {	
			if(게임판[i]=="[O]"&& 게임판[i]==게임판[i+3] && 게임판[i]==게임판[i+6]) {System.out.println("플레이어2가 이겼습니다."); end=1;} 
			else if(게임판[i]=="[X]"&& 게임판[i]==게임판[i+3] && 게임판[i]==게임판[i+6]){System.out.println("컴퓨터2가 이겼습니다.");end=1;}					
				} 
			if(end==1) break;
			
			//3.대각선으로 이기는 수[0 4 8] [2 4 6]
			
			if(게임판[0]=="[O]"&&게임판[0]==게임판[4]&& 게임판[0]==게임판[8]) {System.out.println("플레이어3가 이겼습니다"); break;}
			if(게임판[0]=="[X]"&&게임판[0]==게임판[4]&& 게임판[0]==게임판[8]) {System.out.println("컴퓨터3가 이겼습니다"); break;}
			if(게임판[2]=="[O]"&&게임판[2]==게임판[4]&& 게임판[2]==게임판[6]) {System.out.println("플레이어3가 이겼습니다"); break;}
			if(게임판[2]=="[X]"&&게임판[2]==게임판[4]&& 게임판[2]==게임판[6]) {System.out.println("컴퓨터3가 이겼습니다"); break;} 
			
			//무승부
			
			
			
			//게임판[i].isEmpty()==false	
    }
}
}
