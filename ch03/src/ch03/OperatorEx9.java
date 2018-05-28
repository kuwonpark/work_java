package ch03;

public class OperatorEx9 {
	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000; // int *int = int
		long b = 1_000_000 * 1_000_000L;  //int *Long = int
		
		System.out.println("a="+a); //비정상 
		System.out.println("b="+b); //정상
		
		
	}

}
