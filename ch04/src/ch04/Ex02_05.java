package ch04;

import java.util.*;

public class Ex02_05 {
	public static void main(String[] args) {
		while(true) {
			
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		int result = num/3;
		if(num%3==0 ) {
			System.out.println(result);
		}else if(result == -1){
			break;
			
		}
		
			
		}
	}

}
