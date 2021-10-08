package collection.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;
// 멤버 리스트를 관리하는 ArrayList 메서드
// 1. 추가하고 (C)
// 2. 지우고 (D)
// 3. 열람하는 (R)
// 총 3가지의 메서드를 지원한다.

public class MemberArrayList {
	// ArrayList 선언
	private ArrayList<Member> arrayList;
	
	
	// 생성자
	public MemberArrayList() {
		// Member형의 ArrayList를 생성하여 멤버변수에 할당
		arrayList = new ArrayList<Member>();
	}
	
	// 1. add 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 1-2 특정 위치에 add 하는 메서드
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	// 2. remove 메서드
	// 우선 제거할 멤버가 있는지 검사부터 해야 한다. 따라서 boolean 형으로 메서드를 선언.
	public boolean removeMember(int memberID) {
//		// for문을 돌면서 회원 아이디 하나하나와 매개변수의 아이디를 비교
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempID = member.getId();
//			
//			// 회원 아이디가 매개변수의 아이디와 일치한다면
//			if(tempID == memberID) {
//				// 해당 회원을 삭제
//				System.out.println(member.getName()+ "을 제거합니다.");
//				arrayList.remove(i);
//				System.out.println();
//				return true;
//			}
//		}
		// for 문 대신 반복자 메서드 이용
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getId();
			
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;
			}
		}

		// 반복문이 끝날 때까지 매개변수로 들어온 아이디를 찾지 못한 경우
		System.out.println("아이디가 " +memberID + "인 회원이 존재하지 않습니다. 지울 수 없습니다.");
		System.out.println();
		return false;
	}
	
	// 3. ArrayList의 모든 멤버의 정보를 출력하는 메서드
	public void showAllMembers() {
		System.out.println("전체 회원을 열람합니다. 총" + arrayList.size() + "명.");
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
