package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member memberSoi = new Member(1001, "����");
		Member memberKirari = new Member(1002, "Ű��");
		Member memberUsaming = new Member(1003, "����");
		Member memberAnzu = new Member(1004, "����");
		
		memberHashSet.addMember(memberSoi);
		memberHashSet.addMember(memberKirari);
		memberHashSet.addMember(memberUsaming);
		memberHashSet.addMember(memberAnzu);
		memberHashSet.showAllMember();
		
		// ���̵� �ߺ� ȸ�� �߰�
		memberHashSet.addMember(new Member(1001, "���ε༭"));
		memberHashSet.showAllMember();
		
	
	}

}
