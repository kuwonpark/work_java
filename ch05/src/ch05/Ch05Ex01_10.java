package ch05;

import java.util.Scanner;

public class Ch05Ex01_10 {
	public static void main(String[] args) {
		// 대문자 저장할 배열 선언
		int [] counter = new int [26];
		while(true) {
			Scanner scanner = new Scanner(System.in);
			char ch = scanner.nextLine().charAt(0);


			if('A' <= ch && ch <= 'Z') {
				counter[ch - 'A']++;
			}
			// 반복 빠져나갈 조건문 작성
			else {
				break;
			}
		}
		// 대문자 개수를 저장한 배열 출력하기
		for(int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.printf("%c : %d%n", i+'A',counter[i]);
			}
		}
	}

}
