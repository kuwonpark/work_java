package ch03;

import java.util.*;

public class testt1 {
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
		int x = num/num2;
		int y = num%num2;
		
		System.out.printf("%d/%d= %d...%d",num,num2,x,y);
	}

}
