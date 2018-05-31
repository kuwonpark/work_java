package ch03;

import java.util.*;

public class testtt2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		int x = num/num2;
		double y = (double)num;
		
		System.out.printf("%d %.2f", x,y/num2);
		
	}

}
