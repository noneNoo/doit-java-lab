package constructor;

// Person ��ü�� �����ϴ� ������ �����
public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}; // ����Ʈ ������. �ƹ��� ���� ���̵� ������ ȣ���� �����ϰԲ� �Ѵ�.
	
	// ������ �����ε�
	// �Ű������� �̸��� �Է¹��� �� ������� name�� ���� �����ϰ� �ν��Ͻ��� �ʱ�ȭ�Ѵ�.
	public Person(String pName) {
		name = pName;
	}
	
	// �Ű������� �������� ���� ������ �ޱ�
	public Person(String pName, float pHeight, float pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
}
