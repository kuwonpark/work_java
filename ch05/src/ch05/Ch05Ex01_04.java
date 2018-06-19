package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {

		int[] score = new int [100];

		for(int i = score.length-1; i >= 0; i--) {

			Scanner scanner = new Scanner(System.in);
			String num = scanner.nextLine();

			// 입력 받은 정수를 배열에 저장 중요

			//num은 String 타입이라 인트형으로 바꿔 주어야함
			score[i] = Integer.parseInt(num);

			//0이 입력되면 반복 종료
			if(Integer.parseInt(num) == 0) {
				break;
			}
		}

		// 나중에 입력된 정수 부터 차례 대로 출력
		for(int i = 0;  i < score.length; i++) {
			int tmp = score[i];
			if(tmp !=0) {

				System.out.print(tmp + " ");
			}
		}
	}
}


