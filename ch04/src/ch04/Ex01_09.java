package ch04;

import java.util.Scanner;

public class Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		int num3 = Integer.parseInt(numbers[2]);
		
		int min;
		
		if(num <= num2 && num <= num3) {
			min =num;
		}else if(num2<=num3 && num2 <= num) {
			min = num2;
		}else {
			min = num3;
		}
		System.out.println(min);	
		
	}

}
