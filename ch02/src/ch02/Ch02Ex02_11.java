package ch02;

import java.util.*;

public class Ch02Ex02_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		float num = Float.parseFloat(input);
		String input2 = scanner.nextLine();
		float num2 = Float.parseFloat(input2);
		System.out.printf("%10s%.2f",num,"%10s%.2f",num2,"%10s%.2f",num+num2);


		
		

	}

}
