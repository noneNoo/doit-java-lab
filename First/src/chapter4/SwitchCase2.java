package chapter4;

public class SwitchCase2 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		// 자바7부터는 문자열을 직접 case에 사용할 수 있다.
		// .equals() 메서드를 이용할 필요 없음.
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}

}
