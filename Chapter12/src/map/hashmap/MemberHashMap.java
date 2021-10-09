package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	// HashMap타입 선언
	private HashMap<Integer, Member> hashMap;
	
	// 생성자
	MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	
	
	// 회원 추가
	public void addMember(Member member) {
		// put(key(회원아이디), value(객체))
		hashMap.put(member.getId(), member);
	}
	
	// 회원 제거
	public boolean removeMember(int memberID) {

		// 집합 중에서 매개변수로 들어온 키값과 일치한 것을 찾고, 있을 시 true 반환
		if(hashMap.containsKey(memberID)) {
			// 집합에서 해당 회원 삭제
			hashMap.remove(memberID);
			System.out.println(memberID + "을 찾았습니다. 삭제합니다.");
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		// 키값 전체(hashMap.keySet())을 순회할 수 있도록 속성을 적용
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		// 다음 키 값이 있으면
		while(ir.hasNext()) {
			// 그 키 값을 가져와서
			int key = ir.next();
			
			// 그 키 값에 해당하는 멤버를 지정하여
			Member member = hashMap.get(key);
			
			// 멤버 출력
			System.out.println(member);
		}
		
		//while문이 끝나고
		System.out.println("총 " + hashMap.size() + "명입니다.");
	}
}
