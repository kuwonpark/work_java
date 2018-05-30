package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		//float num = Float.parseFloat(input);
		//float num2 = Float.parseFloat(input2);
		
		double num = Double.parseDouble(input);
		double num2 = Double.parseDouble(input2);
		
		//num num2 변수 이용하여 계산
		double fromYard = num * 91.44;
		double fromInch = num2 * 2.54;
		
		//System.out.printf("%4.1fyd = %5.1fcm%n",num,num* 91.44 );
		//System.out.printf("%4.1fin = %5.1fcm",num2,num2*2.54);
		
		System.out.printf("%.1fyd = %.1fcm\n",num,fromYard);
		System.out.printf("%.1fyd = %.1fcm\n",num2,fromInch);

	}

}
