package ex01;

public class Ex02 {
	public static void main(String[] args) {
		int noodleCup=850;
		
		int sum=noodleCup * 3;
		System.out.println("컵라면의 3개의 가격은" + sum + "원");
		
		//10,000원으로 컵라면 3개를 산 후 거스름돈 구하기
		int money=10000;
		int change=money-sum;
		System.out.println("거스름돈:"+change);
		
		//5,000원으로 컵라면을 몇 개 살 수 있으며, 거스름돈은 얼마나 남는가?
		money=5000;
		int buyNoodleCup=money/noodleCup;
		System.out.println("구매 가능한 개수:"+buyNoodleCup);
		//change=money-noodleCup*buyNoodleCup;
		//나머지 구하기
		change=money%noodleCup;
		System.out.println("거스름돈:" +change);

	}
}
