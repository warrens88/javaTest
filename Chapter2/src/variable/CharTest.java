package variable;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		//음수값은 못들어감
		
		char hangul = '\uAC00';
		System.out.println(hangul);
	}

}
