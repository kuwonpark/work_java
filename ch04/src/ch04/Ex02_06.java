package ch04;

import java.util.*;

public class Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		while(true){
			System.out.println("1.Korea");
			System.out.println("2.USA");
			System.out.println("3.Japan");
			System.out.println("4.China");
			System.out.println("number?");
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		
		
	if(num == 1){
		System.out.println("Seoul");
	}else if(num == 2){
		System.out.println("Washington");
	}else if(num == 3){
		System.out.println("Tokyo");
		
	}else if(num == 4) {
		System.out.println("Beijing");
		
	}
	break;

}
}
}
