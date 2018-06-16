package ch05;

import java.util.Arrays;

public class ArryEx09 {
	public static void main(String[] args) {
		int[] code = {-4,-1,3,6,11}; // 불연속정인 값들로 구성된 배열
		int[] arr =  new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random()*code.length); // 0~4까지 랜덤 배열
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
