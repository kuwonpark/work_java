package ch04;

import java.util.*;

public class Ex02_04 {

	public static void main(String[] args) {

		int sum = 0; // 총합
		int count = 0; // 현재 합한 수의 개수

		//조건 무한 반복
		while(true) {
			//정수 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			//입력받은 숫자 더하기
			sum += num;

			//카운트 증가
			count++;
			if(num>=100) {
				break;
			}
		}
		System.out.printf("%d%n%f", sum ,sum/(double)count);

	}

}
