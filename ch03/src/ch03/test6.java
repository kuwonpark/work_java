package ch03;

import java.util.*;

public class test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		boolean result = num!=0;
		boolean result2 = num2!=0;
		
		boolean x = result&&result2;
		boolean y = result||result2;
		
		
		System.out.printf("%b %b%n",x, y);


	}

}
