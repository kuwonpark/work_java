package ch04;

import java.util.*;

public class Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers = scanner.nextLine().split(" ");
		int num = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		for(int i = 1; i <= num; i++) {
		for(int j = 1; j <= num2; j++) {
			System.out.print(j*i + " ");
			
		}
		System.out.println();
		}
	}

}
