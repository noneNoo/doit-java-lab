package collection.hashset;


import java.util.HashSet;
import java.util.Iterator;

// ����� �ҷ�����
import collection.Member;

public class MemberHashSet {
	// Member������ ������ �����ڷᱸ���� ���� �κ� ����.
	private HashSet<Member> hashSet;
	
	// ������! ������ �ϸ� �����ڷᱸ���� �����ȴ�.
	public MemberHashSet() {
		// hashSet �����ڷᱸ�� ����
		hashSet = new HashSet<Member>();
	}
	
	// 1. ȸ�� �߰� ���
	// �ߺ��Ǵ� ���̵� �߰��� ��
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	// 2. ȸ�� ����� ���
	public boolean removeMember(int memberID) {
		// hashSet�� �Ϲ� �迭�� �ٸ��� �����ڷᱸ���̱� ������
		// 1. ���� ������ �� ���� 2. �ߺ����� �ʴ´�
		// ���� �迭�� �� �� for���� �ƴ� Iterator�� ����Ѵ�.
		
		// hashSet(����)�� ��ȯ�� �� �ְ� Member��ü�� �̷���� Iterator ���� ����
		Iterator<Member> ir = hashSet.iterator();
		
		// ���տ� ������Ұ� �����ϸ� true
		// ���̻� ���� ��Ұ� ���� �� false�� ��ȯ�ϸ� while���� �����
		while(ir.hasNext()) {
			// member ��Ҹ� ��ȯ.
			Member member = ir.next();
			int tempID = member.getId();
			
			if(tempID == memberID) {
				
				System.out.println(member.getName() + "�� �����մϴ�.");
				
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// 3. ȸ�� ���� ���
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println("�� "+ hashSet.size() + "���Դϴ�.");
	}
	
	
}
