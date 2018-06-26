package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [] alpa = scanner.nextLine().split(" ");
		
		
		for(int i = alpa.length-1; i>=0; i-- ) {
				
	
		System.out.print(alpa[i]+" ");
		}
	}

}
