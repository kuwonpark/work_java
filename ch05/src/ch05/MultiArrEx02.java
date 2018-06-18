package ch05;

import java.util.Scanner;

public class MultiArrEx02 {
	public static void main(String[] args) {
		final int SIZE = 5;
		int x = 0, y = 0;
		int num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);
		
		// 배열의 모든 요소를 1 부터 SIZE*SIZE 까지의 숫자로 초기화  i와 j 는 행과 열을 25까지 채운다
		for (int i = 0; i < SIZE; i++) 
			for (int j = 0; j < SIZE; j++) 
				bingo[i][j] = i * SIZE + j + i;
			
		
		
		// 배열의 저장된 값을 섞는다 0~25까지의 랜던값
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				x = (int)(Math.random()*SIZE);
				y = (int)(Math.random()*SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for (int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) 
					System.out.printf("%2d ",bingo[i][j]);
				
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0) >", SIZE * SIZE);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			outer:
				for(int i = 0; i < SIZE; i++) {
					for(int j = 0; j < SIZE; j++) {
						if(bingo[i][j] == num) {
							bingo[i][j] = 0;
							break outer;
						}
					}
				}
		}while (num !=0);
	}

}
