package collection;

// 회원 관리 프로그램에서 사용할 Member 클래스
public class Member2 implements Comparable<Member2> {
	// 속성 필드
	private int memberID;	// 회원 아이디
	private String memberName;	// 회원 이름
	
	//생성자
	public Member2(int memberID, String memberName) {
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
	
	@Override
	// hashCode가 멤버ID를 반환하게 재정의
	public int hashCode() {
		return memberID;
	}
	
	@Override
	// equals 는 이 hashCode를 검사하여, 논리적으로 중복되는 아이디를 찾아낼 것이다.
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			
			if(this.memberID == member.memberID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}


	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		// TODO Auto-generated method stub
		return mem1.getId() - mem2.getId();
	}
}
