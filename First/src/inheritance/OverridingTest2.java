package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "키라리", 2000);
		vc.bonusPoint = 5000;
		
		
		// 선언한 클래스형의 메서드가 아닌 인스턴스의 메서드를 호출한다. (가상메서드)
		System.out.println(vc.getName() + " 님이 지불하셔야 하는 금액은 " + vc.calcPrice(10000) + "원 입니다.");
		
		System.out.println(vc.showCustomerInfo());
	}

}
