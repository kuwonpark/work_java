package ch03;

import java.util.*;

public class testt3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int x= Integer.parseInt(input);
		int y = Integer.parseInt(input2);
		
		System.out.printf("%d %d%n",++x,y--);
		System.out.printf("%d %d",x,y);
	}

}
