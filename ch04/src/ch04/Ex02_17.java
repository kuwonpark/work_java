package ch04;

import java.util.Scanner;

public class Ex02_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		
		for(int i = 1; i<=num; i++) {
			
			System.out.print(i);
			for(int j =0; j>i; j++) {
				System.out.print(j);
				for(int k= 0; k>j; k++) {
				
					System.out.print(k);
				}
			}
			
			}
			
			}
		}
	


