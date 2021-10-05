package ex05;

//클래스: 자료형, 설계도
public class StudentInfo {
	//클래스 (Class):객체 지향
	//1. 속성: 필드, 멤버변수(//학생이름, 점수,과목)
	String name;
	int score;
	String subject;
	
	//2.기능,행위 : 메소드 	메소드명()<-괄호안에 들어가는 것: 매개변수, 파라미터(parameter)
	//접근 제한자:public , protected, private, default
	//public: 공개, 어디서든 사용 가능
	//protected: 상속
	//private: 비공개, 다른곳에서 사용 불가, 클래스 내에서만 사용 가능
	//default: 같은 패키지 내에서 접근 가능
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(score);
		System.out.println(subject);
	}
	

}
