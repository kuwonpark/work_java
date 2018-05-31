package ch03;

import java.util.*;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		int z = num;
		int x = z*num2;
		
		z = num++;
		num2 = --num2;
		
		
		
		System.out.printf("%d %d %d%n",num,num2,x);


	}

}
