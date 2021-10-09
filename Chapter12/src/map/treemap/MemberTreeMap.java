package map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	//생성자
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>();
	}
	
	
	// 회원 추가
	public void addMember(Member member) {
		treeMap.put(member.getId(), member);
	}
	
	// 회원 제거
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			System.out.println(memberID +"번 회원을 제거합니다.");
			treeMap.remove(memberID);
			return true;
		}
		System.out.println(memberID +"번 회원이 없습니다.");
		return false;
	}
	
	// 회원 전체 열람
	public void showAllMember() {
		// 회원키 순회하기 위한 선언
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		// 순회
		while(ir.hasNext()) {
			int key = ir.next();
			System.out.println(treeMap.get(key));
		}
		System.out.println("총 " + treeMap.size() + "명 입니다.");
	}




}
