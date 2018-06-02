package ch03;

import java.util.*;

public class testtt1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String[] numbers = scanner.nextLine()split(" ")
		
        //double num = Double.patseDouble(nembers[0]);
		//double num2 = Double.patseDouble(nembers[1]);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
        
		//2개의 실수를 받는다.
		double num = Double.parseDouble(input);
		double num2 = Double.parseDouble(input2);
		
		/*
		 * 곱한뒤 정수로 변경되는 식 
		 * 곱을한뒤 그 값이 정수로 변경되면서
		 *  소수점이하값이 사라진다.
		 */
	    int x = (int)(num*num2); 
	    
	    /*
	     * 정수로 변경뒤 곱한식  
	     * 실수가 정수로 바뀌면서
	     * 소수점 이하값이 사라진다
	     */
	    int y = (int)num;
	    int z = (int)num2;
	    //int y = (int)num*(int)num2;
	    
	  	//출력
	    System.out.printf("%d %d",x,y*z);
	    //System.out.printf("%d %d",x,y);
	}

}
