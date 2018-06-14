package ch04;

import java.util.Scanner;

public class Ex02_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		
		if ( num>6) {
			System.out.println("INPUT ERROR!");
			return;// 특정 값을 리턴할 경우 사용하는 키워드 
			// 지금은 리턴 타입이 void 이므로 특정값이 없는경우
			// main메소드를 리턴하면 프로그램 종료와 같다
			}
		char a = 'A';
		int count = 0;
		for (int i = 0; i< num; i++) {
			for(int j =0; j< num; j++) {
				int limit = num -i;
				if (j< limit) {
					System.out.print(a+" ");
					a++;
					
				}
				else {
					System.out.print(count + " ");
					count ++;
				}
			}
			System.out.println();
			
		}
		
	}

}
