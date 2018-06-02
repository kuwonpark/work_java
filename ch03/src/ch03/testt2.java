package ch03;

import java.util.*;

public class testt2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//두정수 가로로 입력받기(배열 사용)
		//String[] numbers = scanner.nextLine()split(" ")

		//int num = Integer.patseInt(nembers[0]);
		//int num2 = Integer.patseInt(nembers[1]);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);

		int x = num+5;
		int y = num2*2;
		int z = x*y;

		System.out.printf("width = %d%nlength = %d%narea = %d%n"
				,x,y,z);

	}

}
