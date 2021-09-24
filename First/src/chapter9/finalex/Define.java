package chapter9.finalex;

// 여러 파일에서 상수값을 공유하기 위해 만든
// 상수값 모음 클래스!
// static으로 선언하였기 때문에 인스턴스 생성과 관계 없이 가져다 쓸 수 있다.
public class Define {
	// 유저의 레벨 관리
	public static final int MIN_LEVEL = 1;
	public static final int MAX_LEVEL = 200;
	
	// 과목별 아이디 코드
	public static final int ENG_ID = 1001;
	public static final int KOR_ID = 1002;
	
	// 그냥
	public static final double PI = 3.14;
	public static final String HELLO = "안녕하세요!";
}
