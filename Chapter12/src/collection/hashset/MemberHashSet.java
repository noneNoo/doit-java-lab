package collection.hashset;


import java.util.HashSet;
import java.util.Iterator;

// 멤버를 불러오기
import collection.Member;

public class MemberHashSet {
	// Member형으로 구성된 집합자료구조를 담을 부분 선언.
	private HashSet<Member> hashSet;
	
	// 생성자! 생성을 하면 집합자료구조가 생성된다.
	public MemberHashSet() {
		// hashSet 집합자료구조 생성
		hashSet = new HashSet<Member>();
	}
	
	// 1. 회원 추가 기능
	// 중복되는 아이디를 추가할 시
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	// 2. 회원 지우기 기능
	public boolean removeMember(int memberID) {
		// hashSet은 일반 배열과 다르게 집합자료구조이기 때문에
		// 1. 딱히 순서랄 게 없고 2. 중복되지 않는다
		// 따라서 배열을 돌 때 for문이 아닌 Iterator을 사용한다.
		
		// hashSet(집합)을 순환할 수 있게 Member객체로 이루어진 Iterator 집합 선언
		Iterator<Member> ir = hashSet.iterator();
		
		// 집합에 다음요소가 존재하면 true
		// 더이상 다음 요소가 없을 시 false를 반환하며 while문이 종료됨
		while(ir.hasNext()) {
			// member 요소를 반환.
			Member member = ir.next();
			int tempID = member.getId();
			
			if(tempID == memberID) {
				
				System.out.println(member.getName() + "을 삭제합니다.");
				
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	// 3. 회원 열람 기능
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println("총 "+ hashSet.size() + "명입니다.");
	}
	
	
}
