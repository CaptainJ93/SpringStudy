package test;

import java.util.Scanner;

public class AverageGrade {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int studentNum = scanner.nextInt();
		int i = 1;
		Double sum = (double) 0;
		while(i <= studentNum){
			System.out.println("请输入第"+i+"名学生成绩：");
			sum = sum + scanner.nextInt();
			i++;
		}
		Double avg = sum/studentNum;
		System.out.println("平均成绩为："+avg);
	}
}
