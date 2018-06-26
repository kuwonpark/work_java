package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String [] kg = scanner.nextLine().split(" ");
		
		double avg = 0;
		for(int i = 0; i<kg.length; i++) {
			avg += Double.parseDouble(kg[i]);
			
		}
		//입력한 값은 배열의 크기로 알수 있으므로 배열의 크기를 나누면됨
		System.out.printf("%.1f%n",avg/kg.length);
	}

}
