package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 댓글 {
	// 댓글 클래스 설계  
				//1. 필드
					int cno;//1. 게시물번호
					String ccontents;//2. 내용
					String cwriter;//3. 작성자 
				//2. 생성자
					public 댓글() { }
					
					public 댓글(int cno, String ccontents, String cwriter) {
							super();
							this.cno = cno;
							this.ccontents = ccontents;
							this.cwriter = cwriter;
						}

				//3. 저장용 생성자
					public 댓글(String ccontents, String cwriter) {
						super();
						this.ccontents = ccontents;
						this.cwriter = cwriter;
					}

					//3. 메소드 
					//1. 댓글쓰기
					public void cwrite() {
						Scanner scanner=new Scanner(System.in);
						
						//0.파일처리
						try {
							FileInputStream fileInputStream=new FileInputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/댓글프로그램.txt");
							// 1.입력스트림 읽어와서 배열에 저장 
							byte[] 바이트배열=new byte[1000];
							fileInputStream.read(바이트배열);
							
							// 2. 바이트 => 문자열 
							String 전체문자열=new String(바이트배열);
							
							// 3. 회원구분짓기
							String[] 댓글리스트=전체문자열.split("\n"); 
							
							// 4. 객체간 필드 구분 해서 배열에 저장 
							for(int i=0;i<댓글리스트.length;i++)
							{
								String[] 필드=댓글리스트[i].split(",");
								댓글 comment=new 댓글(필드[0],필드[1]);
								
								for(int j=0;j<과제.commentlist.length;j++) {
									if(과제.commentlist[j]==null) {
										과제.commentlist[j]=comment;
										break;
									}
								}
							}
						} 
						catch (Exception e) {
							
							
						}
						
						
						//1.객체 생성
						System.out.println("[[[댓글쓰기 페이지]]]");
						System.out.print("댓글: "); String ccontents=scanner.nextLine();
						System.out.print("작성자: "); String cwriter=scanner.next();
						댓글 comment = new 댓글(cno,ccontents,cwriter);
						
						//2.배열저장
						int cno=-1;
							for(int i=0;i<과제.commentlist.length;i++) {
								if(과제.commentlist[i]==null) {
									if(i==0) {
										cno=1; break;
									}
									else {
										cno=과제.commentlist[i-1].cno+1; break;
									}
								}
							}
						
						
						for(int i=0;i<과제.commentlist.length;i++) {
							if(과제.commentlist[i]==null) {
								과제.commentlist[i]=comment;
								break;
							}
						}
						
						//3.파일저장	
						try {
						FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/댓글프로그램.txt");
						//1.배열에서 하나씩 객체 꺼내와서 바이트 변환
						for(int i=0;i<과제.commentlist.length;i++) {
							if(과제.commentlist[i]!=null) { 
								String 출력문자열=과제.commentlist[i].ccontents+","+과제.commentlist[i].cwriter+"\n";
								fileOutputStream.write(출력문자열.getBytes());
							}else {
								break;
							}
						}
						}
						catch(Exception exception) { }
						
						}
						
					
					

					//2. 댓글목록[ 게시물 상세페이지 하단 표시 ]
					public void clist() {
						System.out.println("[[댓글목록]]");
						System.out.println("번호\t작성자\t댓글");
						
						for (int i=0; i<과제.commentlist.length;i++) {
							if(과제.commentlist[i]==null)return;
							System.out.print(과제.commentlist[i].cno+"\t");
							System.out.print(과제.commentlist[i].cwriter+"\t");
							System.out.print(과제.commentlist[i].ccontents+"\t");
							System.out.println();
						}
						
						
					}
					//3. 댓글삭제
					public void cdelete(int cno) {
						System.out.println("[[댓글이 삭제 되었습니다]]");
						
						int index=findcomment(cno);
						if(index==-1) return;
						
						과제.commentlist[index]=null;
						for (int j=index;j<과제.commentlist.length;j++) {
							if(과제.commentlist[j+1]!=null) {
								과제.commentlist[j]=과제.commentlist[j+1];
							} else {
								과제.commentlist[j]=null;
								break;
							}
						}
						
					}
					
					//4.댓글번호의 해당하는 배열의 위치를 찾는 메소드
					public int findcomment(int cno) {
						//반환타입 :찾은배열의 위치반환
						for(int i=0;i<과제.commentlist.length;i++) {
							if(과제.commentlist[i]!=null && 과제.commentlist[i].cno==cno) {
								//i번째 인덱스의 배열값이 널이 아니면서 i번째 인덱스의 배열값의 게시물번호가 선택한 게시물번호와 같으면
								return i; //찾은 게시물의 배열위치 반환
							}
						}
						System.out.println("[[오류]]해당 댓글 번호가 없습니다.."); 
						return -1; //배열 인덱스 0부터 시작 
					}
}
