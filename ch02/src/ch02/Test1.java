package ch02;

import java.util.*;

public class Test1 {
	public static void main(String[]args) {
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Scanner을 이용해서 2자리 정수를 입력받으세요.");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println("2. 입력받은 정수를 printf 메소드를 이용해서 10진수,8진수, 16진수로 출력하세여");
		System.out.printf("%n10진수 %d%n", num);
		System.out.printf("8진수 %o%n", num);
		System.out.printf("16진수 %x%n", num);
	 		
		
				
		
	}

}
