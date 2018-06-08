package ch04;

import java.util.Scanner;

public class Ex01_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers = scanner.nextLine().split(" ");
		int num2 = Integer.parseInt(numbers[0]);
		
		char ch = ' ';
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		
		
		
		
		if(ch == 'M' && num2 >=18) {
			System.out.println("MAN");
		}else if(ch == 'M' && num2 < 18){
			System.out.println("BOY");
		}
		if(ch == 'F' && num2 >=18) {
			System.out.println("WOMAN");
		}else if(ch == 'F' && num2 < 18) {
			System.out.println("GIRL");
		}

	}

}
