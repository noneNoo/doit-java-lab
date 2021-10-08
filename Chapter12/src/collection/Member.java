package collection;

// 회원 관리 프로그램에서 사용할 Member 클래스
public class Member {
	// 속성 필드
	private int memberID;	// 회원 아이디
	private String memberName;	// 회원 이름
	
	//생성자
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// Id, Name Getter
	public int getId() {
		return memberID;
	}
	public String getName() {
		return memberName;
	}
	
	
	// Id, Name Setter
	public void setId(int memberID) {
		this.memberID = memberID;
	}
	public void setName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "님의 아이디는 " + memberID + "입니다.";
	}
}
