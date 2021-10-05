package Program;

public class OtherStudent extends Student{
	
	public OtherStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public OtherStudent(String name, int age, int studentNum, String major) {
		super(name, age, studentNum, major);
	}

	@Override
	public void info() {
		super.info();
		System.out.println(super.getName()+"휴학생 정보 입력!!!");
	}
	


}
