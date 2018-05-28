package ch03;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a*b;
		
		System.out.println(c); // int로  출력할 수 없어서 long 값으로 값이 출력이 됬다
	}

}
