package Program;

public class StudentManage {
	public static void main(String[] args) {
		Student student1=new Student("임영웅",34,20201234,"자바 웹프로그래밍");
		student1.info();
		student1.print();
		Student student2=new Student("영탁",39,20201235,"컴퓨터공학과");
		student2.info(); 
		student2.print();
		Student student3=new Student("장동원",15,20201236,"정보보안");
		student3.info();
		student3.print();
		
		student1.modify();
		OtherStudent student4=new OtherStudent("이찬원",26,20201237,"드론 전문가 과정");
		student4.info();
	}

}
