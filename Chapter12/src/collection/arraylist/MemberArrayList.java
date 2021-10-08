package collection.arraylist;
import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;
// ��� ����Ʈ�� �����ϴ� ArrayList �޼���
// 1. �߰��ϰ� (C)
// 2. ����� (D)
// 3. �����ϴ� (R)
// �� 3������ �޼��带 �����Ѵ�.

public class MemberArrayList {
	// ArrayList ����
	private ArrayList<Member> arrayList;
	
	
	// ������
	public MemberArrayList() {
		// Member���� ArrayList�� �����Ͽ� ��������� �Ҵ�
		arrayList = new ArrayList<Member>();
	}
	
	// 1. add �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 1-2 Ư�� ��ġ�� add �ϴ� �޼���
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	// 2. remove �޼���
	// �켱 ������ ����� �ִ��� �˻���� �ؾ� �Ѵ�. ���� boolean ������ �޼��带 ����.
	public boolean removeMember(int memberID) {
//		// for���� ���鼭 ȸ�� ���̵� �ϳ��ϳ��� �Ű������� ���̵� ��
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempID = member.getId();
//			
//			// ȸ�� ���̵� �Ű������� ���̵�� ��ġ�Ѵٸ�
//			if(tempID == memberID) {
//				// �ش� ȸ���� ����
//				System.out.println(member.getName()+ "�� �����մϴ�.");
//				arrayList.remove(i);
//				System.out.println();
//				return true;
//			}
//		}
		// for �� ��� �ݺ��� �޼��� �̿�
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getId();
			
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;
			}
		}

		// �ݺ����� ���� ������ �Ű������� ���� ���̵� ã�� ���� ���
		System.out.println("���̵� " +memberID + "�� ȸ���� �������� �ʽ��ϴ�. ���� �� �����ϴ�.");
		System.out.println();
		return false;
	}
	
	// 3. ArrayList�� ��� ����� ������ ����ϴ� �޼���
	public void showAllMembers() {
		System.out.println("��ü ȸ���� �����մϴ�. ��" + arrayList.size() + "��.");
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
