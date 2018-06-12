package ch04;

import java.util.*;

public class Ex02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		
		int  sum = 0;// 총합 저장 변수
		int i = 1; // while 문을 반복할떄마다 1씩 증가하는 변수
		
		
		while( i<=num) {
			sum += i; //i 가 1씩 증가하면서 sum에 저장
			i++;
			
		}
		System.out.println(sum);
		
	}dsadsadsa
}

