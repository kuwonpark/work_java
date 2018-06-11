package ch04;

import java.util.Scanner;;

public class Ex01_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
	
		
		if (num <= num2) {
			System.out.printf("%d",num2-num);
		}else {
			System.out.printf("%d",num-num2);
		}
	}

}
