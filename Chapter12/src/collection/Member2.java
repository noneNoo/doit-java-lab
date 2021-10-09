package collection;

// ȸ�� ���� ���α׷����� ����� Member Ŭ����
public class Member2 implements Comparable<Member2> {
	// �Ӽ� �ʵ�
	private int memberID;	// ȸ�� ���̵�
	private String memberName;	// ȸ�� �̸�
	
	//������
	public Member2(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// Id, Name Getter
	public int getId() {
		return memberID;
	}
	public String getName() {
		return memberName;
	}
	
	
	// Id, Name Setter
	public void setId(int memberID) {
		this.memberID = memberID;
	}
	public void setName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "���� ���̵�� " + memberID + "�Դϴ�.";
	}
	
	@Override
	// hashCode�� ���ID�� ��ȯ�ϰ� ������
	public int hashCode() {
		return memberID;
	}
	
	@Override
	// equals �� �� hashCode�� �˻��Ͽ�, �������� �ߺ��Ǵ� ���̵� ã�Ƴ� ���̴�.
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			
			if(this.memberID == member.memberID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}


	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		// TODO Auto-generated method stub
		return mem1.getId() - mem2.getId();
	}
}
