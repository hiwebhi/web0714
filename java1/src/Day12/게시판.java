package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;

import Day08.Comment;


public class �Խ��� {
	//1.�ʵ�
	int bno; 	//1.��ȣ
	String btitle; //2.����
	String bcontents; //3.����
	String bwriter; //4.�ۼ���
	String bdate; //5.�ۼ���
	int bcount; //6.��ȸ��
	
	
	//2.������
	public �Խ���() { }
	��� comment=new ���();
	
	public �Խ���(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}
	//��������� ������
	public �Խ���(String btitle, String bcontents, String bwriter, String bdate) {
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
	}


	//3.�޼ҵ�:
	//1.�۾���
	public void bwrite() {
		Scanner scanner =new Scanner(System.in);
		
		//0.����ó��
		try {
			FileInputStream fileInputStream=new FileInputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/�Խ������α׷�.txt");
			// 1.�Է½�Ʈ�� �о�ͼ� �迭�� ���� 
			byte[] ����Ʈ�迭=new byte[1000];
			fileInputStream.read(����Ʈ�迭);
			
			// 2. ����Ʈ => ���ڿ� 
			String ��ü���ڿ�=new String(����Ʈ�迭);
			
			// 3. ȸ����������
			String[] �Խ��Ǹ���Ʈ=��ü���ڿ�.split("\n"); 
			
			// 4. ��ü�� �ʵ� ���� �ؼ� �迭�� ���� 
			for(int i=0;i<�Խ��Ǹ���Ʈ.length;i++)
			{
				String[] �ʵ�=�Խ��Ǹ���Ʈ[i].split(",");
				�Խ��� board=new �Խ���(�ʵ�[0],�ʵ�[1],�ʵ�[2],�ʵ�[3]);
				
				for(int j=0;j<����.boardlist.length;j++) {
					if(����.boardlist[j]==null) {
						����.boardlist[j]=board;
						break;
					}
				}
			}
		} 
		catch (Exception e) {
			
			
		}
		
		//1.��ü ����
		System.out.println("[[[�۾��� ������]]]");
	    System.out.print("������: "); String btitle=scanner.nextLine();
	    System.out.print("�۳���: "); String bcontents=scanner.nextLine();
	    System.out.print("�ۼ���: "); String bwriter=scanner.next();
	    
	    int bno=-1; 
	    		for(int i=0;i<����.boardlist.length;i++) {
	    			if(����.boardlist[i]==null) {
	    				
	    				//1. ù���� �Խù��� ��� 1���� ����
	    				if(i==0) {
	    					bno=1; break;
	    				}
	    				//2.ù��° �Խù��� �ƴѰ��� ������ �Խù��� +1
	    				else {
	    					bno=����.boardlist[i-1].bno+1; break; 
	    					
	    				}
	    			}
	    		}
	    Date date=new Date(); //���ó�¥/�ð� Ŭ����
	   	String bdate=date.toString(); //��¥��ü�� ����
	   	int bcount=1; //�Խù� �ۼ��� ��ȸ�� 1 ���� ����
	    	
	   	�Խ��� board = new �Խ���(bno,btitle,bcontents,bwriter,bdate,bcount);
	   	
	   	//2. �迭����
	   	for (int i=0;i<����.boardlist.length;i++) {
	   		if(����.boardlist[i]==null) {
	   				����.boardlist[i]=board;
	   				break;
	   				
	   		}
	   	}
	   	//3. ��������
	   	try {
			FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/�Խ������α׷�.txt");
			//1.�迭���� �ϳ��� ��ü �����ͼ� ����Ʈ ��ȯ
			for(int i=0;i<����.boardlist.length;i++) {
				if(����.boardlist[i]!=null) { 
					String ��¹��ڿ�=����.boardlist[i].btitle+","+����.boardlist[i].bcontents+","+����.boardlist[i].bwriter+","+����.boardlist[i].bdate+"\n";
					fileOutputStream.write(��¹��ڿ�.getBytes());
				}else {
					break;
				}
			}
			}
			catch(Exception exception) { }
			
			}


	//2.�۸��
	public void blist() {
		System.out.println("[[Ŀ�´�Ƽ]]");
		System.out.println("��ȣ\t����\t\t�ۼ���\t��ȸ��\t�ۼ���");
		
		for (int i=0; i<����.boardlist.length; i++) {
			if(����.boardlist[i]==null) return; //�޼ҵ� ������
			System.out.print(����.boardlist[i].bno+"\t");
			System.out.print(����.boardlist[i].btitle+"\t\t");
			System.out.print(����.boardlist[i].bwriter+"\t");
			System.out.print(����.boardlist[i].bcount+"\t");
			System.out.print(����.boardlist[i].bdate+"\t");
			System.out.println();
			
		}
	}
	//3.�ۼ���
	public void bupdate(int bno){//���� �޼ҵ� �ܺηκ��� �޼ҵ�� ������ ������ (�ڷ��� �����ϰ�) [�μ� : ]
		Scanner scanner=new Scanner(System.in);
		System.out.println("[[[�ۼ��� ������]]]");
		
		int index=findboard(bno);
		if(index==-1) return;
		
		System.out.print("���� : ");
		����.boardlist[index].btitle=scanner.nextLine();
		
		System.out.print("����: ");
		����.boardlist[index].bcontents=scanner.nextLine();
		
		System.out.println("[[[�ۼ���  �Ϸ�]]]");
	}
	
	//4.�ۻ���
	public void bdelete(int bno) {
		System.out.print("[[[�ۻ��� ������]]]");
		System.out.println("[[�ش� �Խù��� �����Ǿ����ϴ�]]");
		
		int index=findboard(bno); //�Խù� ã�� �޼ҵ� ȣ��
		if(index==-1) return; //���࿡ �Խù��� ������ �޼ҵ� ����
		
				
		//�ش� �Խù���ȣ�� ��ü ����
		����.boardlist[index]=null; //ã�� �Խù� ����
		//������ �Խù� �ڷ� ��ĭ�� ����
		for(int j=index;j<����.boardlist.length;j++) {
			if(����.boardlist[j+1]!=null) {
				����.boardlist[j]=����.boardlist[j+1];
			} else {
				����.boardlist[j]=null;
				break;
			}
		}
		
		
	}
	//5.��ȸ������
	public void bcount() {
		//System.out.println("[[��ȸ�� ���� ������]]]");
		this.bcount++; //��ȸ�� ����
	}
	//6.�� ��������
	public void bview(int bno) {//�μ�o
		int index=findboard(bno); //�Խù�ã�� �޼ҵ� ȣ��
		if(index==-1) return; //���࿡ -1�̸� ���� �޼ҵ� ����
		
		�Խ��� board=����.boardlist[index]; //ã�� �Խù� ��ġ�� �Խù� ��������	
		board.bcount(); //��ȸ�� ���� �޼ҵ� ȣ��
		
		System.out.println("[[�������� ������]]]");
		System.out.println("���� : "+board.btitle);
		System.out.println("�ۼ���:"+board.bwriter+" ��ȸ��:"+board.bcount+" �ۼ���"+board.bdate);
		System.out.println("����: "+board.bcontents);
		comment.clist();
		System.out.println("1.����  2.���� 3.����ۼ� 4.��ۻ���  5.�ڷΰ���");
		Scanner scanner=new Scanner(System.in);
		int ch=scanner.nextInt();
		if(ch==1) {
			if(bwriter.equals(����.members[bno].name)) {
			bupdate(bno);}
		}
		if(ch==2) {
			if(bwriter.equals(����.members[bno].name)) {
			bdelete(bno);}
			return;
			}
		if(ch==3) {comment.cwrite();}
		if(ch==4) {
			System.out.println("[[������ ��۹�ȣ �Է�:]]");
			int cno=scanner.nextInt();
			comment.cdelete(cno); return;}
		if(ch==5) {return; //�޼ҵ� ����
		}
		}
	
	//7.�Խù���ȣ�� �ش��ϴ� �迭�� ��ġ�� ã�� �޼ҵ�
	public int findboard(int bno) {
		//��ȯŸ�� :ã���迭�� ��ġ��ȯ
		for(int i=0;i<����.boardlist.length;i++) {
			if(����.boardlist[i]!=null && ����.boardlist[i].bno==bno) {
				//i��° �ε����� �迭���� ���� �ƴϸ鼭 i��° �ε����� �迭���� �Խù���ȣ�� ������ �Խù���ȣ�� ������
				return i; //ã�� �Խù��� �迭��ġ ��ȯ
			}
		}
		System.out.println("[[����]]�ش� �Խù� ��ȣ�� �����ϴ�.."); 
		return -1; //�迭 �ε��� 0���� ���� 
	}



}
