package ch03;

import java.util.*;

public class test4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	String input = scanner.nextLine();
	String input2 = scanner.nextLine();

	int num = Integer.parseInt(input);
	int num2 = Integer.parseInt(input2);
	// int num = Integer.parseInt(scanner.nextLine());
	// int num2 = Integer.parseInt(scanner.nextLine());
	
	System.out.printf("%b%n", num==num2);
	System.out.printf("%b%n", num!=num2);
	//System.out.println(num==num2);	
	//System.out.println(num!=num2);	
	}
	
	
}
