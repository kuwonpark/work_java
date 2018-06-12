package ch04;

import java.util.Scanner;;

public class Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String spell;
		spell = scanner.nextLine();
		
		// 112쪽 ,  switch 문을 사용 하는게 편함
		if(spell.equals("A")) {
			System.out.println("Excellent");
		}else if(spell.equals("B")) {
			System.out.println("Good");
		}else if(spell.equals("C")) {
			System.out.println("Usually");
		}else if(spell.equals("D")) {
			System.out.println("Effort");
		}else if(spell.equals("F")) {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
	}

}
