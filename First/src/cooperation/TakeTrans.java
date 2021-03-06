package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student StudentTomas = new Student("Tomas", 10000);
		
		// 노선 번호가 100인 버스 생성
		Bus bus100 = new Bus(100);
		
		// 학생 객체의 메서드로 교통수단 객체를 넘겨줌
		studentJames.takeBus(bus100);
		bus100.showInfo();
		studentJames.showInfo();
		
		
		// 2호선 지하철 생성!
		Subway subwayGreen = new Subway(2);
		
		// 학생 객체의 메서드로 교통수단 객체를 넘겨줌
		StudentTomas.takeSubway(subwayGreen);
		subwayGreen.showInfo();
		StudentTomas.showInfo();
		
		// AloneCodin
		// 에드워드쿤 지각해서 택시로 1만원 뜯겨서 슬퍼진 상황
		
		// 속상해질 에드워드쿤 생성
		Student StudentEdward = new Student("Edward", 10000);
		
		// 에드워드쿤 속상하게 만들 택시 생성
		Taxi taxi = new Taxi();
		
		// 속상할 일 발생
		StudentEdward.takeTaxi(taxi);
		
		// 나라잃은 에드워드 상태 출력
		StudentEdward.showInfo();
		
		// 김첨지 정보 출력
		taxi.showInfo();
	}

}
