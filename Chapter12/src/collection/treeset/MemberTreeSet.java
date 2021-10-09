package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	// ������
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	// ȸ�� �߰�
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	// ȸ�� ����
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getId();
			
			if(memberID == tempID) {
				System.out.println(member.getName() + "�� �����մϴ�.");
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "�� ȸ���� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println("�� " + treeSet.size() + "���Դϴ�");
	}
}
