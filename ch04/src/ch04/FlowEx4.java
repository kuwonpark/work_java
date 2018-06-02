package ch04;

import java.util.*;

public class FlowEx4 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';

		System.out.print("점수를 입력하세요>");
		Scanner scanner = new Scanner(System.in); //화면을 통해 입력받은 내용을 tmp에 저장
		score = scanner.nextInt();             	// 입력받은 문자열tmp을 숫자로 전환
		
		if(score >=90) {                         //score가 90보다 같거나 크면 A
			grade = 'A';
			
		} else if(score >=80) {                   //score가 80보다 같거나 크면 A
			grade = 'B';
			
		} else if (score >=70) {                   //score가 70보다 같거나 크면 A
			grade = 'C';
			
		} else {                                  // 나머지 D
			grade = 'D';
			
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");



	}

}
