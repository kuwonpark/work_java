package ch02;

import java.util.*;

public class Ch02Ex02_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("height = ");
		//System.out.print("height = ");	
		
		String input = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		
		System.out.printf("Your height is %dcm%n",num);
		//System.out.printf("Your height is %dcm.",num);

	}

}
