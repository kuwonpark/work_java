package ch04;

import java.util.*;

public class Ex01_13 {

	public static void main(String[] args) {
		System.out.print("번호를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int animal = scanner.nextInt();
		
		switch(animal) {
		case 1:
		System.out.println("dog");
		break;
		case 2:
		System.out.println("cat");
		break;
		case 3:
		System.out.println("chick");
		default:
			System.out.println("i don't know.");
		}
		

	}

}
