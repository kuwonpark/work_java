package ch04;

import java.util.*;

public class Ex02_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int odd = 0;
		int even = 0;
		int num = 0;
		
		while(true) {
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num%2 == 0 && num%2 != 0){
			 odd += num;
			}else if(num%3 == 0 && num%3 != 0){
				 odd += num;
			}else if(num == 0) {
				even += num;
			}else {
				
			}
			System.out.println("odd:"+odd+"even:"+even);
		
		}
		
		

	}

}
