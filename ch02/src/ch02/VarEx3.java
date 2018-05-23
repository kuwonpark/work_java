package ch02;

public class VarEx3 {
	
	final static int MAX_SPEED = 10; // Max_speed는 상수 10은 리터럴

	/*
	 * final이 붙으면 앞으로 MAX SPEED는 
	 * 프로그램이 종료될 때까지 10고정
	 */
	
	public static void main(String[]args) { 
		//MAX_SPEED = 20;         상수(MAX_SPEED)는 값을 변경할 수 없다.
		System.out.println(MAX_SPEED); //상수 MAX_SPEED 출력
		
		int area = 10 * 2/ 2;
		System.out.println(area);
						
	}

}
