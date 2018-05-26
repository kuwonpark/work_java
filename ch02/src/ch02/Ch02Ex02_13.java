package ch02;

import java.util.*;

public class Ch02Ex02_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
				
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		
		int sum = num+num2+num3; 
		int avg = sum/3;
		
		System.out.printf("sum = %d%n",sum);
		System.out.printf("avg = %d",avg);
		
		
		
		
	}

}
