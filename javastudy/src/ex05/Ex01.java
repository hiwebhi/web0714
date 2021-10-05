package ex05;

public class Ex01 {
	public static void main(String[] args) {
		String a=new String("안녕하세요");
		
		StudentInfo student1=new StudentInfo(); //객체 생성=인스턴스(student1:객체)
		student1.name="바다";
		student1.score=90;
		student1.subject="과학";
		System.out.println(student1.name);
		System.out.println(student1.score);
		System.out.println(student1.subject);
		//메소드 호출
		student1.printInfo(); //f3을 누르면 메소드 안으로 들어가짐
		
		
		StudentInfo student2=new StudentInfo();
		student2.name="하늘";
		student2.score=100;
		student2.subject="수학";
		//메소드 호출
		student2.printInfo();
	}

}
