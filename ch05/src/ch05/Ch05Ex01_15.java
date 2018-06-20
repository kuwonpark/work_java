package ch05;

import java.util.Scanner;

public class Ch05Ex01_15 {
	public static void main(String[] args) {
		// 각 과목 점수와 평균을 저장할 배열 생성
		int[][] score = new int[5][5];
		
		int sum = 0;


		for(int i = 0; i < 5; i++) {

			// 한 학생의 성적 입력 받기
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			//입력받은 성적을 score 배열에 정수로 저장하기
			for(int j= 0; j < numbers.length; j++) {
				score[i][j] = Integer.parseInt(numbers[j]);
				sum += score[i][j];
			}
			//평균 계산하여 배열 저장
			score[i][4]= sum /4;
		}
		
		//합격자 저장하는 변수
		int count = 0;
		
		//결과 출력
		for(int i = 0; i < 5; i++) {
			if(score[i][4] >= 80) {
				System.out.println("pass");
				count++;
			}
			else {
				System.out.println("fail");
			}
		}
		System.out.printf("Successful: %d",count);
		
	}

}
