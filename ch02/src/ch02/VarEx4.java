package ch02;

public class VarEx4 {
	public static void main(String[]args) {
		// 리터럴의 타입가 접미사 0은 8진수이다 
		int octNum = 010;               // 8진수 10, 10진수로8  
		int hexNum = 0x10;           // 16진수 10, 10진수로 16
		int binNum = 0b10;          // 2진수 10, 10진수로 2 ( jdk 1.7버전부터 사용가능)
		
		// 숫자 중간에 _는 JDK 1.7버전부터 사용 가능
		long big = 100_000_000_000L;                            // long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;           // long hex = 0xFFFFFFFFFFFFFFFFL;
		
		float pi = 3.14f;                            // 접미사 f대신 F사용해도됨
		double rate = 1.618d;                //접미사 d 대신 D사용하거나 생략가능
		// float pi = 3.14;                          //에러 float 타입 변수에 double 타입 리터럴 저장불가
		// double rate = 1.618;                 // ok. 접미사 d 는 생략할 수 있다
		
		// 타입의 불일치
		
		int  i = 'A';                          // ok 문자 'a'의 유니코드 인 65가 변수 i에 저장된다
		long l = 123;                     // ok int 보다 long 타입이 더 범위가 넓다
		double d = 3.14f;           // ok float보다 double 타입이 더 범위가 넓다
		//int i = 0x123456789;    // 에러 int 타입의 범위를 넘는 값을 저장
		//float f = 3.14;                  // 에러 float 타입ㅂ다 double 타입의 범위가 넓음
		byte b = 65;                    // ok byte타입에 저장 가능한 범위의 int 타입 리터럴
		short s = 0x1234;         // ok short 타입에 저장 가능한 범위의 int 타입 리터럴
	}

}
