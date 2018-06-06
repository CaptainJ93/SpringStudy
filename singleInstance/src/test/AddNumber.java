package test;

import java.util.Scanner;

public class AddNumber {
	public static void main(String[] args){
		System.out.println("ÇëÊäÈëÊı×Ö£º");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for(int i =0, j =input; i <= j ; i++,j--){
			System.out.println(i+" + "+j+" = "+(i+j));
		}
	}
}
