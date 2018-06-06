package test;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		int weekday = weekday(year,month);
		System.out.println(" 日    一     二     三     四     五     六  ");
		if(weekday != 7){
			for(int j = 1 ; j <= weekday ; j++){
				System.out.print("   ");
			}
		}else{
			weekday = 0;
		}
		
		int lim = 0;
		if(month == 4 || month == 6 || month == 9 || month == 11){
			lim = 30;
		}else if(month == 2){
			if((year%4 == 0 && year%100 != 0) || year%400 == 0){
				lim = 29;
			}else{
				lim = 28;
			}
		}else{
			lim = 31;
		}
		
		for(int i = 1 ; i <= lim ; i++){
			if(i < 10){
				System.out.print("0"+i + " ");
			}else{
				System.out.print(i + " ");
			}
			
			weekday++;
			if(weekday == 7){
				System.out.print("\n");
				weekday = 0;
			}
		}
	}
	public static int weekday(int year,int month){
		int sum = 0;
		for(int i = 1990 ; i <= year -1 ; i++){
			if((i%4 == 0 && i%100 != 0) || i%400 == 0){
				sum += 366;
			}else{
				sum += 365;
			}
		}
		
		for(int i =1 ; i <= month -1 ; i++){
			if(i == 4 || i == 6 || i == 9 || i == 11){
				sum += 30;
			}else if(i == 2){
				if((year%4 == 0 && year%100 != 0) || year%400 == 0){
					sum += 29;
				}else{
					sum += 28;
				}
			}else{
				sum += 31;
			}
		}
		sum += 1;
		return sum % 7;
	}
}
