package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] numbers = scanner.nextLine().split(" ");
		
		//편의상 numbers에 저장된 문자열들을 정수형으로 바꾼 값을 저장할 배열 생성
		int []sort = new int[numbers.length];
		
		// numbers 배열에 저장된 문자열들을 정수형으로 변환 후 sort 배열에 집어넣기
		for(int i = 0; i < numbers.length; i++) {
			sort[i] = Integer.parseInt(numbers[i]);
		}

		
		for (int i = 0; i < sort.length-1; i++) {// i < numArr.length-1 배열의 길이보다 1이 작은값 비교
			boolean changed = false;// 자리바꿈 발생 체크
			
			for (int j = 0; j < sort.length-1-i; j++) {
				if(sort[j] > sort[j+1]) { //옆의 값이 작으면	서로 바꿔준다
					int temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
					changed = true;
				}
			}
			
			if (!changed) break;
			
	}
		for(int i = sort.length-1; i >=0; i--) {
			System.out.print(sort[i]+" ");
		}

}
}
