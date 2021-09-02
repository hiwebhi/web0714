package Day07;

import java.util.Scanner;

public class Day07_2 {
public static void main(String[] args) {
	
	//회원제 프로그램
	//회원가입.로그인
	//[조건1] 2차원배열
	//[조건2] 최대회원 100명 제한
		//1. 아이디,비밀번호 배열에 저장
	//[조건3]무한루프 [초기메뉴]
		//1.회원가입 [중복아이디x]
		//2.로그인
		//3.종료
	//[조건4] 로그인시 메뉴
		//1.회원탈퇴 2.패스워드변경 3.로그아웃[초기메뉴]
	
	//0.설정[코드상 필요한 객체]
	Scanner scanner=new Scanner(System.in);
	
	//1.2차원배열 [회원 100명 아이디 비밀번호]
	String[][] memberlist=new String[100][2];
    
    //3.프로그램
	while(true) { //무한루프[종료조건:3번 입력시 break]
		
		System.out.println("\n[[회원제 프로그램]]");
		System.out.print("[[1.회원가입 2.로그인 3.종료     선택: ");
		int ch=scanner.nextInt();
		
		if(ch==1) { //회원가입
			System.out.println("[[회원가입 페이지]]");
			System.out.println("--->아이디 : "); String id=scanner.next();
			System.out.println("--->비밀번호 : "); String password=scanner.next();		
			
			//중복체크
			boolean idcheck=true;
			for(int i=0;i<memberlist.length;i++) {
				if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
					//기존회원에 아이디가 null 아니면서 아이디가 앞전에 입력한 아이디와 동일하면
					System.out.println("[[실패]]");
					idcheck=false;
					break; //가장 가까운 반복문 탈출
				}
			}
			if(idcheck) {
				//회원가입처리 [배열에 빈공간을 찾아서 빈공간에 회원넣기]
				for(int i=0; i<memberlist.length;i++) {
					if(memberlist[i][0]==null) {
						memberlist[i][0]=id;
						memberlist[i][1]=password;
						System.out.println("[[완료]]: 회원가입이 되었습니다");
						break;
					}
				}
			
			
			}
		
		}
		else if(ch==2) { //로그인
		System.out.println("[[[로그인 페이지]]]");
		System.out.println("[[--->아이디");  String id=scanner.next();
		System.out.println("[[--->비밀번호: "); String password=scanner.next();
		
		//로그인처리
		boolean logincheck=true;
		for(int i=0;i<memberlist.length;i++) {
									//2차원배열인 경우
									//memberlist.length: 행길이
									//memberlist[0].length: 열길이
		if(memberlist[i][0]!=null && memberlist[i][0].equals(id)&& memberlist[i][1].equals(password)) {
			//로그인성공
			System.out.println("[["+id+"]] :로그인 성공");
			logincheck=false;
			while(true) {//로그인시 무한루프[종료조건: 로그아웃[3] 입력시]
				
				System.out.println("\n[[[회원메뉴]]]");
				System.out.print("[[1.회원탈퇴 2.비밀번호변경 3.로그아웃 4.글쓰기 5.글목록 선택: ");
				int ch2=scanner.nextInt();
				if( ch==1) {//회원탈퇴
					
					//탈퇴한 회원 뒤로 한칸씩 당기기
					//1.로그인된 회원[탈퇴회원] 정보 지우기
					memberlist[i][0]=null;
					memberlist[i][1]=null;
					
					//2.탈퇴회원 뒤로 한칸씩 당기기
					for (int j=i; j<memberlist.length;j++) {
						if(memberlist[j+1][0] !=null) {//다음회원 여부 확인
							memberlist[j][0]=memberlist[j+1][0]; //현위치에 j에 다음회원 j+1 대입
							memberlist[j][1]=memberlist[j+1][1]; //현위치에 j에 다음회원 j+1 대입
							
						} else {//다음회원 없으면
							memberlist[j][0]=null;
							memberlist[j][1]=null;
							break;
						}
					}
					//3.로그아웃
					System.out.println("[[탈퇴성공]] 회원탈퇴 되었습니다");
					break; //로그아웃
				}
				else if(ch2==2) {//비밀번호 변경
					System.out.println("[[[패스워드변경 페이지]]]");
					System.out.print("[[--->새로운비밀번호 :"); String newpassword=scanner.next();
					memberlist[i][1]=newpassword;
					System.out.println("[[알림]] 패스워드 변경 완료 [자동 로그아웃 됩니다]");
									//i: 현재 로그인 성공한 행번호[회원]
					break;
				}
				else if(ch2==3) {System.out.println("[[로그아웃]] 로그아웃 되었습니다"); break;}
				else {System.out.println("[[알림]] 알수없는 번호 입니다");}
			}
			break; //로그아웃
		}	
	}
	if(logincheck) System.out.println("[[로그인실패]] 동일한 정보가 없습니다");
		
		}		
		else if(ch==3) {System.out.println("[[종료]] 이용해주셔서 감사합니다"); break;}
		else {System.out.println("[[알림]] 알수없는 번호 입니다");}
	}//w.e

}//m.e
}//c.e


//과제2 : 회원제프로그램
	// 1. 로그인시 게시판 기능 추가 
	// 2. 게시판 100개 저장하는 2차원배열 [ 제목 , 내용 ]
	// 3. 메뉴에서 4.글쓰기[배열저장] 5.글목록[배열출력]
