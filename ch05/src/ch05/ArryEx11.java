package ch05;

public class ArryEx11 {
	public static void main(String[] args) {
		int[]  numArr = new int[10];
		int[] counter = new int[10];


		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10);
			System.out.print(numArr[i]);// 0~9까지의 랜덤 숫자를 넘i에 저장
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++; // 출력받은 수를 차례대로 카운터 값에 증가시킴
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(i+"의 개수 : " + counter[i]);
		}
	}

}
