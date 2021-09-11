package chapter5;

import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	Calendar time = Calendar.getInstance();


	public MyDate() {
	}

	// ������ �����
	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void isValid() {
		if(this.isValid) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
	
	
	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	
	public void setYear(int year) {
		// ���� �⵵�� �ʰ��� ���� ���Թ��� �� false
		if(time.get(Calendar.YEAR) < year) {
			isValid = false;
		} else {
			this.year = year;
		}
	}


	public int getDay() {
		return day;
	}


	// 28��, 29��, 30��, 31���� ��츦 switch case�� ������
	public void setDay(int day) {
		switch(this.month) {
		// 31�ϱ����� ���� �ϼ��� �̻��� ���� ���
		case 1,3,5,7,8,10,12 :
			if(day > 31 || day <= 0) {
				isValid = false;
			} else {
				this.day = day;
			}
		break;
		case 4, 6, 9, 11 :
			if(day > 30 || day <= 0) {
				isValid = false;
			} else {
				this.day = day;
			}
		// 2���� ��� ���⸶�� �ִ����� 29�Ϸ� �þ
		case 2:
			if(day <= 0) {
				isValid = false;
			}else if(year % 4 == 0 && day < 30) {
				this.day = day;
			} else if(day < 29) {
				this.day = day;
			} else {
				isValid = false;
			}
		}
	}
	
}