package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// reduce : stream 기능 중 사용자가 직접 커스텀할 수 있는 연산기능.

// 구현법 1. BinaryOperator 인터페이스를 구현한 클래스를 정의 + 생성하여 매개변수에 넣어준다
// 구현법 2. 코드가 간단한 경우 매개변수에 람다식으로 바로 구현한다


// 구현법 1. BinaryOperator 인터페이스 구현

// 클래스 이름은 임의로 지었음. 문자열<String> 길이를 비교할 것이다.

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String t, String u) {
		return t.getBytes().length > u.getBytes().length ? t:u;
	}
}

// 가장 긴 문자를 찾아 출력하기
public class ReduceTest {
	public static void main(String[] args) {
		
		String[] amumal = {"안녕하세요~", "Hello", "Good Morning", "아이돌마스터샤이니컬러즈는갓게임이다"};
		String[] amumal2 = {"안녕하세요~", "Hello", "안즈죽도록사랑해안즈죽도록사랑해안즈죽도록사랑해안즈죽도록사랑해후타바안즈죽도록사랑해", "아이돌마스터샤이니컬러즈는갓게임이다"};

	System.out.println(Arrays.stream(amumal).
				// reduce 매개변수로 클래스를 생성해 get으로 바로 넘겨줌
				reduce(new CompareString()).get());
	
	// 바로 람다식
	System.out.println(Arrays.stream(amumal2).
			//냅다 매개변수에 람다식 넣기
			reduce(" ", (s1, s2) -> {
				if(s1.getBytes().length > s2.getBytes().length) {
					return s1;
				} else {
					return s2;
				}
			}));
	}

}
