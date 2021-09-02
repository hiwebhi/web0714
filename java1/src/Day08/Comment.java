package Day08;

import java.util.Scanner;

public class Comment {
	
	 // 댓글 클래스 설계  
			//1. 필드
				int cno;//1. 게시물번호
				String ccontents;//2. 내용
				String cwriter;//3. 작성자 
			//2. 생성자
				public Comment() {}
				public Comment(int cno, String ccontents, String cwriter) {
					
					this.cno = cno;
					this.ccontents = ccontents;
					this.cwriter = cwriter;
				}
				
				
			//3. 메소드 
				//1. 댓글쓰기
				public void cwrite() {
					Scanner scanner=new Scanner(System.in);
					System.out.println("[[[댓글쓰기 페이지]]]");
					System.out.print("댓글: "); String ccontents=scanner.nextLine();
					System.out.print("작성자: "); String cwriter=scanner.next();
					
					int cno=-1;
						for(int i=0;i<Day08_2_Start.commentlist.length;i++) {
							if(Day08_2_Start.commentlist[i]==null) {
								if(i==0) {
									cno=1; break;
								}
								else {
									cno=Day08_2_Start.commentlist[i-1].cno+1; break;
								}
							}
						}
					Comment comment = new Comment(cno,ccontents,cwriter);
					
					for(int i=0;i<Day08_2_Start.commentlist.length;i++) {
						if(Day08_2_Start.commentlist[i]==null) {
							Day08_2_Start.commentlist[i]=comment;
							break;
						}
					}
				}
				//2. 댓글목록[ 게시물 상세페이지 하단 표시 ]
				public void clist() {
					System.out.println("[[댓글목록]]");
					System.out.println("번호\t작성자\t댓글");
					
					for (int i=0; i<Day08_2_Start.commentlist.length;i++) {
						if(Day08_2_Start.commentlist[i]==null)return;
						System.out.print(Day08_2_Start.commentlist[i].cno+"\t");
						System.out.print(Day08_2_Start.commentlist[i].cwriter+"\t");
						System.out.print(Day08_2_Start.commentlist[i].ccontents+"\t");
						System.out.println();
					}
					
					
				}
				//3. 댓글삭제
				public void cdelete(int cno) {
					System.out.println("[[댓글이 삭제 되었습니다]]");
					
					int index=findcomment(cno);
					if(index==-1) return;
					
					Day08_2_Start.commentlist[index]=null;
					for (int j=index;j<Day08_2_Start.commentlist.length;j++) {
						if(Day08_2_Start.commentlist[j+1]!=null) {
							Day08_2_Start.commentlist[j]=Day08_2_Start.commentlist[j+1];
						} else {
							Day08_2_Start.commentlist[j]=null;
							break;
						}
					}
					
				}
				
				//4.댓글번호의 해당하는 배열의 위치를 찾는 메소드
				public int findcomment(int cno) {
					//반환타입 :찾은배열의 위치반환
					for(int i=0;i<Day08_2_Start.commentlist.length;i++) {
						if(Day08_2_Start.commentlist[i]!=null && Day08_2_Start.commentlist[i].cno==cno) {
							//i번째 인덱스의 배열값이 널이 아니면서 i번째 인덱스의 배열값의 게시물번호가 선택한 게시물번호와 같으면
							return i; //찾은 게시물의 배열위치 반환
						}
					}
					System.out.println("[[오류]]해당 댓글 번호가 없습니다.."); 
					return -1; //배열 인덱스 0부터 시작 
				}
	 
}
