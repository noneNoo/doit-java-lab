package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	// HashMapŸ�� ����
	private HashMap<Integer, Member> hashMap;
	
	// ������
	MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	
	
	// ȸ�� �߰�
	public void addMember(Member member) {
		// put(key(ȸ�����̵�), value(��ü))
		hashMap.put(member.getId(), member);
	}
	
	// ȸ�� ����
	public boolean removeMember(int memberID) {

		// ���� �߿��� �Ű������� ���� Ű���� ��ġ�� ���� ã��, ���� �� true ��ȯ
		if(hashMap.containsKey(memberID)) {
			// ���տ��� �ش� ȸ�� ����
			hashMap.remove(memberID);
			System.out.println(memberID + "�� ã�ҽ��ϴ�. �����մϴ�.");
			return true;
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		// Ű�� ��ü(hashMap.keySet())�� ��ȸ�� �� �ֵ��� �Ӽ��� ����
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		// ���� Ű ���� ������
		while(ir.hasNext()) {
			// �� Ű ���� �����ͼ�
			int key = ir.next();
			
			// �� Ű ���� �ش��ϴ� ����� �����Ͽ�
			Member member = hashMap.get(key);
			
			// ��� ���
			System.out.println(member);
		}
		
		//while���� ������
		System.out.println("�� " + hashMap.size() + "���Դϴ�.");
	}
}
