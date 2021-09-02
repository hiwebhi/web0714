package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;

import Day08.Comment;


public class 게시판 {
	//1.필드
	int bno; 	//1.번호
	String btitle; //2.제목
	String bcontents; //3.내용
	String bwriter; //4.작성자
	String bdate; //5.작성일
	int bcount; //6.조회수
	
	
	//2.생성자
	public 게시판() { }
	댓글 comment=new 댓글();
	
	public 게시판(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}
	//파일저장용 생성자
	public 게시판(String btitle, String bcontents, String bwriter, String bdate) {
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
	}


	//3.메소드:
	//1.글쓰기
	public void bwrite() {
		Scanner scanner =new Scanner(System.in);
		
		//0.파일처리
		try {
			FileInputStream fileInputStream=new FileInputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/게시판프로그램.txt");
			// 1.입력스트림 읽어와서 배열에 저장 
			byte[] 바이트배열=new byte[1000];
			fileInputStream.read(바이트배열);
			
			// 2. 바이트 => 문자열 
			String 전체문자열=new String(바이트배열);
			
			// 3. 회원구분짓기
			String[] 게시판리스트=전체문자열.split("\n"); 
			
			// 4. 객체간 필드 구분 해서 배열에 저장 
			for(int i=0;i<게시판리스트.length;i++)
			{
				String[] 필드=게시판리스트[i].split(",");
				게시판 board=new 게시판(필드[0],필드[1],필드[2],필드[3]);
				
				for(int j=0;j<과제.boardlist.length;j++) {
					if(과제.boardlist[j]==null) {
						과제.boardlist[j]=board;
						break;
					}
				}
			}
		} 
		catch (Exception e) {
			
			
		}
		
		//1.객체 생성
		System.out.println("[[[글쓰기 페이지]]]");
	    System.out.print("글제목: "); String btitle=scanner.nextLine();
	    System.out.print("글내용: "); String bcontents=scanner.nextLine();
	    System.out.print("작성자: "); String bwriter=scanner.next();
	    
	    int bno=-1; 
	    		for(int i=0;i<과제.boardlist.length;i++) {
	    			if(과제.boardlist[i]==null) {
	    				
	    				//1. 첫번쩨 게시물인 경우 1부터 시작
	    				if(i==0) {
	    					bno=1; break;
	    				}
	    				//2.첫번째 게시물이 아닌경우는 마지막 게시물의 +1
	    				else {
	    					bno=과제.boardlist[i-1].bno+1; break; 
	    					
	    				}
	    			}
	    		}
	    Date date=new Date(); //오늘날짜/시간 클래스
	   	String bdate=date.toString(); //날짜객체의 정보
	   	int bcount=1; //게시물 작성시 조회수 1 부터 시작
	    	
	   	게시판 board = new 게시판(bno,btitle,bcontents,bwriter,bdate,bcount);
	   	
	   	//2. 배열저장
	   	for (int i=0;i<과제.boardlist.length;i++) {
	   		if(과제.boardlist[i]==null) {
	   				과제.boardlist[i]=board;
	   				break;
	   				
	   		}
	   	}
	   	//3. 파일저장
	   	try {
			FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/게시판프로그램.txt");
			//1.배열에서 하나씩 객체 꺼내와서 바이트 변환
			for(int i=0;i<과제.boardlist.length;i++) {
				if(과제.boardlist[i]!=null) { 
					String 출력문자열=과제.boardlist[i].btitle+","+과제.boardlist[i].bcontents+","+과제.boardlist[i].bwriter+","+과제.boardlist[i].bdate+"\n";
					fileOutputStream.write(출력문자열.getBytes());
				}else {
					break;
				}
			}
			}
			catch(Exception exception) { }
			
			}


	//2.글목록
	public void blist() {
		System.out.println("[[커뮤니티]]");
		System.out.println("번호\t제목\t\t작성자\t조회수\t작성일");
		
		for (int i=0; i<과제.boardlist.length; i++) {
			if(과제.boardlist[i]==null) return; //메소드 끝내기
			System.out.print(과제.boardlist[i].bno+"\t");
			System.out.print(과제.boardlist[i].btitle+"\t\t");
			System.out.print(과제.boardlist[i].bwriter+"\t");
			System.out.print(과제.boardlist[i].bcount+"\t");
			System.out.print(과제.boardlist[i].bdate+"\t");
			System.out.println();
			
		}
	}
	//3.글수정
	public void bupdate(int bno){//현재 메소드 외부로부터 메소드로 들어오는 데이터 (자료형 동일하게) [인수 : ]
		Scanner scanner=new Scanner(System.in);
		System.out.println("[[[글수정 페이지]]]");
		
		int index=findboard(bno);
		if(index==-1) return;
		
		System.out.print("제목 : ");
		과제.boardlist[index].btitle=scanner.nextLine();
		
		System.out.print("내용: ");
		과제.boardlist[index].bcontents=scanner.nextLine();
		
		System.out.println("[[[글수정  완료]]]");
	}
	
	//4.글삭제
	public void bdelete(int bno) {
		System.out.print("[[[글삭제 페이지]]]");
		System.out.println("[[해당 게시물이 삭제되었습니다]]");
		
		int index=findboard(bno); //게시물 찾기 메소드 호출
		if(index==-1) return; //만약에 게시물이 없으면 메소드 종료
		
				
		//해당 게시물번호의 객체 삭제
		과제.boardlist[index]=null; //찾은 게시물 삭제
		//삭제된 게시물 뒤로 한칸씩 당기기
		for(int j=index;j<과제.boardlist.length;j++) {
			if(과제.boardlist[j+1]!=null) {
				과제.boardlist[j]=과제.boardlist[j+1];
			} else {
				과제.boardlist[j]=null;
				break;
			}
		}
		
		
	}
	//5.조회수증가
	public void bcount() {
		//System.out.println("[[조회수 증가 페이지]]]");
		this.bcount++; //조회수 증가
	}
	//6.글 상세페이지
	public void bview(int bno) {//인수o
		int index=findboard(bno); //게시물찾기 메소드 호출
		if(index==-1) return; //만약에 -1이면 현재 메소드 종료
		
		게시판 board=과제.boardlist[index]; //찾은 게시물 위치의 게시물 가져오기	
		board.bcount(); //조회수 증가 메소드 호출
		
		System.out.println("[[상세페이지 페이지]]]");
		System.out.println("제목 : "+board.btitle);
		System.out.println("작성자:"+board.bwriter+" 조회수:"+board.bcount+" 작성일"+board.bdate);
		System.out.println("내용: "+board.bcontents);
		comment.clist();
		System.out.println("1.수정  2.삭제 3.댓글작성 4.댓글삭제  5.뒤로가기");
		Scanner scanner=new Scanner(System.in);
		int ch=scanner.nextInt();
		if(ch==1) {
			if(bwriter.equals(과제.members[bno].name)) {
			bupdate(bno);}
		}
		if(ch==2) {
			if(bwriter.equals(과제.members[bno].name)) {
			bdelete(bno);}
			return;
			}
		if(ch==3) {comment.cwrite();}
		if(ch==4) {
			System.out.println("[[삭제할 댓글번호 입력:]]");
			int cno=scanner.nextInt();
			comment.cdelete(cno); return;}
		if(ch==5) {return; //메소드 종료
		}
		}
	
	//7.게시물번호의 해당하는 배열의 위치를 찾는 메소드
	public int findboard(int bno) {
		//반환타입 :찾은배열의 위치반환
		for(int i=0;i<과제.boardlist.length;i++) {
			if(과제.boardlist[i]!=null && 과제.boardlist[i].bno==bno) {
				//i번째 인덱스의 배열값이 널이 아니면서 i번째 인덱스의 배열값의 게시물번호가 선택한 게시물번호와 같으면
				return i; //찾은 게시물의 배열위치 반환
			}
		}
		System.out.println("[[오류]]해당 게시물 번호가 없습니다.."); 
		return -1; //배열 인덱스 0부터 시작 
	}



}
