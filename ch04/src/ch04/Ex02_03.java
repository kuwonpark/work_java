package ch04;

import java.util.*;

public class Ex02_03 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		 num = Integer.parseInt(scanner.nextLine());
		
		while(num<=100) {
			sum += num;
			num++;

						
			System.out.print(sum);
		}
		

	}

}
