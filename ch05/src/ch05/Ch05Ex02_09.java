package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		int[] a = new int[2];
		
		int i = 0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if(i == a.length) {
				int []tmp = new int [a.length*2];
				System.arraycopy(a, 0, tmp, 0, a.length);
				a = tmp;
			}
			a[i] = num;
			if(a[i] == 0) {
				break;
			}
			i++;
		}
		//배열 저장된값 출력
		System.out.println(i);
		
		
		for(int j =0; j<a.length; j++) {
			if(a[j]==0) {
				break;
			}
			// 홀수일 경우는 곱하기 2 짝수일경우는 나누기2한 몫 출력
			System.out.print((a[j]%2 !=0 ? a[j]*2:a[j]/2)+" ");
		}
	}

}
