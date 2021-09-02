package Day12;


import java.util.Scanner;


public class 과제 {//c.s
	/*
	 제출 : itdanja@kakao.com
과제1 :
	회원제 게시판 [ 파일처리해서 영구저장하기 ] 
	[조건1] 클래스2개( 회원, 게시판 ) 멤버 선택
	[조건2] 각 객체를 저장하는 파일 2개 
	[실행조건] 
		1.메뉴
			1. 로그인
			2. 회원가입
		2. 로그인시 메뉴 
			게시물출력
			1.글작성 2.글보기
		3. 글보기를 눌렀을때 
			글 정보 출력 
			1.수정 2.삭제 
	[조건3] 본인이 작성한 게시물만 수정/삭제 가능 
	 */
	
	public static Scanner scanner=new Scanner(System.in);
	public static 회원[] members=new 회원[100];
	public static 게시판[] boardlist=new 게시판[100];
	public static 댓글[] commentlist=new 댓글[100];
	
	public static void main(String[] args) {
		회원 회원=new 회원();
		게시판 게시판=new 게시판();
		댓글 댓글=new 댓글();
		
	while(true) {
				System.out.println("1.회원가입 2.로그인");
				int ch=scanner.nextInt();
				if(ch==1) {
					회원.join();
				}
				if(ch==2) {
					회원.login();
					게시판.blist();
					System.out.println("[[메뉴 1.글작성  2.글보기]]");
					int ch2=scanner.nextInt();
					if(ch2==1) {
						게시판.bwrite();
					}
					if(ch==2) {
						System.out.println("[[게시물번호 입력:]]");
						int ch3=scanner.nextInt();
						게시판.bview(ch3);
					}
				}
				
	}//w.e
		
	}//m.e
		
}//c.e
