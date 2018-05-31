package ch03;

import java.util.*;

public class test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		
		boolean result = num>num2;
		boolean result2 = num>num3;
		boolean result3 = num==num2;
		boolean result4 = num2==num3;
		
		boolean x = result&&result2;
		boolean y = result3&&result4;
				
		System.out.printf("%b%n",x);
		System.out.printf("%b%n",y);
		
		
	}

}
