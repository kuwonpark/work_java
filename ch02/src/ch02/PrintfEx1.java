package ch02;

public class PrintfEx1 {
	public static void main (String[]args) {
		byte   b = 1;
		short s = 2;
		char   c = 'A';
		
		int finger = 10;                                                
		long big = 100_000_000_000L;                   
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;       
		
		int octNum = 010;                 // 8진수 10, 10진술는 8
		int hexNum = 0x10;              //16진수 10, 10진수로는 16
		int binNum = 0b10;             // 2진수 10, 10진수로는 2
		
		/*
		 *  %b: boolean
		 *  %d: 10진수
		 *  %o: 8진수
		 *  %x , %x : 16진수
		 *  %f: float
		 *  %e, %E: 지수
		 *  %c: 문자
		 *  %s: 문자열
		 *  %n: 엔터키
		 *  ,: argament 인자
		 */
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n",  c, (int)c);  
		//  (int)c = 명시적 형변환= 바꾸고 싶은 타입을 바꿀 수 있음  ( ) 안에다가 바꾸고싶은 타입을 입력
		System.out.printf("finger=[%5d]%n", finger); 
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	}

}
