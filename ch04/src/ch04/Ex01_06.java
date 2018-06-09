package ch04;

import java.util.Scanner;

public class Ex01_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers = scanner.nextLine().split(" ");
		String spell= numbers[0];
		int num2 = Integer.parseInt(numbers[1]);
				
		
		if(spell.equals("M") && num2 >=18) {
			System.out.println("MAN");
		} if(spell.equals("M") && num2 < 18){
			System.out.println("BOY");
		}
		if(spell.equals("F") && num2 >=18) {
			System.out.println("WOMAN");
		} if(spell.equals("F") && num2 < 18) {
			System.out.println("GIRL");
		}

	}

}
