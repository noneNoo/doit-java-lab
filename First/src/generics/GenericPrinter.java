package generics;

// Generic Ŭ���� ����
// ������ �ڷ����� ���� �޾ƿ��� ���� �����ϱ� ���� ����� �� �ִ� �ڷ����� ������ �ξ���.
// Material Ŭ������ ��ӹ��� ���� T �ڷ����� �ҷ��� ��� ������ �߻�!
// �̷��� �����ϸ� ��ӹ��� Material Ŭ������ �޼��嵵 �̿� �����ϴ�! 
public class GenericPrinter<T extends Material> {
	
	// T �ڷ������� ��� ����
	private T material;
	
	
	// �޾ƿ� T�ڷ��� ������ �޼��忡 Ȱ���� '���׸� �޼���'
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	// extends�ؿ� ���� Ŭ���� Material�� �޼��� ȣ�� ����
	public void printing() {
		material.doPrinting();
	}
}
