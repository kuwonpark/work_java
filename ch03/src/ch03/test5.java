package ch03;

import java.util.*;

public class test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		//int num = Integer.paresInt(scanner.nextLine());
		//int num2 = Integer.paresInt(scanner.nextLine());
		
	
		
		System.out.printf("%d>%d---%b%n",num,num2,num>num2);
		System.out.printf("%d<%d---%b%n",num,num2,num<num2);
		System.out.printf("%d>=%d---%b%n",num,num2,num>=num2);
		System.out.printf("%d<=%d---%b%n",num,num2,num<=num2);
	}

}
