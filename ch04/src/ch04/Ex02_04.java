package ch04;

import java.util.*;

public class Ex02_04 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		num = 1;

		
		while(num<=100) {
			sum += num;
			num++;
			
			
		}
			System.out.println(sum);
		

	}

}
