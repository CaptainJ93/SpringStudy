import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Admin admin = new Admin();
		System.out.println("������ѧ������");
		Student students[] = new Student[scanner.nextInt()];

		while(true){
			System.out.println("--����Ҫִ�еĲ���--");
			System.out.println("10.����ѧ��");
			System.out.println("11.����ѧ��");
			System.out.println("12.���ݱ���޸�ѧ����Ϣ");
			System.out.println("13.���ݱ��ɾ��ѧ��");
			System.out.println("14.���ݱ������ѧ�����ǳɼ�");
			System.out.println("15.����ĳ�ųɼ�����");
			System.out.println("16.�����ܷ�����");
			System.out.println("99.�˳�");
			int input = scanner.nextInt();
			if(input == 10){
				System.out.println("��������");
				String name = scanner.next();
				System.out.println("��������");
				int age = scanner.nextInt();
				students = admin.create(name,age,students);
				admin.printStudents(students);
			}else if(input == 11){
				System.out.println("����ѧ��������ѧ����ţ�");
				int no = scanner.nextInt();
				admin.select(no,students);
			}else if(input == 12){
				
			}else if(input == 13){
				
			}else if(input == 14){
				
			}else if(input == 15){
				
			}else if(input == 16){
				
			}else{
				
			}
		}
	}

}
