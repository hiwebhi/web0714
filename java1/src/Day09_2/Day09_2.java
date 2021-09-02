package Day09_2;

import Day09.Character;

public class Day09_2 {
	public static void main(String[] args) {
		
	//다른 패키지 내
	Character character=new Character();
	character.name="신촌it";
	//character.lv=1; //접근불가
	character.setlv(1);
	System.out.println("현재 레벨:"+character.getlv());
	//character.ex=0; //접근불가
	character.setEx(1);
	System.out.println("현재 경험치: "+character.getEx());
	//character.power=10;//접근불가
	character.setpower(1);
	System.out.println("현재 공격력 :"+character.getpower());
}
}
