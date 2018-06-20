package ch05;

import java.util.Scanner;

public class dsadsa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] alpa = scanner.nextLine().split(" ");
		
		char[] result = new char [alpa.length];
		for(int i = 0; i<alpa.length; i++) {
			String tmp = alpa[i];
			char tmp2 = tmp.charAt(0);
			result[i]= tmp2;
			
		}
		System.out.println();
		
	}
	
	}


