package ch02;

import java.util.*;

public class Ch02Ex02_12 {
	public static void main (String [] args) {
	Scanner scanner = new Scanner(System.in);
	
	int num;
	double num2;
	
	String input = scanner.nextLine();
	String input2 = scanner.nextLine();
	
	num = Integer.parseInt(input);
	num2 = Float.parseFloat(input2);
	//num2 = double.parsedouble(input2);
	
	//double result = num* num2;
	
	System.out.printf(" %.2f * %d = %.0f",num2,num,num*num2);
	//System.out.printf(" %.2f * %d = %.0f",num2,num,result);
	
	}

}
