package ch04;

import java.util.Scanner;

public class Ex02_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 별 증가
		for(int i = 1; i<= num; i++ ) {
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 별 감소
		for(int i = 1; i <= num -1; i++) {
			for(int j = num -1; j>= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
