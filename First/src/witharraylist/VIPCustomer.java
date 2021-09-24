package witharraylist;


// Customer 클래스 상송받아 그 속성을 받아옴
public class VIPCustomer extends Customer {
	// 추가 멤버변수 선언
	private int agentID;	// VIP 전용 상담원 ID
	double saleRatio;		// VIP 전용 할인율
	
	// VIP 고객 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// 상위 클래스를 가리키는 예약어 super(this와 사용법이 같다)
		// Customer() 생성자에 아이디와 이름을 넘겨준다.
		super(customerID, customerName);

		this.agentID = agentID;	// 상담원 ID 배정
		customerGrade = "VIP";	// 등급 새로 지정
		bonusRatio = 0.05;		// 5% 적립
		saleRatio = 0.1;		// 10% 할인
	}
	
	// VIP 전용 할인율 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		// 할인된 가격을 리턴한다. (소수의 값을 지불할 수 없기 때문에 int형변환 필요)
		return (int)(price - price * saleRatio);
	}
	
	public String showCustomerInfo() {
		// super로 부모의 메서드 불러와서 추가로 리턴
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentId() {
		return agentID;
	}
	}
