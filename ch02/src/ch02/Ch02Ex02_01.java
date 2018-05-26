package ch02;

import java.util.*;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String strKor = scanner.nextLine();
	String strMat = scanner.nextLine();
	String strEng = scanner.nextLine();

	int kor = Integer.parseInt(strKor);
	int mat = Integer.parseInt(strMat);
	int eng = Integer.parseInt(strEng);
	
	int sum = kor + mat + eng;
	int avg = sum /3;
	
		
	System.out.printf("kor %d%n",kor);
	System.out.printf("may %d%n",mat); 
	System.out.printf("eng %d%n",eng);
	System.out.printf("sum %d%n",sum); 
	System.out.printf("avg %d%n",avg);
	
	
	
		

	}

}
