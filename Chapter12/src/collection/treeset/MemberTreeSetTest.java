package collection.treeset;
import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberSoi = new Member(1001, "소이");
		Member memberKirari = new Member(1005, "키라리");
		Member memberChiyoko = new Member(1003, "치요코");
		Member memberAnzu = new Member(1004, "안즈");
		
		memberTreeSet.addMember(memberSoi);
		memberTreeSet.addMember(memberKirari);
		memberTreeSet.addMember(memberChiyoko);
		memberTreeSet.addMember(memberAnzu);
		
		memberTreeSet.showAllMember();
		
		memberTreeSet.addMember(new Member(1002, "프로듀서"));
		
		memberTreeSet.showAllMember();
	}

}
