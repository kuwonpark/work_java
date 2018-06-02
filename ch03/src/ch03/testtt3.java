package ch03;

import java.util.Scanner;

public class testtt3 {
	public static void main(String[] args) {
		//String[] numbers = scanner.nextLine()split(" ")

		//int num = Integer.patseInt(nembers[0]);
		//int num2 = Integer.patseInt(nembers[1]);
		//int num2 = Integer.patseInt(nembers[2]);

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);

		double x = (double)(num+num2+num3)/3;
		//double x =(num+num2+num3)/3.0;

		System.out.printf("%.1f",x);


	};

}
