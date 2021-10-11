package lambda;

// 인터페이스를 구현하는 클래스
public class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String str1, String str2) {
		System.out.println(str1 + ", " + str2);
	}


}
