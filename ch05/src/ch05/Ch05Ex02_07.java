package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		//999 나타나기 전까지 입력이 무한하므로 크기2배열생성

		int [] score = new int[2];
		
		//배열의 쳔재 인덱스 번호를 저장하는변수
		int i = 0;

		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			//배열복사
			if(i == score.length) {
				int [] tmp = new int[score.length*2];
				System.arraycopy(score, 0, tmp, 0, score.length);
				score=tmp;
			}
			
			// 입력받은 정수를 배열에 저장
			score[i]=num;
			
			//만약 999일경우 무한반복문을 빠져나옴
			if(score[i]==999) {
				break;
			}
			//배열의 인덱스번호 증가
			i++;
		}
		
		
		int max = score[0];
		int min = score[0];
		
		i =0;
		
		//배열에서 꺼낸 정수가 999 가 아닐경우 계속반복
		while(score[i]!=999) {
			min = min<score[i]? min:score[i];
			max = max>score[i]? max:score[i];
			i++;
			
		}
		

		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}

}
