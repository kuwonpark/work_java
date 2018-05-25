package ch02;

import java.util.*;

public class Test1 {
	public static void main(String[]args) {
				
		
		Scanner scanner = new Scanner(System.in); //
		System.out.print("1.Scanner을 이용해서 2자리 정수를 입력받으세요.");
		String input = scanner.nextLine();// String input은 문자열로 변경
		int num = Integer.parseInt(input); //Integer.parseInt(Input) 는  문자열로 변경된 값을  int (정수)로 다시 바꿔준다
		System.out.print("2.입력받은 정수를 printf 메소드를 이용해서 10진수,8진수, 16진수로 출력하세요.");
		System.out.printf("%n10진수 %d%n", num);
		System.out.printf("8진수 %o%n", num);
		System.out.printf("16진수 %x%n", num);
	 		
		
				
		
	}

}
