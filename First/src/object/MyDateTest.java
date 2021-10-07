package object;

class MyDay {
	int day;
	int month;
	int year;
	
	public MyDay(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// �޼��� �������̵�
	// ���� ���̸� ���� ������ �ν��ϰԲ� equals �޼��带 ������
	
	public boolean equals(Object obj) {
		// ����ȯ �ؼ� �ҷ���
		MyDay md = (MyDay)obj;
		
		// instanceof�� 1���˻�
		if(md instanceof MyDay) {
			System.out.println("���� ��");
			
			//���� ���� ��¥�� ������
			if(this.day == md.day && this.month == md.month && this.year == md.year) {
				return true;
			
				//���� ������ ���ڴ� �ٸ���
			}else {
				return false;
			}
			
		} else {
			return false;
		}
	}
}


public class MyDateTest {
	public static void main(String[] args) {
		MyDay myDate1 = new MyDay(2004,9,21);
		MyDay myDate2 = new MyDay(2004,9,21);
		
		if(myDate1.equals(myDate2)) {
			System.out.println("�������Դϴ�.");
		} else {
			System.out.println("�ٸ����Դϴ�.");
		}
	}
}