package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberSoi = new Member(1002, "����");
		Member memberKirari = new Member(1001, "Ű��");
		Member memberUsaming = new Member(1003, "����");
		Member memberAnzu = new Member(1004, "����");
		
		memberTreeMap.addMember(memberAnzu);
		memberTreeMap.addMember(memberUsaming);
		memberTreeMap.addMember(memberKirari);
		memberTreeMap.addMember(memberSoi);
		
		memberTreeMap.showAllMember();
		
	}

}
