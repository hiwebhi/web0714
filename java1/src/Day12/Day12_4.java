package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_4 {
	//메모리[변수,배열]=>프로그램 종료되면 다 메모리 초기화 
		//주기억장치:현재 실행중일 프로그램[명령어] 기억
			//전기X저장X=>휘발성
			//변수, 객체 ,배열 등등
		//보조기억장치[파일,DB 등]
			//전기X 저장O=>비휘발성
			//파일 , DB 등
		//파일처리
			// 키보드[파일] -------스트림(데이터흐름)---------> 출력
				// 데이터흐름 : 바이트단위 [ 비트 : 1bit => 0 혹은 1 ] [ 바이트 : 8bit => 1byte ]

	
	public static void main(String[] args) throws Exception {
		
		
			FileOutputStream fileOutputStream =new FileOutputStream("c:/CookJava/test.txt"); //무조건 예외처리 발생: 만약에 파일이 없을경우
			//파일을 출력해주는 클래스 / 객체명 /new / 파일명?
			//new: 객페 메모리 할당
				//FileOutputStream(파일경로 확장자);
			String 문자열="이클립에서 작성했습니다";
			System.out.println(문자열.getBytes()[0]);
			fileOutputStream.write(문자열.getBytes());
		
		/////////////////////////////////////////////////
		
			FileInputStream fileInputStream =new FileInputStream("c:/CookJava/test.txt");
		//1. 스트링에서 바이트열 가저온다
			byte[] 바이트배열=new byte[1024]; //1024byte=>1kbyte=>1024kb=>1mb
			fileInputStream.read(바이트배열);
				//스트림명.read(바이트배열명) : 바이트 읽어오기=>배열에 저장
			
			
		//2.가져온 바이트열 문자열 변환
			String 문자열2=new String(바이트배열); //생성자에 바이트배열 넣기=>문자열 변환
			System.out.println("현재 파일의 내용: "+문자열2);
		/////////////////////////////
			
		//키보드에 입력된 변수를 메모장에 걔속 누적으로 쓰기
			
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.print("메모장에 입력할 텍스트 입력:");
			String 문자열3=scanner.next();
			String 출력문자열=문자열3+"\n";
			fileOutputStream.write(출력문자열.getBytes());
			
		}
			
			
	}
}
