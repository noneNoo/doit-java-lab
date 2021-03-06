package inheritance;

public class Customer {
	// 고객 정보 멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	// 보너스 관련 멤버변수
	int bonusPoint;
	double bonusRatio;
	
	// 기본 생성자
//	public Customer() {
//		
//		// 디폴트 등급, 적립비율을 기본 적용
//		customerGrade = "SILVER";
//		bonusRatio = 0.01; 
//		System.out.println("Customer() 생성자가 호출되었습니다.");
//	}
	
	// 생성자 오버라이딩 (아이디, 이름 매개변수로 받음)
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
//		System.out.println("Customer() 생성자가 호출되었습니다.");
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
	
	// 상품 가격을 받아와 적립할 포인트를 계산한다.
	public int calcPrice(int price) {
		// 보너스 포인트 = 기존 보너스 포인트 + (상품 가격 * 보너스 비율);
		bonusPoint += price * bonusRatio;
		// 일반 고객은 할인가로 판매 안하지롱! 그냥 가격 리턴
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
