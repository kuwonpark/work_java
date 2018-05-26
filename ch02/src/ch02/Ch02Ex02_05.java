package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
		
	 String input = scanner.nextLine();
	 String input2 = scanner.nextLine();
	 
	 int num = Integer.parseInt(input);
	 float num2 = Float.parseFloat(input2);
	 
	 float result = num* num2;// 변수 선언 이용
	 
	 System.out.printf("%d*%f = %f%n",num , num2, result);// 변수 이용해서 계산
		

	}

}
