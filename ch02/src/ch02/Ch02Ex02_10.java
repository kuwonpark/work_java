package ch02;

import java.util.*;

public class Ch02Ex02_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		// 변수받아서 입력
		//int result = num+num2
		
		System.out.printf("%d + %d = %d%n",num,num2,num+num2);
		//System.out.printf("%d + %d = %d%n",num,num2,result);

		

	}

}
