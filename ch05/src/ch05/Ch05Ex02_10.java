package ch05;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		// 사람의 수를 입력받기
		Scanner scanner= new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		
		// 입력받은 사람의 수가 20초과일경우 프로그램 종료
		if(count>20) {
			return;
		}
		// 입력받은 사람의 수를 이용하여 점수를 저장할 배열 생성
		int []score = new int[count];
		
		//정수들을 입력받기
		String[] tmp = scanner.nextLine().split(" ");
		
		//tmp 배열은 타입이 String 이므로 int 형으로 변경하여 score배열에 저장
		for(int i = 0; i<tmp.length; i++) {
			score[i] = Integer.parseInt(tmp[i]);
		}
		//버블정렬
		for(int  i=0; i<score.length-1; i++) {
			boolean changed = false;
			
			for(int j =0; j<score.length -1-i; j++) {
				if(score[j]>score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1]= temp;
					changed = true;
							
				}
			}
			if(!changed)break;
		}
		//버블정렬이 끝나면 오름차순으로 정렬디기 떄문에 배열을 뒤에서 부터 출력하면
		//내림차순으로 출력된다
		for(int i = score.length-1; i>=0; i--) {
			System.out.println(score[i]);
		}
		
	}

}
