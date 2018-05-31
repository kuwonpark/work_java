package ch03;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 String input = scanner.nextLine();
		 String input2 = scanner.nextLine();
		 
		 int num = Integer.parseInt(input);
		 int num2 = Integer.parseInt(input2);
		 
		 int a = num+100;
		 int b = num2;
		 int c = 10;
		 
		 System.out.printf("%d %d", a, b%c);
		
		
	}

}
