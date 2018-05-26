package ch02;

import java.util.*;

public class Ch02Ex02_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		float num = Float.parseFloat(input);
		float num2 = Float.parseFloat(input2);
		double num3 = Double.parseDouble(input3);
		
		
		System.out.printf("%.3f",num);
		System.out.printf("%.3f",num2);
		System.out.printf("%.3f",num3);
		//System.out.printf("%.3f%n",num);
		//System.out.printf("%.3f%n",num2);
		
	}

}
