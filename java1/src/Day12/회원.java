package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 회원 {//c.s
	
	//1.필드 :상태[메모리]
		String id;
		String password;
		String name;
		
	//2.생성자
	public 회원() {
		
	}

	public 회원(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}



	//메소드
	//1.로그인
	public void login() {
		System.out.println(id+"님 로그인 되었습니다");
	}
	
	//2.회원가입
	public void join() {
		Scanner scanner =new Scanner(System.in);
		
		//0.파일처리
		try {
			FileInputStream fileInputStream=new FileInputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/회원제프로그램.txt");
			// 1.입력스트림 읽어와서 배열에 저장 
			byte[] 바이트배열=new byte[1000];
			fileInputStream.read(바이트배열);
			
			// 2. 바이트 => 문자열 
			String 전체문자열=new String(바이트배열);
			
			// 3. 회원구분짓기
			String[] 회원리스트=전체문자열.split("\n"); 
			
			// 4. 객체간 필드 구분 해서 배열에 저장 
			for(int i=0;i<회원리스트.length;i++)
			{
				String[] 필드=회원리스트[i].split(",");
				회원 member=new 회원(필드[0],필드[1],필드[2]);
				
				for(int j=0;j<과제.members.length;j++) {
					if(과제.members[j]==null) {
						과제.members[j]=member;
						break;
					}
				}
			}
		} 
		catch (Exception e) {
			
			
		}
		
		//1.객체 생성
		System.out.println("아이디:"); String id=scanner.next();
		System.out.println("비밀번호:"); String password=scanner.next();
		System.out.println("이름:"); String name=scanner.next();
		회원 member=new 회원(id,password,name);
		
		//2.배열저장
		for(int i=0;i<과제.members.length;i++) {
			if(과제.members[i]==null) {
				과제.members[i]=member;
				break;
			}
		}
		
		//3.파일저장	
		try {
		FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/gpqls/git/web-java/java1/src/Day12/회원제프로그램.txt");
		//1.배열에서 하나씩 객체 꺼내와서 바이트 변환
		//파일에 저장시 회원내 필드 구분:, [쉼표]
		//파일에 저장시 회원간 구분:\n [백술래시]
		
		for(int i=0;i<과제.members.length;i++) {
			if(과제.members[i]!=null) { 
				String 출력문자열=과제.members[i].id+","+과제.members[i].password+","+과제.members[i].name+"\n";
				fileOutputStream.write(출력문자열.getBytes());
			}else {
				break;
			}
		}
		}
		catch(Exception exception) { }
		
		}
	
	
	
	

	
}//c.e
