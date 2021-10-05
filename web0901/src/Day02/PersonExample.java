package Day02;

public class PersonExample {
public static void main(String[] args) {
	Person p1=new Person("1234-1234","계백");
	
	System.out.println(p1.nation);
	System.out.println(p1.name);
	System.out.println(p1.ssn);
	
	//p1.nation="usa";
	//p1.ssn="3333-2222";
	p1.name="을지문덕";
	System.out.println(p1.name);
}
}
