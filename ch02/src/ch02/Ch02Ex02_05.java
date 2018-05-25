package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
		
	 String input = scanner.nextLine();
	 int num = Integer.parseInt(input);
	 String input2 = scanner.nextLine();
	 float num2 = Float.parseFloat(input2);
	 System.out.printf("%d*%f = %f%n",num , num2, num*num2);
		

	}

}
