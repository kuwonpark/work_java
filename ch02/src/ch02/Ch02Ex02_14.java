package ch02;

import java.util.*;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//yard값 입력하라는 안내 문구 출력
		System.out.print("yard?");
		
		//문자열로 입력받기
		String num = scanner.nextLine();
		
		//입력받은 실수를 실수형으로 변경
		double a = Double.parseDouble(num);
		
        //a 변수를 이용하여 계산
		double result = a *91.44;
		
		System.out.printf("%.1fyard = %.1fcm",a,result);
		
		
		
		
		
	}

}
