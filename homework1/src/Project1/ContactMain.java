package Project1;



public class ContactMain {
	public static void main(String[] args) {
	
		Contact contact=new Contact("최윤호","010-0000-0000","choi@gmail.com","서울","2000-0505","친구");
		contact.info();
		
		System.out.println("---------------");
		System.out.println("그룹 정보 변경");
		System.out.println("---------------");
		contact.change();
		contact.info();
	}

}
