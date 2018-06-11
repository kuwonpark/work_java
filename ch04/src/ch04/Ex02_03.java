package ch04;

import java.util.*;

public class Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		while(true){
			System.out.print("정수를 입력하세요.(0:종료)>");
		
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
				
		if(num>0){
			
			System.out.println("positive integer");
			
		}else if(num<0){
			
			System.out.println("negative integer");
		}else if(num == 0) {
			break;
			
		}
		}
	}

}
