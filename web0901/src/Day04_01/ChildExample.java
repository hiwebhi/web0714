package Day04_01;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent=new Child(); //프로모션(promotion)
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
//		parent.field2="data2";
//		parent.method3();
		
		Child child=(Child)parent;
		child.field2="yyy";
		child.method3();
		
		////////////////비교////////////////
		Child child2=new Child();
		child2.field1="parent field";
		child2.field2="child field";
		
		child2.method1();
		child2.method2();
		child2.method3();
		
	}

}
