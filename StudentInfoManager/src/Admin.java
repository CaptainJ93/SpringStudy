import java.util.Scanner;

public class Admin {
	public void printStudents(Student[] students){
		System.out.println("\t���\t����\t����\tJAVA\tC#\tSQL\tHTML\t�ܷ�\tƽ����");
		for(int i = 0 ; i < students.length ; i++){
			if(students[i] != null){
				System.out.println(students[i]);
			}
		}
	}
	public Student[] create(String name, int age, Student[] students) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		int index = getIndex(students);
		student.setNo(index);
		if (index == 99999) {
			System.out.println("��������");
		} else {
			students[index] = student;
		}
		return students;
	}

	public int getIndex(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				return i;
			}
		}
		return 99999;
	}
	
	public void select(int no,Student[] students){
		for(int i = 0 ; i < students.length ; i++){
			if(no == i){
				System.out.println("\t���\t����\t����\tJAVA\tC#\tSQL\tHTML\t�ܷ�\tƽ����");
				System.out.println(students[i]);
				return;
			}
		}
		System.out.println("�Ҳ���ѧ��");
	}
}
