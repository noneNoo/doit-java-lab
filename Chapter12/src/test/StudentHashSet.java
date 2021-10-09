package test;

import java.util.HashSet;

public class StudentHashSet {
	HashSet<Student> hashSet;
	
	// ������
	public StudentHashSet() {
		hashSet = new HashSet<Student>();
	}
	
	// �л� �߰�
	public void addStudent(Student student) {
		hashSet.add(student);
	}
	
	// �л� ����
	public boolean removeStudent(int studentId) {
		for (Student student : hashSet) {
			int tempId = student.getStudentId();
			if(tempId == studentId) {
				System.out.println(student.getStudentName() + " �л��� �����մϴ�");
				hashSet.remove(student);
				return true;
			}
		}

		System.out.println(studentId + " �� �л��� ã�� ���߽��ϴ�.");
		return false;
	}
	
	public void showAllStudent() {
		for (Student student : hashSet) {
			System.out.println(student);
		}
		System.out.println("�л����� �� " + hashSet.size() + "���Դϴ�.");
	}
}
