package ch04;

import java.util.*;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Ex01_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = Integer.parseInt(scanner.nextLine());
		
		boolean case01 = year%400 == 0;
		boolean case02 = year%4 == 0 &&year%100 != 0;
		
		
		
		if(case01||case02) {
			System.out.println("leap year");
		
		}else{
			System.out.println("common year");
		}

	}da

}
