package test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100);
		System.out.println("��������"+num);
		int guessNumber = 0;
		do{
			System.out.println("������µ����֣���0~100��");
			guessNumber = scanner.nextInt();
			if(guessNumber < num){
				System.out.println("С��");
			}else if(guessNumber > num){
				System.out.println("����");
			}else{
				System.out.println("�¶��ˣ�");
			}
		}while(num != guessNumber);
	}
}
