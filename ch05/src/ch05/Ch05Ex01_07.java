package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] num = scanner.nextLine().split(" ");
		
		// 1 이상 10000미만의 정수가 발견 되면 프로그램 종료

		for(int i = 0; i< num.length; i++) {
			int num1 = Integer.parseInt(num[i]);

			//1000 이상의 정수가 발견되면
			if(!(1<= num1 && num1 <= 10000)) {
				return; // 메소드 종료
			}
		}

		// 100 미만의 수중 가장 큰 수를 저장하는 변수 max 선언
		int max = 100;


		// 100 이상의 수중 가장 작은 수를 저장하는 변수 min 선언
		int min = 100;


		//num 배열의 수를 하나씩 꺼내면서 비교하기
		for(int i = 0; i < num.length; i++) {
			int num1 = Integer.parseInt(num[i]);

			if(num1 < 100) { // 100 이하의 수 중 가장 큰수 출력 하는 식
				if(max==100) {
					max = num1;
				}
				else{

					max = max > num1 ? max : num1;
				}
			}
			else {// 100 이상의 수 중 가장 작은 수 출력 하는 식
				if(min== 100) {
					min = num1;
				}
				else {

					min = min < num1? min : num1;
				}
			}
		}

		// 만약 max와 min값
		System.out.println(max+" "+min);
	}

}
