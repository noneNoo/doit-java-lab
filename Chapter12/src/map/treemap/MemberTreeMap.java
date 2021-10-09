package map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treeMap;
	
	//������
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>();
	}
	
	
	// ȸ�� �߰�
	public void addMember(Member member) {
		treeMap.put(member.getId(), member);
	}
	
	// ȸ�� ����
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			System.out.println(memberID +"�� ȸ���� �����մϴ�.");
			treeMap.remove(memberID);
			return true;
		}
		System.out.println(memberID +"�� ȸ���� �����ϴ�.");
		return false;
	}
	
	// ȸ�� ��ü ����
	public void showAllMember() {
		// ȸ��Ű ��ȸ�ϱ� ���� ����
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		// ��ȸ
		while(ir.hasNext()) {
			int key = ir.next();
			System.out.println(treeMap.get(key));
		}
		System.out.println("�� " + treeMap.size() + "�� �Դϴ�.");
	}




}
