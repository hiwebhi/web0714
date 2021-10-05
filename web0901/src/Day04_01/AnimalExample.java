package Day04_01;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog=new Dog(); //힙 메모리에 Animal 올라가고  Dog 올라감
		Cat cat=new Cat(); //힙 메모리에 Animal 올라가고 Cat 올라감
		dog.sound();
		cat.sound();
		System.out.println("--------------");
		
		//변수의 자동 타입 변환
		Animal animal=null; //Animal 클래스에 animal참조타입 선언. 메모리 할당된거 없으니까 그 주소에 초기화 값으로 null넣음
		animal=new Dog(); //Dog의 주소값을 리턴받아 animal 이 갖고있음.
		animal.sound();
		animal=new Cat(); //Cat의 주소값을 리턴받아 animal이 갖고있음
		animal.sound();
		System.out.println("----------------");
		
		//(파라매터 패싱으로) 매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	//메소드
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
