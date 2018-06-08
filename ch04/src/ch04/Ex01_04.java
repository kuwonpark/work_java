package ch04;

import java.util.*;

public class Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num = Double.parseDouble(scanner.nextLine());
		
		if(num <= 50.80) {
			System.out.println("Flyweihgt");
		}else if(num <= 61.23) {
			System.out.println("Lightweihgt");
		}else if(num <= 72.57) {
			System.out.println("Middleweihgt");
		}else if(num <= 88.45) {
			System.out.println("Cruiserweihgt");
		}else if(num > 88.45) {
			System.out.println("Heavyweihgt");
		}
	}

}
