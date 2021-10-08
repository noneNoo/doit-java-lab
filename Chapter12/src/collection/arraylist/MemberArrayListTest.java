package collection.arraylist;
import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// MemberŬ�������� �⺻���� �ϴ� ArrayList�� ������
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberSoi = new Member(1001, "����");
		Member memberDaezui = new Member(1002, "����");
		Member memberDanBam = new Member(1003, "�ܹ�");
		Member memberAnzu = new Member(1004, "��Ÿ�� ����");
		
		// ȸ�� �߰� �޼��� �׽�Ʈ
		memberArrayList.addMember(memberSoi);
		memberArrayList.addMember(memberDaezui);
		memberArrayList.addMember(memberDanBam);
		memberArrayList.addMember(memberAnzu);
		
		// ȸ�� ���� �޼��� �׽�Ʈ
		memberArrayList.showAllMembers();
		
		// ȸ�� ���� �޼��� �׽�Ʈ
		memberArrayList.removeMember(1001);
		
		// Ȯ��
		memberArrayList.showAllMembers();
		
		// ������ ȸ�� ���� �׽�Ʈ
		memberArrayList.removeMember(2000);
		
		
		// Alone Coding �׽�Ʈ
		// Ư�� ��ġ�� ȸ�� �߰� �׽�Ʈ
		memberArrayList.insertMember(memberSoi, 0);

		memberArrayList.showAllMembers();
	}

}
