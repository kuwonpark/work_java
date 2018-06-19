package ch05;

import java.util.Scanner;

public class ch05Ex01_01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] alpa = scanner.nextLine().split(" ");

		//문자열 배열을 문자 배열로 변경
		char[] result = new char[alpa.length];
		for(int  i= 0; i< alpa.length; i++) {
			// 1. alpa String 배열에 있는 알파벳 하나를 꺼낸다
			String tmp = alpa[i];

			// 2. 1번에서 끄집어 낸 문자열을 char 형으로 변경한다.
			char tmp2 = tmp.charAt(0);

			//3 3. 2번에서 char으로 변경한 값을 result 배열에 집어 넣는다.
			//result 배열의 배열값을 변수 i로 설정하면 증가하여 출력가능
			result[i] = tmp2;

		}
		System.out.println(result); 
		//println 메소드에 넣어주기만 해도 배열값들이 옆으로 출력됨


	}


}


