package ch04;

import java.util.*;

public class Ex01_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age = Integer.parseInt(scanner.nextLine());
		
		if(age>=20) {
			System.out.println("adult");
		}else if(age<20){
			
			System.out.printf("%d years later%n",20-age);
		}
		

	}

}
