package ch03;

public class OperatorEx18 {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortpi = Math.round(pi * 1000)/ 1000.0;
		
		System.out.println(shortpi);
		
		/*
		 * Math.round괄호안에 들어갈 숫자를 소수 첫째자리에서 반올림한다
		 * 괄호 안에 들어갈 수 있는 숫자는 float,double와 같은 실수만허용
		 * 이 메소도의 결과값은 long
		 */
	}

}
