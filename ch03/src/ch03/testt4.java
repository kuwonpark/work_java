package ch03;

import java.util.*;

public class testt4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		boolean x = num>num2;
		
		
		
		System.out.printf("%b",x);
		
	}

}
