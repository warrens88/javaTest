package classPart;

public class Member {
	
	public int memberID;
	public String memberName;
	public String address;
	public String hobby;
	public String age;
	public String blood;
	
	public void showMemberInfo() {
		System.out.println("안녕하세요 제 이름은" + memberName + "입니다 그리고," + address + "에 살고 취미는" + hobby + "이며" + age + "살입니다. 혈액형은" + blood + "입니다" );
	}
}
