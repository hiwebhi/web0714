package Day11;

public interface ������ {

	//���: ���, �߻�޼ҵ� ,default �޼ҵ�
	
	//�ʵ�
	int �ִ����=10;
	int �ּҼ���=0;
	
	
	//�߻�޼ҵ�:����O,����X
	public abstract void ����();
	public void ����();
	public void ��������(int ����);
	
	//default �޼ҵ�: ����O,����O
	public default void ä�κ���() {
		System.out.println("ä�κ���");
	}
	
	
}
