package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();

		Member memberSoi = new Member(1001, "소이");
		Member memberKirari = new Member(1002, "키라리");
		Member memberUsaming = new Member(1003, "나나");
		Member memberAnzu = new Member(1004, "안즈");
		
		memberHashMap.addMember(memberSoi);
		memberHashMap.addMember(memberKirari);
		memberHashMap.addMember(memberUsaming);
		memberHashMap.addMember(memberAnzu);
		
		memberHashMap.showAllMember();
		
		memberHashMap.addMember(new Member(1000, "프로듀서"));

		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1001);

		memberHashMap.showAllMember();
		
		
	}

}
