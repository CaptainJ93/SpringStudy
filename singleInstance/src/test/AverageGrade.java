package test;

import java.util.Scanner;

public class AverageGrade {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int studentNum = scanner.nextInt();
		int i = 1;
		Double sum = (double) 0;
		while(i <= studentNum){
			System.out.println("�������"+i+"��ѧ���ɼ���");
			sum = sum + scanner.nextInt();
			i++;
		}
		Double avg = sum/studentNum;
		System.out.println("ƽ���ɼ�Ϊ��"+avg);
	}
}
