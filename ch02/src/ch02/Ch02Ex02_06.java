package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		float num = Float.parseFloat(input);
		System.out.printf("%4.1fyd = %5.1fcm\n",num,num* 91.44 );
		String input2 = scanner.nextLine();
		float num2 = Float.parseFloat(input2);
		System.out.printf("%4.1fin = %5.1fcm\n",num2,num2*2.54);	

	}

}
