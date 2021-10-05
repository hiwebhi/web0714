package Day03;

public class ComputerExample {
	public static void main(String[] args) {
		int r=10;
		Calculator calculator=new Calculator();
		System.out.println("원면적:"+calculator.areaCirlce(r));
		System.out.println();
		Computer computer=new Computer();
		System.out.println("원면적:"+computer.areaCirlce(r));
	}

}
