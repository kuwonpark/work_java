package ch03;

import java.util.*;

public class testt1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		int x = num/num2;
		int y = num%num2;
		
		System.out.printf("%d/%d= %d...%d",num,num2,x,y);
	}

}
