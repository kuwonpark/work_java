package ch04;

import java.util.Scanner;



public class Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");
		int num = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		if(num<num2) {
			
			for(int i = 1; i<=9; i++) {
				for(int j = num; j <= num2; j++)
				System.out.printf("%d * %d =%3d  ",j,i,j*i);
			}
			System.out.println();
		}
		else if(num > num2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = num; j >= num2; j--) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
				}
				System.out.println();
			
		}
	}

}
}
