package collection.treeset;
import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberSoi = new Member(1001, "����");
		Member memberKirari = new Member(1005, "Ű��");
		Member memberChiyoko = new Member(1003, "ġ����");
		Member memberAnzu = new Member(1004, "����");
		
		memberTreeSet.addMember(memberSoi);
		memberTreeSet.addMember(memberKirari);
		memberTreeSet.addMember(memberChiyoko);
		memberTreeSet.addMember(memberAnzu);
		
		memberTreeSet.showAllMember();
		
		memberTreeSet.addMember(new Member(1002, "���ε༭"));
		
		memberTreeSet.showAllMember();
	}

}
