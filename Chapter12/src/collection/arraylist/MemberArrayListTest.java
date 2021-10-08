package collection.arraylist;
import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// Member클래스형을 기본으로 하는 ArrayList를 생성함
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberSoi = new Member(1001, "소이");
		Member memberDaezui = new Member(1002, "대쥐");
		Member memberDanBam = new Member(1003, "단밤");
		Member memberAnzu = new Member(1004, "후타바 안즈");
		
		// 회원 추가 메서드 테스트
		memberArrayList.addMember(memberSoi);
		memberArrayList.addMember(memberDaezui);
		memberArrayList.addMember(memberDanBam);
		memberArrayList.addMember(memberAnzu);
		
		// 회원 열람 메서드 테스트
		memberArrayList.showAllMembers();
		
		// 회원 제거 메서드 테스트
		memberArrayList.removeMember(1001);
		
		// 확인
		memberArrayList.showAllMembers();
		
		// 엉뚱한 회원 제거 테스트
		memberArrayList.removeMember(2000);
		
		
		// Alone Coding 테스트
		// 특정 위치에 회원 추가 테스트
		memberArrayList.insertMember(memberSoi, 0);

		memberArrayList.showAllMembers();
	}

}
