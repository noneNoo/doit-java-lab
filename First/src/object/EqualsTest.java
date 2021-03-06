package object;

class Student{
	int studentID;
	String studentName;
	
	// 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// 메서드 오버라이딩
	public String toString() {
		return studentID + ", " + studentName;
	}
	
	// equals 메서드 오버라이딩
	public boolean equals(Object obj) {
		// 인자로 들어온 인스턴스를 학생형으로 형변환한다.
		Student std = (Student)obj;
		
		if(obj instanceof Student) {
			
			// 학생 아이디값이 같으면 같은 학생으로 인식한다.
			if(this.studentID == std.studentID) {
				System.out.println("아이디까지 같아서 동일인물임");
				System.out.println("========");
				return true;
			} else {
				System.out.println("학생 아이디가 달라 글내려..");
				System.out.println("========");
				return false;
			}
		} else {
			System.out.println("형이 다른넘을 넣었군... 오류발생");
			System.out.println("========");
			return false;
		}
	}
	
	public int HashCode() {
		return studentID;
	}
	
}

// Equals Test 실행함수
public class EqualsTest {
	public static void main(String[] args) {
		// 인스턴스 생성
		Student studentSoi = new Student(100, "박소이");
		Student studentSoiCopy = studentSoi; // 인스턴스 복사
		//위의 두 인스턴스는 힙메모리에서 같은 주소값을 가리키게 된다.
		
		Student studentSoi2 = new Student(100, "박소이");
		Student studentAnzu = new Student(200, "후타바 안즈");
		
		studentSoi.equals(studentAnzu);

		// ===============
		// 1. 인스턴스의 복제본과 원본의 비교
		// 1-1. == 기호로 '물리적으로' 힙메모리의 '주소값'까지 비교.
		if(studentSoi == studentSoiCopy) {
			System.out.println("StudentSoi 와 Copy의 주소는 같습니다.");
		} else {
			System.out.println("StudentSoi 와 Copy의 주소는 다릅니다");
		}
		
		// 1-2. 인스턴스의 equals로 두 값이 일치하는지 (논리적인)비교
		// equals() 메서드
		if(studentSoi.equals(studentSoiCopy)) {
			System.out.println("StudentSoi와 Copy는 동일합니다.");
		} else {
			System.out.println("StudentSoi와 Copy는 동일하지 않습니다.");
		}

		// ===============
		// 2. 논리적으로 일치하는 값을 가진 인스턴스끼리 비교
		// 2-1. == 기호로 '물리적으로' 힙메모리의 '주소값'까지 비교.
		if(studentSoi == studentSoi2) {
			System.out.println("studentSoi와 studentSoi2의 주소는 같습니다.");
		} else {
			System.out.println("studentSoi와 studentSoi2의 주소는 다릅니다.");
		}

		// 2-2. 인스턴스의 equals로 두 값이 일치하는지 (논리적인)비교
		if(studentSoi.equals(studentSoi2)) {
			System.out.println("studentSoi와 studentSoi2는 동일합니다");
		} else {
			System.out.println("studentSoi와 studentSoi2는 동일하지 않습니다.");
		}
		
		// =====
		
		System.out.println(studentSoi.HashCode());
		System.out.println(studentSoi2.HashCode());
		System.out.println(studentAnzu.HashCode());
		
		System.out.println("=====");

		// 실제 인스턴스의 주소값
		System.out.println(System.identityHashCode(studentSoi));
		System.out.println(System.identityHashCode(studentSoi2));
		
		
	}

}
