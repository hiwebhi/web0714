package Day13;

public class Day13_1 {
	public static void main(String[] args) {
		//API 클래스: 미리 만들어진 클래스들
		
		//1.String 클래스
		
		byte[] 바이트배열= {92,72,101,34,59,84 };
		
		String 문자열= new String(바이트배열);
		
		System.out.println("변환후:"+문자열);
		
		byte[] 바이트배열2= {104,93,82,127,32 };
		String 문자열2=new String(바이트배열2);
		System.out.println("변환후:"+문자열2);
		
		
		
		
	}

	
}
