package ch04;

import java.util.Scanner;;

public class Ex02_10 {
	public static void main(String[] args) {
		//1. 3의 배수와 5의 배수가 아닌 수의 개수를 저장 변수 선언 및초기화
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		if(!(num %3 ==0 || num %5 ==0)) {
			count ++;
		}
		if (num == 0) {
			break;
		}
	}
	System.out.println(count);
	
}
