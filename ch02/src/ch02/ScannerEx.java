package ch02;

import java.util.*;

public class ScannerEx {
	
	
	public static  void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해 주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용: "+ input);
		System.out.printf("num=%d%n", num);
	}

}
//system out 표준 출력
//system in 표준 입력