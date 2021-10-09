package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	// 생성자
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	// 회원 삭제
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getId();
			
			if(memberID == tempID) {
				System.out.println(member.getName() + "을 삭제합니다.");
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "번 회원이 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println("총 " + treeSet.size() + "명입니다");
	}
}
