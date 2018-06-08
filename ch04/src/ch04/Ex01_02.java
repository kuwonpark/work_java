package ch04;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int num = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		int result = num2+100-num;
		
		if(result>0) {
			System.out.printf("%d%nObesity",result);
		}

	}

}
