package ch03;

import java.util.*;

public class testt4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		String input4 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input);
		int num4 = Integer.parseInt(input2);
		
		
		boolean x = num>num3; //키
		boolean y = num2>num4; // 몸무게
		boolean z = x&&y;
		
		
		
		
		System.out.printf("%b",z);
		
	}

}
