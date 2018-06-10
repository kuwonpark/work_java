package ch04;

import java.util.*;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Ex01_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = Integer.parseInt(scanner.nextLine());
		
		int result = year/400;
		int result1 = year/4;
		int result2 = year/100;
		
		if(result == 0) {
			System.out.println("leap year");
		}else if(result1 == 0){
			System.out.println("leap year");
		}else if(result2 != 0) {
			System.out.println("leap year");
		}else{
			System.out.println("common year");
		}

	}ㄴㅇㅁㅇㅁ

}
