package ch03;

import java.util.Scanner;

public class testtt4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		
	    double num = Double.parseDouble(input);
		double num2 = Double.parseDouble(input2);
		double num3 = Double.parseDouble(input3);
		
		
		int x = (int)(num);
		int y =(int)(num2);
		int z =(int)(num3);
		
		
		int a = (int)(num+num2+num3)/3;
		int b = x+y+z;
		
		System.out.printf("sum%d%navg%d",b,a );
	}

}
