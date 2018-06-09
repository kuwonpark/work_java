package ch04;

import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		double num = Double.parseDouble(numbers[0]);
		double num2 = Double.parseDouble(numbers[1]);
		String[] numbers2 = scanner.nextLine().split(" ");
		double num3 = Double.parseDouble(numbers2[0]);
		double num4 = Double.parseDouble(numbers2[1]);
		
		
		
		if(num >= 4.0 && num2 >= 4.0) {
			System.out.println("A");
		}else if((3.0 <= num && num < 4.0)||(3.0 <= num2 && num2 < 4.0)) {
			System.out.println("B");
		}else if(num < 3.0 || num2 < 3.0) {
			System.out.println("c");
		} 
		if(num3 >= 4.0 && num4 >= 4.0) {
				System.out.println("A");
			}else if((3.0 <= num3 && num3< 4.0)||(3.0 <= num4 && num4< 4.0)) {
				System.out.println("B");
			}else if(num3 < 3.0 || num4 < 3.0) {
				System.out.println("c");
		}

	}

}
