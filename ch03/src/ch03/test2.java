package ch03;

import java.util.*;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		//int num = Integer.parseInt(scanner.nextLine());
		
		
		System.out.printf("%d%n", num++);
		System.out.println(++num);
		// System.out.println(num++);
		//++num;
		//System.out.println(num);
		
		
	}

}
