package witharraylist;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 기본 생성자
	public Customer() {
		// 자동으로 고객 등급과 보너스 푄트 적립률을 지정하는 함수 호출
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	// 등급 : 실버, 적립율: 0.01 (1%)
	// 생성자에서만 호출되는 메서드이므로 private로 선언한다
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	// 상품 가격을 매개변수로 받아와 적립할 포인트를 계산하여 저장하는 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		// 일반 가격 리턴
		return price;
	}
	
	// 고객 정보 호출 메서드
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	// getter
	public int getId() {
		return customerID;
	}
	
	public String getName() {
		return customerName;
	}
	
	public String getGrade() {
		return customerGrade;
	}
	
	// setter
	public void setId(int customerID) {
		this.customerID = customerID;
	}
	
	public void setName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}