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
	
	// 메서드 오버라이딩
	// 같은 날이면 같은 날으로 인식하게끔 equals 메서드를 재정의
	
	public boolean equals(Object obj) {
		// 형변환 해서 불러옴
		MyDay md = (MyDay)obj;
		
		// instanceof로 1차검사
		if(md instanceof MyDay) {
			System.out.println("같은 형");
			
			//형도 같고 날짜도 같을시
			if(this.day == md.day && this.month == md.month && this.year == md.year) {
				return true;
			
				//형은 같지만 날자는 다를시
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
			System.out.println("같은날입니다.");
		} else {
			System.out.println("다른날입니다.");
		}
	}
}
