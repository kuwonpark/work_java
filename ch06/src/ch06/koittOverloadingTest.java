package ch06;

 class koittOverloadingTest {
	public static void main(String[] args) {
		koittOverloadingTest k = new koittOverloadingTest();
		
		int result1 =k.plus(3,5);
		System.out.println(result1);
		
		long result2 = k.plus(3L, 5L);
		
		System.out.println(result2);
		
		double result3 = k.plus(3.0, 5.0);
		System.out.println(result3);
		
		int result4 = k.plus(2, 4, 5);
			System.out.println(result4);
		
	}
	
	int plus(int a, int b) {
		return a+b;
	}
	
	int plus (int a, int b, int c) {
		return a +b+c;
	}
	long plus(long a, long b) {
		return a+b;
	}
	
	double plus(double a, double b) {
		return a+b;
	}
	
	
	

}
