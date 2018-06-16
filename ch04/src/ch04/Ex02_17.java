package ch04;

import java.util.Scanner;

public class Ex02_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());


		//숫자 저장 변수 선언
		int count = 1;

		for(int i = 0; i<=num; i++) {
			for(int j =0; j<num; j++) {
				if(j >= i) {
					System.out.print((count%10)+ " ");
					count++;


				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

	}
}



