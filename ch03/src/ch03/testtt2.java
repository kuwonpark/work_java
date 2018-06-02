package ch03;

import java.util.*;

public class testtt2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String[] numbers = scanner.nextLine()split(" ")

		//int num = Integer.patseInt(nembers[0]);
		//int num2 = Integer.patseInt(nembers[1]);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);

		int x = num/num2;
		double y = (double)num;
		//double y = (double)num/num2;

		System.out.printf("%d %.2f", x,y/num2);
		//System.out.printf("%d %.2f", x,y);

	}

}
