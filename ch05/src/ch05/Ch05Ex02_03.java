package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String [] num = scanner.nextLine().split(" ");
		
		int odd = 0;
		int even = 0;
	
		for(int i = 0; i <num.length; i++) {
			int a = Integer.parseInt(num[i]);
			if(i%2==0) {
				odd += a;
			}
			else {
				even += a;
			}
		}
		System.out.printf("odd : %d%neven : %d%n",odd,even);
	}

}
