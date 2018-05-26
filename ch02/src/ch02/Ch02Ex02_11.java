package ch02;

import java.util.*;

public class Ch02Ex02_11 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num;
		double num2;
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		num = Float.parseFloat(input);
		num2 = Float.parseFloat(input2);
		
		//double result = num+ num2;
		
		System.out.printf("%10.2f %10.2f %10.2f",num,num2,num+num2);
		
		//System.out.printf("%10.2f %10.2f %10.2f",num,num2,result);

		
		

	}

}
