package test;

import java.util.HashSet;

public class StudentHashSet {
	HashSet<Student> hashSet;
	
	// 생성자
	public StudentHashSet() {
		hashSet = new HashSet<Student>();
	}
	
	// 학생 추가
	public void addStudent(Student student) {
		hashSet.add(student);
	}
	
	// 학생 제거
	public boolean removeStudent(int studentId) {
		for (Student student : hashSet) {
			int tempId = student.getStudentId();
			if(tempId == studentId) {
				System.out.println(student.getStudentName() + " 학생을 삭제합니다");
				hashSet.remove(student);
				return true;
			}
		}

		System.out.println(studentId + " 번 학생을 찾지 못했습니다.");
		return false;
	}
	
	public void showAllStudent() {
		for (Student student : hashSet) {
			System.out.println(student);
		}
		System.out.println("학생수는 총 " + hashSet.size() + "명입니다.");
	}
}
