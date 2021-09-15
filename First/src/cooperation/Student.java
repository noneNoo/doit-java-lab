package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	// 학생 이름과 가진 돈을 매개변수로 받는 생성자
	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	// 학생이 버스를 타면 1000원을 지불하는 메서드
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
//	 학생이 지하철을 타면 1500원을 지불하는 메서드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
		
		
	}
	
	//학생의 현재 정보를 출력하는 메서드
	public void showInfo() {
		if(money == 0) {
			System.out.println(studentName +"님의 남은 돈은 없습니다... 화이팅!");
		} else {
		System.out.println(studentName +"님의 남은 돈은 " + money +"원 입니다.");
		}
	}
}
