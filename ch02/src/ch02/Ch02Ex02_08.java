package ch02;

import java.util.*;

public class Ch02Ex02_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		float num = Float.parseFloat(input);
		float num2 = Float.parseFloat(input2);
		//double num = Double.parseDouble(input);
		//double num2 = Double.parseDouble(input2);
	    
		
		System.out.printf("%.2f%n",num);
		System.out.printf("%.2f%n",num2);
		System.out.println(input3);
		//System.out.printf("%s",input3);


	}

}
