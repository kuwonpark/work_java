package ch05;

public class ArryEx06 {
	public static void main(String[] args) {
		int[]score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) { // i가 1인 이유는 배열 0번째 값을 맥스와 민에 저장 했기 떄문
			if(score[i] > max) {
				max = score[i];
		} else if (score[i] < min) {
			min = score[i];
		}
		}
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
	}

}
