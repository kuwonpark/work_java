package ch02;

import java.util.*;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String input = scanner.nextLine();
	int num = Integer.parseInt(input);
	System.out.printf("kor%d%n",num);	
	
	String input2 = scanner.nextLine();
	int num2 = Integer.parseInt(input2);
	System.out.printf("mat%d%n",num2);
	
	
	String input3 = scanner.nextLine();
	int num3 = Integer.parseInt(input3);
	System.out.printf("eng%d%n",num3);
		
	System.out.printf("sum%d%n",num+num2+num3);
	System.out.printf("avg%d%n",(num+num2+num3)/3);   
	
	
		

	}

}
