package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ��� {
	// ��� Ŭ���� ����  
				//1. �ʵ�
					int cno;//1. �Խù���ȣ
					String ccontents;//2. ����
					String cwriter;//3. �ۼ��� 
				//2. ������
					public ���() { }
					
					public ���(int cno, String ccontents, String cwriter) {
							super();
							this.cno = cno;
							this.ccontents = ccontents;
							this.cwriter = cwriter;
						}

				//3. ����� ������
					public ���(String ccontents, String cwriter) {
						super();
						this.ccontents = ccontents;
						this.cwriter = cwriter;
					}

					//3. �޼ҵ� 
					//1. ��۾���
					public void cwrite() {
						Scanner scanner=new Scanner(System.in);
						
						//0.����ó��
						try {
							FileInputStream fileInputStream=new FileInputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/������α׷�.txt");
							// 1.�Է½�Ʈ�� �о�ͼ� �迭�� ���� 
							byte[] ����Ʈ�迭=new byte[1000];
							fileInputStream.read(����Ʈ�迭);
							
							// 2. ����Ʈ => ���ڿ� 
							String ��ü���ڿ�=new String(����Ʈ�迭);
							
							// 3. ȸ����������
							String[] ��۸���Ʈ=��ü���ڿ�.split("\n"); 
							
							// 4. ��ü�� �ʵ� ���� �ؼ� �迭�� ���� 
							for(int i=0;i<��۸���Ʈ.length;i++)
							{
								String[] �ʵ�=��۸���Ʈ[i].split(",");
								��� comment=new ���(�ʵ�[0],�ʵ�[1]);
								
								for(int j=0;j<����.commentlist.length;j++) {
									if(����.commentlist[j]==null) {
										����.commentlist[j]=comment;
										break;
									}
								}
							}
						} 
						catch (Exception e) {
							
							
						}
						
						
						//1.��ü ����
						System.out.println("[[[��۾��� ������]]]");
						System.out.print("���: "); String ccontents=scanner.nextLine();
						System.out.print("�ۼ���: "); String cwriter=scanner.next();
						��� comment = new ���(cno,ccontents,cwriter);
						
						//2.�迭����
						int cno=-1;
							for(int i=0;i<����.commentlist.length;i++) {
								if(����.commentlist[i]==null) {
									if(i==0) {
										cno=1; break;
									}
									else {
										cno=����.commentlist[i-1].cno+1; break;
									}
								}
							}
						
						
						for(int i=0;i<����.commentlist.length;i++) {
							if(����.commentlist[i]==null) {
								����.commentlist[i]=comment;
								break;
							}
						}
						
						//3.��������	
						try {
						FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/������α׷�.txt");
						//1.�迭���� �ϳ��� ��ü �����ͼ� ����Ʈ ��ȯ
						for(int i=0;i<����.commentlist.length;i++) {
							if(����.commentlist[i]!=null) { 
								String ��¹��ڿ�=����.commentlist[i].ccontents+","+����.commentlist[i].cwriter+"\n";
								fileOutputStream.write(��¹��ڿ�.getBytes());
							}else {
								break;
							}
						}
						}
						catch(Exception exception) { }
						
						}
						
					
					

					//2. ��۸��[ �Խù� �������� �ϴ� ǥ�� ]
					public void clist() {
						System.out.println("[[��۸��]]");
						System.out.println("��ȣ\t�ۼ���\t���");
						
						for (int i=0; i<����.commentlist.length;i++) {
							if(����.commentlist[i]==null)return;
							System.out.print(����.commentlist[i].cno+"\t");
							System.out.print(����.commentlist[i].cwriter+"\t");
							System.out.print(����.commentlist[i].ccontents+"\t");
							System.out.println();
						}
						
						
					}
					//3. ��ۻ���
					public void cdelete(int cno) {
						System.out.println("[[����� ���� �Ǿ����ϴ�]]");
						
						int index=findcomment(cno);
						if(index==-1) return;
						
						����.commentlist[index]=null;
						for (int j=index;j<����.commentlist.length;j++) {
							if(����.commentlist[j+1]!=null) {
								����.commentlist[j]=����.commentlist[j+1];
							} else {
								����.commentlist[j]=null;
								break;
							}
						}
						
					}
					
					//4.��۹�ȣ�� �ش��ϴ� �迭�� ��ġ�� ã�� �޼ҵ�
					public int findcomment(int cno) {
						//��ȯŸ�� :ã���迭�� ��ġ��ȯ
						for(int i=0;i<����.commentlist.length;i++) {
							if(����.commentlist[i]!=null && ����.commentlist[i].cno==cno) {
								//i��° �ε����� �迭���� ���� �ƴϸ鼭 i��° �ε����� �迭���� �Խù���ȣ�� ������ �Խù���ȣ�� ������
								return i; //ã�� �Խù��� �迭��ġ ��ȯ
							}
						}
						System.out.println("[[����]]�ش� ��� ��ȣ�� �����ϴ�.."); 
						return -1; //�迭 �ε��� 0���� ���� 
					}
}
