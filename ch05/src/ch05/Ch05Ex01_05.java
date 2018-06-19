package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		double[] avgs = {88.6, 79.5, 83.1, 80.0, 87.2, 75.0};
		
		Scanner scanner = new Scanner(System.in);
		String[] classes = scanner.nextLine().split(" ");
		
		// 입력 받은 번호를 이용 하여 각 반의 평균값 배열에서 끄집어내기
		double num01 = avgs[Integer.parseInt(classes[0])];
		double num02 = avgs[Integer.parseInt(classes[1])];
		
		//두반의 평균 점수 합
		double sum = num01+num02;
		
		System.out.printf("%.1f",sum);
			
	}

}
