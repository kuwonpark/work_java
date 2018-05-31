package ch03;

import java.util.*;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		
		//num = num++;
		
		System.out.printf("%d%n", num++);
		
		//num = ++num;
		System.out.println(++num);
		
		
		
	}

}
