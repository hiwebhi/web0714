package Day06;

import java.util.Vector;

public class Student {
	
	private Vector<Course> course; 
	private String sname;

	//생성자
	public Student(String sname) {
		this.sname = sname;
		course=new Vector<Course>();
	}


	//메소드
	public void registerCourse(Course course) {
		this.course.add(course);
	}

	public void dropCourse(Course course) {
		if(this.course.contains(course) ) {
			this.course.remove(course);
		}
		
	}

	//get, set
	public Vector<Course> getCourse() {
		return course;
	}


	public void setCourse(Vector<Course> course) {
		this.course = course;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	

	
	
	
}	



