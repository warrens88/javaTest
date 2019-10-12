package classPart;

public class Member {
	
	public int memberID;
	public String memberName;
	public String address;
	public String hobby;
	public String age;
	public String blood;
	
	public void showMemberInfo() {
		System.out.println("�ȳ��ϼ��� �� �̸���" + memberName + "�Դϴ� �׸���," + address + "�� ��� ��̴�" + hobby + "�̸�" + age + "���Դϴ�. ��������" + blood + "�Դϴ�" );
	}
}
