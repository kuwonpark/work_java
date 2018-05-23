package ch02;

public class VarEx1 {
	public static void main(String[]args) {
		
		/*변수란 단 하나의 값을 저장할 수 있는 메모리 공간
		 * 변수의 초기화란, 변수를 사용하기 전에 처음으로 값을 저장하는것
		*/
		
		int year = 0;   // 변수 year을 선언 및 0으로 초기화
		int age  = 14;  // 변수 age를 선언 및 14로 초기화
		
      System.out.println(year);
      System.out.println(age);
		
        year = age + 2000;  // 변수 age 값에 2000을 더해서 변수 year에 저장
		age = age + 1;     // 변수 age에 저장된 값을 1증가 시킴
		
	    System.out.println(year);
	    System.out.println(age);
	}

}
