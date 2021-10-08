package collection;

// ȸ�� ���� ���α׷����� ����� Member Ŭ����
public class Member {
	// �Ӽ� �ʵ�
	private int memberID;	// ȸ�� ���̵�
	private String memberName;	// ȸ�� �̸�
	
	//������
	public Member(int memberID, String memberName) {
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
}
