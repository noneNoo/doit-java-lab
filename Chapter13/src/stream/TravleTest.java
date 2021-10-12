package stream;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {

	public static void main(String[] args) {
		TravelCustomer customerSoi = new TravelCustomer("����", 24, 100);
		TravelCustomer customerUsaming = new TravelCustomer("����", 9999, 10);
		TravelCustomer customerAnzu = new TravelCustomer("����", 17, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerSoi);
		customerList.add(customerUsaming);
		customerList.add(customerAnzu);
		
		// 1. �� ��� �߰��� ������� ���
		customerList.stream().map(c -> c.getName()).forEach(item -> System.out.println(item));
		System.out.println(" === ");
		
		// 2. �� ���� �� ���
		System.out.println(customerList.size() + "���� ���� �� ���� :" + 
		customerList.stream().mapToInt(c -> c.getPrice()).sum() + "�����Դϴ�.");
		System.out.println(" === ");
		
		// 3. 20�� �̻��� ���� �̸��� ������ ���
		
		// 20�� ���ϴ� �ɷ���
		customerList.stream().filter(c -> c.getAge() > 20).
		// �ɷ��� ���� �̸��� ������
		map(c-> c.getName()).
		// �̸� �������� ����
		sorted().forEach(item -> System.out.println(item));
	}

}
