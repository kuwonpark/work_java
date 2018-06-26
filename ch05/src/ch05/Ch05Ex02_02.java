package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] num = scanner.nextLine().split(" ");
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[2]);
		int c = Integer.parseInt(num[4]);
		
		System.out.print(a+b+c);
	}

}
