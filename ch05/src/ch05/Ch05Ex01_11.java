package ch05;

import java.util.Scanner;

public class Ch05Ex01_11 {
	public static void main(String[] args) {
		// 10의자리 숫자의 개수를 저장하는 배열생성
		int [] counter = new int [10];

		//무한 반복
		while(true) {
			// 한줄에 하나씩 입력 받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			//0이 입력되면 반복문 종료
			if(num == 0) {
				break;
			}

			//십의 자리 수 구하기
			int ten = num / 10;
			counter[ten]++;
		}

		for(int i = 0; i< counter.length; i++) {
			if(counter[i] !=0) {
				System.out.printf("%d : %d%n",i,counter[i]);
			}
		}
	}

}
