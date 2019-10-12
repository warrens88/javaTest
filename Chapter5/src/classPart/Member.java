package classPart;

public class Member {
	
	public int memberID;
	public String memberName;
	public String address;
	public String hobby;
	public String age;
	public String blood;
	
	public void showMemberInfo() {
		System.out.println("이름은" + memberName + "주소는," + address + "취미는" + hobby + "나이는" + age + "혈액형은" + blood + "형" );
	}
}
