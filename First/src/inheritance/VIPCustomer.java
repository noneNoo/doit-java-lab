package inheritance;

// Customer 클래스를 상속받아 그 속성들을 받아온다
public class VIPCustomer extends Customer {
	// 특별히 변화가 필요한 부분들을 새로 선언
	private int agentID;	// VIP 전용 상담원
	double saleRatio;		// VIP 전용 할인율

	// VIP 고객 생성
	public VIPCustomer(int customerID, String customerName, int agentID) {

		super(customerID, customerName);
//		super(); 	// 컴파일러가 자동으로 추가하는 코드. 상위 클래스를 자동으로 호출한다 
		
		// protected 예약어로 상속받은 클래스에서 변수를 변경 가능하게 권한을 부여함
		customerGrade = "VIP"; 
		this.agentID = agentID;
		
		// 아래의 변수는 상위 클래스에서 public으로 선언했기 때문에 문제 없이 변경이 된다.
		bonusRatio = 0.05;	// 5% 적립
		saleRatio = 0.1;	// 10% 할인

		System.out.println("VIPCustomer() 생성자가 호출되었습니다.");
	}
	
	// VIP 전용 할인율(메소드 오버라이딩) 다음장에서 구현
	
	// 상담원 getter
	public int getAgentId() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
	}
}
