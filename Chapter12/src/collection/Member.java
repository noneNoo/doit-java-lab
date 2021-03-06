package collection;

// 회원 관리 프로그램에서 사용할 Member 클래스
public class Member implements Comparable<Member> {
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
	
	@Override
	// hashCode가 멤버ID를 반환하게 재정의
	public int hashCode() {
		return memberID;
	}
	
	@Override
	// equals 는 이 hashCode를 검사하여, 논리적으로 중복되는 아이디를 찾아낼 것이다.
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberID == member.memberID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	// TreeSet의 요소로 추가할 때 필요로 하는 추상메서드
	// 정렬 기준을 잡는 메서드이다.
	
	// 비교대상: this멤버의 아이디, 매개변수멤버의 아이디
	// 아이디가 같을 순 없으므로, 결국 양수가 나오거나 음수가 나온다.
	// 이렇게 TreeSet에서 구현하면 오름차순 정렬이 된다.
//	public int compareTo(Member member) {
//		return (this.memberID - member.memberID);
//	}
	
	public int compareTo(Member member) {
		return this.memberName.compareTo(member.memberName);
	}
}
