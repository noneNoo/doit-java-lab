package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// ���� �������̽� x������ �����ϸ� x���� ������ �޼��常 ��� ����
		X xClass = mClass;
		xClass.x();
		
		// ���� �������̽� y������ �����ϸ� y���� ������ �޼��常 ��� ����
		Y yClass = mClass;
		yClass.y();
		
		// ������ �������̽��� ������ �����ϸ�
		// �������̽��� ����� ��� �޼��� ��� ����!
		MyInterface iClass = mClass;
		iClass.x();
		iClass.y();
	}

}
