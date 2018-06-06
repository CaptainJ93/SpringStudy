import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Admin admin = new Admin();
		System.out.println("请输入学生人数");
		Student students[] = new Student[scanner.nextInt()];

		while(true){
			System.out.println("--输入要执行的操作--");
			System.out.println("10.新增学生");
			System.out.println("11.查找学生");
			System.out.println("12.根据编号修改学生信息");
			System.out.println("13.根据编号删除学生");
			System.out.println("14.根据编号输入学生哥们成绩");
			System.out.println("15.根据某门成绩排序");
			System.out.println("16.根据总分排序");
			System.out.println("99.退出");
			int input = scanner.nextInt();
			if(input == 10){
				System.out.println("输入姓名");
				String name = scanner.next();
				System.out.println("输入年龄");
				int age = scanner.nextInt();
				students = admin.create(name,age,students);
				admin.printStudents(students);
			}else if(input == 11){
				System.out.println("查找学生，输入学生编号：");
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
