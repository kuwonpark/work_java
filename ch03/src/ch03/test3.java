package ch03;

import java.util.*;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		//int num = Integer.parseInt(scanner.nextLine());
		//int num2 = Integer.parseInt(scanner.nextLine());
		
		int x = num++*--num2;
		//int a = num++;  = a에는 num이 1증가하기 전값이 저장
		//int b = --num2; = n에는 num2가 1감소후 저장
		//int nul = a*b;		
		
		
		System.out.printf("%d %d %d%n",num,num2,x);
		//System.out.printf("%d %d %d%n", num,num2,nul);


	}

}
