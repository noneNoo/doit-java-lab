package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member memberSoi = new Member(1001, "소이");
		Member memberKirari = new Member(1002, "키라리");
		Member memberUsaming = new Member(1003, "나나");
		Member memberAnzu = new Member(1004, "안즈");
		
		memberHashSet.addMember(memberSoi);
		memberHashSet.addMember(memberKirari);
		memberHashSet.addMember(memberUsaming);
		memberHashSet.addMember(memberAnzu);
		memberHashSet.showAllMember();
		
		// 아이디 중복 회원 추가
		memberHashSet.addMember(new Member(1001, "프로듀서"));
		memberHashSet.showAllMember();
		
	
	}

}
