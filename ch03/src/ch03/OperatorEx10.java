package ch03;

public class OperatorEx10 {
	public static void main(String[] args) {
		int a = 1000000;
		
		int result1= a*a/a; // 1000000*1000000/1000000 - 인트값 범위를 초과하는 값에다가 계산하여 비정상 출력이됨
		int result2= a/a*a; // 1000000/1000000*1000000 - 정상출력
		
		System.out.printf("%d * %d / %d = %d%n",a,a,a,result1);
		System.out.printf("%d / %d * %d = %d%n",a,a,a,result2);
	}

}
