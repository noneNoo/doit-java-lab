package stream;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {

	public static void main(String[] args) {
		TravelCustomer customerSoi = new TravelCustomer("소이", 24, 100);
		TravelCustomer customerUsaming = new TravelCustomer("나나", 9999, 10);
		TravelCustomer customerAnzu = new TravelCustomer("안즈", 17, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerSoi);
		customerList.add(customerUsaming);
		customerList.add(customerAnzu);
		
		// 1. 고객 명단 추가된 순서대로 출력
		customerList.stream().map(c -> c.getName()).forEach(item -> System.out.println(item));
		System.out.println(" === ");
		
		// 2. 고객 여행 총 비용
		System.out.println(customerList.size() + "명의 여행 총 경비는 :" + 
		customerList.stream().mapToInt(c -> c.getPrice()).sum() + "만원입니다.");
		System.out.println(" === ");
		
		// 3. 20세 이상인 고객의 이름을 정렬후 출력
		
		// 20세 이하는 걸러짐
		customerList.stream().filter(c -> c.getAge() > 20).
		// 걸러진 고객중 이름을 가져와
		map(c-> c.getName()).
		// 이름 오름차순 정렬
		sorted().forEach(item -> System.out.println(item));
	}

}
