package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();

		Member memberSoi = new Member(1001, "����");
		Member memberKirari = new Member(1002, "Ű��");
		Member memberUsaming = new Member(1003, "����");
		Member memberAnzu = new Member(1004, "����");
		
		memberHashMap.addMember(memberSoi);
		memberHashMap.addMember(memberKirari);
		memberHashMap.addMember(memberUsaming);
		memberHashMap.addMember(memberAnzu);
		
		memberHashMap.showAllMember();
		
		memberHashMap.addMember(new Member(1000, "���ε༭"));

		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1001);

		memberHashMap.showAllMember();
		
		
	}

}
