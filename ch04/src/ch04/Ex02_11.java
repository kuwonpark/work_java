package ch04;

import java.util.Scanner;

public class Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Base = ");
			int Base = Integer.parseInt(scanner.nextLine());
			
			System.out.print("Height = ");
			int Height = Integer.parseInt(scanner.nextLine());
			
			System.out.printf("Triangl area = %.1f%n",Base*Height/2.0);
			
			// 반복할 것인지 묻기
			System.out.print("countinue? ");
			
			//문자열 입력받기
			String answer = scanner.nextLine();
			
			// 특정조건 equalsIgnoreCase()
			//괄호안에 대소문자 구별없이 
			//변수와 값이 같다면 true 아니며ㅑㄴ false
			
			if(!answer.equalsIgnoreCase("Y")) {
				break;
			}
		}

	}

}
