package ch05;

import java.util.Scanner;

public class ch05Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char num = scanner.nextLine().charAt(0);
		
		char[]abc = new char[10];
		
		for(int  i= 0; i< abc.length; i++) {
			num += i-'A';
			System.out.print(num);
			
		}
		
		
		
	}

}
