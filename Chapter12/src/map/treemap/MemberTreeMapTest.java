package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberSoi = new Member(1002, "소이");
		Member memberKirari = new Member(1001, "키라리");
		Member memberUsaming = new Member(1003, "나나");
		Member memberAnzu = new Member(1004, "안즈");
		
		memberTreeMap.addMember(memberAnzu);
		memberTreeMap.addMember(memberUsaming);
		memberTreeMap.addMember(memberKirari);
		memberTreeMap.addMember(memberSoi);
		
		memberTreeMap.showAllMember();
		
	}

}
