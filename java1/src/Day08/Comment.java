package Day08;

import java.util.Scanner;

public class Comment {
	
	 // ��� Ŭ���� ����  
			//1. �ʵ�
				int cno;//1. �Խù���ȣ
				String ccontents;//2. ����
				String cwriter;//3. �ۼ��� 
			//2. ������
				public Comment() {}
				public Comment(int cno, String ccontents, String cwriter) {
					
					this.cno = cno;
					this.ccontents = ccontents;
					this.cwriter = cwriter;
				}
				
				
			//3. �޼ҵ� 
				//1. ��۾���
				public void cwrite() {
					Scanner scanner=new Scanner(System.in);
					System.out.println("[[[��۾��� ������]]]");
					System.out.print("���: "); String ccontents=scanner.nextLine();
					System.out.print("�ۼ���: "); String cwriter=scanner.next();
					
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
				//2. ��۸��[ �Խù� �������� �ϴ� ǥ�� ]
				public void clist() {
					System.out.println("[[��۸��]]");
					System.out.println("��ȣ\t�ۼ���\t���");
					
					for (int i=0; i<Day08_2_Start.commentlist.length;i++) {
						if(Day08_2_Start.commentlist[i]==null)return;
						System.out.print(Day08_2_Start.commentlist[i].cno+"\t");
						System.out.print(Day08_2_Start.commentlist[i].cwriter+"\t");
						System.out.print(Day08_2_Start.commentlist[i].ccontents+"\t");
						System.out.println();
					}
					
					
				}
				//3. ��ۻ���
				public void cdelete(int cno) {
					System.out.println("[[����� ���� �Ǿ����ϴ�]]");
					
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
				
				//4.��۹�ȣ�� �ش��ϴ� �迭�� ��ġ�� ã�� �޼ҵ�
				public int findcomment(int cno) {
					//��ȯŸ�� :ã���迭�� ��ġ��ȯ
					for(int i=0;i<Day08_2_Start.commentlist.length;i++) {
						if(Day08_2_Start.commentlist[i]!=null && Day08_2_Start.commentlist[i].cno==cno) {
							//i��° �ε����� �迭���� ���� �ƴϸ鼭 i��° �ε����� �迭���� �Խù���ȣ�� ������ �Խù���ȣ�� ������
							return i; //ã�� �Խù��� �迭��ġ ��ȯ
						}
					}
					System.out.println("[[����]]�ش� ��� ��ȣ�� �����ϴ�.."); 
					return -1; //�迭 �ε��� 0���� ���� 
				}
	 
}
