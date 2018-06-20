package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [] num = scanner.nextLine().split(" ");
		
		// 전체 배열을 검사 해서 1000 이상의 정수가 발견 되면 프로그램 종료
		for(int i = 0; i< num.length; i++) {
			int num1 = Integer.parseInt(num[i]);
			
			//1000 이상의 정수가 발견되면
			if(num1 >= 1000) {
				return; // 메소드 종료
			}
		}
		
		//배열의 개수가 10개가 아니면 프로그램 종료
		if(num.length != 0 ) {
			return;
		}
		
		// 가장 작은 수를 저장하는 변수 생성 초기값은 배열의 첫번째 값
		int min = Integer.parseInt(num[0]);;
		
		// numbers 배열에서 문자열 하나씩 끄집어 내기
		for(int i = 1; i < num.length; i++ ) {
			int num1 = Integer.parseInt(num[i]);
			
			min = min < num1 ? min : num1;
				
		}
		
		// 가장 작은 수는 min 변수에 담기게 되므로
		System.out.println(min);
	}

}
