package chapter4;

public class Alone2 {

	public static void main(String[] args) {
		int floor = 5;
		String place;
		
		switch(floor) {
		case 1:
			place = "�౹";
			System.out.print(floor + "���� " + place);
			break;
		case 2:
			place = "�����ܰ�";
			System.out.print(floor + "���� " + place);
			break;
		case 3:
			place = "�Ǻΰ�";
			System.out.print(floor + "���� " + place);
			break;
		case 4:
			place = "ġ��";
			System.out.print(floor + "���� " + place);
			break;
		case 5:
			place = "�ｺ Ŭ��";
			System.out.print(floor + "���� " + place);
			break;
		default:
			place = "�߸��� ����";
			System.out.print(floor + "���� " + place);
		}
		System.out.println("�Դϴ�.");
	}

}
