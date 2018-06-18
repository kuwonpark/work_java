package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		int[] score = new int [100];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += i;
			if(num == 0) {
				break;
			}
			System.out.print(score[i]);
		}
	}

}
