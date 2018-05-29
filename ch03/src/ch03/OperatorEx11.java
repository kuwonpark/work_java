package ch03;

public class OperatorEx11 {
	public static void main(String[] args) {
		char a = 'a'; //아스키 값 97
		char d = 'd'; // 아스키 값 100
		char zero = '0'; // 아스키 값 48
		char two = '2';// 아ㅡ키값50
		
		//char형은 사칙 연산 시, 아스키 코드값으로 계산
		System.out.printf("'%c - '%c' = %d%n", d, a, d - a); // 'd' -'a' = 3
		System.out.printf("'%c - '%c' = %d%n", two, zero, two - zero);
		System.out.printf("'%c' = %d%n", a, (int)a);
		System.out.printf("'%c' = %d%n", d, (int)d);
		System.out.printf("'%c' = %d%n", zero, (int)zero );
		System.out.printf("'%c' = %d%n", two, (int)two );
	}

}
