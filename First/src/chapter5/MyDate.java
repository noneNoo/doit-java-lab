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

	// 생성자 만들기
	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void isValid() {
		if(this.isValid) {
			System.out.println("유효한 날짜입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
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
		// 현재 년도를 초과한 값을 대입받을 시 false
		if(time.get(Calendar.YEAR) < year) {
			isValid = false;
		} else {
			this.year = year;
		}
	}


	public int getDay() {
		return day;
	}


	// 28일, 29일, 30일, 31일인 경우를 switch case로 구분함
	public void setDay(int day) {
		switch(this.month) {
		// 31일까지인 달의 일수에 이상이 있을 경우
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
		// 2월의 경우 윤년마다 최대일이 29일로 늘어남
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
