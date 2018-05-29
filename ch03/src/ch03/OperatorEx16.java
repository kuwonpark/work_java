package ch03;

public class OperatorEx16 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortpi = (int)(pi * 1000)/ 1000f;
		System.out.println(shortpi);
		/*
		 * 연산자 우선순위 괄호먼저 형변환 사칙연산
		 * 
		 * (int)(pi * 1000) ->(int) (3.141592) -> 3141 
		 */
		
	}

}
