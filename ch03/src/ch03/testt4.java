package ch03;

import java.util.*;

public class testt4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1 한 줄에 두 정수를 입력받아 총 두 줄 입력받기(정수4개)

		//String[] numbers = scanner.nextLine()split(" ")

		//int num = Integer.patseInt(nembers[0]);
		//int num2 = Integer.patseInt(nembers[1]);

		//String[] numbers = scanner.nextLine()split(" ")

		//int num3 = Integer.patseInt(nembers1[0]);
		//int num4 = Integer.patseInt(nembers1[1]);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		String input4 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input);
		int num4 = Integer.parseInt(input2);


		boolean x = num>num3; //키
		boolean y = num2>num4; // 몸무게
		boolean z = x&&y;
		//저건연사자 (삼항연사자) 두번 이용해서 비교
		//boolean isGreatesMinsoo = num>num3 ?(num2>num4? true:false):false;




		System.out.printf("%b",z);

	}

}
