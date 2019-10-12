package classPart;

public class MemberTest {

	public static void main(String[] args) {
		
		Member memberLee = new Member();
		memberLee.memberName = "이순신";
		memberLee.address = "서울";
		memberLee.hobby = "검술";
		memberLee.age = "54세";
		memberLee.blood = "A형";
		
		memberLee.showMemberInfo();
	}

}
