package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public static ArrayList<Student> students=new ArrayList<Student>();
	static int count=0; //static 해줘야 +1 됨.
	//필드
	private String name;
	private int age;
	private int studentNum;
	private String major;
	//생성자
	public Student() {}
	public Student(String name, int age, int studentNum, String major) {
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
		this.major = major;
	}
	
	//메소드
	public void info() {
		Student student=new Student(name,age,studentNum,major);
		students.add(student);		
	}
	
	public void print() {
		System.out.print(students.get(count).getName());
		System.out.print(students.get(count).getAge());
		System.out.print(students.get(count).getStudentNum());
		System.out.print(students.get(count).getMajor());
		System.out.print(" 학생정보입력!!!");
		System.out.println();
		count++;
	}
	
	public void modify() {
			Scanner scanner=new Scanner(System.in);
			System.out.print("수정할 수강생 정보 인덱스(0~2):"); int index=scanner.nextInt();
			while(true) {
			System.out.print("수정할 내용(0:이름 ,1:나이, 2:수강번호, 3:수강과목 ,4:수정완료): "); int num=scanner.nextInt(); 
			int end=0;
			switch(num) {
			case 0:
				students.get(index).setName(scanner.next() ); break;
			case 1:
			    students.get(index).setAge(scanner.nextInt() ); break;
			case 2:
			    students.get(index).setStudentNum(scanner.nextInt() ); break;
			case 3:
			    students.get(index).setMajor(scanner.next() ); break;
			case 4:
		    	System.out.println(students.get(index).getName()+"학생정보 수정완료!!!"); 
		    	end=1;
		    	break; 
			  }
			if(end==1) break;
			}
	}
	
	//get set메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
	
	
	

}
