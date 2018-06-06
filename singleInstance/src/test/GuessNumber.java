package test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100);
		System.out.println("电脑数字"+num);
		int guessNumber = 0;
		do{
			System.out.println("输入你猜的数字：（0~100）");
			guessNumber = scanner.nextInt();
			if(guessNumber < num){
				System.out.println("小了");
			}else if(guessNumber > num){
				System.out.println("大了");
			}else{
				System.out.println("猜对了！");
			}
		}while(num != guessNumber);
	}
}
