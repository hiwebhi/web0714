package Day09_2;

import Day09.Character;

public class Day09_2 {
	public static void main(String[] args) {
		
	//�ٸ� ��Ű�� ��
	Character character=new Character();
	character.name="����it";
	//character.lv=1; //���ٺҰ�
	character.setlv(1);
	System.out.println("���� ����:"+character.getlv());
	//character.ex=0; //���ٺҰ�
	character.setEx(1);
	System.out.println("���� ����ġ: "+character.getEx());
	//character.power=10;//���ٺҰ�
	character.setpower(1);
	System.out.println("���� ���ݷ� :"+character.getpower());
}
}
